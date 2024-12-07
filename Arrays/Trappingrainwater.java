

import java.util.Scanner;

public class Trappingrainwater {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        printarray(n,arr);
        


    }
    public void printarray(int num,int[] arr){
        for(int i=0;i<num;i++){
            System.out.print(arr[i]+" ");
        }
        

    }
    
    
}
