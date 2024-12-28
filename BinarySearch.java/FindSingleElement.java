import java.util.Scanner;
class BinarySearch {
    /*
    //BruteForce
    static int FindSingleElement(int[] arr,int n){
         if(n==1){ return arr[0];}
        if(arr[0]!=arr[1]){
            return arr[0];
            
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        for(int i=1;i<=n-2;i++){
            if((arr[i]!=arr[i-1])&&(arr[i]!=arr[i+1])){
                return arr[i];
            }
        }
        return 0;
        
    }
    */
    
    static int FindSingleElement(int[] arr,int n){
        if(n==1){ return arr[0];}
        if(arr[0]!=arr[1]){
            return arr[0];
            
        }
        if(arr[n-1]!=arr[n-2]){
            return arr[n-1];
        }
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]!=arr[mid-1]&&arr[mid]!=arr[mid+1]){
                return arr[mid];
            }
            //(even,odd) pair case
            if(((mid%2==1)&&(arr[mid]==arr[mid-1]))||(mid%2==0)&&(arr[mid]==arr[mid+1])){
                low=mid+1;
            }
            //(odd,even) pair case
            else{
                high=mid-1;
            }
        }
        return 0;
        
    }
    
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       System.out.print(FindSingleElement(arr,n));
    }
}
/*
ip:
11
2 2 4 4 6 6 7 8 8 9 9
op: 
7
*/

