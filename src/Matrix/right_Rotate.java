package Matrix;

public class right_Rotate {
    public static void main(String[] args) {
        int A[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        for (int[] val:transpose(A)){
            for (int i:val)
                System.out.print(i+" ");
            System.out.println();
        }
        // reverse
        System.out.println("______________________________");
        for (int[] val:reverse(A)){
            for (int i:val)
                System.out.print(i+" ");
            System.out.println();
        }
    }

    private static int[][] reverse(int[][] matrix) {
        int k=0;
        for (int i=0;i<matrix.length;i++){
            for (int j=matrix.length-1;j>= matrix.length/2;j--){
                int temp=matrix[i][k];
                matrix[i][k]=matrix[i][j];
                matrix[i][j]=temp;
                k++;
            }
            k=0;
        }
        return matrix;

    }

    private static int[][] transpose(int[][] matrix) {
        for (int i=0;i<matrix.length;i++){
            for (int j=i+1;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        return matrix;
    }
}
