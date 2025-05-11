import java.util.*;
import java.util.AbstractMap.SimpleEntry; // Used for creating pair

class DistinctIslands {

    public static void dfs(int sr, int sc, int r, int c, List<SimpleEntry<Integer, Integer>> v, int[][] grid, boolean[][] visited) {
        int m = grid.length;
        int n = grid[0].length;

        visited[r][c] = true;
        v.add(new SimpleEntry<>(r - sr, c - sc));

        if (r > 0 && grid[r-1][c] == 1 && !visited[r-1][c]) {
            dfs(sr, sc, r-1, c, v, grid, visited);
        }
        if (r + 1 < m && grid[r+1][c] == 1 && !visited[r+1][c]) {
            dfs(sr, sc, r+1, c, v, grid, visited);
        }
        if (c > 0 && grid[r][c-1] == 1 && !visited[r][c-1]) {
            dfs(sr, sc, r, c-1, v, grid, visited);
        }
        if (c + 1 < n && grid[r][c+1] == 1 && !visited[r][c+1]) {
            dfs(sr, sc, r, c+1, v, grid, visited);
        }
    }

    public static int distinctIslands(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        boolean[][] visited = new boolean[m][n];
        Set<List<SimpleEntry<Integer, Integer>>> s = new HashSet<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    List<SimpleEntry<Integer, Integer>> v = new ArrayList<>();
                    dfs(i, j, i, j, v, grid, visited);
                    s.add(v);
                }
            }
        }
        return s.size();
    }
/*
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int rows = scanner.nextInt();
       
        int cols = scanner.nextInt();
        
        int[][] grid = new int[rows][cols];
       
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = scanner.nextInt();
            }
        }
        
        int result = distinctIslands(grid);
        System.out.println(result);
    }
    */
}