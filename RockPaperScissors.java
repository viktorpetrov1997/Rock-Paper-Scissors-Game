package DataTypesAndVariables.AdditionalProjects;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        String ROCK = "Rock";
        String PAPER = "Paper";
        String SCISSORS = "Scissors";

        Scanner scanner = new Scanner(System.in);

        String playAgain = "";
        boolean thePlayerWantsToPlayAgain = false;
        int playerWins = 0;
        int computerWins = 0;
        int draws = 0;

        while(true)
        {
            System.out.print("Choose [r]ock, [p]aper, or [s]cissors: ");
            String playerMove = scanner.nextLine();

            if(playerMove.equals("r") || playerMove.equals("rock"))
            {
                playerMove = ROCK;
            }
            else if(playerMove.equals("p") || playerMove.equals("paper"))
            {
                playerMove = PAPER;
            }
            else if(playerMove.equals("s") || playerMove.equals("scissors"))
            {
                playerMove = SCISSORS;
            }
            else
            {
                System.out.println("Invalid input. Try again...");
                continue;
            }

            Random random = new Random();
            int computerRandomNumber = random.nextInt(3);

            String computerMove = "";

            switch (computerRandomNumber)
            {
                case 0:
                    computerMove = ROCK;
                    break;
                case 1:
                    computerMove = PAPER;
                    break;
                case 2:
                    computerMove = SCISSORS;
                    break;
            }

            System.out.printf("The computer chose %s.%n", computerMove);

            if ((playerMove.equals(ROCK) && computerMove.equals(SCISSORS)) ||
                    (playerMove.equals(PAPER) && computerMove.equals(ROCK)) ||
                    (playerMove.equals(SCISSORS) && computerMove.equals(PAPER)))
            {
                playerWins++;
                System.out.println("You win.");
            }
            else if ((computerMove.equals(ROCK) && playerMove.equals(SCISSORS)) ||
                    (computerMove.equals(PAPER) && playerMove.equals(ROCK)) ||
                    (computerMove.equals(SCISSORS) && playerMove.equals(PAPER)))
            {
                computerWins++;
                System.out.println("You lose.");
            }
            else
            {
                draws++;
                System.out.println("The game was a draw.");
            }

            System.out.println();
            System.out.printf("Player wins: %d%n", playerWins);
            System.out.printf("Computer wins: %d%n", computerWins);
            System.out.printf("Draws : %d%n", draws);

            System.out.println();
            while(true)
            {
                System.out.print("Do you want to play again? (yes/y or no/n): ");
                playAgain = scanner.nextLine();
                if(playAgain.equalsIgnoreCase("yes") || playAgain.equalsIgnoreCase("y"))
                {
                    thePlayerWantsToPlayAgain = true;
                    break;
                }
                else if(playAgain.equalsIgnoreCase("no") || playAgain.equalsIgnoreCase("n"))
                {
                    thePlayerWantsToPlayAgain = false;
                    break;
                }
                else
                {
                    System.out.println("Invalid input. Try again...");
                    continue;
                }
            }
            if (thePlayerWantsToPlayAgain)
            {
                continue;
            }
            else
            {
                break;
            }
        }
    }
}
