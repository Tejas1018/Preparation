package com.prep.DesignTicTacToe.Factory;

import com.prep.DesignTicTacToe.models.BotDifficultyLevel;
import com.prep.DesignTicTacToe.stratergies.BotStratergies.BotPlayingStratergy;
import com.prep.DesignTicTacToe.stratergies.BotStratergies.EasyBotPlayingStratergy;
import com.prep.DesignTicTacToe.stratergies.BotStratergies.HardBotPlayingStratergy;
import com.prep.DesignTicTacToe.stratergies.BotStratergies.MediumBotPlayingStratergy;

public class BotPlayingStratergyFactory {
    public static BotPlayingStratergy getBotPlayingStratergy(BotDifficultyLevel botDifficultyLevel) {
        if(botDifficultyLevel == BotDifficultyLevel.EASY){
            return new EasyBotPlayingStratergy();
        }
        else if(botDifficultyLevel == BotDifficultyLevel.MEDIUM){
            return new MediumBotPlayingStratergy();
        }
        else if(botDifficultyLevel == BotDifficultyLevel.HARD){
            return new HardBotPlayingStratergy();
        }
        return null;
    }
}
