package com.prep.DesignTicTacToe.stratergies.winningStratergy;

import com.prep.DesignTicTacToe.models.Board;
import com.prep.DesignTicTacToe.models.Move;
import com.prep.DesignTicTacToe.models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class ColumnWinningStratergy implements WinningStratergy{
    Map<Integer,Map<Symbol,Integer>> columnMap;
    @Override
    public boolean checkWinner(Move move, Board board) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getCell().getPlayer().getsymbol();
        if(!columnMap.containsKey(col)){
            columnMap.put(col,new HashMap<>());
        }
        Map<Symbol,Integer> currentColumnMap = columnMap.get(col);
        if(!currentColumnMap.containsKey(symbol)){
            currentColumnMap.put(symbol,0);
        }
        currentColumnMap.put(symbol,currentColumnMap.get(symbol)+1);
        return currentColumnMap.get(symbol) == board.getDimension();
    }
}
