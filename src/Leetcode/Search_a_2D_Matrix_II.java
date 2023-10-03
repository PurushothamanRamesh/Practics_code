package Leetcode;

public class Search_a_2D_Matrix_II {
    public static void main(String[] args) {
        int value=-5;
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        boolean answer=checkPresent(matrix,value);
        System.out.println(answer);
    }

    private static boolean checkPresent(int[][] matrix, int target) {
       int i=0;
       int j= matrix[0].length-1;
       while (i<matrix.length && j>=0){
           int num=matrix[i][j];
           if (num==target)
               return true;
           else if (num>target)
               j--;
           else
               i++;
       }
       return false;
    }
}
