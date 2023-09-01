package Matrix;

import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        char[][] words={
                {'m','n','o','p'},
                {'q','k','z','r'},
                {'o','x','y','z'},
                {'p','r','a','b'}};
        String target="ab";
        // Getting input as a to create a array
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the matrix size ");
        int size=scan.nextInt();
        // declare a matrix
        char[][] matrix=new char[size][size];
        for (int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                System.out.println("Enter the "+i+","+j+"  position");
                matrix[i][j]=scan.next().charAt(0);
            }
        }
        System.out.println("Enter the target word ");
        String targetword=scan.nextLine();
        System.out.println( findthewordPresentOrNot(words,target));
    }

    private static boolean findthewordPresentOrNot(char[][] words, String target) {
        char targetchar=target.charAt(0);
        for (int i=0;i<words[0].length;i++){
            for (int j=0;j<words[0].length;j++){
                if (words[i][j]==targetchar){
                    if(checkcoloumwise(i,j,words,target))
                        return true;
                    else if (checkrowumwise(i,j,words,target))
                        return true;
                }

            }
        }
        return false;
    }

    private static boolean checkrowumwise(int i, int j, char[][] words, String target) {
        int index=0;
        for (int row=i;row<words[0].length;row++){
            if (words[row][j]==target.charAt(index++)){
                if (index==target.length()){
                    return true;
                }
            }else return false;
        }
        return false;
    }

    private static boolean checkcoloumwise(int i, int j, char[][] words, String target) {
        int index=0;
            for (int col=j;col<words[0].length;col++){
                if (words[i][col]==target.charAt(index++)){
                    if (index==target.length()){
                        return true;
                    }
                }else return false;
            }
        return false;
    }
}
