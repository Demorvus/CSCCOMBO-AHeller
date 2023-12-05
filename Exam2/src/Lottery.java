public class Lottery {

    public static int greenTicket(int a, int b, int c) {
        if (a != b && a != c && b != c) {
            return a + b + c;
        } else if (a == b && a != c) {
            return c;
        } else if (a == c && a != b) {
            return b;
        } else if (b == c && a != b) {
            return a;
        } else {
            return 0;
        }
    }

    public static boolean equiDistance(int a, int b, int c) {
        int small, medium, large;

        if (a < b && a < c) {
            small = a;
            medium = Math.min(b, c);
            large = Math.max(b, c);
        } else if (b < a && b < c) {
            small = b;
            medium = Math.min(a, c);
            large = Math.max(a, c);
        } else {
            small = c;
            medium = Math.min(a, b);
            large = Math.max(a, b);
        }


        return (medium - small) == (large - medium);
    }

    public static void main(String[] args) {

        int result1 = greenTicket(1, 2, 3);
        System.out.println("greenTicket result: " + result1);

        boolean result2 = equiDistance(1, 3, 5);
        System.out.println("equiDistance result: " + result2);
    }
}
