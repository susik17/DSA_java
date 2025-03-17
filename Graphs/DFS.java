import java.util.*;

public class DFS {
     public static void dfs_recur(int curr, ArrayList<ArrayList<Integer>> adj,boolean[] visited,List<Integer> ans) {
         ans.add(curr);
         visited[curr] = true;
         for(int k:adj.get(curr)){
             if(!visited[k]){
                dfs_recur(k,adj,visited,ans);
             }
         }
     }
         
    
    public static List<Integer> dfs(int n, ArrayList<ArrayList<Integer>> adj) {
        // Write your code here...
        boolean[] visited = new boolean[n];
        List<Integer> ans = new ArrayList<Integer>();
        dfs_recur(0,adj,visited,ans);
        return ans;
        
         
    }
}
/*
ip:
5 5
0 1
1 2
0 3
3 4
2 4
op:
0 1 2 4 3 
*/
