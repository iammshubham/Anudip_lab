2. Write a program to input two numbers and find the maximum between two numbers using the conditional/ternary operator. Sample Input: num1 = 10 num2 = 30

Code :

package Demo
import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// set two numbers in output 
			System.out.print("Enter first number: ");
			int num1 = scanner.nextInt();

			System.out.print("Enter second number: ");
			int num2 = scanner.nextInt();

			// for Find out the number is maximum using ternary operator 
			int maximum = (num1 > num2) ? num1 : num2;

			// For the result to print
			System.out.println("The maximum number is: " + maximum);
		}
    }
}

Output:

Enter first number: 10
Enter second number: 30
The maximum number is: 30