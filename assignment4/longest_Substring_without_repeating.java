package assignment4;

import java.util.HashMap;

public class longest_Substring_without_repeating {
    class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int windowEnd = 0;
        int windowStart = 0;
        int maxLen = Integer.MIN_VALUE;

        while(windowEnd<s.length()){
            char ch = s.charAt(windowEnd);
            if(map.containsKey(ch) && windowStart<=map.get(ch)){
                windowStart = map.get(ch)+1;
            }
            map.put(ch,windowEnd);
            maxLen = Math.max(maxLen,windowEnd-windowStart+1);
            windowEnd++;
        }

        return (maxLen==Integer.MIN_VALUE)?0:maxLen;

        
    }
}
    
}
