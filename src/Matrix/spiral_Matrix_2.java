package Matrix;

public class spiral_Matrix_2 {
    public static void main(String[] args) {
        int n=4;
        int [][] answer=spiralform(n);
        for (int[] i:answer) {
            for (int j:i)
                System.out.print(j+"  ");
            System.out.println();
        }
    }

    private static int[][] spiralform(int n) {
        int rowbegin=0,colbegin=0,rowEnd=n-1,colEnd=n-1;
        int[][] list=new int[n][n];
        int value=1;
        while (value<=n*n && rowbegin<=rowEnd && colbegin<=colEnd){
            //left to right
            for (int i=colbegin;i<=colEnd;i++){
                list[rowbegin][i]=value++;
            }
            rowbegin++;
            // top to bottom
            for (int i=rowbegin;i<=rowEnd;i++){
                list[i][colEnd]=value++;
            }
            colEnd--;
            // right to left
            for (int i=colEnd;i>=colbegin;i--){
                list[rowEnd][i]=value++;
            }
            rowEnd--;
            // bottopm to up
            for (int i=rowEnd;i>=rowbegin;i--){
                list[i][colbegin]=value++;
            }
            colbegin++;
        }
        return list;
    }
}
