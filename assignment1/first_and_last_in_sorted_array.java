package assignment1;

public class first_and_last_in_sorted_array {
    class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] arr = new int[2];
        arr[0] = first(nums, target);
        arr[1] = last(nums, target);
        return arr;
    }

    public static int first(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                ans = mid;
                end = mid - 1;  // Move left to find the first occurrence
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static int last(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == k) {
                ans = mid;
                start = mid + 1;  // Move right to find the last occurrence
            } else if (arr[mid] > k) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
}
    
}
