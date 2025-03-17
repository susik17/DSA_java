import java.util.*;

class Solution {
        public static void bfs(int start ,boolean[] visited,int n, ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while(!q.isEmpty()){
            int curr = q.remove();
            for(int k:adj.get(curr)){
                if(!visited[k]){
                    q.add(k);
                    visited[k] = true;
                }
            }
        }
        }
        public static int numberOfProvinces(int n, ArrayList<ArrayList<Integer>> adj) {
        int num = 0;
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                num++;
                bfs(i,visited,n,adj);
            }
        }
        return num;
    }
}
/*
ip:
3 1
1 2
op:
2
*/
