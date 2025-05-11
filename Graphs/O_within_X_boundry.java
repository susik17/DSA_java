import java.util.*;

class Solution {
    static void dfs(int r,int c,char[][] grid,boolean[][] visited){
        visited[r][c] = true;
        int m = grid.length;
        int n = grid[0].length;
        //visiting neighbours
        //top
        if(r>0 && !visited[r-1][c] && grid[r-1][c] == 'O'){
            dfs(r-1,c,grid,visited);
        }
        //down 
        if(r+1<m && !visited[r+1][c] && grid[r+1][c] == 'O'){
            dfs(r+1,c,grid,visited);
        }
        //left
        if(c>0 && !visited[r][c-1] && grid[r][c-1] == 'O'){
            dfs(r,c-1,grid,visited);
        } 
        //right 
        if(c+1 < n && !visited[r][c+1] && grid[r][c+1] == 'O'){
            dfs(r,c+1,grid,visited);
        }
    }
    public static void surroundO(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited =  new boolean[m][n];
        //visit borders -  mark safe 'O's 
        for(int j =0 ;j<n;j++){
            if(grid[0][j] =='O' & !visited[0][j]){
                dfs(0,j,grid,visited);
            }
            if(grid[m-1][j] =='O' & !visited[m-1][j]){
                dfs(m-1,j,grid,visited);
            }
            
        }
        for(int i = 0 ;i < m;i++){
            if(grid[i][0] =='O' & !visited[i][0]){
                dfs(i,0,grid,visited);
            }
            if(grid[i][n-1] =='O' & !visited[i][n-1]){
                dfs(i,n-1,grid,visited);
            }
            
        }
        //visit remainings - other than borders
        for(int i = 0;i<m-1;i++){
            for(int j = 0;j< n-1 ;j++){
                if(grid[i][j] == 'O' && !visited[i][j]){
                    grid[i][j] = 'X';
                }
            }
        }
    }
}

/*
ip:
m = 3, n = 3
grid = { ( X, X, X ), 
         ( X, O, X ),
         ( X, X, X ) 
op:
X X X
X X X
X X X 
*/