package Leetcode;

import java.util.Arrays;

public class setMatrixZero {
    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setMatrixZeroCode(matrix);
    }

    private static void setMatrixZeroCode(int[][] matrix) {
        boolean isRow0=false,isCol0=false;
        int m = matrix.length;
        int n= matrix[0].length;
        // check for first coloum
        for (int i=0;i<m;i++){
            if(matrix[i][0]==0)
                isCol0=true;
        }
        // check for a row
        for (int j=0;j<n;j++){
            if (matrix[0][j]==0)
                isRow0=true;
        }
        // check is other than the first col and row is contains zero if its having a zero then make a first col and  row zero
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (matrix[i][j]==0){
                    // make the rowfirst zero
                    matrix[i][0]=0;
                    // make the col first is zero
                    matrix[0][j]=0;
                }
            }
        }
        // make internel things zero
        for (int i=1;i<m;i++){
            for (int j=1;j<n;j++){
                if (matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                }
            }
        }
        if (isRow0){
            for (int i=0;i<n;i++){
                matrix[0][i]=0;
            }
        }
        if (isCol0)
            for (int j=0;j<m;j++){
                matrix[j][0]=0;
            }


        System.out.println(Arrays.deepToString(matrix));

    }
}
