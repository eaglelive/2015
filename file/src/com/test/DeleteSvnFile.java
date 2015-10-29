package com.test;

import java.io.File;

public class DeleteSvnFile {

	public static void main(String[] args) {
		String outputDir = "C:\\Users\\CL\\Desktop\\tjhq";
		File rootFile = new File(outputDir);
		if (rootFile.isDirectory()) {
			getFilePath(rootFile);
		}
		

	}
	
	public static void getFilePath(File rootFile) {
		for (File fileItem : rootFile.listFiles() ) {
			if (fileItem.getName().endsWith(".svn")) {
				deleteSvnFile(fileItem);
				System.out.println("delete directory "+ fileItem.getName());
				fileItem.delete();
				continue;
			}
			if (fileItem.getName().endsWith(".svn-base")) {
				System.out.println("delete file "+ fileItem.getName());
				fileItem.delete();
			}
			if (fileItem.isDirectory()) {
				getFilePath(fileItem);
			}
		}
	}
	
	public static void deleteSvnFile(File rootFile) {
		for (File fileItem : rootFile.listFiles() ) {
			if (fileItem.isDirectory()) {
				deleteSvnFile(fileItem);
				System.out.println("delete directory "+ fileItem.getName());
				fileItem.delete();
			} else {
				System.out.println("delete file "+ fileItem.getName());
				fileItem.delete();
			}
		}
	}

}
