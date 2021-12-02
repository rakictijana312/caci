package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.util.Scanner;

public class SwitchStatements1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the command: ");
        String text= scanner.next();

        switch(text){
            case "start":
                System.out.println("Machine will start");
                break;

            case "stop":
                System.out.println("Machine will stop");
                break;

            default:
                System.out.println("Invalid input");

        }

    }
}
