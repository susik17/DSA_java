import java.util.*;
class LinearSearch {
    static int findk(int[] arr,int n,int k) {
        for(int i=0;i<=n-1;i++){
            if(arr[i]==k){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int ans=findk(a,n,k);
        System.out.print(ans);
    }
}
/*
ip 1
6 7
1 2 3 4 5 6 
op 1
-1
ip 2
6 3
1 2 3 4 5 6
op 2
2
*/
        
