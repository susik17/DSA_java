import java.util.*;
class LongestSubArray{
    //optimal-only for +ve intergers
    static int LongestSubArray(int[]arr,int k){
        int n=arr.length;
        int max = 0;
        int i = 0, j = 0;
        long sum = arr[0];

        while (j < n) {
            if (sum == k) {
                if (j - i + 1 > max) {
                    max = j - i + 1;
                }
                j++;
                if (j < n) {
                    sum += arr[j];
                }
            } else if (sum < k) {
                j++;
                if (j < n) {
                    sum += arr[j];
                }
            } else if (sum > k) {
                if (i == j) {
                    i++;
                    j++;
                    if (j < n) {
                        sum = arr[j];
                    }
                } else {
                    sum -= arr[i];
                    i++;
                }
            }
        }

        return max;
    }
    /*
    //Better-both +ve and -ve numbers
    static int LongestSubArray(int[]arr,int k){
        int n=arr.length;
        int max=0;
        long sum=0;
        Map<Long, Integer> m = new HashMap<>();
        for(int i=0;i<=n-1;i++){
            sum+=arr[i];
            if(arr[i]==k){
                max=i+1;
            }
            if(m.containsKey(sum-k)){
                int len=i-m.get(sum-k);
                if(len>max){
                    max=len;
                }
            }
            if(!m.containsKey(sum)){
                m.put(sum,i);
            }
        }
        return max;
    }
    //BruteForce-Both +ve and -ve numbers
    static int LongestSubArray(int[]arr,int k){
        int n=arr.length;
        int max=0;
        for(int i=0;i<=n-1;i++){
            int sum=0;
            for(int j=i;j<=n-1;j++){
                    sum+=arr[j];
                    int len=j-i+1;
                    if(sum==k){
                        if(len>max){
                            max=len;
                        }
                    }
            }
            }
        return max;
        }
        */
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int k=sc.nextInt();
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        int ans=LongestSubArray2(arr,k);
        System.out.print(ans);
        
    }
}


/*
IP:
9 5
1 4 1 3 1 1 2 1 4
OP:
4
*/
