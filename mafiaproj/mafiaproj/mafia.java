package mafiaproj;

public class mafia extends role {


    String name = "mafia";

    public mafia(){

         Boolean canKill;
         Boolean canChat;
         Boolean isAlive;
         int killCount;


        this.role_Id = 1;

    }

    @Override 
    public String getRoleName(){
        return "mafia";
    }
   
}

