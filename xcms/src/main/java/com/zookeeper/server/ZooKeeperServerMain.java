package com.zookeeper.server;

import java.io.IOException;

import org.apache.zookeeper.server.quorum.QuorumPeerConfig.ConfigException;

/**
 * Author:CAOK
 * 2015-7-8 下午03:08:37 
 * Version 1.0
 */
public class ZooKeeperServerMain extends
		org.apache.zookeeper.server.ZooKeeperServerMain {
	
	public void initializeAndRun(String[] args) throws ConfigException,
			IOException {
		super.initializeAndRun(args);
	}
	
	public void shutdown() {
		super.shutdown();
	}
	
	
}
