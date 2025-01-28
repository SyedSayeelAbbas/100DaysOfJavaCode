import java.util.Random;
import java.util.Scanner;
public class Day13_NumberGuessingGame {
    public static void easyMode(){
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        int rangeOfGame=random.nextInt(101);
        int gussedNumber=102,NumberOfTries=0;
        while (rangeOfGame!=gussedNumber){
        System.out.print("Enter Your Guessed Number : ");
        gussedNumber=input.nextInt();
        if(rangeOfGame>gussedNumber)
        {
            System.out.println("Too Low!");
            NumberOfTries++;
        }
        else if(rangeOfGame<gussedNumber)
        {
            System.out.println("Too High!");
            NumberOfTries++;
        }
        else if((rangeOfGame)==(gussedNumber))
        {
            System.out.println("Correct!\nAnswer:"+rangeOfGame+"\nNumber Of Tries:"+NumberOfTries);
            NumberOfTries++;
        }
        }
    }
    public static void normalMode(){
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        int rangeOfGame=random.nextInt(501);
        int gussedNumber=501,NumberOfTries=0;
        while ((rangeOfGame)!=(gussedNumber)){
            System.out.print("Enter Your Guessed Number : ");
            gussedNumber=input.nextInt();
            if(NumberOfTries==21) {
                System.out.println("Your Have excied the number of tries!\nRandom number was:"+rangeOfGame);
                break;
            }
            else if(rangeOfGame>gussedNumber)
            {
                System.out.println("Too Low!");
                NumberOfTries++;
            }
            else if(rangeOfGame<gussedNumber)
            {
                System.out.println("Too High!");
                NumberOfTries++;
            }
            else if((rangeOfGame)==(gussedNumber))
            {
                System.out.println("Correct!\nAnswer:"+rangeOfGame+"\nNumber Of Tries:"+NumberOfTries);
                NumberOfTries++;
                break;
            }
        }
    }
    public static void hardMode(){
        Random random=new Random();
        Scanner input=new Scanner(System.in);
        int rangeOfGame=random.nextInt(1001);
        int gussedNumber=1001,NumberOfTries=1;
        while ((rangeOfGame)!=(gussedNumber)){
            System.out.print("Enter Your Guessed Number : ");
            gussedNumber=input.nextInt();
            if(NumberOfTries==11){
                System.out.println("Your Have excied the number of tries!\nRandom number was:"+rangeOfGame);
                break;
            }
            else if(rangeOfGame>gussedNumber)
            {
                System.out.println("Too Low!");
                NumberOfTries++;
            }
            else if(rangeOfGame<gussedNumber)
            {
                System.out.println("Too High!");
                NumberOfTries++;
            }
            else if((rangeOfGame)==(gussedNumber))
            {
                System.out.println("Correct!\nAnswer:"+rangeOfGame+"\nNumber Of Tries:"+NumberOfTries);
                NumberOfTries++;
                break;
            }
        }
    }
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("\t\"Welcome to Number-Guessing-Game\"\nChoose the Difficulty: ");
        System.out.print("1)Easy(Range:100/No limit of tries)" +
                "\n2)Normal(Range:500/Limit:20 tries)\n" +
                "3)Hard(Range:1000/Limit:10 tries)\n4)Quit\nChoose Here:");
        int choose=input.nextInt();
        switch (choose){
            case 1:
            {
                easyMode();
                break;
            }
            case 2:
            {
                normalMode();
                break;
            }
            case 3:
            {
                hardMode();
                break;
            }
            case 4:
            {
                System.out.println("You have Exited the Program!");
                break;
            }
        }

    }
}
