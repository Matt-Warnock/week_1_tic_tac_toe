package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeShould {
    private TicTacToe ticTacToe;

    @BeforeEach
    void setup() {
        ticTacToe = new TicTacToe();
    }

    @Test
    void displays_x_in_first_position() {
        String output = "X..\n...\n...";

        assertEquals(output, ticTacToe.play(1));
    }

    @Test
    void displays_x_in_third_position() {
        String output = "..X\n...\n...";

        assertEquals(output, ticTacToe.play(3));
    }

    @Test
    void displays_x_in_fifth_position() {
        String output = "...\n.X.\n...";

        assertEquals(output, ticTacToe.play(5));
    }
}
