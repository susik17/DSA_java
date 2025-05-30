
class Solution {
    public static String largestOddNumber(String s) {
        for(int i = s.length()-1;i>=0;i--){
            //odd
            if((s.charAt(i) - '0')%2 != 0){
                return s.substring(0,i+1);
            }
        }
        return " ";
    /* 
    public static String largestOddNumber(String s) {
        //my way
        StringBuilder ans = new StringBuilder();
        ans.append(s);
      for(int i = s.length()-1;i>=0;i--){
          //even no
          if((Character.getNumericValue(s.charAt(i)))%2==0){
              ans.deleteCharAt(i);
          }
          else{break;}
      }
      return ans.toString();
      */
    }

}
/*
Sample Input 1
23467850
Sample Output 1
2346785
Sample Input 2
6804
Sample Output 2
" "
*/
