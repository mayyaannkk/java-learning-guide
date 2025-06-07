package org.mayank.questions.footballMatchEntity;

import java.util.List;

public class Team {
    private String teamName;
    private List<Player> team;

    public Team(String teamName, List<Player> team) {
        this.teamName = teamName;
        this.team = team;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public List<Player> getTeam() {
        return team;
    }

    public void setTeam(List<Player> team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "Team{" +
                "teamName='" + teamName + '\'' +
                ", team=" + team +
                '}';
    }
}
