package java_8;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;

class prime_no1{
	public static String check_prime(int num) {   
            
		 int count = 0;
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                count++;
	            }
	        }
	        if (count == 2) {
	            return "it is a prime no: ";
	        }
	        else
	            return "not a prime no";
        }
}
public class predefined_interface_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the no.");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        
        Function<Integer,String> con =prime_no1::check_prime;
        System.out.println(con.apply(num));
        
	}

}
