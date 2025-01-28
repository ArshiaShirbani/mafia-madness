package com.mafiamadness.mafiagame;

public class doctor extends role {

      String name = "doctor";

    public doctor(){
      
        this.role_Id = 2;
        Boolean canKill;
        Boolean canChat;
        Boolean isAlive;
    }
   
    @Override 
    public String getRoleName(){
        return "doctor";
    }
}
    

