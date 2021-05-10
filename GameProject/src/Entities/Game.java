package Entities;

import Abstracts.Entity;

public class Game implements Entity {

    private int gameId;
    private String gameName;
    private double unitPrice;

    public Game(int gameId, String gameName, double unitPrice) {
        this.gameId = gameId;
        this.gameName = gameName;
        this.unitPrice = unitPrice;
    }

    public int getGameID() {
        return gameId;
    }

    public void setGameID(int gameID) {
        this.gameId = gameID;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}
