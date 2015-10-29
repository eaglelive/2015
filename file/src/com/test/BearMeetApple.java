package com.test;

public class BearMeetApple {

	public static int n = 10;//熊数N
	public static int a = (int)Math.pow(n, n-1);//N^(N-1)
	public static int b = (int)Math.pow(n-1, n-1);//(N-1)^(N-1)
	 
	public static void main(String[] args){
	     
	    for(int i=1; i<=Integer.MAX_VALUE; i++){
	        if(solve(i*n+1)){
	            System.out.println(n+" "+(i*n+1));
	            break;
	        }
	    }
	}
	//假设第n只熊拿到An个苹果，那么N*An=(N-1)*A(n-1) - 1;
	    //得到递推式：N*(An+1) = (N-1)*(A(n-1) + 1):
	public static boolean solve(int apple){
	    //第一只熊拿到的苹果数
	    int a0 = (apple-1)/n+1;
	    int b0 = b*a0;
	     
	    return (b0/a*a == b0);
	     
	}

}
