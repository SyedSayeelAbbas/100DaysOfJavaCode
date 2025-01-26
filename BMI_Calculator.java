/*1.BMI Calculator
Objective: Create a program that calculates the Body Mass Index (BMI).
Requirements:
Take user inputs for height (in meters) and weight (in kilograms).
Use the formula: BMI = weight / (height * height).
Display the BMI value and categorize it (e.g., Underweight, Normal, Overweight, Obese).
Concepts Practiced: Data types (float/double), input handling, and conditional*/
import java.util.Scanner;
public class BMI_Calculator {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        double height,weight,bmi;
        System.out.print("Enter Your height in meters :");
        height=input.nextDouble();
        System.out.print("Enter Your Weight in Kilogram :");
        weight=input.nextDouble();
        bmi=weight/(height*height);
        if(bmi>0&&bmi<=18.5){
            System.out.println("Underweight as your BMI is :"+bmi);
        }
        else if(bmi>18.5&&bmi<=24.9){
            System.out.println("Normal as your BMI is :"+bmi);
        }
        else if(bmi>24.9&&bmi<=29.9){
            System.out.println("Overweight as your BMI is :"+bmi);
        }
        else if(bmi>29.9&&bmi<=39.9){
            System.out.println("Obese as your BMI is :"+bmi);
        }
        else if(bmi>39.9){
            System.out.println("sever Obese as your BMI is :"+bmi);
        }
    }
}
