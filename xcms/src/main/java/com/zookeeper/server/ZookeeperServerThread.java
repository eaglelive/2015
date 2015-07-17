package com.zookeeper.server;

import java.io.IOException;

import com.zookeeper.conf.ZookeeperConfig;

import org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Author:CAOK
 * 2015-7-8 下午02:40:34 
 * Version 1.0
 */
public class ZookeeperServerThread extends Thread {
	protected static final Logger LOG =
        LoggerFactory.getLogger(ZookeeperServerThread.class);
	private ZooKeeperServerMain zksMain = null;
	
	public ZookeeperServerThread() {
		zksMain = new ZooKeeperServerMain();
	}
	
	@Override
	public void run() {
		String args[] = new String[1];
		args[0] = this.getClass().getResource("/").getPath() + ZookeeperConfig.zkConfPath;
		LOG.info("Load Zookeeper Config : " + args[0]);
		try {
			zksMain.initializeAndRun(args);
		} catch (ConfigException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public void shutdown() {
		zksMain.shutdown();
	}
}
