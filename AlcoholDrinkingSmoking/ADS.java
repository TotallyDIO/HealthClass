import java.util.Scanner;  // Reads inputs

public class ADS{
    static int totalQuestions = 40;
    int currentQuestion = 1;
    int correctAnswers = 0;
    int incorrectAnswers = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creates Scanner

        // Introduction
        System.out.println("Welcome to the Alcohol, Drinking, and Smoking Quiz!");
        System.out.println("You will be asked " + totalQuestions + " questions. Good luck!");
        System.out.println("Press Enter to start...");
        String a = scanner.nextLine(); // Waits for user to press Enter
        if (a.isEmpty()) {
            System.out.println("Starting quiz...");
        System.out.print("\033[H\033[2J");//clears console for cleanliness
        System.out.flush();
        }
        System.out.println("Question 1: What is the legal drinking age in most countries?");

    }
}