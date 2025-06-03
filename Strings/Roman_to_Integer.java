import java.util.*;

class Solution {
    public static int romanToInteger(String s) {
        Map<Character,Integer> m = new HashMap<>();
        m.put('I',1);
        m.put('V',5);
        m.put('X',10);
        m.put('L',50);
        m.put('C',100);
        m.put('D',500);
        m.put('M',1000);
        int n = s.length();
        int prev = m.get(s.charAt(n-1));
        int ans = prev;
        for(int i= n-2;i>=0;i--){
            int curr = m.get(s.charAt(i));
            if(curr>=prev){
                ans += curr;
            }
            else{
                ans -= curr;
            }
            prev = curr;
        }
        return ans;
    }

/*
ip:
s = "XLVII"
op:
47
*/
}
