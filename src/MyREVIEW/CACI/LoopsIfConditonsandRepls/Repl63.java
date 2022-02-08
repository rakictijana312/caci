package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.util.Scanner;

public class Repl63 {
    /*
Given the following inputs:
int x;
Write a for loop that will print out a series of numbers starting at 0 and ending at the x(value must be taken from a user),
exclusive.
Example Output:
In: 3
0 1 2
In: 8
0 1 2 3 4 5 6 7
In: 5
0 1 2 3 4
 */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("IN: ");
        int x=scanner.nextInt();
        for(int i=0; i<x; i++){
            System.out.println(i);
        }

    }
}
