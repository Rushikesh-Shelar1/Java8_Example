package java_8;
interface sports{
	public void name_of_sport();
	}
public class lambda_2  {

	public static void main(String[] args) {
		
		
		//using anonymous class
		sports sp =new sports(){   //sports is the parent class of the this anonymous class, where the class declaration and implementation takes at same place			
			public void name_of_sport(){
				System.out.println("cricket");
			}
		};
		
		//using lambda function 
		sports sp1=()->{
			System.out.println("basketball");
		};
		
		sp.name_of_sport();
		sp1.name_of_sport();

	}

}
