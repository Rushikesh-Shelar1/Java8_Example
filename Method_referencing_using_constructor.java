package java_8;
interface D_mart2
{
	public void data(int id,String name,int price);
}
class products2{
	int id;
	String name;
	int price;
	public products2(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		System.out.println(id+" "+name+" "+price);
		System.out.println("i am second line thanks for calling me");
	}

}
public class Method_referencing_using_constructor {

	public static void main(String[] args) {
		
		D_mart2 d4=products2::new;
		d4.data(502,"MDH masale", 80);
	}

}
