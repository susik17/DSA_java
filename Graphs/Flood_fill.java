import java.util.*;

class Solution {
    static void dfs(int[][] image,int i,int j,int start_color,int new_color){
        int m = image.length;
        int n = image[0].length;
        image[i][j] = new_color;
        //Top 
        if(i>0 && image[i-1][j] == start_color ){
            dfs(image,i-1,j,start_color,new_color);
        }
        //down
         if(i+1<m && image[i+1][j] == start_color){
            dfs(image,i+1,j,start_color,new_color);
        }
        //left
         if(j>0 && image[i][j-1] == start_color){
            dfs(image,i,j-1,start_color,new_color);
        }
        //right
         if(j+1<n && image[i][j+1] == start_color){
            dfs(image,i,j+1,start_color,new_color);
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int start_color = image[sr][sc];
        //Edge case 
        if(start_color == newColor){
            return image;
        }
        image[sr][sc] = newColor;
        if(newColor != start_color){
            dfs(image,sr,sc,start_color,newColor);
        }
        return image;
       
    }
    /*
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int newColor = scanner.nextInt();
        int[][] image = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                image[i][j] = scanner.nextInt();
            }
        }

        floodFill(image, r, c, newColor);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(image[i][j] + " ");
            }
            System.out.println();
        }
    }
    */
}
/*
ip: 
3 3 1 1 2
1 1 1
1 1 0
0 0 0 
op:
2 2 2 
2 2 0 
0 0 0  
*/