import java.util.*;
class LargestElement{
    public static int largestElement(int[] arr, int n) {
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            } 
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int large=largestElement(arr,n);
        System.out.print(large);
        
    }
}
/*
ip:
6
12 34 56 78 90 100
op:
100
*/

