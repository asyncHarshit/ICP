package assignment3;

import java.util.ArrayList;
import java.util.List;

public class spiral_matrix {
    class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
        List<Integer> map = new ArrayList<>();
        int m = arr.length;
        int n = arr[0].length;
        int left = 0;
        int right = n-1;
        int top = 0;
        int bottom = m-1;

        while(left<=right && top <= bottom){

            for(int i=left;i<=right;i++){
                map.add(arr[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                map.add(arr[i][right]);
            }
            right--;

            if(top<= bottom){
                for(int i=right;i>=left;i--){
                    map.add(arr[bottom][i]);
                }
                bottom--;
            }
            if(left <= right){
                for(int i=bottom;i>=top;i--){
                    map.add(arr[i][left]);
                }
                left++;
            }
            
            

            

        }
        return map;

        
    }
}
}
