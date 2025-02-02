import java.util.Scanner;
import java.util.Random;
public class Day22_MagicNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        // Generate a random number between 1 and 100
        int magicNumber = random.nextInt(100) + 1;
        int guess;
        int attempts = 0;
        System.out.println("Welcome to the Magic Number Game!");
        System.out.println("I've chosen a number between 1 and 100. Can you guess it?");
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            if (guess < magicNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > magicNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the magic number in " + attempts + " attempts.");
            }
        } while (guess != magicNumber);
        scanner.close();
    }
}