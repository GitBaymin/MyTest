package com.huawei1;

import java.util.Scanner;

public class CopyOfMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
		String[] sArray = s.split(",");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < sArray.length; i++) {
			if(i==0)
				sb.append("["+"["+sArray[i]+"],");
			else if(i==sArray.length-1)
				sb.append("["+sArray[i]+"]"+"]");
			else
				sb.append("["+sArray[i]+"],");
		}
		String str = sb.toString();
		str = str.replace("=", ",");
		
		System.out.println(str);
	}
}
