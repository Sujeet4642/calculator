package github_try;

import java.util.Scanner;

public class Operations {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a;
		int b;
		int result;
		System.out.println("Enter first and second digits");
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a>b) {
			result = a + b;
			System.out.println("Sum of digits : " + result);
			}
		else {
			result = a - b;
			System.out.println("sub of digits : " + result);
			}
	
	}

}
