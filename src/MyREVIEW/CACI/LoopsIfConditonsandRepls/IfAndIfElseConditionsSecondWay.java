package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import org.openqa.selenium.json.JsonOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class IfAndIfElseConditionsSecondWay {
    public static void main(String[] args) {

    /*
    Alex Lee
  */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scanner.nextInt();

        if (n < 5) {
            System.out.println("A");
        } else if (n > 10) {
            System.out.println("B");
        } else if (n >= 10) {
            System.out.println("C");
        } else {
            System.out.println("Non of the above");

        }


    }
}