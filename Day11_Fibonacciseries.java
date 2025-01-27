import java.util.Scanner;

public class Day11_Fibonacciseries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        System.out.print("Enter the number of terms for the Fibonacci series: ");
        num = input.nextInt();

        int a = 0, b = 1, next;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            next = a + b;
            a = b;
            b = next;
        }
    }
}