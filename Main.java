import java.util.Scanner;
import java.util.Random;

class Main {
  public static void main(String[] args) {
    // Initialize Variables
    int range = 100;                           // Determine the range
    Random makeRand = new Random();            // Random object 
    int[] guessTracker = new int[range];       // Keeps track of which numbers are guessed 
    int counter = 0;                           // Keeps track of how many guesses
    Scanner userIn = new Scanner(System.in);   // User Input
    int guess = 0;                             // Holds the current guess
    int randomNum = makeRand.nextInt(range);   // Choose a random number from range

    System.out.println("Guess a number between 0 and 100.");

    while (counter != range){
      System.out.print("Guess a number: ");
      guess = userIn.nextInt();
      
      // Repeated a Guess
      if(guessTracker[guess] == 1) {                     
        System.out.println("You guessed that already!");
        continue;
      }

      // Compare guess to randomNum
      if(guess > randomNum) {                            
        System.out.println("Too Big!");
      }
      else if (guess < randomNum){
        System.out.println("Too Small!");
      }
      else {                            
        break;   // Guessed Correctly. Exit Blocked Loop
      }

      // Keep Track of guesses
      guessTracker[guess] = 1;                             
      counter++;
    }

    System.out.println("You guessed it! It was " + randomNum + ".");
    System.out.println("You made " + counter + " guesses before you guessed correctly.");


  }
}