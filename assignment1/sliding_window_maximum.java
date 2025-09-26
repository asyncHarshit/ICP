package assignment1;

import java.util.ArrayDeque;
import java.util.Deque;

public class sliding_window_maximum {

    class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int res[] = new int[n-k+1];
        int idx = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i=0;i<n;i++){


            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.pollLast();
            }

            dq.offerLast(i);

            if(i>=k-1){
                res[idx++] = nums[dq.peekFirst()];

            }
        }

        return res;
        
    }
    }
    
}
