import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number");
		int sc = scn.nextInt();
		int result = fact(sc);
		System.out.println("factorial of the number is "+result);

	} 

	public static int fact(int n) {
		int i,fact=1;
		for(i=1;i<=n;i++) {
			fact=fact*i;

		}

		return fact;
	}

}
