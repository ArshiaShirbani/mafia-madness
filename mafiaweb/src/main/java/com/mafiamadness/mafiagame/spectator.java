package com.mafiamadness.mafiagame;

public class spectator extends role {

    String name = "spectator";
    
    public spectator(){
        this.role_Id = 0;
        Boolean canKill;
        Boolean canChat;
        Boolean isAlive;
    }

    @Override 
    public String getRoleName(){
        return "spectator";
    }
}