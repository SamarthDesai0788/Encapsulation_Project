package basic;
public class UserPrivate{
    private String teamName;
    private String innings;
    private int runs;
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getInnings() {
        return innings;
    }
    public void setInnings(String innings) {
        this.innings = innings;
    }
    public int getRuns() {
        return runs;
    }
    public void setRuns(int runs) {
        this.runs = runs;
    }
    public void Displaying() {
    	if (innings.equals("First")) {
            System.out.println("Team Name: "+teamName);
            System.out.println("Scored: "+runs);
            System.out.println("Need "+(runs+1)+" to win");
        } else if(innings.equals("Second")) {
        	 System.out.println("Team Name: "+teamName);
             System.out.println("Scored: "+runs);
            System.out.println("match ended");
        }
        else {
        	System.out.println("Invalid");
        }
    
    }
}