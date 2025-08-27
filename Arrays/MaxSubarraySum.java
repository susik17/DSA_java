public import java.util.*;


class Solution {



    //bruteForce - O(n^3)
    public static int largestSubarraySum(int[] arr) {
        int n = arr.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += arr[k];
                }
                ans = Math.max(sum, ans);
            }
        }

        return ans;
    }
    /* 
    //better - O(n^2)
     public static int largestSubarraySum(int[] arr) {
        int n = arr.length;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }

    
    //optimal - Kadanes algorithms 
    public static int largestSubarraySum(int[] arr) {
        int n = arr.length;
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            
            currSum += arr[i];
            maxSum = Math.max(currSum,maxSum);
            if(currSum < 0){
                currSum = 0;
            }
            
        }
        return maxSum;
        
        
        
    }
*/
}

/*
ip:N = 4
arr = [4, -2, 6, -4]
op:8
 */

