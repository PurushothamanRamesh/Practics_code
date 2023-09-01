package Matrix;

public class set_Zeros {
    public static void main(String[] args) {
        int[][] matrix={{3,1,2,},{3,0,2},{1,3,5}};
        int [][] answer=setzero(matrix);
        for (int[] val:answer){
            for (int i:val){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

//    private static int[][] setzero(int[][] matrix) {
//       // int[][] list=matrix.clone();
//        int[][] list=new int[matrix[0].length][matrix.length];
//        for (int i=0;i<matrix[0].length;i++){
//            for (int j=0;j<matrix[0].length;j++){
//                if(matrix[i][j]==0){
//                  //  setcornerzero(i,j,list);
//
//                    for (int index=0;index<list[0].length;index++){
//                        list[i][index]=0;
//                    }
//                    for (int index=0;index<list[0].length;index++){
//                        list[index][j]=0;
//                    }
//                }
//            }
//        }
//        return list;
//    }
    private static int[][] setzero(int[][] matrix) {
        int numRows = matrix.length;
        int numCols = matrix[0].length;

        int[][] list = new int[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                list[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (matrix[i][j] == 0) {
                    for (int index = 0; index < numCols; index++) {
                        list[i][index] = 0;
                    }
                    for (int index = 0; index < numRows; index++) {
                        list[index][j] = 0;
                    }
                }
            }
        }
        matrix=list;

        return matrix;
    }


    private static void setcornerzero(int i, int j, int[][] list) {
        for (int index=0;index<list.length;index++){
            list[index][j]=0;
        }
        for (int index=0;index<list.length;index++){
            list[i][index]=0;
        }
    }
}
