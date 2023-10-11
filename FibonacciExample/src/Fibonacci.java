public class Fibonacci {
    static long[] fibArray;

    public static void main(String[] args) {
        int term = 47;
        fibArray = new long[term + 1];
        System.out.println(fib(term));
        for (int i = 0; i <= term; i++) {
        	if(i%7 == 0)System.out.println();
            System.out.println(fibArray[i]);
        }
    }

    private static long fib(int n) {
        if (n == 0 || n == 1) return n;
        if (fibArray[n] != 0) {
            return fibArray[n];
        }
        long nthFibNum = fib(n - 1) + fib(n - 2);
        fibArray[n] = nthFibNum;
        return nthFibNum;
    }
}
//    public int fib(int n) {
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }
//    public static void main(String[] args) {
//        Fibonacci fibonacci = new Fibonacci();
//        int n = 10;
//        int result = fibonacci.fib(n);
//        System.out.println("Fibonacci number at position " + n + " is: " + result);
//    }
//}
// Made one where you can input the number and it will give placement of Fibonnaci
//import java.util.Scanner;
//
//public class Fibonacci {
//    public int fib(int n) {
//        if (n == 0 || n == 1) {
//            return n;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }
//
//    public static void main(String[] args) {
//        Fibonacci fibonacci = new Fibonacci();
//        
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the position of the Fibonacci number: ");
//        int n = scanner.nextInt();
//        scanner.close();
//        
//        if (n < 0) {
//            System.out.println("Position should be a non-negative number.");
//        } else {
//            int result = fibonacci.fib(n);
//            System.out.println("Fibonacci number at position " + n + " is: " + result);
//        }
//    }
//}