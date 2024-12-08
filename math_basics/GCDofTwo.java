import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //  GCD/HCF of two numbers 
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        while(n1!=0 && n2!=0){
            if(n1>=n2){
                n1=n1%n2;
            }
            else{
                n2=n2%n1;
            }
        }
         if(n1==0){
            System.out.print(n2);
        }
        else{
            System.out.print(n1);
        }
       
        
        
    }
}

