import java.util.*;
class SmallestElement{
    public static int SmallestElement(int[] arr, int n) {
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            } 
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int small=SmallestElement(arr,n);
        System.out.print(small);
        
    }
}
/*
ip:
6
12 34 56 78 90 100
op:
12
*/


