import java.util.*;
class SubsequencesPrint {
    //print non-picking elements first
    public static void printSubsequences(int i, List<Integer> v, int[] arr, int n) {
        if (i >= n) {
            for (int k : v) {
                System.out.print(k + " ");
            }
            System.out.println();
            return;
        }
        printSubsequences(i + 1, v, arr, n);

        // Pick
        v.add(arr[i]);
        printSubsequences(i + 1, v, arr, n);
        // Not Pick
        v.remove(v.size() - 1);
        
        
    }
    
    /*
    //print picking elements first
    public static void printSubsequences(int i, List<Integer> v, int[] arr, int n) {
        if (i >= n) {
            for (int k : v) {
                System.out.print(k + " ");
            }
            System.out.println();
            return;
        }

        // Pick
        v.add(arr[i]);
        printSubsequences(i + 1, v, arr, n);

        // Not Pick
        v.remove(v.size() - 1);
        printSubsequences(i + 1, v, arr, n);
        
    }
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> v = new ArrayList<>();
        printSubsequences(0, v, arr, n);
    }
}
/*
ip:
3 
4 5 6
op:

6 
5 
5 6 
4 
4 6 
4 5 
4 5 6 
*/