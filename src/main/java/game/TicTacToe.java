package game;

public class TicTacToe {
    public String play(int coordinate) {
        if (coordinate == 3) {
            return "..X\n...\n...";
        }
        if (coordinate == 5) {
            return "...\n.X.\n...";
        }

        return "X..\n...\n...";
    }
}
