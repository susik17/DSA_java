import java.util.Scanner;

class MissingNum {
    //optimal-2
    static int FindMissingNum(int[] arr, int n){
        int XOR1=0;
        int XOR2=0;
        for(int i=0;i<=n-2;i++){
            XOR1=XOR1^arr[i];
            XOR2=XOR2^(i+1);
        }
        return XOR1^XOR2^n;
    
    }
    /*
    //optimal-1
    static int FindMissingNum(int[] arr, int n){
        int sum1=(n*(n+1))/2;
        int sum2=0;
        for(int i=0;i<=n-2;i++){
            sum2+=arr[i];
        }
        return sum1-sum2;
    }
    
    //better-Hashing
     static int FindMissingNum(int[] arr, int n) {
         int[] temp=new int[n+1];
         for(int i=0;i<=n-2;i++){
             temp[arr[i]]=1;
         }
         for(int i=1;i<=n;i++){
             if(temp[i]==0){
                 return i;
             }
         }
         return -1;
     }
    //Bruteforce
    static int FindMissingNum(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            int present = 0; 
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] == i) {
                    present = 1; 
                    break;
                }
            }
            if (present==0) {
                return i;
            }
        }
        return -1;
    }
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); 
        int[] a = new int[n - 1];  
        for (int i = 0; i < n - 1; i++) {
            a[i] = scanner.nextInt();
        }
        int missing = FindMissingNum(a, n);
        System.out.print(missing);
    }
}

