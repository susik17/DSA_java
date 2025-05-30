import java.util.*;

class Solution {
    public static boolean isomorphic(String s1, String s2 ){
        return helper(s1,s2)&&helper(s2,s1);
    }
    static boolean helper(String s1,String s2){
        HashMap<Character,Character> m = new HashMap<>();
        if(s1.length()!=s2.length()){ return true;}
        for(int i=0;i<s1.length();i++){
            //char at s1[i] is not mapped yet
            if(!m.containsKey(s1.charAt(i))){
                //mapping it with s2[i]
                m.put(s1.charAt(i),s2.charAt(i));
            }
            //s1[i] char is already mapped to diff char at s2
            else if(m.get(s1.charAt(i))!=s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
}
/*
ip:
moon
feed
op:
true
*/
