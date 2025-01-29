import java.util.Scanner;

public class Day20_VowelsConsonantsCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of words: ");
        int size = input.nextInt();
        input.nextLine(); // Consume the leftover newline
        String[] words = new String[size]; // Use a 1D array

        System.out.println("Enter " + size + " words:");
        for (int i = 0; i < size; i++) {
            words[i] = input.nextLine(); // Store each word in the array
        }

        int vowelsCount = 0, consonantsCount = 0;

        // Iterate through each word and count vowels & consonants
        for (String word : words) {
            word = word.toLowerCase(); // Convert word to lowercase for easy comparison

            for (char ch : word.toCharArray()) { // Convert word to character array
                if (ch >= 'a' && ch <= 'z') { // Check if it's a letter
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        vowelsCount++;
                    } else {
                        consonantsCount++;
                    }
                }
            }
        }

        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}
