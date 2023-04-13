import java.util.Scanner;
import java.util.Random;

public class Mission05Luke
{
   public static void main (String[] args)
   {
      //create instance for Scanner and Random tools
      
      Scanner in = new Scanner (System.in);
      Random r = new Random ();
      
      
      //Initialize varibles
      int numGames = 0;
      String userChoice = "";
      String cpuChoice = "";
      int cpuRandNum = 0;
      int userWins = 0;
      int cpuWins = 0;
      int oddNum = 0;
      
      
      //Begin program and request input for # of rounds
      
      System.out.println("Welcome to Rock, Paper, Scissors!");
      System.out.println("Please enter the number of rounds you would like to play.");
      numGames = in.nextInt();
      
      
      //Check that # of games is odd
      
      oddNum = numGames % 2;
      while (oddNum != 1 )
      {
      
         System.out.println("Sorry there needs to be an odd number of rounds. Try again: ");
         numGames = in.nextInt();
         oddNum = numGames % 2; //update oddNum variable
         
      }
      
      //Flush the buffer
      
      in.nextLine();
      
      
      //begin for loop
      
      for (int i = 1; i <= numGames; i++)
      {

         //prompt user for input
         
         System.out.println("Rock, Paper, or Scissors?: ");
         userChoice = in.nextLine();
         
         
         //check validity of input
         
         while (!userChoice.equalsIgnoreCase("rock") && !userChoice.equalsIgnoreCase("paper") && !userChoice.equalsIgnoreCase("scissors"))
         {
         
            System.out.println("Sorry, not a valid response. Try Again: ");
            System.out.println("Rock, Paper, or Scissors?: ");
            userChoice = in.nextLine();
            
         }
         
         
         //generate random number for cpu entry
         
         cpuRandNum = r.nextInt(3);
         
         
         //Link random number to a String 
         
         if (cpuRandNum == 0)
         {
            cpuChoice = "Rock";
         }
         
         else if (cpuRandNum == 1)
         {
            cpuChoice = "Paper";
         }
         
         else if (cpuRandNum == 2)
         {
            cpuChoice = "Scissors";
         }
         
         
         //Check for a tie
         
         while (userChoice.equalsIgnoreCase(cpuChoice))
         {
         
            System.out.println("It's a tie.");
            --i;
            break;
            
         }
         
         
         //*********************************
         //                                *
         //Check for winner and tally score*
         //                                *
         //*********************************
         
         
         //************************
         //1st while loop - Rock
         
         while (userChoice.equalsIgnoreCase("Rock") && !userChoice.equalsIgnoreCase(cpuChoice))
         {
         
            if (cpuChoice.equalsIgnoreCase("scissors"))
            {
               userWins++;
               System.out.println("Computer chooses: " + cpuChoice + "\nYou win! User Score: " + userWins);
               break;
            }
            else if (cpuChoice.equalsIgnoreCase("paper"))
            {
               cpuWins++;
               System.out.println("Computer chooses: " + cpuChoice + "\nComputer wins! Computer Score: " + cpuWins);
               break;
            }
            
         }
         
         
         //***********************
         //2nd while loop - Paper
         
         while (userChoice.equalsIgnoreCase("Paper") && !userChoice.equalsIgnoreCase(cpuChoice))
         {
         
            if (cpuChoice.equalsIgnoreCase("rock"))
            {
               userWins++;
               System.out.println("Computer chooses: " + cpuChoice + "\nYou win! User Score: " + userWins);
               break;
            }
            else if (cpuChoice.equalsIgnoreCase("scissors"))
            {
               cpuWins++;
               System.out.println("Computer chooses: " + cpuChoice + "\nComputer wins! Computer Score: " + cpuWins);
               break;
            }
            
         }
         
         
         //*************************
         //3rd while loop - Scissors
         
          while (userChoice.equalsIgnoreCase("Scissors") && !userChoice.equalsIgnoreCase(cpuChoice))
         {
            if (cpuChoice.equalsIgnoreCase("paper"))
            {
               userWins++;
               System.out.println("Computer chooses: " + cpuChoice + "\nYou win! User Score: " + userWins);
               break;
            }
            else if (cpuChoice.equalsIgnoreCase("rock"))
            {
               cpuWins++;
               System.out.println("Computer chooses: " + cpuChoice + "\nComputer wins! Computer Score: " + cpuWins);
               break;
            }

         }
         
         
      } // end of for loop
      
      
      //Print final results and call overall winner
      
      System.out.println("Computer Wins: " + cpuWins);
      System.out.println("User Wins: " + userWins);
      
      if (userWins < cpuWins)
      {
         System.out.println("Computer won the game!");
      }
      
      else
      {
         System.out.println("You won the game!");
      }
      
   } // end of main method

} // end of class
//****************end of program********************