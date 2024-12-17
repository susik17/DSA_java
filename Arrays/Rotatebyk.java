import java.util.*;
class RotateArray {
    //optimal
    static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

    static void leftRotatebyk(int[] arr, int n,int k) {
        k=k%n;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0,n-1);
    }
    
    
    /*
    //brute force
     static void leftRotatebyk(int[] arr, int n,int k) {
         k=k%n;
        int[] temp;
        temp=new int[k];
        for(int i=0;i<=k-1;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<=n-1;i++){
            arr[i-k]=arr[i];
        }
        for(int i=n-k;i<=n-1;i++){
            arr[i]=temp[i-(n-k)];
        }
    }
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        leftRotatebyk(a,n,k);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
/*
ip 
6 4
1 2 3 4 5 6 
op 
5 6 1 2 3 4 
*/
        
