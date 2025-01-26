/*4. Currency Converter
Objective: Create a program that converts amounts between two currencies.
Requirements:
Take input for an amount in USD.
Convert it to INR (Indian Rupee), EUR (Euro), and GBP (British Pound)
using predefined conversion rates.
Display the results with appropriate formatting.
Concepts Practiced: Data types (double), constants, and user interaction.
*/
import java.util.Scanner;
public class Day4_Currency_Converter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float pkr,inr,gbp,eur;
        System.out.println("\"Welcome to Currency Convert\"\n"
        +"1)PKR TO INR \t2)PKR TO EUR\n3)PKR TO GBP\t4)INR TO PKR\n5)INR TO EUR\t6)INR TO GBT" +
                "\n7)EUR TO PKR\t8)EUR TO INR\n9)EUR TO GBT\t10)GBT TO PKR\n11)GBT TO INR\t12)GBT TO EUR\nEnter here :");
        int choose=input.nextInt();
        switch (choose){
            case 1:
            {
                System.out.print("Enter Your amount in PKR :");
                pkr=input.nextInt();
                System.out.print(pkr+" PKR is "+pkr*0.31+" INR");
                break;
            }
            case 2:
            {
                System.out.print("Enter Your amount in PKR :");
                pkr=input.nextInt();
                System.out.print(pkr+" PKR is "+pkr*0.0034162315+" EUR");
                break;
            }
            case 3:
            {
                System.out.print("Enter Your amount in PKR :");
                pkr=input.nextInt();
                System.out.print(pkr+" PKR is "+pkr*0.0028783177+" GBP");
                break;
            }
            case 4:
            {
                System.out.print("Enter Your amount in INR :");
                inr=input.nextInt();
                System.out.print(inr+" INR is "+inr*3.2332707+" PKR");
                break;
            }
            case 5:
            {
                System.out.print("Enter Your amount in INR :");
                inr=input.nextInt();
                System.out.print(inr+" INR is "+inr*0.011048179+" EUR");
                break;
            }
            case 6:
            {
                System.out.print("Enter Your amount in INR :");
                inr=input.nextInt();
                System.out.print(inr+" INR is "+inr*0.009300337+" GBP");
                break;
            }
            case 7:
            {
                System.out.print("Enter Your amount in EUR :");
                eur=input.nextInt();
                System.out.print(eur+" EUR is "+eur*292.65191+" PKR");
                break;
            }
            case 8:
            {
                System.out.print("Enter Your amount in EUR :");
                eur=input.nextInt();
                System.out.print(eur+" EUR is "+eur*90.512652+" INR");
                break;
            }
            case 9:
            {
                System.out.print("Enter Your amount in EUR :");
                eur=input.nextInt();
                System.out.print(eur+" EUR is "+eur*0.84179817+" GBP");
                break;
            }
            case 10:
            {
                System.out.print("Enter Your amount in GBP :");
                gbp=input.nextInt();
                System.out.print(gbp+" GBP is "+gbp*347.65092+" PKR");
                break;
            }
            case 11:
            {
                System.out.print("Enter Your amount in GBP :");
                gbp=input.nextInt();
                System.out.print(gbp+" GBP is "+gbp*107.52299+" INR");
                break;
            }
            case 12:
            {
                System.out.print("Enter Your amount in GBP :");
                gbp=input.nextInt();
                System.out.print(gbp+" GBP is "+gbp*1.1879332+" EUR");
                break;
            }
            case 13:
            {
                System.out.print("You have exited the program");
                break;
            }

        }
    }

}