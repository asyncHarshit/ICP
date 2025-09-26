package assignment1;

import java.util.Arrays;

public class minimum_no_arrow_toburst_ballon {
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