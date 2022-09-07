package game;

import java.util.Arrays;

public class Board {
    public static final int BOARD_SIZE = 9;
    public static final int ROW_SIZE = 3;
    public static final String EMPTY_SPACE = ".";

    private final String[] board = new String[BOARD_SIZE];

    public Board() {
        Arrays.fill(board, EMPTY_SPACE);
    }

    public void set(int coordinate, Player player) throws DuplicatePlayException {
        if (!EMPTY_SPACE.equals(board[coordinate])) {
            throw new DuplicatePlayException();
        }
        board[coordinate] = player.getValue();
    }

    public String format() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < BOARD_SIZE; i = i + ROW_SIZE) {
            formatRow(builder, i);
            builder.append("\n");
        }
        return builder.toString();
    }

    private void formatRow(StringBuilder builder, int rowIndex) {
        for (int j = 0; j < ROW_SIZE; j++) {
            builder.append(board[rowIndex + j]);
        }
    }

    public boolean hasWon() {
        for (int i = 0; i < BOARD_SIZE; i = i + ROW_SIZE) {
            if ("X".equals(board[i]) &&
                    "X".equals(board[i + 1]) &&
                    "X".equals(board[i + 2])) {
                return true;
            }
        }

        for (int i = 0; i < ROW_SIZE; i++) {
            if ("X".equals(board[i]) &&
                    "X".equals(board[i + ROW_SIZE]) &&
                    "X".equals(board[i + (ROW_SIZE * 2)])) {
                return true;
            }
        }
        
        return false;
    }
}
