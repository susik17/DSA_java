import java.util.Scanner;
class SquareRoot {
    //optimal-binarySearch
    static int findSquareroot1(int n){
        int ans=-1;
        int low=0;
        int high=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;
    }
    //brute-linear approach
    /* 
    static int findSquareroot(int n){
        int ans=-1;
        for(int k=0;k<n;k++){
            if(k*k<=n){
                ans=k;
            }
            else{
                break;
            }
        }
        return ans;
    }
    */
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(findSquareroot1(n));
        
    }
}

/*
ip1:25
op1:5
ip2:7 
op2:2
*/
