package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
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
    @Test
    void displays_x_in_first_0_in_second() {
        ticTacToe.play(1);
        String output = "XO.\n...\n...";

        String result = ticTacToe.play(2);

        assertThat(output, is(result));
    }
    @Test
    void displays_4_plays() {
        ticTacToe.play(1);
        ticTacToe.play(2);
        ticTacToe.play(5);
        String output = "XO.\n.X.\n..O";

        String result = ticTacToe.play(9);

        assertThat(output, is(result));
    }
}
