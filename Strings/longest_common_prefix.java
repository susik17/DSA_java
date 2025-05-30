import java.util.*;

class Solution {
    public static String longest_common_prefix(List<String> words) {
       int n = words.size();
       int k = 0;
       if(n == 0 ) return " ";
       if(n == 1) return words.get(0);
       while(true){
       for(int i = 0;i<n;i++){
           if(k == words.get(i).length() || k == words.get(0).length()) { 
               return words.get(0).substring(0,k);
           }
           if(words.get(i).charAt(k)!=words.get(0).charAt(k)){
               return words.get(0).substring(0,k);
           }
           
       }
       k++;
      }
    }
}
/*
ip:
n = 4
words = ["cloud", "close", "clear", "cluster"] 
op:
"cl"
*/

