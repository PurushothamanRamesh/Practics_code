package Matrix;

import java.util.ArrayList;
import java.util.List;

public class spiral_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},
                          {4,5,6},
                          {7,8,9}};
        List<Integer> answer=spiralfornation(matrix);
        for (int i:answer)
            System.out.print(i+" ");
    }

    private static List<Integer> spiralfornation(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int rowbegin=0,colEnd=matrix[0].length-1,rowEnd=matrix[0].length-1,colBegin=0;
        System.out.println(colEnd);
        System.out.println(rowEnd);
        while (rowbegin<=rowEnd && colBegin<=colEnd ){
            // left to fight
            for (int i=colBegin;i<=colEnd;i++){
                list.add(matrix[rowbegin][i]);
            }
            rowbegin++;
            // top to bottom
            for (int i=rowbegin;i<=rowEnd;i++){
                list.add(matrix[i][colEnd]);
            }
            colEnd--;
            // right to left
            if (rowbegin <= rowEnd){
                for (int i=colEnd;i>=colBegin;i--){
                    list.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;
            // bottom to top
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowbegin; i--) {
                    list.add(matrix[i][colBegin]);
                }
            }
            colBegin++;
        }
        return list;

    }
}


