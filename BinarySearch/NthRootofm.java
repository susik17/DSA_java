import java.util.Scanner;

class NthRootofm{
    //To Handle overflows
    static int power(int mid, int n, int m) {
        long ans=1;
        for (int i=0; i < n; i++) {
            ans = ans*mid;
            if (ans > m)
                return 1;
        }
        if (ans == m)
            return 0;
        else
            return -1;
    }

    static int findNthrootofM(int n, int m) {
        int low = 1;
        int high = m;
        while (low <= high) {
            int mid = (low + high) / 2;
            int x = power(mid, n, m);
            if (x == 0) {
                return mid;
            }
            if (x == -1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    
    /*
    static int power(int k,int n){
        int ans=1;
        for(int i=0;i<=n-1;i++){
            ans=ans*k;
        }
        return ans;
    }
    //optimal 
    static int findNthrootofM(int n, int m) {
        int low=1;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            int x=power(mid,n);
            if(x==m){
                return mid;
            }
            else if(x>m){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    
    
    //bruteforce
    static int findNthrootofM(int n, int m) {
        for(int k=0;k<=m;k++){
            int x=power(k,n);
            if(x==m){
                return k;
            }
            else if(x>m){
            return -1;
            }
        }
            return -1;

    }
    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.print(findNthrootofM(n, m));
        
    }

}
/*
 ip:3 64
 op:4
 */