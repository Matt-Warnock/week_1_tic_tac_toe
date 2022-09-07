package game;

public class TicTacToe {
    private final Turn turn = new Turn();
    private final Board board = new Board();

    public String play(int coordinate) throws DuplicatePlayException {

        Player player = turn.player();

        board.set(coordinate - 1, player);
        turn.add();

        if (board.hasWon()) {
            return player.declarateWin();
        }

        return board.format();
    }
}
