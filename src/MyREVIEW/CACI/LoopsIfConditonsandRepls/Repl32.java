package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.util.Scanner;

public class Repl32 {
    /*
Ask the user to enter his/her gender "Please enter your gender: M or F" and their age "Please enter your age"

You have 2 conditions:

If age is above 25, then check if a user entered F then the output should be "Woman" otherwise it should say "Man"

If age is below 25, then check if a user entered F then the output should be "Girl" otherwise it should say "Boy"
     */

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Please enter your gender: M or F");
        char gender = user.next().charAt(0);
        System.out.println("Please enter your age");
        int age = user.nextInt();

        if (age > 25 && gender == 'F') {
            System.out.println("Woman");
        } else if (age < 25 && gender == 'F') {
            System.out.println("Girl");
        } else if (age > 25 && gender == 'M') {
            System.out.println("Man");
        } else {
            System.out.println("Boy");
        }
    }
}