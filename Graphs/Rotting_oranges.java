import java.util.*;

class Solution {
    public static int rottenOranges(int[][] matrix) {
        int m  =  matrix.length;
        int n = matrix[0].length;
        boolean[][] visited = new boolean[m][n];
        Queue <int[]> q = new LinkedList<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 2){
                    q.offer(new int[]{i,j,0});
                    visited[i][j] = true;
                }
            }
        }
        int ans_t = 0;
        while(!q.isEmpty()){
            int[] current = q.poll();
            int r = current[0],c = current[1] , t = current[2];
            ans_t = Math.max(ans_t,t);
            
            //for check once ratherthan check top,down,left,right seperately
            int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            for (int[] d : directions) {
                int nr = r + d[0], nc = c + d[1];
                if (nr >= 0 && nr < m && nc >= 0 && nc < n && matrix[nr][nc] == 1 && !visited[nr][nc]) {
                    q.offer(new int[]{nr, nc, t + 1});
                    visited[nr][nc] = true;
                }
            }
            /*
            //top 
            if(r>0 && matrix[r-1][c] == 1 && !visited[r-1][c]){ 
                q.offer(new int[]{r-1,c,t+1});
                visited[r-1][c] = true;
            }
            //down 
            if(r+1<m && matrix[r+1][c] == 1 && !visited[r+1][c]){ 
                q.offer(new int[]{r+1,c,t+1});
                visited[r+1][c] = true;
            }
            //left 
            if(c>0 && matrix[r][c-1] == 1 && !visited[r][c-1]){ 
                q.offer(new int[]{r,c-1,t+1});
                visited[r][c-1] = true;
            }
            //right
            if(c+1<n && matrix[r][c+1] == 1 && !visited[r][c+1]){ 
                q.offer(new int[]{r,c+1,t+1});
                visited[r][c+1] = true;
            }
            */
            
        }
        //Edge case:check any fresh oranges still present 
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j] == 1 && !visited[i][j]){
                    return -1;
                }
            }
        }
        return  ans_t;
    }
}
/*
ip:
3 3
2 1 1
0 1 1
1 1 2
op:
2
*/