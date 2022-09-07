package game;

public enum Player {

    FIRST_PLAYER("X"),
    SECOND_PLAYER("O");

    private String value;

    public String declarateWin() {
        return "Player " + value + " wins";
    }

    public String getValue() {
        return value;
    }

    Player(String value) {
        this.value = value;
    }
}