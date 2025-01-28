import java.util.Random;
import java.util.Scanner;
public class Day14_RockPaperScissorGame {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int attempt=3,computerWon=0,userWon=0;
        System.out.println("\t\"Welcome to RPS Game\"");
        while (attempt>0){
            Random randomNumber=new Random();
            int computer=randomNumber.nextInt(3);
            System.out.print("Enter your move r(Rock),p(Paper),s(scissor):");
            char userMove=input.next().charAt(0);
        if (userMove != 'r' && userMove != 'p' && userMove != 's')
            {
                System.out.println("Invalid move! Please enter 'r', 'p', or 's'.");
                continue;
            }
        if(userMove=='r' && computer==1)
            {
                System.out.println("You LOSE!\nUser:Rock\nComputer:Paper");
                attempt--;
                computerWon++;
            }
        else if(userMove=='r'&& computer==0)
            {
                System.out.println("Its a DRAW!\nUser:Rock\nComputer:Rock");
                attempt--;
            }
        else if(userMove=='r'&& computer==2)
            {
                System.out.println("You WON!\nUser:Rock\nComputer:Scissor");
                attempt--;
                userWon++;
            }
        else if((userMove=='p'&&computer==1))
            {
                System.out.println("Its a DRAW!\nUser:Paper\nComputer:Paper");
                attempt--;
            }
        else if(userMove=='p'&& computer==0)
            {
                System.out.println("You WON!!\nUser:Paper\nComputer:Rock");
                attempt--;
                userWon++;
            }
        else if(userMove=='p'&& computer==2)
            {
                System.out.println("You LOSE!\nUser:Paper\nComputer:Scissor");
                attempt--;
                computerWon++;
            }
        else if(userMove=='s'&&computer==1)
            {
                System.out.println("You Won!\nUser:Scissor\nComputer:Paper");
                attempt--;
                userWon++;
            }
        else if(userMove=='s'&& computer==0)
            {
                System.out.println("You LOSE!!\nUser:Scissor\nComputer:Rock");
                attempt--;
                computerWon++;
            }
        else if(userMove=='s'&& computer==2)
            {
                System.out.println("Its a Draw!\nUser:Scissor\nComputer:Scissor");
                attempt--;
            }
        }
        if (userWon > computerWon) {
            System.out.println("Congratulations! You are the overall WINNER!");
        } else if (userWon < computerWon) {
            System.out.println("Computer WINS the game! Better luck next time.");
        } else {
            System.out.println("It's a TIE!");
        }
        System.out.println("User Score :"+userWon+"\nComputer Score :"+computerWon);
    }
}
