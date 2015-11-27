package com.test;

import java.io.File;

public class FileDirOutput {
	
	//static String svn = "http://192.168.3.135:9966/svn/YFB-CODE/product/budget/trunk/EFMIS_WEB";
	static String svn = "WEB-INF/classes";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String outputDir = "E:/Workspaces/NT//efmisweb_OA_1.0/src/com/tjhq/synch2";
		String outputDir = "E:/TJHQ/Release/projects/1.1.0.7_bgt/src/com/tjhq/commons/excel";
		File rootFile = new File(outputDir);
		if (rootFile.isDirectory()) {
			getFilePath(rootFile);
		}
		

	}
	
	public static void getFilePath(File rootFile) {
		String filePath = null;
		for (File fileItem : rootFile.listFiles() ) {
			if (fileItem.isDirectory()) {
				getFilePath(fileItem);
			} else {
				filePath = fileItem.getParentFile().getPath();
				filePath = filePath.substring(filePath.indexOf("src")+3).replaceAll("\\\\", "/");
				System.out.println(svn+filePath+"/"+fileItem.getName());
			}
		}
	}

}
