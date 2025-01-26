/*2. Temperature Converter
Objective: Build a temperature conversion tool.
Requirements:
Ask the user for a temperature in Celsius.
Convert it to Fahrenheit using the formula: F = (C × 9/5) + 32.
Convert it back to Celsius for verification.
Optionally, add Kelvin conversion.
Concepts Practiced: Variables, arithmetic operations, and float/double types.
*/
import java.util.Scanner;
public class Day2_TempratureConverter {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double celsius,fahrenheit,kelvin;
        int choose;
        System.out.println("\t\"Welcome to Temprature Converter\"\n" +
                "1)Celsius to Fahrenheit\t\t2)Celsius to Kelvin" +
                "\n3)Fahrenheit to Celsius\t\t4)Fahrenheit to Kelvin\n" +
                "5)Kelvin to Celcius\t\t6)Kelvin to Fahrenheit\n0)Exit\nEnter here:");
        choose=input.nextInt();
        if(choose==1){
            System.out.print("Enter Temprature in Celsius :");
            celsius=input.nextDouble();
            fahrenheit=(celsius*9/5)+32;
            System.out.println(celsius+" C in Fahrenheit :"+fahrenheit+" F");
        }
        else if(choose==2){
            System.out.print("Enter Temprature in Celsius :");
            celsius=input.nextDouble();
            kelvin=celsius+273.15;
            System.out.println(celsius+" C in Kelvin :"+kelvin+" K");
        }
        else if(choose==3){
            System.out.print("Enter Temprature in Fahrenheit :");
            fahrenheit=input.nextDouble();
            celsius=(fahrenheit-32)*5/9;
            System.out.println(fahrenheit+" F in Celsius :"+celsius+" C");
        }
        else if(choose==4){
            System.out.print("Enter Temprature in Fahrenheit :");
            fahrenheit=input.nextDouble();
            kelvin=(fahrenheit-32)/1.8+273.15;
            System.out.println(fahrenheit+" F in Kelvin :"+kelvin+" K");
        }
        else if(choose==5){
            System.out.print("Enter Temprature in Kelvin :");
            kelvin=input.nextDouble();
            celsius=kelvin-273.15;
            System.out.println(kelvin+" K in Celsius :"+celsius+" C");
        }
        else if(choose==6){
            System.out.print("Enter Temprature in Kelvin :");
            kelvin=input.nextDouble();
            fahrenheit=(kelvin-273.15)*9/5+32;
            System.out.println(kelvin+" k in Fahrenheit :"+fahrenheit+" F");
        }
        else if(choose==7){
            System.out.println("You have exited the program");
        }
    }
}
