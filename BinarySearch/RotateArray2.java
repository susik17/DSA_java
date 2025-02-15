import java.util.Scanner;
class RotatedArraySearch2{
    //Array with dublicate values
    static int SearchRotatedArray2(int []arr,int n,int x){
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==x){
                return 1;
            }
            if(arr[low]==arr[mid]&&arr[mid]==arr[high]){
                low=low+1;
                high=high-1;
                
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
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(SearchRotatedArray2(arr,n,x));

    }
}
/*
ip1:
9 4
10 11 12 4 5 7 7 7 9 
op1:
1
ip2:
10 4
5 5 5 5 4 5 5 5 5 5
op2:
1
*/
