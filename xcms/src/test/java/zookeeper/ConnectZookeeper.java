package test.java.zookeeper;

import main.java.zookeeper.conf.ZookeeperConfig;
import main.java.zookeeper.server.ZookeeperServerThread;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.ZooDefs.Ids;
import org.junit.Assert;
import org.junit.Test;

public class ConnectZookeeper implements Watcher {
	
	/**
     * Verify the ability to start a standalone server instance.
     */
    @Test
    public void testStandalone() throws Exception {

        ZookeeperServerThread main = new ZookeeperServerThread();
        main.start();

        
        Assert.assertTrue("waiting for server being up",
                ZookeeperConfig.waitForServerUp(ZookeeperConfig.hostPort,
                		ZookeeperConfig.CONNECTION_TIMEOUT));

        ZooKeeper zk = new ZooKeeper(ZookeeperConfig.hostPort,
        		ZookeeperConfig.CONNECTION_TIMEOUT, this);

        zk.create("/foo1", "foobar1".getBytes(), Ids.OPEN_ACL_UNSAFE,
                CreateMode.PERSISTENT);
        Assert.assertEquals(new String(zk.getData("/foo1", null, null)), "foobar1");
        zk.close();

        main.shutdown();

        Assert.assertTrue("waiting for server down",
        		ZookeeperConfig.waitForServerDown(ZookeeperConfig.hostPort,
        				ZookeeperConfig.CONNECTION_TIMEOUT));
    }

	@Override
	public void process(WatchedEvent event) {
		// TODO Auto-generated method stub
		
	}
	
}
