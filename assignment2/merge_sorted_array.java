package assignment2;

import java.util.Arrays;

public class merge_sorted_array {
    class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {


        int idx = nums1.length - n;
        int c = 0;
        for(int i=idx;i<nums1.length;i++){
            nums1[i] = nums2[c];
            c++;
        }
        Arrays.sort(nums1);


        
    }
}
    
}
