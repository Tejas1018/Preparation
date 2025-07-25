package com.prep.DesignTicTacToe.models;

import java.util.Scanner;

public class Player {
    private String name;
    private PlayerType playerType;
   private Symbol symbol;
    private Scanner scanner;
    public Player(String name, Symbol symbol) {
        this.name = name;
        this.playerType = PlayerType.HUMAN;
        this.symbol = symbol;
        this.scanner = new Scanner(System.in);
    }
    public Move makeMove(Board board) {
        // Logic to make a move
        // This could involve updating the game state, checking for win conditions, etc.
        System.out.println("Please enter row number:");
        int row = scanner.nextInt();
        System.out.println("Please enter column number:");
        int col = scanner.nextInt();
        return new Move(this,new Cell(row, col)); // Assuming the first symbol is used for the move
    }
    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Symbol getsymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbols) {
        this.symbol = symbol;
    }
}
