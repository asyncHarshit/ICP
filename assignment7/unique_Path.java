public class unique_Path {
    class Solution {
    public int uniquePaths(int m, int n) {
        int visited[][] = new int[m][n];
        
        return solve(m , n , visited , 0 , 0);
    }

    public int solve(int m , int n ,int[][] visited ,int i , int j){
        if(i == m-1 && j == n-1){
            visited[i][j] = 1;
            return 1;
        }

        if(i < 0 || j < 0 || i >= m || j >=n){
            return 0;
        }

        if(visited[i][j] != 0){
            return visited[i][j];
        }

        int right = solve(m , n , visited ,  i , j+1);
        int down = solve(m , n ,visited ,  i+1 , j);

        visited[i][j] = right + down;

        return visited[i][j];
    }
}
    
}
