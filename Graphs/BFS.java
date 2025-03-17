import java.util.*;
class Solution {
    List<Integer> bfs(int n, List<List<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[n];
        q.add(0);
        visited[0] = true;
        ArrayList<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            int curr = q.remove();
            ans.add(curr);
            for(int k:adj.get(curr)){
                if(!visited[k]){
                    q.add(k);
                    visited[k] = true;
                }
            }
         }
         return ans;
        }
    }
/*
ip:
4 4
0 1
0 2
1 2
2 3
op:
0 1 2 3 
*/
