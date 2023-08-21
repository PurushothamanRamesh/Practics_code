package Tic_Tac;

import java.util.Scanner;

public class Tic_Tac {
    public static void main(String[] args) {
        char[][] board=new char[3][3];

        // filling the board in first normal space
        for (int row=0;row<board.length;row++){
            for (int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }
        // player
        char player='X';

        boolean gameOver=false;
        Scanner scanner=new Scanner(System.in);
        while(!gameOver){
            printboard(board);
            System.out.println("Player "+ player+" Enter : ");
            int row=scanner.nextInt();
            int col=scanner.nextInt();
            if (board[row][col]==' '){
                //place the element
                board[row][col]=player;
                gameOver=wongame(board,player);
                if (gameOver)
                    System.out.print("Player "+player+" Won");
                else
                    player=(player=='X')?'O':'X';
            } else {
                System.out.println("Invalid entry , Try Again Later ");
            }
          //  printboard(board);
        }
        
    }

    private static boolean wongame(char[][] board, char player) {
        // check it for row vise
        for (int row=0;row<board.length;row++){
            if (board[row][0]==player && board[row][1]==player && board[row][2]==player)
                return true;
        }
        // check it for coloum wise
        for (int col=0;col<board.length;col++){
            if (board[0][col]==player && board[1][col]==player && board[2][col]==player)
                return true;
        }
        // check it for diagonal
        for (int row=0;row<board.length;row++){
           if (board[0][0]==player && board[1][1]==player && board[2][2]==player)
               return true;
        }
        // another diagonal
        for (int row=0;row<board.length;row++){
            if (board[2][0]==player && board[1][1]==player && board[0][2]==player)
                return true;
        }
        // nothing happens
        return false;
    }

    private static void printboard(char[][] board) {
        for (int row=0;row<board.length;row++){
            for (int col=0;col<board[row].length;col++){
                System.out.print(board[row][col]+" |");
            }
            System.out.println();
        }
    }
}
