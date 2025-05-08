import java.util.*;
class Pair{
    int vertex, parent;
        Pair(int v, int p) {
            vertex = v;
            parent = p;
        }
}


class Solution {
    static boolean bfs(int start,List<List<Integer>> adj,boolean[] visited){
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start,-1));
        visited[start] = true;
        while(!q.isEmpty()){
            Pair p =q.poll();
            int cur = p.vertex;
            int parent = p.parent;
            for(int neighbor : adj.get(cur)){
               if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(new Pair(neighbor, cur));
                } else if (neighbor != parent) {
                    return true;
                }
            }
        }
         return false;
    }
    public static boolean checkCycle(int n,List<List<Integer>> adj) {
        boolean[] visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                if(bfs(i,adj,visited)){return true;}
            }
        }
        return false;
    }
}
/*
ip:
n (vertices)= 8, e (edges) = 8
adj = { {1}, 
        {0, 2, 3}, 
        {1, 4}, 
        {1, 5}, 
        {2, 6}, 
        {3, 6}, 
        {4, 5, 7}, 
        {6} }
op:true
*/
