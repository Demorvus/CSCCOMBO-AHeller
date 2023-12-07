import java.util.Scanner;

public class Arrays {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("How many words?");
		int num = input.nextInt();

		String[] stringArray = new String[num];
		for (int i = 0; i < num; i++) {
			System.out.println("Enter word: ");
			stringArray[i] = input.next();

		}
		int[] strLens = new int[num];
		for (int i = 0; i < num; i++) {
			System.out.print(stringArray[i] + " ");
			strLens[i] = stringArray[i].length();
			
			
		}
		System.out.println();
		for (int i = 0; i < num; i++) {
			System.out.print(strLens[i]+ " ");
		}
	}

	
	
	
}
