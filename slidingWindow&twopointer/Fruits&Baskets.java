import java.util.*;

class Solution {
    //optimal - using Sliding Window
    public static int fruitsBaskets(int[] tree) {
        int n = tree.length;
        int i = 0,j = 0,ans = 0;
        Map<Integer,Integer> m = new HashMap<>();
        while(j<n){
            m.put(tree[j],m.getOrDefault(tree[j],0)+1);
            while(m.size()>2){
                m.put(tree[i] , m.get(tree[i])-1);
                if(m.get(tree[i]) == 0){ m.remove(tree[i]);}
                i++;
                
            }
            ans = Math.max(ans , j-i+1);
            j++;
        }
        return ans;
        
    /*
    //BruteForce - possible valid subarrays with atmost 2 distict numbers 
    public static int fruitsBaskets(int[] tree) {
        int n = tree.length;
        int ans = 0;
        for(int i = 0 ;i < n;i++){
            Map<Integer,Integer> m = new HashMap<>();
            for(int j = i;j<n;j++){
                m.put(tree[j],m.getOrDefault(tree[j],0)+1);
                if(m.size() > 2){
                    break;
                }
                ans = Math.max(ans,j-i+1);
            }
        
            
        }
        return ans;
        
      */  
    }
}
/*
ip:
4
4 2 3 3
op:
3
*/