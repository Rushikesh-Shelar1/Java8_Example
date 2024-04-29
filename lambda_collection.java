package java_8;

import java.util.ArrayList;

public class lambda_collection {

	public static void main(String[] args) {
	ArrayList<String> cars =new ArrayList<String>();
	cars.add("Mahindra Thar");
	cars.add("Tata Nexon");
	cars.add("Toytota Innova");
	cars.add("Tata nano");
	cars.add("Maruti alto");
	System.out.println(cars);
//	for(String s:cars)
//	{
//		System.out.println();
//	}
	cars.forEach(
			(n)->System.out.println(n));
	
	}

}
