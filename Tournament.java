package Toss.java;

import Toss.java.Teams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo ThinkPad T520
 */
public class Tournament {
    
     private List<Teams> teams;

    public Tournament() {
        this.teams = new ArrayList<>();
    }

    public void addTeam(String name) {
        teams.add(new Teams (name));
    }

    public void generateMatches() {
        if (teams.size() % 2 != 0) {
            System.out.println("Teams must be even for fair matchups!");
            return;
        }

        Collections.shuffle(teams);
        System.out.println("Generated Matches:");

        for (int i = 0; i < teams.size(); i += 2) {
            System.out.println(teams.get(i).getName() + " (Home) vs " + teams.get(i + 1).getName() + " (Away)");
        }
    }
}
    
