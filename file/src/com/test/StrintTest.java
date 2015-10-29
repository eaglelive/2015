package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class StrintTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		String reg = "^(([1][1-5])|([2][1-3])|([3][1-7])|([4][1-6])|([5][0-4])|([6][1-5])|([7][0-9])|([8][0-9])|([9][0-9]))\\d{4}((?:([1][9]\\d{2}(?:(?:0[1,3-9]|1[0-2])(?:29|30)|((?:0[13578]|1[02])31)))|([1][9]\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|1\\d|2[0-8]))|(((?:([1][9](?:0[48]|[2468][048]|[13579][26]))|(?:0[48]00|[2468][048]00|[13579][26]00))0229))))|((?:([2][0]\\d{2}(?:(?:0[1,3-9]|1[0-2])(?:29|30)|((?:0[13578]|1[02])31)))|([2][0]\\d{2}(?:0[1-9]|1[0-2])(?:0[1-9]|1\\d|2[0-8]))|(((?:([2][0](?:0[48]|[2468][048]|[13579][26]))|(?:0[48]00|[2468][048]00|[13579][26]00))0229))))\\d{3}[\\dx|X]|(([1][1-5])|([2][1-3])|([3][1-7])|([4][1-6])|([5][0-4])|([6][1-5])|([7][0-9])|([8][0-9])|([9][0-9]))\\d{4}(?:([0-9][0-9](?:(?:0[1,3-9]|1[0-2])(?:29|30)|((?:0[13578]|1[02])31)))|([0-9][0-9](?:0[1-9]|1[0-2])(?:0[1-9]|1\\d|2[0-8]))|(((?:((?:0[48]|[2468][048]|[13579][26]))|(?:0[48]00|[2468][048]00|[13579][26]00))0229)))\\d{3}$";
//		String str = "131128199302054073";
//		Pattern pattern = Pattern.compile(reg);
//		Matcher match = pattern.matcher(str);
//		System.out.println(match.matches()); 
//		System.out.println(StrintTest.DataType.N.toString().equals("N"));
//		List<String> list = new ArrayList<String>();
//		list.add("123");
//		list.add("456");
//		String [] str = new String [2];
//		list.toArray(str);
//		System.out.println(Arrays.toString(str));
//		String str = "123'456";
//		System.out.println(str.replaceAll("'", ""));
//		Integer [] a = {1,2,3};
//		List<Integer> list = Arrays.asList(a);
//		System.out.println(list.size());
		String tableCode = "bgt_t_ysjzsjb_indi";
		tableCode = tableCode.toUpperCase().replace("_INDI", "");
		System.out.println(tableCode);
	}
	
	public enum DataType {
		N, S, D;
	}

}
