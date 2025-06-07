package org.mayank.questions.footballMatchEntity;

public class Player {
    private String playerName;
    private int jerseyNum;

    public Player(String playerName, int jerseyNum) {
        this.playerName = playerName;
        this.jerseyNum = jerseyNum;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getJerseyNum() {
        return jerseyNum;
    }

    public void setJerseyNum(int jerseyNum) {
        this.jerseyNum = jerseyNum;
    }
}
