import java.util.Scanner;
public class Day10_PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        System.out.print("Enter your number: ");
        number = input.nextInt();

        if (number <= 1) {
            System.out.println(number + " is not a prime number.");
        } else if (number == 2) {
            System.out.println(number + " is a prime number.");
        } else if (number % 2 == 0) {
            System.out.println(number + " is not a prime number.");
        } else {
            // Check divisibility only by odd numbers up to the square root
            int limit = (int) Math.sqrt(number);
            boolean isPrime = true;
            for (int i = 3; i <= limit; i += 2) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }
    }
}