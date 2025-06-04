import java.util.*;
class Main { 
    //Note: USe helper function if arguments are not given -likebelow 
    /* 
    class Solution {
    boolean isPalindrome(String s) {
        return helper(s, 0);
    }

    boolean helper(String s, int i) {
        int n = s.length();
        if (i >= n / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(n - i - 1)) {
            return false;
        }
        return helper(s, i + 1);
    }
}
*/
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