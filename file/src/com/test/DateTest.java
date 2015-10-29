package com.test;

import java.text.SimpleDateFormat;

public class DateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss:SSS");
		System.out.println(df.format(System.currentTimeMillis()));

	}

}
