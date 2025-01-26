/*3. Simple Interest Calculator
Objective: Calculate simple interest based on user input.
Requirements:
Take inputs for the principal amount (double),
 rate of interest (float), and time in years (int).
Calculate simple interest using the formula: SI = (P × R × T) / 100.
Display the interest and total amount.
Concepts Practiced: Data types (double, float, int), user input,
and mathematical operations.
*/
import java.util.Scanner;
public class Day3_Simple_interest {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double si,principalAmount;
        float interest;
        int years;
        System.out.print("Enter Principal Amount :");
        principalAmount=input.nextDouble();
        System.out.print("Enter Rate of Interesrt :");
        interest=input.nextFloat();
        System.out.print("Enter Time on Years :");
        years=input.nextInt();
        si=(principalAmount*interest*years)/100;
        System.out.println("The simple inetrest is :"+si);
    }
}
