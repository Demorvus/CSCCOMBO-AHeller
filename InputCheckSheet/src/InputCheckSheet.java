import java.util.Scanner;

public class InputCheckSheet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String word;
		int intNum;
		float realNum;
		double biggerRealNum;
		char letter;
		
		System.out.println("The word goes here");
		word = input.next();
		System.out.println("The word goes here" + word);
		System.out.println("The number goes here");
		intNum = input.nextInt();
		System.out.println("The number goes here" + intNum);
		System.out.println("The number goes here");
		realNum = input.nextFloat();
		System.out.println("The number goes here" + realNum);
		System.out.println("The number goes here");
		biggerRealNum = input.nextDouble();
		System.out.println("The number goes here" + biggerRealNum);
		System.out.println("Enter charachter");
		letter = input.next().charAt(0);
		System.out.println("Enter Charachter" + letter);
		System.out.printf("$%.2f", biggerRealNum);
		//
		
	}

}
