import java.util.*;
class CountSubsequencesSumk {
    public static int printSubseq(int i, int sum, int[] arr, int n, int k) {
        if (i >= n) {
            if (sum == k) {
                return 1;
            }
            return 0;
        }
        // Pick
        sum += arr[i];
        int left = printSubseq(i + 1, sum, arr, n, k);

        // Not pick
        sum -= arr[i];
        int right = printSubseq(i + 1, sum, arr, n, k);

        return left + right;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(printSubseq(0, 0, arr, n, k));
        scanner.close();
    }
}
