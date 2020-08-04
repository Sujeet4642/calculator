package github_try;
import java.util.Scanner;

public class Add_Substraction {
public static void main (String args[]) {
	Scanner sc = new Scanner(System.in);
	int a;
	int b;
	int result;
	a = sc.nextInt();
	b = sc.nextInt();
	if(a>b) {
		result = a + b;
		System.out.println("Added");
	}
	else {
		result = a - b;
		System.out.println("Substrated");
	}
}
}
