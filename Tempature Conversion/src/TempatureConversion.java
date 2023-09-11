import java.util.Scanner;

public class TempatureConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		{
		        Scanner input = new Scanner(System.in);
		        System.out.print("Enter temperature in Fahrenheit: ");
		        double fahrenheit = input.nextDouble();
		        double celsius = (fahrenheit - 32) * 5 / 9;
		        double kelvin = celsius + 273.15;
		        System.out.printf("%.2f°F is equivalent to %.2f°C and %.2fK.", fahrenheit, celsius, kelvin);
		    }
		}

}
