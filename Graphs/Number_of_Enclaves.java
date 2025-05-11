import java.util.*;

class Solution {
        // Write your code here...
        static void dfs(int r,int c,int[][] grid,boolean[][] visited){
        visited[r][c] = true;
        int m = grid.length;
        int n = grid[0].length;
        //visiting neighbours
        //top
        if(r>0 && !visited[r-1][c] && grid[r-1][c] == 1){
            dfs(r-1,c,grid,visited);
        }
        //down 
        if(r+1<m && !visited[r+1][c] && grid[r+1][c] == 1){
            dfs(r+1,c,grid,visited);
        }
        //left
        if(c>0 && !visited[r][c-1] && grid[r][c-1] == 1){
            dfs(r,c-1,grid,visited);
        } 
        //right 
        if(c+1 < n && !visited[r][c+1] && grid[r][c+1] == 1){
            dfs(r,c+1,grid,visited);
        }
          }
    public static int numberOfEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited =  new boolean[m][n];
        //visit borders -  mark safe 'O's 
        for(int j =0 ;j<n;j++){
            if(grid[0][j] ==1 & !visited[0][j]){
                dfs(0,j,grid,visited);
            }
            if(grid[m-1][j] ==1 & !visited[m-1][j]){
                dfs(m-1,j,grid,visited);
            }
            
        }
        for(int i = 0 ;i < m;i++){
            if(grid[i][0] ==1 & !visited[i][0]){
                dfs(i,0,grid,visited);
            }
            if(grid[i][n-1] ==1 & !visited[i][n-1]){
                dfs(i,n-1,grid,visited);
            }
            
        }
        //visit remainings - other than borders
        int count = 0;
        for(int i = 0;i<m-1;i++){
            for(int j = 0;j< n-1 ;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    count++;
                }
            }
        }
        return count;
        }
}
