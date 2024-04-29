package java_8;
interface sportsgame{
	public void name_of_sport();
	}
public class lambda1 implements sportsgame {
	public void name_of_sport() {
		System.out.println("Cricket");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sportsgame sp=new lambda1();
		sp.name_of_sport();

	}

}
