import java.util.Scanner;
class RotatedArraySearch{
    //Array with unique  values
    /* 
    //brute-Linear
    static int SearchRotatedArray(int []arr,int n,int x){
        for(int i=0;i<=n-1;i++){
            if(arr[i]==x){
                return i;
            }
        }
        return -1;
    }
    */
    //optimal-BinarySearch
    static int SearchRotatedArray(int []arr,int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return mid;
            }
            //left-Sorted check
            else if(arr[low]<=arr[mid]){
                if(arr[low]<=x&&x<=arr[mid]){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            //Right-Sorted check
            else if(arr[mid]<=arr[high]){
                if(arr[mid]<=x&&x<=arr[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            
        }
        return -1;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(SearchRotatedArray(arr,n,x));

    }
}
/*
ip1:
9 4
10 11 12 4 5 6 7 8 9 
op1:
3
ip2:
9 13
10 11 12 4 5 6 7 8 9 
op2:
-1
*/

