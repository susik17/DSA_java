import java.util.Scanner;
class Main {
    static void printnum(int i,int n){
        if (i==0){
            return;
        }
        System.out.print(i+" ");
        printnum(i-1,n);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printnum(n,1);
    }
}

