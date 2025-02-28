package Q2;
import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner scan = new Scanner(System.in);
		        System.out.print("Enter a number to find its factorial: ");
		        int number = scan.nextInt();
		        long factorial = calculateFactorial(number);
		        System.out.println("Factorial of " + number + " is: " + factorial);
		        scan.close();
		    }
		    public static long calculateFactorial(int n) {
		        if (n < 0) {
		            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
		        }
		        long factorial = 1;
		        for (int i = 1; i <= n; i++) {
		            factorial *= i;
		        }
		        return factorial;
		    }
}