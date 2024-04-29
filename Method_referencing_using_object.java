package java_8;
interface D_mart1
{
	public void data(int id,String name,int price);
}
class products1{

	public void info(int p_id, String p_name, int p_price) {
		System.out.println(p_id+" "+p_name+" "+p_price);
		System.out.println("i am info method");
	}
	public static void details(int id, String name, int price) {
		System.out.println(id+" "+name+" "+price);
	}
}
public class Method_referencing_using_object {

	public static void main(String[] args) {
		
		//object Method reference
		products1 p1=new products1();
		D_mart1 d1 =p1::info;
		d1.data(45,"suger 5kg",100);
		
		//lambda Expression
		D_mart1 d2= (a,b,c)-> {System.out.println(a+" "+b+" "+c);};
		d2.data(2002,"Ghee 1kg",250);
		
		
		//static method reference
		D_mart d3=products1::details;
		d3.data(303,"salt", 10);
	}

}
