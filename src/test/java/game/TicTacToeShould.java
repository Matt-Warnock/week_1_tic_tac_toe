package game;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;

public class TicTacToeShould {
    private TicTacToe ticTacToe;

    @BeforeEach
    void setup() {
        ticTacToe = new TicTacToe();
    }

    @Test
    void displays_x_in_first_position() throws Exception {
        String output = "X..\n...\n...\n";

        assertEquals(output, ticTacToe.play(1));
    }

    @Test
    void displays_x_in_third_position() throws Exception {
        String output = "..X\n...\n...\n";

        assertEquals(output, ticTacToe.play(3));
    }

    @Test
    void displays_x_in_fifth_position() throws Exception {
        String output = "...\n.X.\n...\n";

        assertEquals(output, ticTacToe.play(5));
    }
    @Test
    void displays_x_in_first_0_in_second() throws Exception {
        ticTacToe.play(1);
        String output = "XO.\n...\n...\n";

        String result = ticTacToe.play(2);

        assertThat(output, is(result));
    }
    @Test
    void displays_4_plays() throws Exception {
        ticTacToe.play(1);
        ticTacToe.play(2);
        ticTacToe.play(5);
        String output = "XO.\n.X.\n..O\n";

        String result = ticTacToe.play(9);

        assertThat(output, is(result));
    }

    @Test
    void displays_6_plays() throws Exception {
        ticTacToe.play(1);
        ticTacToe.play(2);
        ticTacToe.play(5);
        ticTacToe.play(9);
        ticTacToe.play(7);
        String output = "XO.\nOX.\nX.O\n";

        String result = ticTacToe.play(4);

        assertThat(output, is(result));
    }

    @Test
    void throws_exception_when_reusing_coordinate() throws Exception {

        ticTacToe.play(1);

        assertThrowsExactly(DuplicatePlayException.class, () -> {
            ticTacToe.play(1);
        });
    }

    @Test
    void confirms_player_win_with_first_row() throws Exception {
        ticTacToe.play(1);
        ticTacToe.play(4);
        ticTacToe.play(2);
        ticTacToe.play(5);

        String result = ticTacToe.play(3);

        assertThat("Player X wins", is(result));
    }

    @Test
    void confirms_player_win_with_second_row() throws Exception {
        ticTacToe.play(5);
        ticTacToe.play(1);
        ticTacToe.play(4);
        ticTacToe.play(2);

        String result = ticTacToe.play(6);

        assertThat("Player X wins", is(result));
    }
    @Test
    void confirms_player_win_with_third_row() throws Exception {
        ticTacToe.play(8);
        ticTacToe.play(1);
        ticTacToe.play(7);
        ticTacToe.play(2);

        String result = ticTacToe.play(9);

        assertThat("Player X wins", is(result));
    }

    @Test
    void confirms_player_win_with_first_column() throws Exception {
        ticTacToe.play(1);
        ticTacToe.play(2);
        ticTacToe.play(4);
        ticTacToe.play(3);

        String result = ticTacToe.play(7);

        assertThat("Player X wins", is(result));
    }

    @Test
    void confirms_player_win_with_second_column() throws Exception {
        ticTacToe.play(2);
        ticTacToe.play(6);
        ticTacToe.play(5);
        ticTacToe.play(3);

        String result = ticTacToe.play(8);

        assertThat("Player X wins", is(result));
    }

    @Test
    void confirms_player_win_with_third_column() throws Exception {
        ticTacToe.play(3);
        ticTacToe.play(5);
        ticTacToe.play(6);
        ticTacToe.play(1);

        String result = ticTacToe.play(9);

        assertThat("Player X wins", is(result));
    }

}
