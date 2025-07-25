package com.prep.DesignTicTacToe;

import com.prep.DesignTicTacToe.controllers.GameController;
import com.prep.DesignTicTacToe.exceptions.InValidPlayerCount;
import com.prep.DesignTicTacToe.exceptions.InvalidBotCount;
import com.prep.DesignTicTacToe.models.*;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) throws InValidPlayerCount, InvalidBotCount {
        GameController gameController = new GameController();
        int dimension = 3; // Dimension of the Tic Tac Toe board
        List<Player> players = new ArrayList<Player>();
        players.add(new Player("Teja", new Symbol('X'))); // HUMAN
        players.add(new Bot("ChatGPT", new Symbol('O'), BotDifficultyLevel.EASY)); // BOT
    // Initialize the game controller to start the Tic Tac Toe game
        Game game = gameController.startGame(dimension, players);
        while(gameController.GameState(game).equals(GameState.IN_PROGRESS)){
            gameController.printBoard(game);
            gameController.makeMove(game);
        }
        if(game.getGameState().equals(GameState.ENDED)){
            System.out.println("Game Over!" + game.getWinner().getName() + " is the winner!");
        }
        else if(game.getGameState().equals(GameState.DRAW)){
            System.out.println("Game Over! It's a draw!");
        }

    }
}
