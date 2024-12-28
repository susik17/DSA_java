import java.util.Scanner;
class Minimum {
    static int MinimumRotations(int[] arr,int n){
        int low=0;
        int high=n-1;
        int ans=Integer.MAX_VALUE;
        int ans_index=-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    ans=arr[low];
                    ans_index=low;
                }
                low=mid+1;
            }
            else if(arr[mid]<=arr[high]){
                if(arr[mid]<ans){
                    ans=arr[mid];
                    ans_index=mid;
                }
                high=mid-1;
            }
        }
        return ans_index;
        
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       System.out.print(MinimumRotations(arr,n));
    }
}
/*
ip:
5
4 5 1 2 3
op: 
2
*/
