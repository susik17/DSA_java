import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // Count number of digits
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n!=0){
            int lastdigit=n%10;
            n=n/10;
            count+=1;
        }
        System.out.print(count);
    }
}

