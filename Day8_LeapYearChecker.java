import java.util.Scanner;
public class Day8_LeapYearChecker {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("\"Welcome to Leap Year Checker\"");
        int year;
        System.out.print("Enter year :");
        year =input.nextInt();
        if((year%4==0&&year%100!=0)||(year%400==0)){
            System.out.println(year+" is a leap year");
        }
        else {
            System.out.println(year+" is not a leap year");
        }
    }
}
