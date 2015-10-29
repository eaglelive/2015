package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateUpdateFile {
	
	static String fromFilePath = "D:/Oracle/Middleware/user_projects/domains/exp_domain/autodeploy/bgt/";
	static String toFilePath = "E:/TJHQ/Release/预算系统/2015-10-13/update_v3/war/";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String [] updateFiles = {"WEB-INF/classes/com/tjhq/exp/datainput/dao/IDataAuditMapper.class",
				"WEB-INF/classes/com/tjhq/exp/datainput/dao/maps/DataAuditMapper.xml",
				"WEB-INF/classes/com/tjhq/exp/datainput/service/impl/DataAuditService.class",
				"WEB-INF/classes/com/tjhq/commons/setting/external/service/impl/AuditRuleOutService.class",
				"WEB-INF/classes/com/tjhq/exp/zhsh_oa/web/TableUtil.class",
				"WEB-INF/classes/com/tjhq/exp/zhsh_oa/web/OAAuditController.class",
				"WEB-INF/classes/com/tjhq/exp/zhsh_oa/service/IOAAuditService.class",
				"WEB-INF/classes/com/tjhq/exp/zhsh_oa/service/impl/OAAuditService.class",
				"WEB-INF/classes/com/tjhq/exp/zhsh_oa/dao/OAAuditMapper.class",
				"WEB-INF/classes/com/tjhq/exp/zhsh_oa/dao/maps/OAAuditMapper.xml",
				"WEB-INF/classes/com/tjhq/exp/quotamanage/formulaset/web/TableInfo.class",
				"WEB-INF/classes/com/tjhq/exp/quotamanage/formulaset/web/FormulasetNewController.class"};
		try {
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
