package assignment4;

public class max_consecutive_ones {
    class Solution {
    public int longestOnes(int[] nums, int k) {
        
        
        int max = 0;
        int n = nums.length;
        int start = 0;
        int end = 0;
        int zero = 0;
        while(end < n){
            if(nums[end] == 0){
                zero++;
            }
            end++;
            while(start < end && zero > k){
                if(nums[start] == 0){
                    zero--;
                }
                start++;
            }

            max = Math.max(max , end - start);
            
        }

        return max;
        
    }
}
    
}
