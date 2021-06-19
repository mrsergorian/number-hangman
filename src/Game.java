import java.util.Random;
import java.util.Scanner;

public class Game {
	
	// global variables
    public boolean running		 = true;
    public int guess			 = 0;
    public int number			 = 0;
    public String numbersUsed	 = "";
    public int guessAmount		 = 9;

    HangmanStages hangmanStages = new HangmanStages();

	// methods
	
	// create a random number
    public void createNumber() {
        Random random = new Random();
        number = random.nextInt(100);
    }
	
	// take input from the console 
    public void takeGuess() {
        guess = (new Scanner(System.in)).nextInt();
    }
	
	// to show the numbers that were already used
    public void showUsedNumbers() {
        System.out.println("HERE ARE THE NUMBERS YOU USED:\n" + numbersUsed);
        System.out.println();
    }
	
	// draw the hangman
    public void loadHangmanStage() {
        switch (guessAmount) {
            case 8:
                System.out.println("FIRST, WE DRAW THE HEAD");
                hangmanStages.stage1();
                break;
            case 7:
                System.out.println("NOW WE DRAW VA BODY.");
                hangmanStages.stage2();
                break;
            case 6:
                System.out.println("NEXT WE DRAW AN ARM.");
                hangmanStages.stage3();
                break;
            case 5:
                System.out.println("THIS TIME IT'S THE OTHER ARM.");
                hangmanStages.stage4();
                break;
            case 4:
                System.out.println("NOW, LET'S DRAW THE RIGHT LEG.");
                hangmanStages.stage5();
                break;
            case 3:
                System.out.println("THIS TIME WE DRAW THE LEFT LEG.");
                hangmanStages.stage6();
                break;
            case 2:
                System.out.println("NOW WE PUT UP A HAND.");
                hangmanStages.stage7();
                break;
            case 1:
                System.out.println("NEXT THE OTHER HAND.");
                hangmanStages.stage8();
                break;
        }
    }
	
	// to play again or not?
    public void playAgain() {
        System.out.print("WANT ANOTHER NUMBER? ");
        String playAgain = (new Scanner(System.in)).nextLine();

        if (playAgain.equals("YES") || 
			playAgain.equals("Y") || 
			playAgain.equals("yes") || 
			playAgain.equals("y")) {

            running = true;
            guessAmount = 9;
            numbersUsed = "";
            run();
        } else if (playAgain.equals("NO") || 
				   playAgain.equals("no") || 
				   playAgain.equals("n")  || 
				   playAgain.equals("N")){

            running = false;
            System.out.println("IT'S BEEN FUN! BYE FOR NOW.");
        } else {
			System.out.println("?");
		}

    }

	// to check the input from the console
    public void checkGuess() {
        if (guess == number) {
            running = false;

        } else if (guess < number) {
            guessAmount--;
            System.out.println("SORRY THE NUMBER IS TO SMALL.");
            loadHangmanStage();
            numbersUsed = numbersUsed + Integer.toString(guess) + ",";
        } else if (guess > number) {
            guessAmount--;
            System.out.println("SORRY THE NUMBER IS TO BIG.");
            loadHangmanStage();
            numbersUsed = numbersUsed + Integer.toString(guess) + ",";
        }
    }

	// the method that runs the whole game
    public void run() {
        System.out.println("    HANGMAN     ");
        System.out.println("\n\n");
        createNumber();

        while (running && guessAmount != 0) { // the main game loop
            showUsedNumbers();

            System.out.print("WHAT IS YOUR GUESS? ");
            takeGuess();
            checkGuess();
        }

        if (guess == number) {
            System.out.println("YOU FOUND THE NUMBER!");
            playAgain();
        } else if (guess != number) {
            System.out.println("YOU MISSED THAT ONE.");
            playAgain();
        }
    }

    public static void main(String[] args) {
        Game hangman = new Game();
        hangman.run();
    }
}
