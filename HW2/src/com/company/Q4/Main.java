package com.company.Q4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Bob",10);
        Player p2 = new Player("Bao",8);
        Player p3 = new Player("Maia",8);
        Player p4 = new Player("Ada",4);
        Player p5 = new Player("Cindy",2);

//        ArrayList <Player> players = new ArrayList<>();
//        players.add(p1);
//        players.add(p2);
//        players.add(p3);
//        players.add(p4);
//        players.add(p5);

        Player[] players = new Player[]{p1, p2, p3, p4, p5};
        Arrays.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                if(o1.score != o2.score){
                    return Integer.compare(o2.score, o1.score);
                }else{
                    return o1.name.compareTo(o2.name);
                }
            }
        });

        for(Player p: players){
            p.printDetails();
        }
    }
}
