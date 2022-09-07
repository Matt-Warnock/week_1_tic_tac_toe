package game;

public class Turn {

    private int turn = 0;

    public void add() {
        turn ++;
    }

    public Player player() {
        return turn % 2 == 0 ? Player.FIRST_PLAYER : Player.SECOND_PLAYER;
    }
}