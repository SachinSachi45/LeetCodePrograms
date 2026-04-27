package lc.Problems;
//using moores voting alg
//TC:O(n)Linear TC,SC:O(1)
public class $169MajorityElement {
 public static void main(String[] args) {
	int[] ar= {3,2,3};
	majorityEle(ar);
}

private static void majorityEle(int[] ar) {

	int cand=0;
	int count=0;
	for(int i=0;i<ar.length;i++) {
		if(count==0) {
			cand=ar[i];
		}
		if(cand==ar[i]) {
			count++;
		}else
		{
			count--;
		}
	}
	System.out.println("Majority Element is: "+cand);
}
}
