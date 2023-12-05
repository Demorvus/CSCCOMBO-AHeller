public class Exam2 {

    public static boolean howManyCat(String input) {
        String lowercaseInput = input.toLowerCase();

        int count = 0;
        int index = lowercaseInput.indexOf("cat");

        while (index != -1) {
            count++;
            index = lowercaseInput.indexOf("cat", index + 1);
        }

        return count > 0;
    }

    public static boolean endOther(String a, String b) {
        String lowercaseA = a.toLowerCase();
        String lowercaseB = b.toLowerCase();

        return lowercaseA.endsWith(lowercaseB) || lowercaseB.endsWith(lowercaseA);
    }

    public static void main(String[] args) {

        String inputString = "The cat ran away from the dog.";
        boolean containsCat = howManyCat(inputString);
        System.out.println("Contains 'cat': " + containsCat);

        String str1 = "Hello";
        String str2 = "lo";
        boolean endsOther = endOther(str1, str2);
        System.out.println("Either string appears at the very end of the other: " + endsOther);
    }
}
