package basic;
import java.util.Scanner;

public class Innings {
		public static void main(String[]as)throws Exception{
			Scanner sc=new Scanner(System.in);
			System.out.println("Team Name : ");
			UserPrivate in=new UserPrivate();	
			in.setTeamName(sc.next());
			System.out.println(" innings :");
			in.setInnings(sc.next());
			System.out.println("runs :");
			in.setRuns(sc.nextInt());
			in.Displaying();
		
		}
	}

