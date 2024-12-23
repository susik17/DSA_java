import java.util.Scanner;
class InsertPosition {
    static int SearchInsertPosition(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=n;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]>=x){
               ans=mid;
               high=mid-1;
           }
           else{
               low=mid+1;
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
        System.out.print(SearchInsertPosition(arr,n,x));
        
    }
}
/*
ip:
4 7
4 5 6 9
op:
3
*/