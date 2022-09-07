package game;

public class TicTacToe {
    private final Turn turn = new Turn();
    private final Board board = new Board();

    public String play(int coordinate) throws DuplicatePlayException {

        board.set(coordinate - 1, turn.player());
        turn.add();

        if (board.hasWon()) {
            return "Player X wins";
        }

        return board.format();
    }
}
