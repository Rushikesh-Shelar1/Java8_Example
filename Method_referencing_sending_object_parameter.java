package java_8;
interface D_mart3
{
	public void data(products3 p);
}
class products3{
	
	int id;
	String name;
	int price;
		
	public products3(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	public static void info(products3 pr) {
		System.out.println(pr.id+" "+pr.name+" "+pr.price);
	}

}
public class Method_referencing_sending_object_parameter {

	public static void main(String[] args) {
		//static method reference
		products3 p=new products3(85,"rubber",8569);
		D_mart3 d1 =products3::info;
		d1.data(p);
		

	}

}
