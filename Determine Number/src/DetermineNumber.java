import java.util.Scanner;

public class DetermineNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String ans = "y";
		while (ans.equals("y")) {

			int num = -1;
			int oddCount = 0;
			int evenCount = 0;
			int total = 0;
			while (num != 0) {
				System.out.print("Enter a number: ");
				num = input.nextInt();
				if (num % 2 == 0) {
					System.out.println(num + " is even");
					evenCount++;
				} else {
					System.out.println(num + " is odd");
					oddCount++;
				}
				total = total + num;
			}
			System.out.println("How many numbers: " + (evenCount + oddCount));
			System.out.println("Total " + total);
			System.out.println("Average: " + total / (evenCount + oddCount - 1));
			System.out.println("Is there more numbers?");
			ans = input.next();
		}
		System.out.println("Goodbye!");
	}
}
