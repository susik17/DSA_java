import java.util.Scanner;
class CeiltheFloor {
    static int CeilValue(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]>=x){
               ans=arr[mid];
               high=mid-1;
           }
           else{
               low=mid+1;
           }
        }
        return ans;
        
    }
    static int FloorValue(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]<=x){
               ans=arr[mid];
               low=mid+1;
           }
           else{
               high=mid-1;
           }
        }
        return ans;
        
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(FloorValue(arr,n,x)+" "+CeilValue(arr,n,x));
        
        
    }
}
/*
ip1:
5 12
5 10 15 20 25
op1:
10 15
ip2:
7 30
5 10 10 15 15 20 25
op2:
25 -1
*/

