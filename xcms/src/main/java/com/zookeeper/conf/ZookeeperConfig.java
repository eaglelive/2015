package main.java.com.zookeeper.conf;

import static org.apache.zookeeper.client.FourLetterWordMain.send4LetterWord;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.zookeeper.server.ServerCnxnFactory;
import org.apache.zookeeper.server.ZooKeeperServer;
import org.apache.zookeeper.server.persistence.FileTxnLog;
import org.apache.zookeeper.server.quorum.QuorumPeer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ZookeeperConfig {
	protected static final Logger LOG =
        LoggerFactory.getLogger(ZookeeperConfig.class);
	public static int CONNECTION_TIMEOUT = 30000;
	public static String zkConfPath = "/zoo.cfg";
    static final File BASEPATH = new File("/tmp/zookeeper");
    public static String hostPort = "127.0.0.1:2182";
    protected int maxCnxns = 0;
    protected ServerCnxnFactory serverFactory = null;
    protected File tmpDir = null;
    
    public static class HostPort {
        String host;
        int port;
        public HostPort(String host, int port) {
            this.host = host;
            this.port = port;
        }
    }
    
    public static List<HostPort> parseHostPortList(String hplist) {
        ArrayList<HostPort> alist = new ArrayList<HostPort>();
        for (String hp: hplist.split(",")) {
            int idx = hp.lastIndexOf(':');
            String host = hp.substring(0, idx);
            int port;
            try {
                port = Integer.parseInt(hp.substring(idx + 1));
            } catch(RuntimeException e) {
                throw new RuntimeException("Problem parsing " + hp + e.toString());
            }
            alist.add(new HostPort(host,port));
        }
        return alist;
    }

    public static boolean waitForServerUp(String hp, long timeout) {
        long start = System.currentTimeMillis();
        while (true) {
            try {
                // if there are multiple hostports, just take the first one
                HostPort hpobj = parseHostPortList(hp).get(0);
                String result = send4LetterWord(hpobj.host, hpobj.port, "stat");
                if (result.startsWith("Zookeeper version:") &&
                        !result.contains("READ-ONLY")) {
                    return true;
                }
            } catch (IOException e) {
                // ignore as this is expected
                LOG.info("server " + hp + " not up " + e);
            }

            if (System.currentTimeMillis() > start + timeout) {
                break;
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                // ignore
            }
        }
        return false;
    }
    public static boolean waitForServerDown(String hp, long timeout) {
        long start = System.currentTimeMillis();
        while (true) {
            try {
                HostPort hpobj = parseHostPortList(hp).get(0);
                send4LetterWord(hpobj.host, hpobj.port, "stat");
            } catch (IOException e) {
                return true;
            }

            if (System.currentTimeMillis() > start + timeout) {
                break;
            }
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                // ignore
            }
        }
        return false;
    }

    public static boolean waitForServerState(QuorumPeer qp, int timeout,
            String serverState) {
        long start = System.currentTimeMillis();
        while (true) {
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                // ignore
            }
            if (qp.getServerState().equals(serverState))
                return true;
            if (System.currentTimeMillis() > start + timeout) {
                return false;
            }
        }
    }
   
    private static int getPort(String hostPort) {
        String[] split = hostPort.split(":");
        String portstr = split[split.length-1];
        String[] pc = portstr.split("/");
        if (pc.length > 1) {
            portstr = pc[0];
        }
        return Integer.parseInt(portstr);
    }

    public static ServerCnxnFactory createNewServerInstance(File dataDir,
            ServerCnxnFactory factory, String hostPort, int maxCnxns)
        throws IOException, InterruptedException
    {
        ZooKeeperServer zks = new ZooKeeperServer(dataDir, dataDir, 3000);
        final int PORT = getPort(hostPort);
        if (factory == null) {
            factory = ServerCnxnFactory.createFactory(PORT, maxCnxns);
        }
        factory.startup(zks);
        ZookeeperConfig.waitForServerUp(ZookeeperConfig.hostPort,
                CONNECTION_TIMEOUT);

        return factory;
    }



    /**
     * Test specific setup
     */
    public static void setupTestEnv() {
        // during the tests we run with 100K prealloc in the logs.
        // on windows systems prealloc of 64M was seen to take ~15seconds
        // resulting in test Assert.failure (client timeout on first session).
        // set env and directly in order to handle static init/gc issues
        System.setProperty("zookeeper.preAllocSize", "100");
        FileTxnLog.setPreallocSize(100 * 1024);
    }
    
    
}
