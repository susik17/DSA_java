import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //  reverse of number
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=0;
        while(n!=0){
            int lastdigit=n%10;
            x=x*10+lastdigit;
            n=n/10;
        }
        System.out.print(x);
    }
}

