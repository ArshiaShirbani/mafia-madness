package mafiadata;
public class player {
    private String Username;
    private role role;
    private boolean isAlive;
    private int playerID;
    private int playerCount;
    private static int MIN_PLAYERS = 5;
    private static int MAX_PLAYERS = 20;
    private Boolean isSpectating;
    private Boolean hasVoted;
    private String hasJoined;




    public void vote() {

    }

    public void performAction() {
        
    }

    public void setUserName(String u){
        this.Username = u;
    }

    public String getUserName(){
        return Username;
    }

    public void setplayerID(int newID){
        this.playerID = newID;
    }

    public int getplayerID(){
       return playerID; 
    }

    public void setRole(role role){
        this.role = role;
    }
    public role getRole(){
        return role;
    }
    public void display(){
        System.out.println("Username: " + this.getUserName());
        System.out.println("PlayerID: " + this.getplayerID());
        System.out.println("Rolename: " + this.getRole().getRoleName());

    }
}

