package lcWorkingExample;

import java.util.Arrays;

public class $26RemoveDuplicateFromSortedArrayAndCountUniqElements
{
	public static void main(String[] args) {
		int[] nums= {2,3,4,4,5,5,6,8};
		System.out.println(removeDup(nums));
	}

	private static int removeDup(int[] arr) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(i<arr.length-1 && arr[i]==arr[i+1]) {
				continue;
			}
			else {
				arr[count]=arr[i];
				count++;
			}
		}
		return count;
	}
}
