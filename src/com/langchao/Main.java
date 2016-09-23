package com.langchao;

import java.util.Scanner;
/*
 * 时钟差
 */

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String strStart = sc.nextLine();
		String strEnd = sc.nextLine();
		Integer[] value = handleStr(strStart, strEnd);
		int minus = value[0]*3600 + value[1]*60 + value[2];
		System.out.println(minus);
	}
	
	public static Integer[] handleStr(String str1, String str2){
		String[] strArr1 = str1.split(":");
		int h1 = Integer.parseInt(strArr1[0]);
		int m1 = Integer.parseInt(strArr1[1]);
		int s1 = Integer.parseInt(strArr1[2]);
		if(h1>23 || m1>59 || s1>59){
			return null;
		}
		
		String[] strArr2 = str2.split(":");
		int h2 = Integer.parseInt(strArr2[0]);
		int m2 = Integer.parseInt(strArr2[1]);
		int s2 = Integer.parseInt(strArr2[2]);
		if(h2>23 || m2>59 || s2>59){
			return null;
		}
		return minus(h1, m1, s1, h2, m2, s2);
	}
	
	public static Integer[] minus(int h1,int m1,int s1,int h2,int m2,int s2){
		int h,m,s;
		Integer[] value = new Integer[3];
		if(s1>=s2){//秒
			s = s1 - s2;
			if(m1>=m2){//分
				m = m1 - m2;
				h = h1 - h2;
			}
			else{//分
				h1 = h1 - 1;
				m1 = m1 + 60;
				m = m1 - m2;
				h = h1 - h2;
			}
		}else {//秒
			m1 = m1 -1;
			s1 = s1 + 60;
			s = s1 - s2;
			if(m1>=m2){//分
				m = m1 - m2;
				h = h1 - h2;
			}
			else{//分
				h1 = h1 - 1;
				m1 = m1 + 60;
				m = m1 - m2;
				h = h1 - h2;
			}
		}
		
		value[0] = h;
		value[1] = m;
		value[2] = s;
		
		return value;
	}
}
