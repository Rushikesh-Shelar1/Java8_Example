package java_8;

import java.util.ArrayList;
import java.util.Collections;

class car{
	String name;
	String brand;
	int price;
	public car(String name, String brand, int price) {
		super();
		this.name = name;
		this.brand = brand;
		this.price = price;
	}
}
public class lambda_collections_comparable {

	public static void main(String[] args) {
		car c1 =new car("thar","Mahindra",180000000);
		car c2 =new car("Nexon","Tata",250000);
		car c3 =new car("Innova","Crysta",28000000);
		car c4 =new car("Compass","jeep",3000000);
		
		ArrayList<car> cars =new ArrayList<car>();
		cars.add(c1);
		cars.add(c2);
		cars.add(c3);
		cars.add(c4);
		/*
		Collections.sort(cars,(car1,car2)->{
			return car1.name.compareTo(car2.name);
		}
		);
		*/
		
		Collections.sort(cars,(car1,car2)->{
			if(car1.price>car2.price) {
				return 1;
			}
			else if(car1.price<car2.price) {
				return -1;
			}
			else {
				return 0;
			}
		}
		);
		for(car c:cars) {
			System.out.println(c.brand+" "+c.name+" "+c.price);
		}

	}

}
