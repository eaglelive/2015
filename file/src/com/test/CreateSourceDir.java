package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;

public class CreateSourceDir {
	
	static final String rootPath = "E:/GitHub/2015/file/src/";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String srcPath = null;
		String dirName = null;
		try {
			System.out.print("Please input source package : ");
			srcPath = br.readLine();
			System.out.print("Please input dir name : ");
			dirName = br.readLine();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		CreateSourceDir csd = new CreateSourceDir();
		csd.mkDir(srcPath, dirName);

	}
	
	public void mkDir(String srcPath, String dirName) {
		srcPath = srcPath.replace(".", "/");
		srcPath = rootPath.concat(srcPath).concat("/").concat(dirName);
		String [] files = getFileList();
		for (String file : files) {
			file = MessageFormat.format(file, dirName.substring(0, 1).toUpperCase().concat(dirName.substring(1)));
			file = srcPath.concat(file);
			System.out.println(file);
		}
	}
	
	public void mkFile(String fileName) {
		
	}
	
	public String [] getFileList() {
		String [] files = new String [4];
		files[0] = "/service/I{0}Service.java";
		files[1] = "/service/impl/{0}Service.java";
		files[2] = "/dao/I{0}DAO.java";
		files[3] = "/dao/maps/{0}Mapper.xml";
		
		return files;
	}

}
