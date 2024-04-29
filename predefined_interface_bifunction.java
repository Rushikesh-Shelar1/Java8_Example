package java_8;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

class map{
	public static Map<Integer,String> map_data(int id,String product){
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(id, product);
		map.put(102, "Ghee");
		map.put(103, "Milk");
		map.put(104, "Butter");
		
		return map;
	}
}
public class predefined_interface_bifunction {

	public static void main(String[] args) {
		
		BiFunction<Integer,String,Map<Integer,String>> con =map::map_data;
		System.out.println(con.apply(101,"tata salt"));

	}

}
