import java.util.Scanner;

public class Exam1Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("this is my first programming test");
//		**Problem 2
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter a number to choose a beverage:");
		System.out.println("(1) Water");
		System.out.println("(2) Coke");
		System.out.println("(3) Coffee");
		int choice = scanner.nextInt();
		String beverage;

		switch (choice) {
		case 1:
			beverage = "Water";
			break;
		case 2:
			beverage = "Coke";
			break;
		case 3:
			beverage = "Coffee";
			break;
		default:
			beverage = "Invalid choice";
			break;
		}

		System.out.println("You chose: " + beverage);
//		**Problem 3
        int num1 = 5;
        int num2 = 5;
        
        if (makes10(num1, num2)) {
            System.out.println("The numbers " + num1 + " and " + num2 + " add up to 10.");
        } else {
            System.out.println("The numbers " + num1 + " and " + num2 + " do not add up to 10.");
        }
    }
    
    public static boolean makes10(int a, int b) {
        return (a + b) == 10;
    
//	** Problem 4
//    for (int i = 5; i <= 19; i++) {
//        System.out.println(i);
//    }
//    ** Problem 5
//    boolean accumulator() {
//        numbers = [];
//        sum = 0;
//        number = parseInt(prompt("Enter a number: "));
//
//        while (number !== 0) {
//            numbers.push(number);
//            sum += number;
//            number = parseInt(prompt("Enter a number: "));
//        }
//
//        console.log("All numbers entered: " + numbers.join(", "));
//        console.log("Sum of all numbers: " + sum);
//    }
//
//    accumulator();
//    
}
}