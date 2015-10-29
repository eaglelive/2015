package com.test;

import java.io.File;
import java.io.FileWriter;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;
import org.dom4j.io.XMLWriter;

public class DataSourceUpdate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//getDataSourceFile39();
		getDataSourceFile33();
		//getDataSourceFile38();
		//getDataSourceFile31();
		//getDataSourceFile34();
		//getDataSourceFile27();
		//getDataSourceFile148();
		//getDataSourceFile67();
		//getDataSourceFile192();

	}
	
	public static void getDataSourceFile39() {
		String basePath = "D:/Oracle/Middleware/user_projects/domains/";
		try {
			String fileUrl = "portal_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.33:1521:orcl", "FASP_62_TEST", "FASP_62_TEST");
			
			fileUrl = "exp_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.33:1521:orcl", "EFMIS_62_TEST", "EFMIS_62_TEST");
			
			fileUrl = "hqoa_domain/config/jdbc/hqoa_ds-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.33:1521:orcl", "OA_62_TEST", "OA_62_TEST");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getDataSourceFile192() {
		String basePath = "D:/Oracle/Middleware/user_projects/domains/";
		try {
			String fileUrl = "portal_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.100.192:1521:orcl", "FASP_62", "FASP_62");
			
			fileUrl = "exp_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.100.192:1521:orcl", "EFMIS_62", "EFMIS_62");
			
			fileUrl = "hqoa_domain/config/jdbc/hqoa_ds-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.100.192:1521:orcl", "OA_0720", "OA_0720");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getDataSourceFile33() {
		String basePath = "D:/Oracle/Middleware/user_projects/domains/";
		try {
			String fileUrl = "portal_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.33:1521:orcl", "FASP_62", "FASP_62");
			
			fileUrl = "exp_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.33:1521:orcl", "EFMIS_62", "EFMIS_62");
			
			fileUrl = "hqoa_domain/config/jdbc/hqoa_ds-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.33:1521:orcl", "OA_0720", "OA_0720");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getDataSourceFile27() {
		String basePath = "D:/Oracle/Middleware/user_projects/domains/";
		try {
			String fileUrl = "portal_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.27:1521:orcl", "FASP_62", "FASP_62");
			
			fileUrl = "exp_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.27:1521:orcl", "EFMIS_62", "EFMIS_62");
			
			fileUrl = "hqoa_domain/config/jdbc/hqoa_ds-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.27:1521:orcl", "OA_0720", "OA_0720");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getDataSourceFile38() {
		String basePath = "D:/Oracle/Middleware/user_projects/domains/";
		try {
			String fileUrl = "portal_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.38:1521:orcl", "FASP_62", "FASP_62");
			
			fileUrl = "exp_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.38:1521:orcl", "EFMIS_62", "EFMIS_62");
			
			fileUrl = "hqoa_domain/config/jdbc/hqoa_ds-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.38:1521:orcl", "OA_0720", "OA_0720");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getDataSourceFile31() {
		String basePath = "D:/Oracle/Middleware/user_projects/domains/";
		try {
			String fileUrl = "portal_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.33:1521:ORCL", "FASP_5101", "FASP_5101");
			
			fileUrl = "exp_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.33:1521:ORCL", "EFMIS_5101", "EFMIS_5101");
			
			fileUrl = "hqoa_domain/config/jdbc/hqoa_ds-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.33:1521:ORCL", "OA_5101", "OA_5101");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getDataSourceFile34() {
		String basePath = "D:/Oracle/Middleware/user_projects/domains/";
		try {
			String fileUrl = "portal_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.93:1521:ORCL", "FASP_62", "FASP_62");
			
			fileUrl = "exp_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.93:1521:ORCL", "EFMIS_62", "EFMIS_62");
			
			fileUrl = "hqoa_domain/config/jdbc/hqoa_ds-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.93:1521:ORCL", "OA_0720", "OA_0720");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getDataSourceFile67() {
		String basePath = "D:/Oracle/Middleware/user_projects/domains/";
		try {
			String fileUrl = "portal_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.100.67:1521:ORCL", "FASP_GS", "FASP_GS");
			
			fileUrl = "exp_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.100.67:1521:ORCL", "EFMIS_GS", "EFMIS_GS");
			
			fileUrl = "hqoa_domain/config/jdbc/hqoa_ds-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.100.67:1521:ORCL", "OA_GS", "OA_GS");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void getDataSourceFile148() {
		String basePath = "D:/Oracle/Middleware/user_projects/domains/";
		try {
			String fileUrl = "portal_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.148:1521:ORCL", "FASP_44", "FASP_44");
			
			fileUrl = "exp_domain/config/jdbc/portalDataSource-6671-jdbc.xml";
			updateDataSource(basePath + fileUrl, "jdbc:oracle:thin:@192.168.5.148:1521:ORCL", "EFMIS_44", "EFMIS_44");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void updateDataSource(String fileUrl, String connectUrl, String userName, String password) throws Exception {
		Document document = parse(new File(fileUrl));
		Node node = document.selectSingleNode("/*[name()='jdbc-data-source']/*[name()='jdbc-driver-params']");
		node.selectSingleNode("*[name()='url']").setText(connectUrl);
		node.selectSingleNode("*[name()='properties']/*[name()='property']/*[name()='value']").setText(userName);
		node.selectSingleNode("*[name()='password-encrypted']").setText(password);
		
		XMLWriter xmlWriter = new XMLWriter(new FileWriter(fileUrl));
		xmlWriter.write(document);
		xmlWriter.flush();
		xmlWriter.close();
	}
	
	public static Document parse(File file) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(file);
        return document;
    }
	


}
