class Solution{

    //flip atmost k zeros to one 
public static int findMaxOnes(List<Integer> arr , int k) {
        int n = arr.size();
       int left = 0,right  = 0;
       int zeroCount = 0 , longestSeq = 0;
       while(right < n){
           if(arr.get(right) == 0){
               zeroCount++;
           }
           while( zeroCount > k){
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
}
