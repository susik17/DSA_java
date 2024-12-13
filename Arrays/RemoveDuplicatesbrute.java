//brute force approach
import java.util.*;
public class RemoveDuplicatesbrute {
    public static int removeDuplicates(int[] a, int n) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(a[i]);
        }
        int j = 0;
        for (int k : set) {
            a[j] = k;
            j++;
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int uniqueCount = removeDuplicates(a, n);
        System.out.println(uniqueCount);
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
/*
input
10
3 3 5 5 7 7 9 9 9 9
output
4
3 5 7 9 7 7 9 9 9 9 
*/
