package game;

public class TicTacToe {
    public String play(int coordinate) {

        String[] board = new String[] {
                ".", ".", ".",
                ".", ".", ".",
                ".", ".", "."
        };

        board[coordinate - 1] = "X";

        return board[0] + board[1] + board[2] + "\n" +
               board[3] + board[4] + board[5] + "\n" +
               board[6] + board[7] + board[8]
        ;
    }
}
