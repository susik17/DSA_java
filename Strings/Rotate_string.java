import java.util.*;

class Solution {
    //optimal 
    static void calculate_lps(int[] lps, String p){
        lps[0] = 0;
        int i = 0,j = 1;
        int n = p.length();
        while(j < n){
            if(p.charAt(i) == p.charAt(j)){
                lps[j] = i+1;
                i++;
                j++;
                }
            //equal
            else{
                 if(i == 0){
                    lps[j] = 0;
                    j++;
                }
                else{
                    i = lps[i-1];
            }
        }
    }
    }
    public static boolean patternMatching(String text, String pattern) {
        int m = text.length();
        int n = pattern.length();
        int[] lps = new int[n];
        int i = 0,j=0;
        calculate_lps(lps,pattern);
        while(i < m){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }
            else{
               if(j!=0){
                   j = lps[j - 1];
               }
               else{
                   i++;}
            }
            if(j == n) return true;
        }
       return false; 
    }
    
     public static boolean rotateString(String s, String target) {
        if(s.length()!=goal.length()){ return false;}
         String s1 = s+s;
         return patternMatching(s1,target);
     }
    /*
    //brute force - O(n^2)
       public static boolean rotateString(String s, String target) {
           int n = s.length();
           for(int k=0;k<n;k++){
               boolean is_equals = true;
               for(int i =0;i<n;i++){
                   if(s.charAt((i+k)%n) != target.charAt(i)){
                       is_equals = false;
                   }
               }
               if(is_equals){
                    return true;
               }
           }
           return false;
        }
        */
}
