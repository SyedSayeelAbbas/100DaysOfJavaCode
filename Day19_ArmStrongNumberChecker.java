import java.util.Scanner;
public class Day19_ArmStrongNumberChecker
{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Your Number :");
        int number=input.nextInt();
        int power=number%10,powerRemainderSum=0,equality=number;
        for(int i=0;number!=0;i++)
        {
            int remainder=number%10;
            int powerRemainderSave=1;
            for(int j=1;j<=power;j++)
            {
                powerRemainderSave*=remainder;
            }
            number/=10;
            powerRemainderSum+=powerRemainderSave;
        }
        if(powerRemainderSum==equality)
        {
        System.out.println("Armstrong number :"+powerRemainderSum);
        }
        else if(powerRemainderSum!=equality)
        {
            System.out.println("Not Armstrong number :"+powerRemainderSum);
        }
    }
}
