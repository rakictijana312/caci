package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.util.ArrayList;
import java.util.Scanner;

public class WhileLoopForthWay {
    //https://www.youtube.com/watch?v=SGJ9DpxGCkY
    public static void main(String[] args) {
        String  sentence= "Tijana Voli Mihaila";
        Scanner scanner=new Scanner(sentence);
        ArrayList<String>words= new ArrayList<>();

        while(scanner.hasNext()){
            words.add(scanner.next());

        }
        System.out.println(words);
    }
}
