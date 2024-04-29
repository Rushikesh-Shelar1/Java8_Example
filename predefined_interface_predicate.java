package java_8;

import java.util.Scanner;
import java.util.function.Function;
import java.util.function.Predicate;

class prime_no2{
	public static boolean check_prime(int num) {   
            
		 int count = 0;
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                count++;
	            }
	        }
	        if (count == 2) {
	            return true;
	        }
	        else
	            return false;
        }
}
public class predefined_interface_predicate {

	public static void main(String[] args) {
		System.out.println("enter the no.");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        
        Predicate<Integer> con =prime_no2::check_prime;
        System.out.println(con.test(num));

	}

}
