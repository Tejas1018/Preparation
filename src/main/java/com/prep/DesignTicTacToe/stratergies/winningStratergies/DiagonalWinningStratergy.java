package com.prep.DesignTicTacToe.stratergies.winningStratergies;

import com.prep.DesignTicTacToe.models.Board;
import com.prep.DesignTicTacToe.models.Move;
import com.prep.DesignTicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class DiagonalWinningStratergy implements WinningStratergy{
    Map<Symbol,Integer> leftDiagonalMap = new HashMap<>();
    Map<Symbol,Integer> rightDiagonalMap = new HashMap<>();
    @Override
    public boolean checkWinner(Move move, Board board) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getCell().getPlayer().getsymbol();
        //checking for left diagonal
        if (row == col) {
            if (!leftDiagonalMap.containsKey((symbol))) {
                leftDiagonalMap.put(symbol, 0);
            }
            leftDiagonalMap.put(symbol, leftDiagonalMap.get(symbol) + 1);
            return leftDiagonalMap.get(symbol) == board.getDimension();
        }

        //if not left diagonal then checking for right diagonal

        //checking for right diagonal
        if (row + col == board.getDimension() - 1) {
            if (!rightDiagonalMap.containsKey((symbol))) {
                rightDiagonalMap.put(symbol, 0);
            }
            rightDiagonalMap.put(symbol, rightDiagonalMap.get(symbol) + 1);
            return rightDiagonalMap.get(symbol) == board.getDimension();
        }
        return false;
    }

}
