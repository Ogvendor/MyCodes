package TicTacToe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static TicTacToe.Mark.BLANK;
import static org.junit.Assert.assertEquals;

public class BoardTest {
    Board board;

    @BeforeEach
    void setUp(){
        board = new Board();
    }
    @Test
    void testThatAllCellsOnTheBoardAreEmpty(){
         var boardsu = board.getBoardSur();
         assertEquals(BLANK, board.getBoardSur());
    }
}
