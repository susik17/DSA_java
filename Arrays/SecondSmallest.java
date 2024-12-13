import java.util.*;
class SecondLargest{
    static int secondSmallestElement(int[] arr, int n) {
        int min=arr[0];
        int secondsmallest=9999999;//can replace with INT_max value
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                secondsmallest=min;
                min=arr[i];
            }
            if((arr[i]>min)&&(arr[i]<secondsmallest)){
                secondsmallest=arr[i];
            }
        
        }
        return secondsmallest;
     }
     public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int s_small=secondSmallestElement(arr,n);
        System.out.print(s_small);
        
    }
}
/*
input
7
3 45 67 89 23 45 90
output
23
*/
