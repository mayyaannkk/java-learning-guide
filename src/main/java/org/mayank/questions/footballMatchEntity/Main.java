package org.mayank.questions.footballMatchEntity;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Generating players
        Player messi = new Player("Messi", 10);
        Player ronaldo = new Player("Ronaldo", 7);

        // Making team
        List<Player> barcaTeam = new ArrayList<>();
        List<Player> madridTeam = new ArrayList<>();
        barcaTeam.add(messi);
        madridTeam.add(ronaldo);

        Team barca = new Team("Barca", barcaTeam);
        Team madrid = new Team("Madrid", madridTeam);

        // Playing match
        Match match1 = new Match(barca, madrid);
        match1.score(barca);
        match1.score(barca);
        match1.score(madrid);
        System.out.println(match1.winner());

        // Playing second leg of match
//        Match match2 = new Match(barca, madrid, 2, 1);
//        match2.score(madrid);
//        System.out.println(match2.winner());
    }

}

