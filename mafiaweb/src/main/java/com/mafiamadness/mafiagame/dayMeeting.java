package com.mafiamadness.mafiagame;

import java.util.*;
class dayMeeting{

    private List<player> players;
   


public static void initalizeMeeting(){
    System.out.println("A meeting has been called.");
    System.out.println("A murder has taken place... Everyone will now have time to discuss who is the culprit");
    System.out.println("After the Discussion period is up Everyone will vote on who to Lynch");
}

public static void initalizeVote(){
    System.out.println("Everyone now take a vote...");
    System.out.println("You may only vote once or you can choose to skip.");
}

public static void concludeVote(){
    System.out.println("The Voting has ended.");
}

public static void concludeMeeting(){
    System.out.println("This meeting has ended.");
    System.out.println("Dismissed.");
}
}

/*public int getID(){

    return id;
}

*/