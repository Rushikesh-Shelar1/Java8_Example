package java_8;
interface sport1{
	public void name_of_sport(String name,int budget);
	}
public class lambda_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sport1 sp1=(name1,budget1)->{
			System.out.println("The sports "+name1+" budget is "+budget1);
		};
		
		
		sport1 sp2=(a,b)->System.out.println("The sports "+a+" budget is "+b);//lambda without passing parameter data type and curly braces,{}
		
		sp1.name_of_sport("hockey",100000);
		sp2.name_of_sport("football",200000);
	}

}
