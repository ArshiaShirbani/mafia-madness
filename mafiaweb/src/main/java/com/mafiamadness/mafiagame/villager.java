package com.mafiamadness.mafiagame;

public class villager extends role {

    String name = "villager";
    
    public villager(){
        this.role_Id = 0;
        Boolean canKill;
        Boolean canChat;
        Boolean isAlive;
    }

    @Override 
    public String getRoleName(){
        return "villager";
    }
}
