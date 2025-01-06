import java.util.*;
class SubsequencesPrint {

    public static void printSubsequencesSumk(int i, List<Integer> v,int sum, int[] arr, int n,int k) {
        if (i >= n) {
            if(sum==k){
                for(int num : v){
                System.out.print(num + " ");
                }
                System.out.println();
                }
            
            return;
        }
        // Pick
        v.add(arr[i]);
        sum+=arr[i];
        printSubsequencesSumk(i+1,v,sum,arr,n,k);

        // Not Pick
        v.remove(v.size() - 1);
        sum-=arr[i];
        printSubsequencesSumk(i+1,v,sum,arr,n,k);
        
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int sum=0;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        List<Integer> v = new ArrayList<>();
        printSubsequencesSumk(0, v,sum,arr,n,k);
    }
}
/*
ip:
3 9
4 5 9
op:
4 5 
9 
*/
