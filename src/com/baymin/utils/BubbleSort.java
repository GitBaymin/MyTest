package com.baymin.utils;
/**
 * ð������Ľ�
 * @author BaiXue
 * @date 2016��9��8��
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
