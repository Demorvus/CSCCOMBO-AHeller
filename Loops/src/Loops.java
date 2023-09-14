
public final class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println();
		int i = 1;
		int sum = 0;
		while (i <= 10) {
		    sum += i;
		    i++;
		    
		}
		System.out.println("Sum of numbers from 1 to 10 is: " + sum);
		sum = 0;
		
		for(int count = 0; count <=10; count = count + 1) {
			sum += count;
			
			
		}
		System.out.println("Sum of the numbers from 1 to 10 is: " + sum);
	}

}
