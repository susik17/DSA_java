import java.util.*;
class Solution {
    public static String reverseWords(String str) {
        // Split the string into words using whitespace as delimiter
        String[] words = str.trim().split("\\s+");
        
        // Use a StringBuilder to construct the result
        StringBuilder ans = new StringBuilder();
        
        // Traverse the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            ans.append(words[i]).append(" ");
        }
        
        // Remove the trailing space and return the result
        return ans.toString().trim();
    }

    /* 
    public static String reverseWords(String text) {
        int n = text.length();
        int end_ptr = n-1;
        StringBuilder ans = new StringBuilder();
        
        for(int i = n-1;i>=0;i--){
            if(text.charAt(i)== ' '){
                if(i+1<=end_ptr){
                ans.append(text.substring(i+1,end_ptr+1));
                ans.append(" ");
                }
                end_ptr = i-1;
            }
            else if(i==0){
                ans.append(text.substring(i,end_ptr+1));
            }
            
        }
        return ans.toString();
        
        
    }
*/
}