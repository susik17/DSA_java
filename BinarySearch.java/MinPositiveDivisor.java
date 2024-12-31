import java.util.Scanner;

class MinPositiveDivisor {
    static int maxvalue(int[] arr,int n){
        int max=arr[0];
        for(int i=1;i<=n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int DivisionSum(int[] arr,int n,int d){
        int Division_total=0;
        for(int i=0;i<=n-1;i++){
            Division_total+=Math.ceil((double)arr[i]/(double)d);
        }
        return Division_total;
    }
    static int minimumPositiveDivisor(int[] arr, int n, int limit){
        int max=maxvalue(arr,n);
        //int max=Arrays.stream(arr).max().getAsInt();
        int low=1;
        int high=max;
        int ans=max;
        while(low<=high){
            int mid=(low+high)/2;
            if(DivisionSum(arr,n,mid)<=limit){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    /*
    //Brute
    public static int minimumPositiveDivisor(int[] arr, int n, int limit) {
        int max=Arrays.stream(arr).max().getAsInt();
        for(int d=1;d<=max;d++){
            if(DivisionSum(arr,n,d)<=limit){
                return d;
            }
        }
        return -1;
    
        
    }
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int limit = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(minimumPositiveDivisor(arr, n, limit));
    }
}
/*
ip:
5 11
9 35 19 17 7
op:
9 
*/