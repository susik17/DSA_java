import java.util.*;
class Print1SubsequenceSumk {
    static boolean printSubsequence(int i, ArrayList<Integer> v, int sum, int[] arr, int n, int k) {
        if (i >= n) {
            if (sum == k) {
                for (int x : v)
                    System.out.print(x + " ");
                System.out.println();
                return true;
            }
            return false;
        }
        // Pick
        v.add(arr[i]);
        sum += arr[i];
        if (printSubsequence(i + 1, v, sum, arr, n, k)) return true;

        // Not pick
        v.remove(v.size() - 1);
        sum -= arr[i];
        if (printSubsequence(i + 1, v, sum, arr, n, k)) return true;

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        ArrayList<Integer> v = new ArrayList<>();
        printSubsequence(0, v, 0, arr, n, k);
    }
}