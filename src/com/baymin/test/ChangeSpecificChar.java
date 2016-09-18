package com.baymin.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
/**��ΪOJ
 * ����һ���ַ��������ַ������ַ���a���滻Ϊ��#���������滻����
 * ��ǰ����ӷ��š�*����������ַ���������0������9�����������ɾ
 * ����������ַ���ΪСд�ַ�
 * @author BaiXue
 * @date 2016��9��10��
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
