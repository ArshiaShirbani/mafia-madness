package mafiadata;

public abstract class role {
   /*  private String Villager;
    private String Mafia;
    private String Doctor;
    private String Sheriff;
    private String Spectator;
*/

    // These variables will indicate the total number of players who can be on each team
    private int villager_Num;
    private int mafia_Num;
    private int doctor_Num;
    private int sheriff_Num;
    private int spectator_Num;

    protected int role_Id;
 

    public abstract String getRoleName();


	
	public void setRole(int r) {
		this.role_Id = r;
		
	}


    public void roleAction(){

    }
	

	
	
}



