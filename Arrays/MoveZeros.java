import java.util.*;
class Main {
    //optimal
    static void MoveZeros(int[] arr,int n){
        int i=0;
        for(int j=0;j<=n-1;j++){
            if(arr[j]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                
            }
        }
    }
    
    /*
    //bruteforce
    static void MoveZeros(int[] arr,int n){
       Vector<Integer> v = new Vector<>();
       for(int i=0;i<=n-1;i++){
           if(arr[i]!=0){
               v.add(arr[i]);
           }
       }
       int j = 0;
       for (Integer num : v) {
             arr[j] = num; 
             j++;
        }
       for(int i=v.size();i<=n-1;i++){
           arr[i]=0;
       }
    }
    */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=input.nextInt();
        }
        MoveZeros(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
