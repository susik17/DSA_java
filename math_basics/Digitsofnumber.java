import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // print digits of number 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n!=0){
            int lastdigit=n%10;
            n=n/10;
            System.out.print(lastdigit+" ");
            
        }
    }
}

