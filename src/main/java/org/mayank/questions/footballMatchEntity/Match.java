package org.mayank.questions.footballMatchEntity;

public class Match {
    private Team homeTeam;
    private Team awayTeam;
    private int homeScore;
    private int awayScore;


    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = 0;
        this.awayScore = 0;
    }

    public Match(Team homeTeam, Team awayTeam, int homeScore, int awayScore) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.homeScore = homeScore;
        this.awayScore = awayScore;
    }

    public void score(Team scoringTeam) {
        if(scoringTeam.equals(homeTeam)) {
            homeScore++;
        } else {
            awayScore++;
        }
    }

    public Team winner() {
        if(homeScore == awayScore) {
            return null;
        }
        else
            return homeScore > awayScore ? homeTeam : awayTeam;
    }

}
