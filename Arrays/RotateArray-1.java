import java.util.*;
class RotateArray {
     static void leftRotate(int[] arr, int n) {
        int temp=arr[0];
        for(int i=1;i<=n-1;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        leftRotate(a,n);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
/*
ip 
6
1 2 3 4 5 6 
op 
2 3 4 5 6 1 
*/
        