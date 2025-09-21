import java.util.*;

class Solution {
    //Similar to fruits and basckets problem 
    //optimal 
    public static int longestSubstring(String s, int k) {
        int n = s.length();
        int i = 0,j = 0,ans = 0;
        Map<Character,Integer> m = new HashMap<>();
        while(j<n){
            m.put(s.charAt(j),m.getOrDefault(s.charAt(j),0)+1);
            while(m.size()>k){
                m.put(s.charAt(i) , m.get(s.charAt(i))-1);
                if(m.get(s.charAt(i)) == 0){ m.remove(s.charAt(i));}
                i++;
                
            }
            ans = Math.max(ans , j-i+1);
            j++;
        }
        return ans;
        
        
    }
}