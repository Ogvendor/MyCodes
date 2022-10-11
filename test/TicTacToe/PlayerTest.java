package TicTacToe;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TicTacToe.Mark.O;
import static TicTacToe.Mark.X;

public class PlayerTest {
     Player player1;
    Player player2;

    @BeforeEach
    void setUp(){
        player1 = new Player(X);
        player2 = new Player(O);
    }

}
