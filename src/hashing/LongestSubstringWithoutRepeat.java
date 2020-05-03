package hashing;

import java.util.HashMap;
import java.util.Map;

/*
 *Given a string, find the length of the longest substring without repeating characters.
 */

public class LongestSubstringWithoutRepeat {
	public int lengthOfLongestSubstring(String A) {
        Map<Character, Integer> hm=new HashMap<>();
        int count=0;
        int max=0;
        for(int i=0;i<A.length();){
            char temp=A.charAt(i);
            if(hm.get(temp)!=null){
                count--;
            }
            else{
                hm.put(temp,1);
                i++;
                count++;
                max=Math.max(max, count);
            }
        }
        return max;
    }
}
