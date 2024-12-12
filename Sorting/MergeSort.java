import java.util.Scanner;
public class Main {
    static void Merge(int[] arr,int left,int mid,int right){
        int i=left,j=mid+1,k=0;
        int n=right-left+1;
        int [] new_arr=new int[n];
        while(i<=mid&&j<=right){
            if(arr[i]<arr[j]){
                new_arr[k]=arr[i];
                i++;
                k++;
            }
            else{
                new_arr[k]=arr[j];
                j++;
                k++;
            }
        }
        while(i<=mid){
                new_arr[k]=arr[i];
                i++;
                k++;
        }
        while(j<=right){
                new_arr[k]=arr[j];
                j++;
                k++;
        }
        
        for(int c=0;c<=n-1;c++){
            arr[left+c]=new_arr[c];
        }
    }
    static void MergeSort(int[] arr,int start,int end) {
        
        if(start==end){
            return;
        }
        int mid=(start+end)/2;
        MergeSort(arr,start,mid);
        MergeSort(arr,mid+1,end);
        Merge(arr,start,mid,end);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int start=0;
        int end=n-1;
        MergeSort(arr,start,end);
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}