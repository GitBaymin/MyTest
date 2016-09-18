package com.baymin.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**华为OJ
 * 输入一个字符串，将字符串中字符“a”替换为“#”，在呗替换的字
 * 符前后添加符号“*”，输入的字符串包含“0”到“9”，在输出中删
 * 除，输出的字符均为小写字符
 * @author BaiXue
 * @date 2016年9月10日
 */
public class ChangeSpecificChar {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Input:");
		 String s = sc.nextLine();
		String newS = changeString(s.toLowerCase());
		for (int i = 0; i < newS.length(); i++) {
			if(newS.charAt(i)>='0'&&newS.charAt(i)<='9')
				continue;
			System.out.print(newS.charAt(i));
		}
	}

	public static String changeString(String s) {
		ArrayList<Character> al = new ArrayList<Character>();
		char[] c = s.toCharArray();
		int numOfa;
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a') {
				int j = i + 1;
				while (j < c.length && c[j] == 'a') {
					++j;
				}
				numOfa = j - i;
				al.add('*');
				while (numOfa > 0) {
					al.add('#');
					--numOfa;
				}
				al.add('*');
				i = j - 1;
				continue;
			}
			al.add(c[i]);
		}
		StringBuilder sb = new StringBuilder();
		Iterator<Character> it = al.iterator();
		while (it.hasNext()) {
			Character ch = it.next();
			sb.append(ch);
		}
		return sb.toString();
	}
}
