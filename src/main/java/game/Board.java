package game;

public class Board {
    private String[] board = new String[] {
            ".", ".", ".",
            ".", ".", ".",
            ".", ".", "."
    };

    public void set(int coordinate, String player) {
        board[coordinate] = player;
    }

    public String format() {
        return  board[0] + board[1] + board[2] + "\n" +
                board[3] + board[4] + board[5] + "\n" +
                board[6] + board[7] + board[8];
    }
}
