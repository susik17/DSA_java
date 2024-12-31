import java.util.*;
class MonkeyEatingBanans {
    static int maxvalue(int[] arr,int n){
        int max=arr[0];
        for(int i=1;i<=n-1;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int timeToEat(int[] arr,int n,int m){
        //Handle overflow
        long total_time=0;
        for(int i=0;i<=n-1;i++){
            total_time+=Math.ceil((double)arr[i]/(double)m);
        }
        return (int) total_time;
        
    }
    //optimal
    static int MonkeyEatBananas(int[] arr,int n,int h){
        int low=1;
        //int max=maxvalue(arr,n);
        int max=Arrays.stream(arr).max().getAsInt();
        int high=max;
        int ans=max;
        while(low<=high){
            int mid=(low+high)/2;
            int x=timeToEat(arr,n,mid);
            if(x<=h){
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
    //brute
    static int MonkeyEatBananas(int[] arr,int n,int h){
        for(int m=1;m<=maxvalue(arr,n);m++){
            int x=timeToEat(arr,n,m);
            if(x<=h){
            return m; 
            }
        }
        return -1;
    }
    */
        
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int h = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print(MonkeyEatBananas(arr,n,h));
        
    }
}
/*
ip1:
6 28
1 4 3 6 7 7
op1:
1 
ip2:
3 6
3 9 6 
op2:
3
*/