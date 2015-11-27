package com.test;

import java.util.HashMap;
import java.util.Map;

public class ClassTest {
	
	private static Map<String, String> map = null;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		map = new HashMap<String, String>();
		System.out.println(map.size());

	}

}
