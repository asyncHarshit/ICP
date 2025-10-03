public class word_search {
    class Solution {
    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == word.charAt(0) && find(board , word , i , j , 0)){
                    return true;
                }

            }
        }
        return false;
        
    }

    public boolean find(char[][] board , String word , int row , int col , int idx){

        if(idx == word.length()){
            return true;
        }

        if(row < 0 || col < 0 || row >= board.length || col>= board[0].length || board[row][col] != word.charAt(idx)){
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '$';

        int dir[][] = {
            {row +1 , col} , {row-1 , col} , {row , col+1} , {row , col-1}
        };

        for(int d[] : dir){
            int dx = d[0];
            int dy = d[1];
            if(find(board , word , dx , dy , idx+1)){
                return true;
            };
        }


        board[row][col] = temp;


        return false;

    }
}
    
}
