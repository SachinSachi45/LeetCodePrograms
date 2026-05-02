package lc.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class $1TwoSum {
	public static void main(String[] args) {
		int[] nums= {2,4,6,8};
		int target=10;
		int[] res= twoSum(nums,target);
		System.out.println(Arrays.toString(res));
	}

	private static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int reqNum=target-nums[i];
			if(map.containsKey(reqNum)) {
				int[] arr= {map.get(reqNum),i};
				return arr;
			}
			map.put(nums[i], i);
		}
		return null;
	}

}
