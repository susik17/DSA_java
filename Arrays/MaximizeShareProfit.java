
class Solution{
    /* 
    //Brute Force - O(n^2) ,O(1)
    public static int maximizeShareProfit(int[] arr) {
        int maxprofit = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i = 0;i < n ;i++){
            for(int j = i+1;j<n;j++){
                if(arr[j] > arr[i]){
                    int profit = arr[j] - arr[i];
                    maxprofit = Math.max(profit,maxprofit);
                }
            }
        }
        return maxprofit;
        
        
    }
        */
    //optimal - o(n) , O(1)
     public static int maximizeShareProfit(int[] arr) {
        int n = arr.length;
        int maxprofit = 0;
        int minimum = arr[0];
        for(int i = 1;i < n ;i++){
                    int profit = arr[i] - minimum;
                    maxprofit = Math.max(profit,maxprofit);
                    minimum = Math.min(minimum,arr[i]);
                    
                }
        return maxprofit;
    }
}