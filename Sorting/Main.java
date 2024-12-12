import java.util.Scanner;
public class Main {
    static void insertion_sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i;
            while (j >= 1 && (arr[j-1] < arr[j])){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        insertion_sort(arr, n);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
