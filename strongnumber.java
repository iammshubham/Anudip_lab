 1.Write a program to check whether a number is a Strong number or not.
 Strong number is a special number whose sum of factorial of digits is equal to the
 original number.
 For example: 145 is a strong number. Since, 1! + 4! + 5! = 145
 [Hint: conditional operator,method,use parameterized method to take input]


Code:

package Demo;

import java.util.Scanner;

public class StrongNumberChecker {



	    // Method to calculate factorial
	    static int factorial(int n) {
	        int fact = 1;
	        for (int i = 2; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    // Method to check if a number is a strong number
	    static void checkStrongNumber(int number) {
	        int original = number;
	        int sum = 0;

	        while (number > 0) {
	            int digit = number % 10;
	            sum += factorial(digit);
	            number /= 10;
	        }

	        // Using ternary operator to print result
	        String result = (sum == original) ? "Strong number" : "Not a strong number";
	        System.out.println(original + " is " + result);
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Taking input using a parameterized method
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();

	        checkStrongNumber(num);

	        scanner.close();
	    }

}


output :  

Enter a number: 145
145 is Strong number