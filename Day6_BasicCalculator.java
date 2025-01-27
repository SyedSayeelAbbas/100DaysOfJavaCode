/*Making a Basic Calculator*/
import java.util.Scanner;
public class Day6_BasicCalculator {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        float num1,num2;
        System.out.println("\"Welcome to Basic Calculator\"");
        System.out.print("Choose the operation you want to do\n" +
        "1)Addition\t\t2)Subraction\n3)Multiplication\t4)Division\nEnter Here:");
        int choose=input.nextInt();
        switch (choose){
            case 1:
            {
                System.out.print("Enter First value :");
                num1=input.nextFloat();
                System.out.print("Enter Second value :");
                num2=input.nextFloat();
                System.out.println(Math.round(num1)+"+"+Math.round(num2)+"="+(num1+num2));
                break;
            }
            case 2:
            {
                System.out.print("Enter First value :");
                num1=input.nextFloat();
                System.out.print("Enter Second value :");
                num2=input.nextFloat();
                System.out.println(Math.round(num1)+"-"+Math.round(num2)+"="+(num1-num2));
                break;
            }
            case 3:
            {
                System.out.print("Enter First value :");
                num1=input.nextFloat();
                System.out.print("Enter Second value :");
                num2=input.nextFloat();
                System.out.println(Math.round(num1)+"x"+Math.round(num2)+"="+(num1*num2));
                break;
            }
            case 4:
            {
                System.out.print("Enter First value :");
                num1=input.nextFloat();
                System.out.print("Enter Second value :");
                num2=input.nextFloat();
                System.out.println(num1+"/"+num2+"="+(num1/num2));
                break;
            }
        }
    }
}
