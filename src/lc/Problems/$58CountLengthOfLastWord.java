package lc.Problems;

//TC:O(n),SC:O(1)
import java.util.concurrent.CountDownLatch;

public class $58CountLengthOfLastWord {
	public static void main(String[] args) {
		String str="  Hello World  ";
		System.out.println(Count(str));
	}

	private static int Count(String s) {
		String str=s.trim();
		int count=0;
		for(int i=str.length()-1;i>=0;i--) {
			if(str.charAt(i)!=' ') {
				count++;
			}
			else {
				break;
			}
		}
		return count;
	}
}
