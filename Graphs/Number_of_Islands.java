import java.util.*;

class Solution {
    static void dfs(int i,int j,int[][] grid,boolean[][] visited){
        int r = grid.length;
        int c = grid[0].length;
        visited[i][j] = true;
        //Top 
        if(i>0 && grid[i-1][j]==1 && !visited[i-1][j]){
            dfs(i-1,j,grid,visited);
        }
        //down
        if(i+1<r && grid[i+1][j]==1 && !visited[i+1][j]){
            dfs(i+1,j,grid,visited);
        }
        //left
        if(j>0 && grid[i][j-1]==1 && !visited[i][j-1]){
            dfs(i,j-1,grid,visited);
        }
        //right
        if(j+1<c && grid[i][j+1]==1 && !visited[i][j+1]){
            dfs(i,j+1,grid,visited);
        }
        
    }
    public static int numIslands(int[][] grid) {
        int count = 0;
        int r = grid.length;
        int c = grid[0].length;
        boolean[][] visited = new boolean[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j] == 1 && !visited[i][j]){
                    count++;
                    dfs(i,j,grid,visited);
                    
                }
            }
        }
        return count;
    }
     /*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        int[][] grid = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
            if (i < rows - 1) {
                scanner.nextLine(); // Consume newline
            }
        }

        int result = numIslands(grid);
        System.out.println(result);
        scanner.close();
    }
    */
}
/*
ip:
4 4
0 0 0 0
0 1 1 0
0 1 1 0
0 0 0 0 
op:
1 
*/
