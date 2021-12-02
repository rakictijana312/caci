package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.util.Scanner;

public class Repl30 {
    /*
Write a program to take the month number from a user.

Provide month name to the corresponding month number

If a user provides any number that is out of month range, the program should display "Invalid"

IMPORTANT: use Scanner Class

Example Output:

Please enter month number 1
January
Please enter month number 1
January
Example Output:

Please enter month number 33
Invalid

     */

    public static void main(String[] args) {
        Scanner scann= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x= scann.nextInt();
        if(x==1){
            System.out.println("Month is January");
        }
        else if(x==2){
            System.out.println("Month is February");
        }
        else if(x==3){
            System.out.println("Month is March");
        }else {
            System.out.println("Invalid month");
        }

    }
}
