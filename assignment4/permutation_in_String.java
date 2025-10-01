package assignment4;

public class permutation_in_String {
    class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();

        if(l1 > l2) return false;

        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for(int i = 0; i < l1; i++) {
            count1[s1.charAt(i) - 'a']++;
            count2[s2.charAt(i) - 'a']++;
        }

        if(matches(count1, count2)) return true;

        for(int i = l1; i < l2; i++) {
            count2[s2.charAt(i) - 'a']++; 
            count2[s2.charAt(i - l1) - 'a']--;

            if(matches(count1, count2)) return true;
        }

        return false;
    }

    public boolean matches(int[] count1, int[] count2) {
        for(int i = 0; i < 26; i++) {
            if(count1[i] != count2[i]) return false;
        }
        return true;
    }
}
    
}
