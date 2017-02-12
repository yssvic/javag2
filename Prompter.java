/**
 * Created by ysoete on 11/02/17.
 */

import java.util.*;

public class Prompter {

    public static void toPrint(String toPrint){
        System.out.print(toPrint);
    }

    public static String toAsk(String question){
        Scanner in = new Scanner(System.in);
        toPrint(question);
        String answer = in.nextLine();
        return answer;
    }
}

