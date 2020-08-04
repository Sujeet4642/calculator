package github_try;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first numer");
		int a;
		a = sc.nextInt();
		
		System.out.println("Enter second numer");
		int b;
		b = sc.nextInt();
		
		System.out.println("Enter operator (+,-,*,/): ");
		char operator;
		operator = sc.next().charAt(0);
		
		
		
		
		if (operator== '+') {
			int result = a + b;
			System.out.println("Sum of digits : " + result);
			}
		else if(operator== '-') {
			int result = a - b;
			System.out.println("sub of digits : " + result);
			}
		
		else {
			System.out.println("invalid operator");
		}
	
	}

}
