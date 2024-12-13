import java.util.*;
class RemoveDuplicates{
    static int RemoveDuplicates(int[] arr, int n) {
        int i=0;
        for(int j=1;j<=n-1;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        int unique_count=RemoveDuplicates(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nunique elements:"+unique_count);
        
    }
}
/*
input
10
3 3 5 5 7 7 9 9 9 9
output
3 5 7 9 7 7 9 9 9 9 
unique elements:4
*/

