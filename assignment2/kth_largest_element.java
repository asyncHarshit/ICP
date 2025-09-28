package assignment2;

import java.util.PriorityQueue;

public class kth_largest_element {
    class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);

        for(int i : nums){
            pq.offer(i);
        }

        for(int i=1;i<k;i++){
            pq.poll();
        }

        return pq.peek();
        
    }
}
    
}
