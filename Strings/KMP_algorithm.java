import java.util.*;

class Solution {
    //Brute force - O(m*n)
    /* 
     public static int patternMatching(String text, String pattern) {
        int m = text.length();
        int n = pattern.length();

        for (int i = 0; i <= m - n; i++) {
            int j;
            for (j = 0; j < n; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            
            if (j == n) {
                return i;
            }
        }
        
        return -1;
    }
*/
//optimal -  O(m+n)
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
    public static int patternMatching(String text, String pattern) {
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
            if(j == n) return i - j;
        }
       return -1; 
    }
    
}
/*
ip:
text = "abbdabcabcabe"
pattern = "abcab
op:
6
*/