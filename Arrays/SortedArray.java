import java.util.*;
class SortedArray{
    static boolean SortedArray(int[] arr, int n) {
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
            /*
            if(arr[i]<=arr[i+1]){//do nothing
            }
            else{
                return false;
            }*/
        }
        return true;

    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        boolean ans=SortedArray(arr,n);
        System.out.print(ans);
    }
}
/*
input
7
3 45 67 89 23 45 90
output
false
*/


