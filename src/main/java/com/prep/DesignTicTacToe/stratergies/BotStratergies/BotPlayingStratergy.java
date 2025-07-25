package com.prep.DesignTicTacToe.stratergies.BotStratergies;

import com.prep.DesignTicTacToe.models.Board;
import com.prep.DesignTicTacToe.models.Move;
import com.prep.DesignTicTacToe.models.Symbol;

public interface BotPlayingStratergy {
    Move makeMove(Board board);
}
