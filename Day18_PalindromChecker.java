import java.util.Scanner;
public class Day18_PalindromChecker {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Number");
        int value=input.nextInt(),saver=0,num=value;
        for(int i=0;value!=0;i++)
        {
            int remainder=value%10;
            saver=saver*10+remainder;
            value/=10;
        }
        if(saver==num)
        {
            System.out.println("Number :"+saver+" is equal to :"+num+" hence is palindrom");
        }
        else if(saver!=num)
        {
            System.out.println("Number :"+saver+" is not equal to :"+num+" hence is not a palindrom");
        }
    }
}
