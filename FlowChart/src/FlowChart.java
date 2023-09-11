import java.util.Scanner;

public class FlowChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner input = new Scanner(System.in);
			int total;
			System.out.println("How many credits are you taking?");
			int creds=input.nextInt();
			total = (creds * 580) + 650;
			if (creds >12) {
				total=total+250;
			}
			else {
				System.out.println("Do you want activity fee? Yes = 1");
				int fee=input.nextInt();
				if (fee == 1) {
				total=total+250;
				}
			}

			System.out.println("The total tuition is: " + total);
			
			
	}

}
