import java.util.Scanner;
class Main {
    static int sum_of_nums(int n){
        if (n==1){
            return 1;
        }
       return n+sum_of_nums(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=sum_of_nums(n);
        System.out.print(sum);
    }
}

