import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //  print all divisors of a number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                if(i!=n/i){
                    System.out.print(n/i+" ");
                }
            }
        }
       
    }
}

