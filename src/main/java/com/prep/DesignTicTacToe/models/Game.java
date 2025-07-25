package com.prep.DesignTicTacToe.models;

import com.prep.DesignTicTacToe.exceptions.InValidPlayerCount;
import com.prep.DesignTicTacToe.exceptions.InvalidBotCount;
import com.prep.DesignTicTacToe.exceptions.InvalidMoveException;
import com.prep.DesignTicTacToe.stratergies.winningStratergies.ColumnWinningStratergy;
import com.prep.DesignTicTacToe.stratergies.winningStratergies.DiagonalWinningStratergy;
import com.prep.DesignTicTacToe.stratergies.winningStratergies.RowWinningStratergy;
import com.prep.DesignTicTacToe.stratergies.winningStratergies.WinningStratergy;

import java.util.*;

public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moves;
    private int currentPlayerIndex;
    private Player winner;
    private GameState gameState;
    private List<WinningStratergy> winningStratergies;

    private Game(int dimension, List<Player> players,List<WinningStratergy> winningStratergy) {
        this.board = new Board(dimension);
        this.players = players;
        this.moves = new ArrayList<>();
        this.currentPlayerIndex = 0; // Start with the first player
        this.winner = null; // No winner at the start
        this.gameState = GameState.IN_PROGRESS; // Game starts in progress
        this.winningStratergies = winningStratergy;
    }

    public static GameBuilder getBuilder() {
        return new GameBuilder();
    }


    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void setCurrentPlayerIndex(int currentPlayerIndex) {
        this.currentPlayerIndex = currentPlayerIndex;
    }

    public List<WinningStratergy> getWinningStratergy() {
        return winningStratergies;
    }

    public void setWinningStratergy(List<WinningStratergy> winningStratergy) {
        this.winningStratergies = winningStratergy;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }
    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

        //-------BULDER DESIGN PATTERN IMPLEMENTATION-------//

    public static class GameBuilder{
        private int dimension;
        private List<Player> players;

        public GameBuilder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public int getDimension() {
            return dimension;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }
        void validateGame() throws InvalidBotCount, InValidPlayerCount {
            validatePlayerCount();
            //validateSymbols();
            validateBotCount();
        }
        void validateBotCount() throws InvalidBotCount {
            int botCount = 0;
            for(Player player : players){
                if(player instanceof Bot){
                    botCount++;
                }
            }
            if(botCount > 1){
                throw new InvalidBotCount("Only one bot is allowed in the game.");
            }
        }
        void validatePlayerCount() throws InValidPlayerCount {
            int playerCount = 0;
            for (Player player : players) {
                if(PlayerType.HUMAN.equals(player.getPlayerType())){
                    playerCount++;
                }
                if(playerCount == 0){
                    throw new InValidPlayerCount("Invalid player count. Expected " + (dimension - 1) + " human players, but found " + playerCount);
                }
            }
        }

        //Validate the builder before building the game
        public Game build() throws InvalidBotCount, InValidPlayerCount {
            validateGame();
            validatePlayerCount();
            List<WinningStratergy> winningStratergy = new ArrayList<>();
            // Add winning strategies based on the game dimension
            winningStratergy.add(new RowWinningStratergy());
            winningStratergy.add(new ColumnWinningStratergy());
            winningStratergy.add(new DiagonalWinningStratergy());
            //validateSymbols();
            return new Game(
                    dimension,
                    players,
                    winningStratergy
            );
        }
    }

    public void displayBoard() {
       this.board.displayBoard();
    }

    public void makeMove() throws InvalidMoveException {
        Player currentPlayer = players.get(currentPlayerIndex);
        // Logic to make a move for the current player
        Move move = currentPlayer.makeMove(board);
        // Validate the move in the board
        if (!validateMove(move)) {
            throw new InvalidMoveException("Invalid move please try again...!!");
        }

        // Update the board with the move
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        System.out.println(currentPlayer.getName() + " made a move at (" + row + ", " + col + ")");
        Cell cell = board.getBoard().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(currentPlayer);
        currentPlayerIndex = (currentPlayerIndex+1) % players.size(); // Move to the next player in a circular manner
        Move finalMove = new Move(currentPlayer, cell);
        moves.add(finalMove); // Add the move to the list of moves

        //check if the current player has WON the game or not
        if(checkWinner(finalMove,board)){
            winner = currentPlayer;
            gameState = GameState.ENDED;
            System.out.println( currentPlayer.getName() + " has won the game...!");
        }
        else if(moves.size() == board.getDimension() * board.getDimension()) {
            gameState = GameState.DRAW;
            System.out.println("The game is a draw!");
        }
    }

    private boolean checkWinner( Move move,Board board) {
        for(WinningStratergy winningStratergy : winningStratergies) {
            if (winningStratergy.checkWinner(move, board)) {
                return true;
            }
        }
        return false;
    }
    public boolean validateMove (Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        // Check if the cell is within bounds
        if (row < 0 || row > board.getDimension() || col < 0 || col > board.getDimension()) {
            return false;
        }
        // Check if the cell is already occupied
        return board.getBoard().get(row).get(col).isEmpty();
    }

}
