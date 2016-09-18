package com.baymin.utils;
/**
 * 冒泡排序改进
 * @author BaiXue
 * @date 2016年9月8日
 */
public class BubbleSort {
	public static void bubbleSort(int[] nums){
		int i,j;
		boolean flag=true ;
		for ( i = 0; i < nums.length && flag; i++) {
			flag = false;
			for ( j = nums.length-1; j > i; j--) {
				if(nums[j-1]>nums[j]){
					int temp = nums[j-1];	
					nums[j-1] = nums[j];
					nums[j] = temp;
					
					flag = true;
				}
			}
		}
//		return nums;
	}
}
