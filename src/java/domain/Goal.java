/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author dennisschmock
 */
public class Goal {
    private int goalId;
    private int matchId;
    private int userId;
    private String goalType;
   
    public Goal(int goalId, int matchId, int userId, String goalType) {
        this.goalId = goalId;
        this.matchId = matchId;
        this.userId = userId;
        this.goalType = goalType;
        
    }

    /**
     * @return the goalId
     */
    public int getGoalId() {
        return goalId;
    }

    /**
     * @param goalId the goalId to set
     */
    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }

    /**
     * @return the matchId
     */
    public int getMatchId() {
        return matchId;
    }

    /**
     * @param matchId the matchId to set
     */
    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
}
