package assignment3;
public class number_Of_Islands {
    class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int m = grid.length;
        int n = grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1'){
                    count++;
                    clear(grid , i , j);
                }
            }
        }

        return count;
    }

    public void clear(char grid[][] , int row , int col){

        if(row < 0 || col < 0 || row >= grid.length || col >=grid[0].length || grid[row][col] == '0') return;
        grid[row][col] = '0';

        int adj[][] = {
            {row+1 , col} , {row-1 , col} , {row , col+1} , {row , col-1}
        };

        for(int i[] : adj){
            int dx = i[0];
            int dy = i[1];
            clear(grid , dx , dy);
        }
        
    }
}
    
}
