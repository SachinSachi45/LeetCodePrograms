package lc.Problems;

import java.util.Arrays;

public class $189ArrayRotate {
 public static void main(String[] args) {
	int [] nums= {1,2,3};
	int k=4;
	System.out.println(Arrays.toString(arrayRotate(nums,k)));
}

private static int[] arrayRotate(int[] nums, int k) {
	int n=nums.length;
	k=k%n;
	rotate(nums,0,n-1);
	rotate(nums,0,k-1);
	rotate(nums,k,n-1);
	
	return nums;
	
}

private static void rotate(int[] nums, int start, int end) {
	while(start<=end) {
		int temp=nums[start];
		nums[start]=nums[end];
		nums[end]=temp;
		start++;
		end--;
	}
}
}
