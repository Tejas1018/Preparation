package com.prep.DesignTicTacToe.stratergies.BotStratergies;

import com.prep.DesignTicTacToe.models.Board;
import com.prep.DesignTicTacToe.models.Cell;
import com.prep.DesignTicTacToe.models.Move;

import java.util.List;

public class EasyBotPlayingStratergy implements BotPlayingStratergy{
    @Override
    public Move makeMove(Board board) {
        for(List<Cell> cells : board.getBoard()){
            for(Cell cell : cells){
                if(cell.isEmpty()){
                    return new Move(null,cell);
                }
            }
        }
        return null; // If no move can be made, return null
    }
}
