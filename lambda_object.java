package java_8;
class cricket
{
	String country;
	String captain;
	String bowler;
	String batsman;
	String coach;
	public cricket(String country, String captain, String bowler, String batsman, String coach) {
		
		this.country = country;
		this.captain = captain;
		this.bowler = bowler;
		this.batsman = batsman;
		this.coach = coach;
	}
	
}
interface cricket_sports
{
	public void name_of_sport(cricket c);
}
public class lambda_object {

	public static void main(String[] args) {
		cricket c =new cricket("India","Rohit Sharma","Virat Kohli","Jasprit Bumrah","Rahul Dravid");
		cricket c1 =new cricket("Australia","Pat Cummins","Travis Head","Mitchel Starc","XYZ");
		cricket_sports sp=(cr)->{//defining name_of_sports() method and creating object of class cricket_sport
			System.out.println(cr.country+" "+cr.captain);
			System.out.println(cr.bowler+" "+cr.batsman);
			System.out.println(cr.coach);
		};
		
		cricket_sports sp2=(cr)->{
			System.out.println(" ");
			System.out.println(cr.country+" "+cr.captain);
			System.out.println(cr.bowler+" "+cr.batsman);
			System.out.println(cr.coach);
		};
		sp.name_of_sport(c);
		sp2.name_of_sport(c1);
		
	}

}
