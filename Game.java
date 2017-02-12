/**
 * Created by ysoete on 11/02/17.
 */

public class Game {

    public static void main(String[] args){
        // Print Adminstrator Setup when starting program
        Prompter.toPrint("Administrator Setup\n");
        Prompter.toPrint("-------------------\n");
        // Ask information to create the instance of the jar class
        String nameItems = Prompter.toAsk("What type of item? ");
        Prompter.toPrint("What is the maximum amount of ");
        Prompter.toPrint(nameItems);
        String askNumberItems = Prompter.toAsk("? ");


        // Create the jar class
        int numberItems = Integer.parseInt(askNumberItems);

        Jar ajar = new Jar(nameItems,numberItems);
        // Display the game instrucitons to the Player
        Prompter.toPrint("PLAYER\n");
        Prompter.toPrint("------\n");
        Prompter.toPrint("Your goal is to guess how many items there are in the jar named ");
        Prompter.toPrint(nameItems);
        Prompter.toPrint(". Your guess should be between 1 ");
        Prompter.toPrint("and ");
        Prompter.toPrint(Integer.toString(numberItems));
        Prompter.toAsk("\n\nReady? (Press Enter to start guessing) ");

        int counter = 0;

        while (counter < numberItems){
            String guessQuestion = Prompter.toAsk("\nGuess:");
            int guess = Integer.parseInt(guessQuestion);
            if (guess > ajar.getNumberItems()){
                Prompter.toPrint("“\nYour guess must be less than ");
                Prompter.toPrint(Integer.toString(ajar.getNumberItems()));
                continue;
            }

            counter++;

            if (guess == ajar.getTheNumberToGuess()){
                Prompter.toPrint("\nWow you found it! CONGRATS!\n\n");
                Prompter.toPrint("You guessed there where ");
                Prompter.toPrint(Integer.toString(ajar.getTheNumberToGuess()));
                Prompter.toPrint(" ");
                Prompter.toPrint(nameItems);
                Prompter.toPrint(" in the jar! \n\n It took you ");
                Prompter.toPrint(Integer.toString(counter));
                Prompter.toPrint( " guesses!\n\n");
                break;
            }

            if (guess > ajar.getTheNumberToGuess()){
                Prompter.toPrint("\nYour guess is too high\n");
            }

            if (guess < ajar.getTheNumberToGuess()){
                Prompter.toPrint("\nYour guess is too low\n");
            }


        }
        if (counter == numberItems && counter != 1){
            Prompter.toPrint("Sorry, you reached the maximum amount of guesses!...better luck next time\n");
        }
        }
}

