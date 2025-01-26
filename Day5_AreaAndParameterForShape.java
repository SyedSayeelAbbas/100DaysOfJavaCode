/*5. Area and Perimeter Calculator for Shapes
Objective: Calculate the area and perimeter of different shapes based on user input.
Requirements:
Prompt the user to choose a shape (e.g., Circle, Rectangle, Square).
For each shape:
Circle: Take the radius and calculate area (π * r^2) and circumference (2 * π * r).
Rectangle: Take length and width to calculate area and perimeter.
Square: Take the side length to calculate area and perimeter.
Use Math.PI for accurate π value.
Concepts Practiced: Variables, constants, mathematical operations, and conditionals.
*/
import java.util.Scanner;
import java.lang.Math;
public class Day5_AreaAndParameterForShape {
    public static void main(String[] args) {
        float piValue=(float)Math.PI;
        Scanner input=new Scanner(System.in);
        System.out.print("Choose the Shape :\n1)Circle\n2)Rectangle\n3)Square\nENTER HERE:");
        int choose=input.nextInt();
        switch (choose){
            case 1:
            {
                float radius,area,circum;
                System.out.print("\t\"YOU HAVE SELECTED CIRCLE\"\nEnter Radius of Circle :");
                radius=input.nextFloat();
                area=piValue*(radius*radius);
                circum=piValue*2*radius;
                System.out.println("Area of circle is :"+area);
                System.out.println("Parameter of circle is :"+circum);
                break;
            }
            case 2:
            {
                float length,width;
                System.out.print("\t\"YOU HAVE SELECTED RECTANGLE\"\nEnter Length of Rectangle :");
                length=input.nextFloat();
                System.out.print("Enter Width of Rectangle :");
                width=input.nextFloat();
                float area=length*width,parameter=2*(length+width);
                System.out.println("Area of Rectangle is :"+area);
                System.out.println("Parameter of Rectangle is :"+parameter);
                break;
            }
            case 3:
            {
                float length;
                System.out.print("\t\"YOU HAVE SELECTED Square\"\nEnter Length of Square :");
                length=input.nextFloat();
                float area=length*length,parameter=4*length;
                System.out.println("Area of Square is :"+area);
                System.out.println("Parameter of Square is :"+parameter);
                break;
            }
        }
    }
}
