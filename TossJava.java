/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Toss.java;

import java.util.Scanner;

/**
 *
 * @author Lenovo ThinkPad T520
 */
public class TossJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("WELCOME TO TOSS \n Where rivalry meets respect");
        // TODO code application logic here

        Tournament Tournament = new Tournament();
        Scanner Toss = new Scanner(System.in);

        System.out.println("Enter number of teams (even number):");
        int numTeams = Toss.nextInt();
        Toss.nextLine();   

        for (int i = 1; i <= numTeams; i++) {
            System.out.println("Enter team " + i + " name:");
            String teamName = Toss.nextLine();
            Tournament.addTeam(teamName);
        }

        Tournament.generateMatches();
        Toss.close();
    }
}
