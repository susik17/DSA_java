import java.util.Scanner;
class MaxConsecutiveOnes {
    static int MaximumConsecutiveones(int[] arr,int n){
        int current=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                current++;
                if(current>max){
                    max=current;
                }
                
            }
            else{
                current=0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int max = MaximumConsecutiveones(a, n);
        System.out.println(max);
    }
}
/*
ip:
10
1 0 1 1 0 1 1 1 1 0
op:
4
/
*/
