import java.util.Scanner;
class Main {
    static void Bubblesort(int[] arr,int n){
        for (int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                if(arr[j+1]>arr[j]){
                    int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int [] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        Bubblesort(arr,n);
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*ip: 
5
12 3 56 7 90 
op:
3 7 12 56 90
*/ 
