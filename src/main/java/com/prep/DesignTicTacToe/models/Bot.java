package com.prep.DesignTicTacToe.models;

import com.prep.DesignTicTacToe.Factory.BotPlayingStratergyFactory;
import com.prep.DesignTicTacToe.stratergies.BotStratergies.BotPlayingStratergy;

public class Bot extends Player {
    private BotDifficultyLevel difficultyLevel;
    private BotPlayingStratergy playingStratergy;
    public Bot(String name,Symbol symbol,BotDifficultyLevel difficultyLevel) {
        super(name, symbol);
        this.setPlayerType(PlayerType.BOT);
        this.difficultyLevel = difficultyLevel;
        this.playingStratergy =  BotPlayingStratergyFactory.getBotPlayingStratergy(difficultyLevel);
    }
    public Move makeMove(Board board){
        // Logic to make a move based on the difficulty level
        // This could involve AI logic to determine the best move
        // For simplicity, we will just return a dummy move here
        System.out.println("Bot is making a move with difficulty level: " + difficultyLevel);
        return BotPlayingStratergyFactory.getBotPlayingStratergy(difficultyLevel).makeMove(board);
    }
    public BotDifficultyLevel getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(BotDifficultyLevel difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }
}
