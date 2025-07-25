package com.prep.DesignTicTacToe.stratergies.winningStratergies;

import com.prep.DesignTicTacToe.models.Board;
import com.prep.DesignTicTacToe.models.Move;

public interface WinningStratergy {
    boolean checkWinner(Move move, Board board);
}
