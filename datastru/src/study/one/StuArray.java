package study.one;

import java.text.SimpleDateFormat;

public class StuArray {
	
	
	public static int find(long [] array, long serachKey) {
		int min = 0;
		int max = array.length - 1;
		int curInd = 0;
		while(true) {
			curInd = (min+max)/2;
			if (array[curInd] == serachKey) {
				return curInd;
			} else if (min > max) {
				return -1;
			} else {
				if (array[curInd] > serachKey) {
					max = curInd - 1;
				} else {
					min = curInd + 1;
				}
			}
		}
	}
	
	public static int findA(long [] array, long serachKey) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == serachKey) {
				return i;
			}
		}
		return -1;
	}
	
	
	
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd/HH:mm:ss:SSS");
		long [] array = new long [1000000];
		long searchKey = 1000000;
		for (int i = 0; i < array.length; i++) {
			array[i] = i+1;
		}
		
		System.out.println(df.format(System.currentTimeMillis()));
		System.out.println(find(array, searchKey));
		System.out.println(df.format(System.currentTimeMillis()));
		
		System.out.println(df.format(System.currentTimeMillis()));
		System.out.println(findA(array, searchKey));
		System.out.println(df.format(System.currentTimeMillis()));
	}
}
