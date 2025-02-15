import java.util.Scanner;
class Minimum {
    //Time complexity:O(logn)
    static int MinimumRotatedArray(int[] arr,int n){
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    ans=arr[low];
                }
                low=mid+1;
            }
            else if(arr[mid]<=arr[high]){
                if(arr[mid]<ans){
                    ans=arr[mid];
                }
                high=mid-1;
            }
        }
        return ans;
        
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       System.out.print(MinimumRotatedArray(arr,n));
    }
}
/*
ip:
5
7 10 2 4 6 
op: 
2
*/