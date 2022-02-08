package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.util.Scanner;

public class Repl33 {
    /*
Ask the user to enter any number

if a user enters a number and it is even, print "Value is even", otherwise print "Value is odd"

If the number is even then check if it is greater than 1000 or not.

If the number is greater than 1000, then print "Even value is large", else print "Even value is just right".
     */

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        //NIJE DOBRO
        System.out.println("Please enter the number: ");
        int x = number.nextInt();
        if (x % 2 == 0) {
            System.out.println("Number is even");
        } else if (x >= 1000) {
            System.out.println("Even value is right");
        } else if (x > 1000) {
            System.out.println("Even value is large");
        } else {
            System.out.println("Number is odd");
        }

    }
}
