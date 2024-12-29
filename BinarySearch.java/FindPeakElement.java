import java.util.Scanner;
class Peak {
    static int FindPeakElement1(int[] arr,int n){
        if(n==0){return 0;}
        if(arr[0]>arr[1]){return 0;}
        if(arr[n-1]>arr[n-2]){return n-1;}
        int low=1;
        int high=n-2;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[mid-1]&&arr[mid]>arr[mid+1]){
                return mid;
            }
            //upward-slope
            if(arr[mid]>arr[mid-1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
        
    }
    
    //BruteForce
    static int FindPeakElement(int[] arr,int n){
        if(n==0){return 0;}
        if(arr[0]>arr[1]){return 0;}
        if(arr[n-1]>arr[n-2]){return n-1;}
        for(int i=1;i<=n-2;i++){
            if((arr[i]>arr[i-1])&&(arr[i]>arr[i+1])){
                return i;
            }
        }
        return -1;
        
    }


    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();
       }
       System.out.print(FindPeakElement1(arr,n));
    }
}
/*
peakElement index return
ip:
11
1 2 3 4 5 6 7 8 4 2 1
op:
7
*/
