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
public class Match {
    private int matchId;
    private String team1;
    private String team2;

    public Match(int matchId, String team1, String team2) {
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
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
     * @return the team1
     */
    public String getTeam1() {
        return team1;
    }

    /**
     * @param team1 the team1 to set
     */
    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    /**
     * @return the team2
     */
    public String getTeam2() {
        return team2;
    }

    /**
     * @param team2 the team2 to set
     */
    public void setTeam2(String team2) {
        this.team2 = team2;
    }
    
    
}
