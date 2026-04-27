package lc.Problems;

//TC:O(n),SC:O(1)
public class $80RemoveDuplicatesFromSortedArray2 {
public static void main(String[] args) {
	int nums[] = {1,1,2,2,2,2,3,3,4,4};
	System.out.println(removeDuplicates(nums));
}

private static int removeDuplicates(int[] nums) {
	int i=0;
    for(int n:nums){
        if(i<2 || n!=nums[i-2]){
            nums[i++]=n;
        }
    }
    return i;
}
}
