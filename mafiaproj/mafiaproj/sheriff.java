package mafiaproj;

public class sheriff extends role {

    

    public sheriff(){

       
        Boolean canKill;
        Boolean canChat;
        Boolean isAlive;
        this.role_Id = 3;
    }
   
    @Override 
    public String getRoleName(){
        return "sheriff";
    }
}
    

