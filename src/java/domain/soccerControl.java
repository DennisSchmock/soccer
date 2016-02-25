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
public class soccerControl {
    
    public static void main(String[] args) {
        Player player1 = new Player(1, "Dennis", "team1",13,"ATT");
        Player player2 = new Player(2, "Dennis", "team1",13,"ATT");
        Player player3 = new Player(3, "Dennis", "team2",13,"ATT");
        Player player4 = new Player(4, "Dennis", "team2",13,"ATT");
        Team team1 = new Team("team1");
    }
    private List<Match> matches = new ArrayList<>();
 
    
    public void createPlayer(String name, int teamId, String position, String teamName){
        
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
