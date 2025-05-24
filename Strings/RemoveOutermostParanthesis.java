import java.util.*;

class Solution {
    public static String removeOutermostParentheses(String s) {
        int n = s.length();
        int count = 0;
        StringBuilder ans  = new StringBuilder();
        for(int i = 0;i<n;i++){
            if(s.charAt(i)=='('){
                if(count!=0){
                    ans.append(s.charAt(i));
                }
                count++;
            }
            else{
                count--;
                if(count!=0){
                    ans.append(s.charAt(i));
                }
            }
        }
        return ans.toString();
        
        
    }
    /*
    //Using character array
     public static String removeOutermostParentheses(String s) {
        //Write your code here...
        int count = 0;
        StringBuilder ans = new StringBuilder();
        for(char c:s.toCharArray()){
            if(c=='('){
                if(count != 0) ans.append(c);
                count += 1;
            }
            else{
                count -= 1;
                if(count != 0) ans.append(c);
            }
        }
        return ans.toString();
        
        
    }
    */
    
}
/*
IP:
((())(()))(()(()))
OP:
(())(())()(())