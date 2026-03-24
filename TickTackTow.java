package twoDArrays;

import java.util.Scanner;

public class TTT {

	/*
	 * presenting near empty main
	 */
    public static void main(String[] args) {
    	startGame();
    }
    
    /*
     * this starts the game, it makes a new scanner, makes the play board and
     * the players make their move by typing in the row they would like to move, then
     * the column
     */
    public static void startGame() 
    {

        Scanner input = new Scanner(System.in);

        String[][] board = {
                {" ", " ", " "},
                {" ", " ", " "},
                {" ", " ", " "}
        };

        String player = "X";
        int moves = 0;
        boolean gameOver = false;

        while (!gameOver) 
        {

            printBoard(board);

            System.out.println("Player " + player + ", enter row (0-2): ");
            int row = input.nextInt();

            System.out.println("Player " + player + ", enter column (0-2): ");
            int col = input.nextInt();

            if (!board[row][col].equals(" ")) 
            {
                System.out.println("That spot is already taken. Try again.");
            } 
            else {

                board[row][col] = player;
                moves++;

                if (checkWin(board, player)) 
                {
                    printBoard(board);
                    System.out.println("Player " + player + " wins!");
                    gameOver = true;
                } 
                else if (moves == 9) 
                {
                    printBoard(board);
                    System.out.println("It's a tie!");
                    gameOver = true;
                } 
                else 
                {
                    if (player.equals("X")) 
                    {
                        player = "O";
                    } 
                    else 
                    {
                        player = "X";
                    }
                }
            }
        }

        input.close();
    }


    //This prints out the TicTacTow board and updates it as the game progresses
    public static void printBoard(String[][] board) {
        System.out.println();

        for (int i = 0; i < 3; i++) 
        {
            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
            if (i < 2) 
            {
                System.out.println("---+---+---");
            }
        }

        System.out.println();
    }
    
   
    /*
     * checks after each play if a player has 
     * gotten 3 in a row and won the game
     */
    public static boolean checkWin(String[][] board, String player) {

        // check rows for win
        for (int i = 0; i < 3; i++) 
        {
            if (board[i][0].equals(player) &&
                board[i][1].equals(player) &&
                board[i][2].equals(player)) 
            {
                return true;
            }
        }

        // check columns for win
        for (int j = 0; j < 3; j++) {
            if (board[0][j].equals(player) &&
                board[1][j].equals(player) &&
                board[2][j].equals(player)) 
            {
                return true;
            }
        }

        // check diagonals for win
        if (board[0][0].equals(player) &&
            board[1][1].equals(player) &&
            board[2][2].equals(player)) 
        {
            return true;
        }

        if (board[0][2].equals(player) &&
            board[1][1].equals(player) &&
            board[2][0].equals(player)) 
        {
            return true;
        }

        return false;
    }
}
