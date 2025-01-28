import java.util.Scanner;
public class Day15_StudentGrading {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter marks of Engilsh :");
        int english=input.nextInt(),maths=0,programming=0,physics=0,iict=0;
        if(english>-1&&english<101){
            System.out.print("Enter marks of Calculus :");
            maths=input.nextInt();
            if(maths>-1&&maths<101){
                System.out.print("Enter marks of Programming :");
                programming=input.nextInt();
                if(programming>-1&&programming<101){
                    System.out.print("Enter marks of IICT :");
                    iict=input.nextInt();
                    if (iict>-1&&iict<51){
                        System.out.print("Enter marks of Physics :");
                        physics=input.nextInt();
                        if (physics>-1&&physics<101) {
                            float percent = (float) (100 * (english + maths + physics + programming + iict) / 450);
                            if (percent >= 90 && percent < 101)
                                {
                                    System.out.println("Congratulations!You Have Passed the Exams:\nYour Grade :A1\nPercentage:" + percent);
                                }
                            else if (percent >= 83 && percent < 90)
                                {
                                    System.out.println("Congratulations!You Have Passed the Exams:\nYour Grade :A\nPercentage:" + percent);
                                }
                            else if (percent >= 75 && percent < 83)
                                {
                                    System.out.println("Congratulations!You Have Passed the Exams:\nYour Grade :B+\nPercentage:" + percent);
                                }
                            else if (percent >= 65 && percent < 75)
                                {
                                    System.out.println("Congratulations!You Have Passed the Exams:\nYour Grade :B\nPercentage:" + percent);
                                }
                            else if (percent >= 60 && percent < 65)
                                {
                                    System.out.println("Congratulations!You Have Passed the Exams:\nYour Grade :C+\nPercentage:" + percent);
                                }
                            else if (percent >= 50 && percent < 60)
                                {
                                    System.out.println("Congratulations!You Have Passed the Exams:\nYour Grade :C\nPercentage:" + percent);
                                }
                            else if (percent < 50)
                                {
                                    System.out.println("REDO!You Have Failed the Exams:\nYour Grade :F\nPercentage:" + percent);
                                }
                        }
                        else {
                            System.out.println("Wrong input! Plz Enter Marks B/W 0-100");
                        }
                    }
                    else {
                        System.out.println("Wrong input! Plz Enter Marks B/W 0-50");
                    }
                }
                else {
                    System.out.println("Wrong input! Plz Enter Marks B/W 0-100");
                }
            }
            else {
                System.out.println("Wrong input! Plz Enter Marks B/W 0-100");
            }
        }
        else {
            System.out.println("Wrong input! Plz Enter Marks B/W 0-100");
        }
    }
}
