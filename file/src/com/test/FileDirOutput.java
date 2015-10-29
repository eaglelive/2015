package com.test;

import java.io.File;

public class FileDirOutput {
	
	static String svn = "http://192.168.3.135:9966/svn/YFB-CODE/product/budget/trunk/EFMIS_WEB";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String outputDir = "E:/Workspaces/NT//efmisweb_OA_1.0/src/com/tjhq/synch2";
		File rootFile = new File(outputDir);
		if (rootFile.isDirectory()) {
			getFilePath(rootFile);
		}
		

	}
	
	public static void getFilePath(File rootFile) {
		for (File fileItem : rootFile.listFiles() ) {
			if (fileItem.isDirectory()) {
				getFilePath(fileItem);
			} else {
				System.out.println(svn+"/"+fileItem.getName());
			}
		}
	}

}
