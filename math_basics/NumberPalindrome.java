import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // Number palindrome check
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        int x=0;
        while(n!=0){
            int lastdigit=n%10;
            x=x*10+lastdigit;
            n=n/10;
        }
        if (x==num){
            System.out.print("palindrome");
        }
        else{
            System.out.print("Not Palindrome");
        }
    }
}

