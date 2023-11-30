import java.util.Scanner;

public class RaceSelection {
    static Scanner scanner = new Scanner(System.in);

    static String chooseRace() {
        System.out.println("Choose your race: ");
        System.out.println("1. Human");
        System.out.println("2. Elf");
        System.out.println("3. Dwarf");

        int raceChoice = getIntInput("Select a race (1-3): ", 1, 3);
        return getRaceName(raceChoice);
    }

    private static int getIntInput(String prompt, int min, int max) {
        int choice = -1;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            choice = scanner.nextInt();
        } while (choice < min || choice > max);

        return choice;
    }

    private static String getRaceName(int raceChoice) {
        switch (raceChoice) {
            case 1:
                return "Human";
            case 2:
                return "Elf";
            case 3:
                return "Dwarf";
            default:
                return "Unknown";
        }
    }
}