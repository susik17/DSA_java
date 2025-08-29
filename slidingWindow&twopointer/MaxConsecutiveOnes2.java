import java.util.*;

//consecutive along with can flip only one zero to 1
class Solution {
     public static int findMaxOnes(List<Integer> arr) {
        int longestSeq = 0;
        for (int left = 0; left < arr.size(); left++) {
            int numZeroes = 0;
            for (int right = left; right < arr.size(); right++) {
                if (arr.get(right) == 0) {
                    numZeroes++;
                }
                if (numZeroes <= 1) {
                    longestSeq = Math.max(longestSeq, right - left + 1);
                }else{
                    break;
                }
            }
        }
        return longestSeq;
    }

    //optimal - Sliding window using 2 pointers
    /* 
    public static int findMaxOnes(List<Integer> arr) {
        int n = arr.size();
       int left = 0,right  = 0;
       int zeroCount = 0 , longestSeq = 0;
       while(right < n){
           if(arr.get(right) == 0){
               zeroCount++;
           }
           while( zeroCount > 1){
               if(arr.get(left) == 0){
                   zeroCount--;
               }
               left++;
           }
           int windowSize = right-left+1;
           longestSeq = Math.max(longestSeq,windowSize);
           right++;
           
       }
       return longestSeq;
        
        
    }
       */
}