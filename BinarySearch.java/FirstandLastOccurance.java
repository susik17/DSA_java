import java.util.Scanner;
class FirstandLastOccurance {
    /*
    //Brute Force-linear Search
    static void FirstandLastOccurance(int[] arr,int n,int x){
        int first=-1;
        int last=-1;
        for(int i=0;i<=n-1;i++){
            if(arr[i]==x){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
        }
        System.out.print(first+" "+last+"\n");
    }
    */
    //optimal-Binary search
    static int FirstOccurance(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]==x){
               ans=mid;
               high=mid-1;
           }
           else if(arr[mid]>x){
               high=mid-1;
           }
           else{
               low=mid+1;
           }
           
        }
        return ans;
        
    }
    static int LastOccurance(int[] arr,int n,int x){
        int low=0;
        int high=n-1;
        int ans=-1;
        while(low<=high){
           int mid=(low+high)/2;
           if(arr[mid]==x){
               ans=mid;
               low=mid+1;
           }
           else if(arr[mid]>x){
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
        System.out.print(FirstOccurance(arr,n,x)+" "+LastOccurance(arr,n,x));
        
        
    }
}
/*
ip:
10 5
2 5 5 5 5 6 8 9 9 11 12
op:
1 4
*/

