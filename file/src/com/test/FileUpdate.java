package com.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class FileUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		File file = new File("E:\\Workspaces\\NT\\EFMIS_WEB\\efmisweb\\WEB-INF\\views");
		readFile(file);

	}
	
	static void readFile(File file) {
		if (file.isDirectory()) {
			for (File subFile : file.listFiles()) {
				readFile(subFile);
			}
		} else {
			if ("jsp".equals(file.getName().substring(file.getName().length() - 3))) {
				updateFile(file);
			}
		}
		
	}
	
	static void updateFile(File file) {
		
		try {
			String content = "<script src=\"static/pub/js/Hq.js\"></script> \r\n";
			String read = "";
			BufferedReader bfr = new BufferedReader(new FileReader(file));
			try {
				while ((read = bfr.readLine()) != null) {
					content += read + "\r\n";
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			 RandomAccessFile mm = null;
		        try {
		            mm = new RandomAccessFile(file.getPath(), "rw");
		            mm.writeBytes(new String(content.getBytes(), "ISO-8859-1"));
		        } catch (IOException e1) {
		            e1.printStackTrace();
		        } finally {
		            if (mm != null) {
		                try {
		                    mm.close();
		                } catch (IOException e2) {
		                    e2.printStackTrace();
		                }
		            }
		        }
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
