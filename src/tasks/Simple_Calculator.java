package tasks;

import java.util.Scanner;

public class Simple_Calculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Simple Calculator");
		System.out.println();
		System.out.println("Choose an operation:");
		System.out.println("1. Addition (+)");
		System.out.println("2. Subtraction (-)");
		System.out.println("3. Multiplication (*)");
		System.out.println("4. Division (/)");

		System.out.print("Enter your choice (1-4): ");
		int choice = scanner.nextInt();

		System.out.print("Enter the first number: ");
		double num1 = scanner.nextDouble();

		System.out.print("Enter the second number: ");
		double num2 = scanner.nextDouble();

		double result = 0;
		boolean validOperation = true;

		switch (choice) {
		case 1:
			result = num1 + num2;
			System.out.println("Operation: Addition");
			break;
		case 2:
			result = num1 - num2;
			System.out.println("Operation: Subtraction");
			break;
		case 3:
			result = num1 * num2;
			System.out.println("Operation: Multiplication");
			break;
		case 4:
			if (num2 != 0) {
				result = num1 / num2;
				System.out.println("Operation: Division");
			} else {
				System.out.println("Error: Division by zero is not allowed.");
				validOperation = false;
			}
			break;
		default:
			System.out.println("Invalid choice. Please choose a number between 1 and 4.");
			validOperation = false;
		}

		if (validOperation) {
			System.out.println("Result: " + result);
		}

		scanner.close();
	}
}
