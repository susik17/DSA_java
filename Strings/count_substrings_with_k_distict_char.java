import java.util.*;

class Solution {
    //optimal - O(n)
    static Long f(String s,int k){
        int n = s.length();
        long ans = 0;
        int i = 0,j=0;
        int  count = 0;
        int[] arr = new int[26];
        while(j<n){
            if(arr[s.charAt(j)-'a'] == 0) count+=1;
                arr[s.charAt(j)-'a'] += 1;
                while(count == k){
                    ans += n - j;
                    arr[s.charAt(i)-'a'] -= 1;
                    if(arr[s.charAt(i)-'a'] == 0){count -= 1;}
                    i++;
                }
                j++;
            }
        
        return ans;
    }
    public static Long substringCount(String s, int k) {
        return f(s,k) - f(s,k+1);
   }
}
//brute force - O(n^2)
    /*
    public static Long substringCount(String s, int k) {
        long ans = 0;
        int n = s.length();
       for(int i=0;i<n;i++){
            int count = 0;
            int[] arr = new int[26];
            Arrays.fill(arr,0);
            for(int j=i;j<n;j++){
                if (arr[s.charAt(j)-'a'] == 0){
                    arr[s.charAt(j)-'a'] = 1;
                    count+=1;
                    if(count == k+1){break;}
                }
                if(count == k){
                        ans+=1;
                }
            }
            
        }
        return ans;
    }

*/
/*
ip:
ecbaddce
3
op:
7
*/