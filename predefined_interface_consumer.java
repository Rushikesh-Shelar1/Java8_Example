package java_8;

import java.util.Scanner;
import java.util.function.Consumer;

class prime_no{
	public static void check_prime(int num) {   
            
		 int count = 0;
	        for (int i = 1; i <= num; i++) {
	            if (num % i == 0) {
	                count++;
	            }
	        }
	        if (count == 2) {
	            System.out.println("it is a prime no: " + num);
	        }
	        else
	            System.out.println("not a prime no");
        }
	
public static void string_palindrome(String sentence1){
    
     StringBuffer sb =new StringBuffer(sentence1);
     sb.reverse();
     String str1 =sb.toString();
     if(sentence1.equals(str1)){
         System.out.println("it is palindrome");
     }
     else
         System.out.println("not a palindrome");

	}
}
public class predefined_interface_consumer {

	public static void main(String[] args) {
		
		System.out.println("enter the no.");
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        
        Consumer<Integer> con =prime_no::check_prime;
        con.accept(num);
        
        
        System.out.println("enter the word ");
        String sentence=sc.next();
        
        Consumer<String> con1 =prime_no::string_palindrome;
        con1.accept(sentence);
        
	}

}
