import java.util.Scanner;

public class Day21_UnitConverter {

    public static void length() {
        Scanner input = new Scanner(System.in);
        double centimeter, inche, feet, meter;
        System.out.print("1)Meters to Feet\t2)Meters to Inches\n3)Meters to Centimeter\t4)Feet to Meter\n5)Feet to Inches\t\t6)Feet to Centimeter\n7)Inches to Meters\t\t8)Inches to Feet\n9)Inches to Centimeter\t10)Centimeter to Meter\n11)Centimeter to Feet\t12)Centimeter to Inches\n\nEnter Here:");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Enter Meters:");
            meter = input.nextDouble();
            feet = (meter) * (3.28084);
            System.out.println(meter + " Meters is Equal to " + feet + " Feet");
        } else if (option == 2) {
            System.out.println("Enter Meters:");
            meter = input.nextDouble();
            inche = (meter) * (39.3701);
            System.out.println(meter + " Meters is Equal to " + inche + " Inches");
        } else if (option == 3) {
            System.out.println("Enter Meters:");
            meter = input.nextDouble();
            centimeter = (meter) * (100);
            System.out.println(meter + " Meters is Equal to " + centimeter + " Cm");
        } else if (option == 4) {
            System.out.println("Enter Feet:");
            feet = input.nextDouble();
            meter = (feet) * (0.3048);
            System.out.println(feet + " Feet is Equal to " + meter + " Meters");
        } else if (option == 5) {
            System.out.println("Enter Feet:");
            feet = input.nextDouble();
            inche = (feet) * (12);
            System.out.println(feet + " Feet is Equal to " + inche + " Inches");
        } else if (option == 6) {
            System.out.println("Enter Feet:");
            feet = input.nextDouble();
            centimeter = (feet) * (30.48);
            System.out.println(feet + " Feet is Equal to " + centimeter + " Cm");
        } else if (option == 7) {
            System.out.println("Enter Inches:");
            inche = input.nextDouble();
            meter = (inche) * (0.0254);
            System.out.println(inche + " Inches is Equal to " + meter + " Meters");
        } else if (option == 8) {
            System.out.println("Enter Inches:");
            inche = input.nextDouble();
            feet = (inche) * (0.0833333);
            System.out.println(inche + " Inches is Equal to " + feet + " Feet");
        } else if (option == 9) {
            System.out.println("Enter Inches:");
            inche = input.nextDouble();
            centimeter = (inche) * (2.54);
            System.out.println(inche + " Inches is Equal to " + centimeter + " Cm");
        } else if (option == 10) {
            System.out.println("Enter Centimeter:");
            centimeter = input.nextDouble();
            meter = (centimeter) * (0.01);
            System.out.println(centimeter + " Cm is Equal to " + meter + " Meters");
        } else if (option == 11) {
            System.out.println("Enter Centimeter:");
            centimeter = input.nextDouble();
            feet = (centimeter) * (0.0328084);
            System.out.println(centimeter + " Cm is Equal to " + feet + " Feet");
        } else if (option == 12) {
            System.out.println("Enter Centimeter:");
            centimeter = input.nextDouble();
            inche = (centimeter) * (0.393701);
            System.out.println(centimeter + " Cm is Equal to " + inche + " Inches");
        } else {
            System.out.println("Wrong Input");
        }
    }

    public static void weight() {
        Scanner input = new Scanner(System.in);
        double kilogram, pound, gram, ounce;
        System.out.print("1)Kilogram to Pound\t2)Kilogram to Gram\n3)Kilogram to Ounce\t4)Pound to Kilogram\n5)Pound to Gram\t6)Pound to Ounce\n7)Gram to Kilogram\t8)Gram to Pound\n9)Gram to Ounce\t10)Ounce to Kilogram\n11)Ounce to Pound\n12)Ounce to Gram\n\nEnter Here:");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Enter Kilogram:");
            kilogram = input.nextDouble();
            pound = (kilogram) * 2.20462;
            System.out.println(kilogram + " Kgs is Equal to " + pound + " Pounds");
        } else if (option == 2) {
            System.out.println("Enter Kilogram:");
            kilogram = input.nextDouble();
            gram = (kilogram) * 1000;
            System.out.println(kilogram + " Kgs is Equal to " + gram + " Grams");
        } else if (option == 3) {
            System.out.println("Enter Kilogram:");
            kilogram = input.nextDouble();
            ounce = (kilogram) * 35.274;
            System.out.println(kilogram + " Kgs is Equal to " + ounce + " Ounces");
        } else if (option == 4) {
            System.out.println("Enter Pound:");
            pound = input.nextDouble();
            kilogram = (pound) * 0.453592;
            System.out.println(pound + " Pounds is Equal to " + kilogram + " Kgs");
        } else if (option == 5) {
            System.out.println("Enter Pound:");
            pound = input.nextDouble();
            gram = (pound) * 453.592;
            System.out.println(pound + " Pounds is Equal to " + gram + " Grams");
        } else if (option == 6) {
            System.out.println("Enter Pound:");
            pound = input.nextDouble();
            ounce = (pound) * 16;
            System.out.println(pound + " Pounds is Equal to " + ounce + " Ounces");
        } else if (option == 7) {
            System.out.println("Enter Gram:");
            gram = input.nextDouble();
            kilogram = (gram) * 0.001;
            System.out.println(gram + " Grams is Equal to " + kilogram + " Kgs");
        } else if (option == 8) {
            System.out.println("Enter Gram:");
            gram = input.nextDouble();
            pound = (gram) * 0.00220462;
            System.out.println(gram + " Grams is Equal to " + pound + " Pounds");
        } else if (option == 9) {
            System.out.println("Enter Gram:");
            gram = input.nextDouble();
            ounce = (gram) * 0.035274;
            System.out.println(gram + " Grams is Equal to " + ounce + " Ounces");
        } else if (option == 10) {
            System.out.println("Enter Ounce:");
            ounce = input.nextDouble();
            kilogram = (ounce) * 0.0283495;
            System.out.println(ounce + " Ounces is Equal to " + kilogram + " Kgs");
        } else if (option == 11) {
            System.out.println("Enter Ounce:");
            ounce = input.nextDouble();
            pound = (ounce) * 0.0625;
            System.out.println(ounce + " Ounces is Equal to " + pound + " Pounds");
        } else if (option == 12) {
            System.out.println("Enter Ounce:");
            ounce = input.nextDouble();
            gram = (ounce) * 28.3495;
            System.out.println(ounce + " Ounces is Equal to " + gram + " Grams");
        } else {
            System.out.println("Wrong Input");
        }
    }

    public static void temperature() {
        Scanner input = new Scanner(System.in);
        double celsius, fahrenheit, kelvin;
        System.out.print("1)Celsius to Fahrenheit\t2)Celsius to Kelvin\n3)Fahrenheit to Celsius\t4)Fahrenheit to Kelvin\n5)Kelvin to Celsius\t6)Kelvin to Fahrenheit\n\nEnter Here:");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Enter Celsius:");
            celsius = input.nextDouble();
            fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " Celsius is Equal to " + fahrenheit + " Fahrenheit");
        } else if (option == 2) {
            System.out.println("Enter Celsius:");
            celsius = input.nextDouble();
            kelvin = celsius + 273.15;
            System.out.println(celsius + " Celsius is Equal to " + kelvin + " Kelvin");
        } else if (option == 3) {
            System.out.println("Enter Fahrenheit:");
            fahrenheit = input.nextDouble();
            celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " Fahrenheit is Equal to " + celsius + " Celsius");
        } else if (option == 4) {
            System.out.println("Enter Fahrenheit:");
            fahrenheit = input.nextDouble();
            kelvin = (fahrenheit - 32) * 5 / 9 + 273.15;
            System.out.println(fahrenheit + " Fahrenheit is Equal to " + kelvin + " Kelvin");
        } else if (option == 5) {
            System.out.println("Enter Kelvin:");
            kelvin = input.nextDouble();
            celsius = kelvin - 273.15;
            System.out.println(kelvin + " Kelvin is Equal to " + celsius + " Celsius");
        } else if (option == 6) {
            System.out.println("Enter Kelvin:");
            kelvin = input.nextDouble();
            fahrenheit = (kelvin - 273.15) * 9 / 5 + 32;
            System.out.println(kelvin + " Kelvin is Equal to " + fahrenheit + " Fahrenheit");
        } else {
            System.out.println("Wrong Input");
        }
    }

    public static void time() {
        Scanner input = new Scanner(System.in);
        double seconds, minutes, hours, days;
        System.out.print("1)Seconds to Minutes\t2)Seconds to Hours\n3)Seconds to Days\t4)Minutes to Seconds\n5)Minutes to Hours\t6)Minutes to Days\n7)Hours to Seconds\t8)Hours to Minutes\n9)Hours to Days\t10)Days to Seconds\n11)Days to Minutes\t12)Days to Hours\n\nEnter Here:");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Enter Seconds:");
            seconds = input.nextDouble();
            minutes = seconds / 60;
            System.out.println(seconds + " Seconds is Equal to " + minutes + " Minutes");
        } else if (option == 2) {
            System.out.println("Enter Seconds:");
            seconds = input.nextDouble();
            hours = seconds / 3600;
            System.out.println(seconds + " Seconds is Equal to " + hours + " Hours");
        } else if (option == 3) {
            System.out.println("Enter Seconds:");
            seconds = input.nextDouble();
            days = seconds / 86400;
            System.out.println(seconds + " Seconds is Equal to " + days + " Days");
        } else if (option == 4) {
            System.out.println("Enter Minutes:");
            minutes = input.nextDouble();
            seconds = minutes * 60;
            System.out.println(minutes + " Minutes is Equal to " + seconds + " Seconds");
        } else if (option == 5) {
            System.out.println("Enter Minutes:");
            minutes = input.nextDouble();
            hours = minutes / 60;
            System.out.println(minutes + " Minutes is Equal to " + hours + " Hours");
        } else if (option == 6) {
            System.out.println("Enter Minutes:");
            minutes = input.nextDouble();
            days = minutes / 1440;
            System.out.println(minutes + " Minutes is Equal to " + days + " Days");
        } else if (option == 7) {
            System.out.println("Enter Hours:");
            hours = input.nextDouble();
            seconds = hours * 3600;
            System.out.println(hours + " Hours is Equal to " + seconds + " Seconds");
        } else if (option == 8) {
            System.out.println("Enter Hours:");
            hours = input.nextDouble();
            minutes = hours * 60;
            System.out.println(hours + " Hours is Equal to " + minutes + " Minutes");
        } else if (option == 9) {
            System.out.println("Enter Hours:");
            hours = input.nextDouble();
            days = hours / 24;
            System.out.println(hours + " Hours is Equal to " + days + " Days");
        } else if (option == 10) {
            System.out.println("Enter Days:");
            days = input.nextDouble();
            seconds = days * 86400;
            System.out.println(days + " Days is Equal to " + seconds + " Seconds");
        } else if (option == 11) {
            System.out.println("Enter Days:");
            days = input.nextDouble();
            minutes = days * 1440;
            System.out.println(days + " Days is Equal to " + minutes + " Minutes");
        } else if (option == 12) {
            System.out.println("Enter Days:");
            days = input.nextDouble();
            hours = days * 24;
            System.out.println(days + " Days is Equal to " + hours + " Hours");
        } else {
            System.out.println("Wrong Input");
        }
    }

    public static void speed() {
        Scanner input = new Scanner(System.in);
        double kmh, ms, mph;
        System.out.print("1)Km/h to m/s\t2)Km/h to mph\n3)m/s to Km/h\t4)m/s to mph\n5)mph to Km/h\t6)mph to m/s\n\nEnter Here:");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Enter Km/h:");
            kmh = input.nextDouble();
            ms = kmh * 0.277778;
            System.out.println(kmh + " Km/h is Equal to " + ms + " m/s");
        } else if (option == 2) {
            System.out.println("Enter Km/h:");
            kmh = input.nextDouble();
            mph = kmh * 0.621371;
            System.out.println(kmh + " Km/h is Equal to " + mph + " mph");
        } else if (option == 3) {
            System.out.println("Enter m/s:");
            ms = input.nextDouble();
            kmh = ms * 3.6;
            System.out.println(ms + " m/s is Equal to " + kmh + " Km/h");
        } else if (option == 4) {
            System.out.println("Enter m/s:");
            ms = input.nextDouble();
            mph = ms * 2.23694;
            System.out.println(ms + " m/s is Equal to " + mph + " mph");
        } else if (option == 5) {
            System.out.println("Enter mph:");
            mph = input.nextDouble();
            kmh = mph * 1.60934;
            System.out.println(mph + " mph is Equal to " + kmh + " Km/h");
        } else if (option == 6) {
            System.out.println("Enter mph:");
            mph = input.nextDouble();
            ms = mph * 0.44704;
            System.out.println(mph + " mph is Equal to " + ms + " m/s");
        } else {
            System.out.println("Wrong Input");
        }
    }

    public static void volume() {
        Scanner input = new Scanner(System.in);
        double liter, gallon, milliliter, cubicMeter;
        System.out.print("1)Liters to Gallons\t2)Liters to Milliliters\n3)Liters to Cubic Meters\t4)Gallons to Liters\n5)Gallons to Milliliters\t6)Gallons to Cubic Meters\n7)Milliliters to Liters\t8)Milliliters to Gallons\n9)Milliliters to Cubic Meters\t10)Cubic Meters to Liters\n11)Cubic Meters to Gallons\t12)Cubic Meters to Milliliters\n\nEnter Here:");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Enter Liters:");
            liter = input.nextDouble();
            gallon = liter * 0.264172;
            System.out.println(liter + " Liters is Equal to " + gallon + " Gallons");
        } else if (option == 2) {
            System.out.println("Enter Liters:");
            liter = input.nextDouble();
            milliliter = liter * 1000;
            System.out.println(liter + " Liters is Equal to " + milliliter + " Milliliters");
        } else if (option == 3) {
            System.out.println("Enter Liters:");
            liter = input.nextDouble();
            cubicMeter = liter * 0.001;
            System.out.println(liter + " Liters is Equal to " + cubicMeter + " Cubic Meters");
        } else if (option == 4) {
            System.out.println("Enter Gallons:");
            gallon = input.nextDouble();
            liter = gallon * 3.78541;
            System.out.println(gallon + " Gallons is Equal to " + liter + " Liters");
        } else if (option == 5) {
            System.out.println("Enter Gallons:");
            gallon = input.nextDouble();
            milliliter = gallon * 3785.41;
            System.out.println(gallon + " Gallons is Equal to " + milliliter + " Milliliters");
        } else if (option == 6) {
            System.out.println("Enter Gallons:");
            gallon = input.nextDouble();
            cubicMeter = gallon * 0.00378541;
            System.out.println(gallon + " Gallons is Equal to " + cubicMeter + " Cubic Meters");
        } else if (option == 7) {
            System.out.println("Enter Milliliters:");
            milliliter = input.nextDouble();
            liter = milliliter * 0.001;
            System.out.println(milliliter + " Milliliters is Equal to " + liter + " Liters");
        } else if (option == 8) {
            System.out.println("Enter Milliliters:");
            milliliter = input.nextDouble();
            gallon = milliliter * 0.000264172;
            System.out.println(milliliter + " Milliliters is Equal to " + gallon + " Gallons");
        } else if (option == 9) {
            System.out.println("Enter Milliliters:");
            milliliter = input.nextDouble();
            cubicMeter = milliliter * 0.000001;
            System.out.println(milliliter + " Milliliters is Equal to " + cubicMeter + " Cubic Meters");
        } else if (option == 10) {
            System.out.println("Enter Cubic Meters:");
            cubicMeter = input.nextDouble();
            liter = cubicMeter * 1000;
            System.out.println(cubicMeter + " Cubic Meters is Equal to " + liter + " Liters");
        } else if (option == 11) {
            System.out.println("Enter Cubic Meters:");
            cubicMeter = input.nextDouble();
            gallon = cubicMeter * 264.172;
            System.out.println(cubicMeter + " Cubic Meters is Equal to " + gallon + " Gallons");
        } else if (option == 12) {
            System.out.println("Enter Cubic Meters:");
            cubicMeter = input.nextDouble();
            milliliter = cubicMeter * 1000000;
            System.out.println(cubicMeter + " Cubic Meters is Equal to " + milliliter + " Milliliters");
        } else {
            System.out.println("Wrong Input");
        }
    }

    public static void energy() {
        Scanner input = new Scanner(System.in);
        double joule, calorie, kilojoule, kilocalorie;
        System.out.print("1)Joules to Calories\t2)Joules to Kilojoules\n3)Joules to Kilocalories\t4)Calories to Joules\n5)Calories to Kilojoules\t6)Calories to Kilocalories\n7)Kilojoules to Joules\t8)Kilojoules to Calories\n9)Kilojoules to Kilocalories\t10)Kilocalories to Joules\n11)Kilocalories to Calories\t12)Kilocalories to Kilojoules\n\nEnter Here:");
        int option = input.nextInt();
        if (option == 1) {
            System.out.println("Enter Joules:");
            joule = input.nextDouble();
            calorie = joule * 0.239006;
            System.out.println(joule + " Joules is Equal to " + calorie + " Calories");
        } else if (option == 2) {
            System.out.println("Enter Joules:");
            joule = input.nextDouble();
            kilojoule = joule * 0.001;
            System.out.println(joule + " Joules is Equal to " + kilojoule + " Kilojoules");
        } else if (option == 3) {
            System.out.println("Enter Joules:");
            joule = input.nextDouble();
            kilocalorie = joule * 0.000239006;
            System.out.println(joule + " Joules is Equal to " + kilocalorie + " Kilocalories");
        } else if (option == 4) {
            System.out.println("Enter Calories:");
            calorie = input.nextDouble();
            joule = calorie * 4.184;
            System.out.println(calorie + " Calories is Equal to " + joule + " Joules");
        } else if (option == 5) {
            System.out.println("Enter Calories:");
            calorie = input.nextDouble();
            kilojoule = calorie * 0.004184;
            System.out.println(calorie + " Calories is Equal to " + kilojoule + " Kilojoules");
        } else if (option == 6) {
            System.out.println("Enter Calories:");
            calorie = input.nextDouble();
            kilocalorie = calorie * 0.001;
            System.out.println(calorie + " Calories is Equal to " + kilocalorie + " Kilocalories");
        } else if (option == 7) {
            System.out.println("Enter Kilojoules:");
            kilojoule = input.nextDouble();
            joule = kilojoule * 1000;
            System.out.println(kilojoule + " Kilojoules is Equal to " + joule + " Joules");
        } else if (option == 8) {
            System.out.println("Enter Kilojoules:");
            kilojoule = input.nextDouble();
            calorie = kilojoule * 239.006;
            System.out.println(kilojoule + " Kilojoules is Equal to " + calorie + " Calories");
        } else if (option == 9) {
            System.out.println("Enter Kilojoules:");
            kilojoule = input.nextDouble();
            kilocalorie = kilojoule * 0.239006;
            System.out.println(kilojoule + " Kilojoules is Equal to " + kilocalorie + " Kilocalories");
        } else if (option == 10) {
            System.out.println("Enter Kilocalories:");
            kilocalorie = input.nextDouble();
            joule = kilocalorie * 4184;
            System.out.println(kilocalorie + " Kilocalories is Equal to " + joule + " Joules");
        } else if (option == 11) {
            System.out.println("Enter Kilocalories:");
            kilocalorie = input.nextDouble();
            calorie = kilocalorie * 1000;
            System.out.println(kilocalorie + " Kilocalories is Equal to " + calorie + " Calories");
        } else if (option == 12) {
            System.out.println("Enter Kilocalories:");
            kilocalorie = input.nextDouble();
            kilojoule = kilocalorie * 4.184;
            System.out.println(kilocalorie + " Kilocalories is Equal to " + kilojoule + " Kilojoules");
        } else {
            System.out.println("Wrong Input");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\t\"Welcome To Unit Converter\"\nChoose Your Option :\n");
        System.out.print("1)Length\t\t2)Weight/Mass\n3)Temperature\t4)Time\n5)Speed\t\t\t6)Volume\n7)Energy\n\nEnter Here:");
        int choose = input.nextInt();
        switch (choose) {
            case 1:
                length();
                break;
            case 2:
                weight();
                break;
            case 3:
                temperature();
                break;
            case 4:
                time();
                break;
            case 5:
                speed();
                break;
            case 6:
                volume();
                break;
            case 7:
                energy();
                break;
            default:
                System.out.println("Wrong Input");
        }
    }
}