package com.huawei1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
	
		String[] sArray = s.split("[=,]");
		StringBuilder sb = new StringBuilder();
		if (sArray.length == 0)
			return;
		else {
			for (int i = 0; i < sArray.length; i = i + 2) {
				if (i == 0) {
					sb.append("[" + "[" + sArray[i] + ",");
					if (i + 1 < sArray.length)
						sb.append(sArray[i + 1]);
					sb.append("]" + ",");
					if (sArray.length == 1) {
						sb.deleteCharAt(sb.length() - 1);
						sb.append("]");
					}
				} else if (i == sArray.length - 2 || i == sArray.length - 1) {
					sb.append("[" + sArray[i] + ",");
					if (i + 1 < sArray.length)
						sb.append(sArray[i + 1]);
					sb.append("]" + "]");
				} else {
					sb.append("[" + sArray[i] + ",");
					if (i + 1 < sArray.length)
						sb.append(sArray[i + 1]);
					sb.append("]" + ",");
				}
			}
		}
		System.out.println(sb.toString());
	}
}
