import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        //  check prime or not 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for (int i=1;i*i<=n;i++){
            if(n%i==0){
                count+=1;
                if(i!=n/i){
                    count+=1;
                }
            }
        }
        if(count==2){
            System.out.print("prime");
        }
        else{
            System.out.print("Not Prime");
        }
       
    }
}

