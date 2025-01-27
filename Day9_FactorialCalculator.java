import java.util.Scanner;
public class Day9_FactorialCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num,factorial=1;
        System.out.print("Enter your number :");
        num=input.nextInt();
        for(int i=1;i<=num;i++){
            factorial*=i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
