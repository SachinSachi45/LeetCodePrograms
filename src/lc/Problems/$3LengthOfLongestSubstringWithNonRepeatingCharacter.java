package lc.Problems;

import java.util.ArrayList;
import java.util.List;

public class $3LengthOfLongestSubstringWithNonRepeatingCharacter {
	public static void main(String[] args) {
		String s="abcabcbb";
		System.out.println(length(s));
	}

	private static int length(String s) {
		int start=0,end=0,max_len=0;
		List<Character> list = new ArrayList<>();
		while(end<s.length()) {
			if(!list.contains(s.charAt(end))) {
				list.add(s.charAt(end));
				end++;
				max_len=Math.max(max_len,list.size());
			}
			else {
				list.remove(Character.valueOf(s.charAt(end)));
				start++;
			}
		}
		return max_len;
	}
}
