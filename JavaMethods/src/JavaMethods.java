import java.util.Scanner;

public class JavaMethods {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter a number: ");
//		int num1= scan.nextInt();
//		System.out.println("Enter a number: ");
//		int num2= scan.nextInt();
//		System.out.println("Enter a number: ");
//		int num3= scan.nextInt();
//		System.out.println("smallestNum="+findSmallest(num1,num2,num3));
//		
//		
//		System.out.println("Enter a number: ");
//		num1= scan.nextInt();
//		System.out.println("Enter a number: ");
//		num2= scan.nextInt();
//		System.out.println("Enter a number: ");
//		num3= scan.nextInt();
//		System.out.println("averageNum="+findAverage(num1,num2,num3));
//		
		
		System.out.println("Enter a number: ");
		String str= scan.next();
		System.out.println("middleChar="+getMiddleChar(str));
	}
	public static float findSmallest (int num1, int num2, int num3) {
		int smallest = num1;
		if (num2<smallest) {
			smallest=num2;
		}
		if (num3<smallest) {
			smallest=num3;
		}
		return smallest;
	
	}
	public static float findAverage (int num1, int num2, int num3) {
		return (num1 + num2 + num3)/3;
	}
	
	
	
	public static String getMiddleChar(String str) {
	    int length = str.length();
	    int middleIndex = length / 2;
	    if (length % 2 == 0) {
	        return str.substring(middleIndex - 1, middleIndex + 1);
	    } else {
	        return str.substring(middleIndex, middleIndex + 1);
	    }
	}
}
