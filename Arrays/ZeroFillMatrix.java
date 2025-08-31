import java.util.*;
class Solution{
    //optimal 
    //Note : incase ask for ArrayList use - matrix[i][j] - > matrix.get(i).get(j) update matrix[i][j] = 0 -> matrix.get(i).set(j, 0);

    public static void zeroFill(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        //1.marking zeros 
          //1.1Mark zeros of 1st row 1st Col 
          int first_row = -1;
          for(int j = 0; j < n;j++){
              if(matrix[0][j] == 0){
                  first_row = 0;
              }
          }
          int first_col = -1;
          for(int i = 0; i < m;i++){
              if(matrix[i][0] == 0){
                  first_col = 0;
              }
          }
          //1.2.mark remaining Parts
          for(int i = 1;i < m;i++){
              for(int j = 1;j < n;j++ ){
                  if(matrix[i][j] == 0){
                        matrix[0][j] = 0;
                        matrix[i][0] = 0;
                  }
              }
          }
          //2.manipulate zeros 
          //2.1 remaing part manipulation
          for(int i = 1 ;i < m;i++){
              for(int j = 1 ;j < n;j++){
                  if(matrix[0][j] == 0 || matrix[i][0] == 0){
                      matrix[i][j] = 0;
                  }
              }
          }
          //2.2 maipulate 1st row 1st Col
          if(first_row == 0){
              for(int j = 0; j < n;j++){
                  matrix[0][j] = 0;
              }
          }
           if(first_col == 0){
              for(int i = 0; i < m;i++){
                  matrix[i][0] = 0;
              }
          }
        
        
    }
    /* 
    //1.BruteForce
     public static void makeRowZero(int row, int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int j = 0; j < n; ++j) {
            matrix[row][j] = 0;
        }
    }

    public static void makeColumnZero(int column, int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; ++i) {
            matrix[i][column] = 0;
        }
    }

    public static void zeroFill(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] temp = new int[m][n];
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    temp[i][j] = 1;
                }
            }
        }
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (temp[i][j] == 1) {
                    makeRowZero(i, matrix);
                    makeColumnZero(j, matrix);
                }
            }
        }
    }
        //2.Better
        public static void zeroFill(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] rows = new int[m];
        int[] cols = new int[n];
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (matrix[i][j] == 0) {
                    rows[i] = 1;
                    cols[j] = 1;
                }
            }
        }
        
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                if (rows[i] == 1 || cols[j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }


     //3.Optimal 
     public static void zeroFill(ArrayList<ArrayList<Integer>> matrix) {
        int m = matrix.size();
        int n = matrix.get(0).size();

        // 1. Marking zeros
        // 1.1 Check first row
        int first_row = -1;
        for (int j = 0; j < n; j++) {
            if (matrix.get(0).get(j) == 0) {
                first_row = 0;
            }
        }

        // 1.2 Check first col
        int first_col = -1;
        for (int i = 0; i < m; i++) {
            if (matrix.get(i).get(0) == 0) {
                first_col = 0;
            }
        }

        // 1.3 Mark remaining parts
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(0).set(j, 0);
                    matrix.get(i).set(0, 0);
                }
            }
        }

        // 2. Manipulate zeros
        // 2.1 Remaining parts
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix.get(0).get(j) == 0 || matrix.get(i).get(0) == 0) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        // 2.2 Handle first row
        if (first_row == 0) {
            for (int j = 0; j < n; j++) {
                matrix.get(0).set(j, 0);
            }
        }

        // 2.3 Handle first col
        if (first_col == 0) {
            for (int i = 0; i < m; i++) {
                matrix.get(i).set(0, 0);
            }
        }
    }
        */
}
