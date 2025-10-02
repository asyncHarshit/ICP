package assignment5;

import java.util.Arrays;

public class boat_save_people {
    class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int left = 0;
        int right = n-1;
        int count = 0;
        while(left <= right){

            if(people[left] + people[right] > limit){
                count++;
                right--;
            }else if(people[right]+ people[left] <= limit){
                count++;
                right--;
                left++;
            }
        }

        return count;

    
        
    }
}
    
}
