package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateUpdateFile {
	
	static String fromFilePath = "D:/Oracle/Middleware/user_projects/domains/busi_domain/autodeploy/bgt/";
	//static String toFilePath = "E:/TJHQ/Release/预算系统/2015-10-29/update_v1/war/";
	static String toFilePath = "C:/Users/CL/Desktop/BGT/war/";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] updateFiles = {"static/app/exp/bgtexpend/js/controller/ExpTableDetailController.gzjs",
		        "static/app/exp/bgtexpend/js/controller/ExpTableDetailController.js",
		        "WEB-INF/classes/com/tjhq/exp/bgtexpend/web/ExpTableDetailInputController.class",
		        "WEB-INF/classes/com/tjhq/exp/bgtexpend/service/impl/ExpTableDetailInputService.class"};
		try {
			System.err.println("Source Path : " + fromFilePath);
			System.err.println("Target Path : " + toFilePath);
			createFile(updateFiles);
			System.out.println("生成成功！");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private static void createFile(String [] updateFiles) throws IOException {
		File inFile = null;
		File outFile = null;
		FileOutputStream os = null;
		FileInputStream is = null;
		byte[] buffer = new byte[1024];
        int byteRead = 0;    
		for (String filePath : updateFiles) {
			inFile = new File(fromFilePath+filePath);
			is = new FileInputStream(inFile);
			outFile = new File(toFilePath+filePath);
			if (!outFile.getParentFile().exists()) {
				outFile.getParentFile().mkdirs();
			}
			os = new FileOutputStream(outFile);
			while ((byteRead = is.read(buffer)) != -1) {
				os.write(buffer, 0, byteRead);
			}
			os.flush();
			os.close();
			is.close();
			System.out.println("成功创建：" + toFilePath+filePath);
		}
	}

}
