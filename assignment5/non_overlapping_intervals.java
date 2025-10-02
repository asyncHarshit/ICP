package assignment5;

import java.util.Arrays;

public class non_overlapping_intervals {
    class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {

        Arrays.sort(intervals , (a,b) -> a[1] - b[1]);
        int c = 0;
        int lastEnd = intervals[0][1];
        int n = intervals.length;
        for(int i=1;i<n;i++){
            if(intervals[i][0]<lastEnd){
                c++;
            }
            else{
                lastEnd = intervals[i][1];
            }
        }

        return c;
        
    }
}
    
}
