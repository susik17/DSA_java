import java.util.*;


class Solution {
    public static int[][] rotateGrid(int[][] matrix) {
       int n = matrix.length;
       //Transpose matrix
       for(int i = 0;i<n;i++){
           for(int j = 0;j<i;j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[j][i];
               matrix[j][i] = temp;
           }
       }
       //reverse each row 
       for(int i = 0;i<n;i++){
           for(int j = 0;j<n/2;j++){
               int temp = matrix[i][j];
               matrix[i][j] = matrix[i][n-1-j];
               matrix[i][n-1-j] = temp;
               
           }
       }
       return matrix;
    }
    
    /*
    //Brute force
    public static int[][] rotateGrid(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] temp = new int[m][n];
        for(int i =0;i<m;i++){
            for(int j =0;j<n;j++){
                    temp[j][n-1-i] = matrix[i][j];
                
            }
        }
        return temp;
        
        
    }
    */
    
}