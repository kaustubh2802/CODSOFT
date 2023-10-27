
// CODSOFT JAVA PROGRAMMING TASK ONE
// NUMBER GUESSING GAME

import java.util.Random;
import java.util.Scanner;

public class CDSFT_T1_NUM_GAME {

    public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   Random random = new Random();
   int minr = 1;
   int maxr = 10;
   int maxAttempts = 5;
   int score = 0;

   System.out.println("Welcome to the Number Guessing Game!");

  while (true) {
 int targetNumber = random.nextInt(maxr - minr + 1) + minr;
  int attempts = 0;
  System.out.println("You selected a number between " + minr + " to " + maxr );            
  while (attempts < maxAttempts) {
	  System.out.print("Guess: ");
	  int guess = scanner.nextInt();
	  attempts++;
	  if (guess < minr || guess > maxr) 
	  { System.out.println("Your guess is out of range. Please guess between " + minr + " and " + maxr + "."); }
	  else if (guess == targetNumber) 
	  { System.out.println("Congratulations!\nNumber : "+ targetNumber +"\n You have guessed the correct number \nin " + attempts + " attempts.");             
	       score++;
	        break;} 
	  else if (guess < targetNumber) {System.out.println("Too low! Try again.");} 
	  else { System.out.println("Too high! Try again.");}
	  if (attempts == maxAttempts) {
	                    System.out.println("You've used all your attempts. The correct number was " + targetNumber + ".");
	                    break;
	 }		 }
	  System.out.print("\n\tDo you want to play again?\nYes[y]\tNo[n] ");
	  String playAgain = scanner.next();         
       if (!playAgain.equalsIgnoreCase("y")) 
	  { System.out.println("Thanks for playing! Your total score is: " + score); break;            } 
 }

        scanner.close();
    }
}
