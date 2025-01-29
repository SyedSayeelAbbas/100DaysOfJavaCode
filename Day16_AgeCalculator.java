import java.util.Scanner;
public class Day16_AgeCalculator {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int currentMonthDigit,currentDayDigit,birthMonthDigit,birthDayDigit;
        System.out.println("Enter Current Year:");
        int currentYear=input.nextInt();
        input.nextLine();
        System.out.println("Enter Current Day(monday,tuesday,wednesday,thursday,friday,saturday,sunday):");
        String currentDay=input.nextLine();
        System.out.println("Enter Current Month(jan,feb,march,apr,may,june,july,aug,sep,oct,nov,dec):");
        String currentMonth=input.nextLine();
        System.out.println("Enter Birth Year:");
        int birthYear=input.nextInt();
        input.nextLine();
        System.out.println("Enter Birth Day(monday,tuesday,wednesday,thursday,friday,saturday,sunday):");
        String birthDay=input.nextLine();
        System.out.println("Enter Birth Month(jan,feb,march,apr,may,june,july,aug,sep,oct,nov,dec):");
        String birthMonth=input.nextLine();
        switch (currentMonth)
        {
            case "jan":
            {
                currentMonthDigit=1;
                break;
            }
            case "feb":
            {
                currentMonthDigit=2;
                break;
            }
            case "march":
            {
                currentMonthDigit=3;
                break;
            }
            case "apr":
            {
                currentMonthDigit=4;
                break;
            }
            case "may":
            {
                currentMonthDigit=5;
                break;
            }
            case "june":
            {
                currentMonthDigit=6;
                break;
            }
            case "july":
            {
                currentMonthDigit=7;
                break;
            }
            case "aug":
            {
                currentMonthDigit=8;
                break;
            }
            case "sep":
            {
                currentMonthDigit=9;
                break;
            }
            case "oct":
            {
                currentMonthDigit=10;
                break;
            }
            case "nov":
            {
                currentMonthDigit=11;
                break;
            }
            case "dec":
            {
                currentMonthDigit=12;
                break;
            }
            default:
            {
                System.out.println("Wrong Input");
                return;
            }

        }
        switch (currentDay)
        {
            case "monday":
            {
                currentDayDigit=1;
                break;
            }
            case "tuesday":
            {
                currentDayDigit=2;
                break;
            }
            case "wednesday":
            {
                currentDayDigit=3;
                break;
            }
            case "thursday":
            {
                currentDayDigit=4;
                break;
            }
            case "friday":
            {
                currentDayDigit=5;
                break;
            }
            case "saturday":
            {
                currentDayDigit=6;
                break;
            }
            case "sunday":
            {
                currentDayDigit=7;
                break;
            }
            default:
            {
                System.out.println("Wrong input");
                return;
            }
        }
        switch (birthMonth)
        {
            case "jan":
            {
                birthMonthDigit=1;
                break;
            }
            case "feb":
            {
                birthMonthDigit=2;
                break;
            }
            case "march":
            {
                birthMonthDigit=3;
                break;
            }
            case "apr":
            {
                birthMonthDigit=4;
                break;
            }
            case "may":
            {
                birthMonthDigit=5;
                break;
            }
            case "june":
            {
                birthMonthDigit=6;
                break;
            }
            case "july":
            {
                birthMonthDigit=7;
                break;
            }
            case "aug":
            {
                birthMonthDigit=8;
                break;
            }
            case "sep":
            {
                birthMonthDigit=9;
                break;
            }
            case "oct":
            {
                birthMonthDigit=10;
                break;
            }
            case "nov":
            {
                birthMonthDigit=11;
                break;
            }
            case "dec":
            {
                birthMonthDigit=12;
                break;
            }
            default:
            {
                System.out.println("Wrong Input");
                return;
            }

        }
        switch (birthDay)
        {
            case "monday":
            {
                birthDayDigit=1;
                break;
            }
            case "tuesday":
            {
                birthDayDigit=2;
                break;
            }
            case "wednesday":
            {
                birthDayDigit=3;
                break;
            }
            case "thursday":
            {
                birthDayDigit=4;
                break;
            }
            case "friday":
            {
                birthDayDigit=5;
                break;
            }
            case "saturday":
            {
                birthDayDigit=6;
                break;
            }
            case "sunday":
            {
                birthDayDigit=7;
                break;
            }
            default:
            {
                System.out.println("Wrong input");
                return;
            }
        }
        if(currentMonthDigit < birthMonthDigit || (currentMonthDigit == birthMonthDigit && currentDayDigit < birthDayDigit))
        {
        int currentAge=currentYear-birthYear-1;
            System.out.println("Your Current age is :"+currentAge+" as you were born in\n"+birthDayDigit+" ("+birthDay+")" +"-"+birthMonth+"-"+birthYear);
        }
        else if (currentMonthDigit > birthMonthDigit || (currentMonthDigit == birthMonthDigit && currentDayDigit >= birthDayDigit))
        {
            int currentAge = currentYear - birthYear;
            System.out.println("Your Current age is: " + currentAge + " as you were born on \n"
                    + birthDayDigit + " (" + birthDay + ") - " + birthMonth + " - " + birthYear);
        }
    }
}
