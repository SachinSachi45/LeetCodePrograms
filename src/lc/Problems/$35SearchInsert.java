package lc.Problems;

public class $35SearchInsert {
	public static void main(String[] args) {
		int [] nums= {1,3,5,7};
		int target=8;
		System.out.println(search(nums,target));
	}

	private static int search(int[] nums, int target) {
		int start=0;
		int end=nums.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]<target)
			{
				start=mid+1;
			}
			else {
				end=mid-1;
			}
		}
		return start;
	}

}
