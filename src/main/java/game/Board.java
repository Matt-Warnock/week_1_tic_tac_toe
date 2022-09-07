package game;

import java.util.Arrays;

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
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 9; i = i + 3) {
            builder.append(board[i]);
            builder.append(board[i + 1]);
            builder.append(board[i + 2]);
            builder.append("\n");
        }
        return builder.toString();
    }
}
