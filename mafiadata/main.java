package mafiadata;
import javax.swing.*;
import java.util.*;
public class main {

    public static void main(String[] args) {


      
        role villagerRole = new villager();
        role sheriffRole = new sheriff();
        role mafiaRole = new mafia();
        role doctorRole = new doctor();
        role spectatorRole = new spectator();

        

       gameFrame game = new gameFrame();

    

       List<player> Players = new ArrayList<>();

       for (int I = 0; I < 8; I++){
        player player = new player();
        player.setUserName("Player " + I);
        player.setplayerID(I);
        Players.add(player);
    

       }

      

       Players.get(0).setRole(villagerRole);
       Players.get(1).setRole(villagerRole);
       Players.get(2).setRole(villagerRole);
       Players.get(3).setRole(mafiaRole);
       Players.get(4).setRole(mafiaRole);
       Players.get(5).setRole(doctorRole);
       Players.get(6).setRole(sheriffRole);
       Players.get(7).setRole(spectatorRole);


 




       // FOR LOOP TO DISPLAY ROLES USERNAME AND PLAYERID// 
       for (int i = 0; i < Players.size(); i++){
        Players.get(i).display();
       }



       // METHODS TO CALL MEETING//
       dayMeeting.initalizeMeeting();
       dayMeeting.initalizeVote();
       dayMeeting.concludeVote();
       dayMeeting.concludeMeeting();





        //  Player Roles 7 players 2 Mafia 3 Villagers 1 Doctor 1 Sheriff//


       


        


}



}