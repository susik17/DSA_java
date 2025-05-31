import java.util.*;

class Solution {
    //method-2 
    public static boolean validAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        StringBuilder s = new StringBuilder();
        s.append(s2);
        for(int i = 0;i< s1.length();i++){
            char c = s1.charAt(i);
            int index = s.indexOf(String.valueOf(c));
            //character found
            if(index != -1){
                s.deleteCharAt(index);
            }
            //character - not found
            else{
                return false;
            }
        }
        return s.length() == 0;
    }
    
    
    /*
    //method - 1(using sorting)
    public static boolean validAnagram(String s1, String s2) {
        if(s1.length() != s2.length()){
            return false;
        }
        char temp1[] = s1.toCharArray();
        char temp2[] = s2.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        return Arrays.equals(temp1,temp2);
    }
    */
    
}
