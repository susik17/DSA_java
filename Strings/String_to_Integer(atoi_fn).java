import java.util.*;

 class Solution {
    public static int stringToInteger(String s) {
        int n = s.length();
        long ans = 0;
        int sign = 1;
        int i = 0;
        //1.leading whitespace
        while(i < n && s.charAt(i)==' ') i++; 
        //2.sign determination
        if(s.charAt(i)=='+'){
            sign = 1;
            i++;
        }
        else if (i < n && s.charAt(i) == '-') {
            sign = -1;
            i++;
            
        }
        while(i < n && s.charAt(i)>='0' && s.charAt(i)<='9'){
            //3.number conversion
            int digit = s.charAt(i) - '0';
            ans = ans*10 + digit;
            //4.range handling
            if (ans > Integer.MAX_VALUE && sign == 1) return Integer.MAX_VALUE;
            if (-ans < Integer.MIN_VALUE && sign == -1) return Integer.MIN_VALUE;
            i++;
        }
        return (int) (ans*sign);
        
        
        
        
        
    }

}