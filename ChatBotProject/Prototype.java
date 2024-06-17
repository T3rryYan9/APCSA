import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Simple ChatBot!");
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("What is your grade? ");
        String grade = scanner.nextLine();

        System.out.println("\nThank you, " + name + "!");
        System.out.println("Your grade is: " + grade);

        scanner.close();
    }
}


