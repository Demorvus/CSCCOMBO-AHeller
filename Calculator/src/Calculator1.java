import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			boolean goAgain = true;

			while (goAgain) {
			    System.out.println("What operation would you like to perform? Choose from addition (+), subtraction (-), multiplication (*), or division (/)");
			    String operation = scanner.nextLine();

			    System.out.print("Enter the first number: ");
			    double num1 = scanner.nextDouble();
			    System.out.print("Enter the second number: ");
			    double num2 = scanner.nextDouble();
			    double result;

			    if (operation.equals("+")) {
			        result = num1 + num2;
			    } else if (operation.equals("-")) {
			        result = num1 - num2;
			    } else if (operation.equals("*")) {
			        result = num1 * num2;
			    } else if (operation.equals("/")) {
			        if (num2 != 0) {
			            result = num1 / num2;
			        } else {
			            System.out.println("Division by zero is not allowed");
			            continue;
			        }
			    } else {
			        System.out.println("Invalid operation!");
			        continue;
			    }

			    System.out.println("The result is: " + result);

			    System.out.print("Enter a number to count up to 100: ");
			    int countNumber = scanner.nextInt();
			    
			    if (countNumber <= 0) {
			        System.out.println("Please enter a positive number to count.");
			    } else {
			        int currentCount = 0;
			        while (currentCount < 100) {
			            currentCount += countNumber;
			            System.out.println("Count: " + currentCount);
			        }
			        if (currentCount != 100) {
			            System.out.println("Count: 100");
			        }
			    }

			    System.out.print("Do you want to go again? (yes/no): ");
			    String goAgainResponse = scanner.next();
			    goAgain = goAgainResponse.toLowerCase().equals("yes");
			}
		}
        System.out.println("Thank you for using the calculator!");
    }
}