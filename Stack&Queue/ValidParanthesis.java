import java.util.*;
class Main {
    static boolean validParanthesis(String s){
        Stack<Character> st = new Stack<>();
        //Iterate using for(char ch : s.toCharArray()) -> O(n) for string - charArray Conversion
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('||ch == '{'||ch == '[') st.push(ch);
            else{
                if(st.empty()) return false;
                char top = st.peek();
                st.pop();
                if((top == '('&& ch == ')' )||
                  (top == '{'&& ch == '}' )||
                    (top == '['&& ch == ']' )){
                    continue;
                }
                else{
                    return false;
                }
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        String s = "()[{}()";
        System.out.println(validParanthesis(s));
    }
}

/*
ip: ()[{}()] op:true
ip: ()[{}() op: false
 */