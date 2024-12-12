import java.util.Scanner;
class Main {
    static void selectionsort(int[] arr,int n){
        for(int i=0;i<n-1;i++){
            int min_indx=i;
            for(int j=i+1;j<n;j++){
                if (arr[min_indx]>arr[j]){
                    min_indx=j;
                }
            }
            int temp=arr[min_indx];
            arr[min_indx]=arr[i];
            arr[i]=temp;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        selectionsort(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}