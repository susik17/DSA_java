import java.util.*;
class Main {
    static Boolean palindromecheck(int i,String S){
        int n=S.length();
        if (i>=n/2){
            return true;
        }
        if (S.charAt(i)!=S.charAt(n-i-1)){
            return false;
        }
        return palindromecheck(i+1,S);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        Boolean result=palindromecheck(0,S);
        System.out.print(result);
        sc.close();
        
    }
}