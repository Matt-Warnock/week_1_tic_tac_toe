package game;

public class Turn {

    public static final String FIRST_PLAYER = "X";
    public static final String SECOND_PLAYER = "O";
    private int turn = 0;

    public void add() {
        turn ++;
    }

    public String player() {
        return turn % 2 == 0 ? FIRST_PLAYER : SECOND_PLAYER;
    }
}