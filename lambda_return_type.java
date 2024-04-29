package java_8;
interface sport2{
	public String name_of_sport(String name,int budget);
	}
public class lambda_return_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sport2 sp1=(name1,budget1)->{
			return "The sports "+name1+" budget is "+budget1;
		};
		
		
		sport2 sp2=(a,b)->{
			return "The sports "+a+" budget is "+b;
		};
		String s1=sp1.name_of_sport("hockey",100000);
		System.out.println(s1);
		System.out.println(sp2.name_of_sport("football",200000));
	}

}
