package game;

public class Turn {
    private int turn = 0;

    public void add() {
        turn ++;
    }

    public String player() {
        if (turn % 2 != 0) {
            return "O";
        }

        return "X";
    }
}