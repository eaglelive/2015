package com.test;

public class ConstantsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(Constants.PERSON_NAME);
		System.out.println(Constants.PERSON.SEX);

	}
	
	static final class Constants {
		public static final String PERSON_NAME = "zhansan";
		public static final String PERSON_SEX = "M";
		static final class PERSON {
			public static final String SEX = "M";
		}
	}

}
