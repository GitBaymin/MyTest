package com.baymin.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.baymin.utils.BubbleSort;


public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] sArray = s.split(" ");
		int[] nums = new int[sArray.length];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 0;
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(sArray[i]);
		}
//		int[] nums = Integer.parseInt(s.split(" "));
//		int[] nums = {2,1,5,9,0,4,3,8};
		BubbleSort.bubbleSort(nums);
		System.out.println();
		ArrayList<Integer> al = deleteContinue(nums);
		Iterator<Integer> iter =  al.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		
	}
	public static ArrayList<Integer> deleteContinue(int[] nums){
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int j = i + 1;
			if(j<nums.length && nums[j]-nums[j-1]==1){
				while (j < nums.length && nums[j] - nums[j - 1] == 1) {
					++j;
				}
				al.add(nums[i]);
				al.add(nums[j - 1]);
				i = j-1;
				continue;
			}
			al.add(nums[i]);
			
		}
		return al;
	}
}
