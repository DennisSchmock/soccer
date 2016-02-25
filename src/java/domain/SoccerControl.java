/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author dennisschmock
 */
public class SoccerControl {
    
    public static void main(String[] args) {
        Player player1 = new Player(1, "Dennis1", "team1",13,"ATT");
        Player player2 = new Player(2, "Dennis2", "team1",13,"ATT");
        Player player3 = new Player(3, "Dennis3", "team1",13,"ATT");
        Player player4 = new Player(4, "Dennis4", "team2",13,"ATT");
        Player player5 = new Player(1, "Dennis5", "team2",13,"ATT");
        Player player6 = new Player(2, "Dennis6", "team2",13,"ATT");
        Player player7 = new Player(3, "Dennis7", "team3",13,"ATT");
        Player player8 = new Player(4, "Dennis8", "team3",13,"ATT");
        Player player9 = new Player(4, "Dennis9", "team3",13,"ATT");
        Goal goal1 = new Goal(1,1,1,"GOAL");
        Goal goal2 = new Goal(2,1,1,"GOAL");
        Goal goal3 = new Goal(3,2,3,"GOAL");
        Goal goal4 = new Goal(4,2,3,"GOAL");
        Goal goal5 = new Goal(5,2,7,"GOAL");
        Goal goal6 = new Goal(6,3,2,"GOAL");
        Goal goal7 = new Goal(7,3,2,"GOAL");
        Goal goal8 = new Goal(8,3,2,"GOAL");
        Goal goal9 = new Goal(9,3,9,"GOAL");
        Goal goal10 = new Goal(10,3,9,"GOAL");
        Goal goal11 = new Goal(11,3,9,"GOAL");
        
        Team team1 = new Team("team1");
        Team team2 = new Team("team2");
        Team team3 = new Team("team3");
        Match match1 = new Match(1,team1,team2);
        Match match2 = new Match(2,team2,team3);
        Match match3 = new Match(3,team1,team3);
        
       
        
       
    }
    private List<Match> matches = new ArrayList<>();
 
    
    public void createPlayer(String name, int teamId, String position, String teamName){
        
    }
    private SoccerControl(){
        //to-do getDBFacade
    }
    
    public static SoccerControl getInstance(){
        return new SoccerControl();
    }
    public void updatePlayer(Player player){
        
        
    }
    
    public void createGoal(int MatchId, int playerId){
        
    }
    
    public void updateGoal(Goal goal){
        
    }
    
    public void deleteGoal(int goalId){
        
    }
    
    
    
    
   
    
}
