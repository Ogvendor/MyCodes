package TicTacToe;

import static TicTacToe.Mark.BLANK;

public class Board {
    private Mark[][] boardsur = {{BLANK, BLANK,BLANK},{BLANK,BLANK,BLANK},{BLANK,BLANK,BLANK}};

    public Mark[][] getBoardSur() {
        return boardsur;
    }

    public void setBoardsur(Mark[][] boardsur) {
        this.boardsur = boardsur;
    }

}
