package assignment5;

import java.util.Arrays;

public class min_arrow_to_burst_baloon {
    class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrow = 1;
        int lastEnd = points[0][1];
        
        for(int point[] : points){
            if(point[0] > lastEnd){
                arrow++;
                lastEnd = point[1];
            }
        }

        for(int i[] : points){
            System.out.println(i[0]+"->"+i[1]);
        }
        return arrow;
        
        
    }
}
    
}
