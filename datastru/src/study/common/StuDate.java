package study.common;

import java.text.SimpleDateFormat;


public  class  StuDate {
	
	private static SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss:SSS");
	
	public static void outputCurrentDate() {
		System.out.println(df.format(System.currentTimeMillis()));
	}
	
	public static void main(String[] args) {
		outputCurrentDate();
	}
}
