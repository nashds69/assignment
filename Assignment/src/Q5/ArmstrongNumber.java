package Q5;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = scan.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        scan.close();
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int sum = 0;
        int numDigits = (int) Math.floor(Math.log10(number)) + 1;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }
}