/**
 * Created by ysoete on 11/02/17.
 */

import java.util.Random;

public class Jar {
    //class varialbles declaration
    private String nameItems;
    private int numberItems;
    private int theNumberToGuess;

    // constructor of class
    public Jar(String nameItems, int numberItems){
        this.nameItems = nameItems;
        this.numberItems = numberItems;

        // Generate the randomnumber to guess
        Random random = new Random();
        int maxItemsAllowed = numberItems;
        theNumberToGuess = random.nextInt(maxItemsAllowed);
        theNumberToGuess++;
        }

    // methods to retrieve the private vars of the instance of the class
    public String getNameItems(){
        return this.nameItems;
    }

    public int getNumberItems(){
        return this.numberItems;
    }

    public int getTheNumberToGuess(){
        return this.theNumberToGuess;
    }

}
