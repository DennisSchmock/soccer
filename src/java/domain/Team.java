/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dennisschmock
 */
public class Team {

    private String name;

    private List<Player> players = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}
