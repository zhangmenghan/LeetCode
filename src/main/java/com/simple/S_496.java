package com.simple;

public class S_496 {
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int length1 = nums1.length;
		int length2 = nums2.length;
		int result[] = new int[length1];
		
		for(int i = 0;i<length1;i++) {
			int j = 0;
			for( ;j<length2;j++) {
				result[i] = -1;
				if(nums1[i] == nums2[j]) {
					break;
				}
			}
			for(int k = j;k<length2;k++) {
				if(nums2[j] < nums2[k]) {
					result[i] = nums2[k];
					break;
				}
			}
		}

		return result;
	}
	
	public static void main(String[] args) {
		S_496 s = new S_496();
		int nums1[] = {2,4};
		int nums2[] = {1,2,3,4};
		for(int i = 0;i < s.nextGreaterElement(nums1, nums2).length;i++) {
			System.out.println(s.nextGreaterElement(nums1, nums2)[i]);
		}
	}
}
