package com.prep.DesignTicTacToe.controllers;

import com.prep.DesignTicTacToe.exceptions.InValidPlayerCount;
import com.prep.DesignTicTacToe.exceptions.InvalidBotCount;
import com.prep.DesignTicTacToe.models.Game;
import com.prep.DesignTicTacToe.models.GameState;
import com.prep.DesignTicTacToe.models.Player;

import java.util.List;

public class GameController {
    //Place where the game logic will be implemented and user interactions will be handled.
    // This class will manage the game state, handle player moves, check for win conditions,
    public Game startGame(int dimension, List<Player> players) throws InValidPlayerCount, InvalidBotCount {
        return  Game.getBuilder().setDimension(dimension)
                .setPlayers(players)
                .build();
    }
    public void printBoard(Game game) {
        game.displayBoard();
    }
    public void  makeMove(Game game){
        game.makeMove();
    }

    public GameState GameState(Game game){
        return game.getGameState();
    }
    public Player checkWinner(Game game){
        return game.getWinner();
    }
}
