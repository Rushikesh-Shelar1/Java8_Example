package java_8;
interface D_mart
{
	public void data(int id,String name,int price);
}
class products{

	public static void info(int p_id, String p_name, int p_price) {
		System.out.println(p_id+" "+p_name+" "+p_price);
	}
}
public class Method_referencing_using_static_method {

	public static void main(String[] args) {
	//static method reference
	D_mart d1 =products::info;
	d1.data(45,"suger 5kg",100);
	
	//lambda Expression
	D_mart d2= (a,b,c)-> {System.out.println(a+" "+b+" "+c);};
	d2.data(2002,"Ghee 1kg",250);
	}

}
