package lc.Problems;

import java.util.HashMap;
import java.util.Map;

public class $219RemoveDuplicate2 {
 public static void main(String[] args) {
	int [] nums= {1,2,3,1};//prevInd-preInd=<=k
	int k=3;
	System.out.println(isDuplicate(nums,k));
}

private static boolean isDuplicate(int[] nums, int k) {

	Map<Integer, Integer> hm = new HashMap<>();
	for(int i=0;i<nums.length;i++) {
		if(!hm.containsKey(nums[i])) {
			hm.put(nums[i], i);
		}
		else {
			int prevIndex=hm.get(nums[i]);
			if(Math.abs(prevIndex-i)<=k){
				return true;
			}
			else
			{
				hm.put(nums[i], i);
			}
		}
	}
	return false;
}
}
