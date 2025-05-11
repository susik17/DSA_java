import java.util.*;

class Solution {
    public static int[][] nearestZero(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int[][] ans = new int[m][n];
        Queue< int[] > q = new LinkedList<>();
        //add zeros to queue 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == 0){
                    q.offer(new int[]{i,j,0});
                    visited[i][j] = true;
                }
            }
        }
        while(!q.isEmpty()){
            int[] cur = q.poll();
            int r = cur[0];//row
            int c = cur[1];//column
            int d = cur[2];//distance to nerest zero
            ans[r][c] = d;
            //neighbours 
            //upper 
            if(r>0 && !visited[r-1][c]){
                q.offer(new int[]{r-1,c,d+1});
                visited[r-1][c] = true;
            }
            //Lower 
            if(r+1<m && !visited[r+1][c]){
                q.offer(new int[]{r+1,c,d+1});
                visited[r+1][c] = true;
            }
            //left
            if(c>0 && !visited[r][c-1]){
                q.offer(new int[]{r,c-1,d+1});
                visited[r][c-1] = true;
            }
            //right
            if(c+1<n && !visited[r][c+1]){
                q.offer(new int[]{r,c+1,d+1});
                visited[r][c+1] = true;
            }
        }
        return ans;
        
    }
}
/*
ip:
m = 3, n = 3
grid ={(1, 0, 1) 
       (1, 1, 1)
       (1, 1, 0)} 
op:
1 0 1
2 1 1
2 1 0 
*/
