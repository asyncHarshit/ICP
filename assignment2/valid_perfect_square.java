package assignment2;

public class valid_perfect_square {
    class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while(start<=end){
            int mid = start + (end - start)/2;
            long div = (long) mid*mid;
            if(div==num){
                return true;
            }
            else if(div>num){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
        
    }
    }
    
}
