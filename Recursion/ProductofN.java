import java.util.Scanner;
class Main {
    static int prod_of_nums(int n){
        if (n==1||n==0){
            return 1;
        }
       return n*prod_of_nums(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorial=prod_of_nums(n);
        System.out.print(factorial);
    }
}


