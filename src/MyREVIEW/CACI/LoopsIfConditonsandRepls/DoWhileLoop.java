package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.sql.SQLOutput;
import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        //https://courses.caveofprogramming.com/courses/2081/lectures/38454

     /*   Scanner scanner=new Scanner(System.in);
        System.out.println("Scanner scanner=new Scanner(System.in); ");
        int value= scanner.nextInt();
        while(value !=5){
            System.out.println("Enter a number: ");
            value = scanner.nextInt();
        }
        System.out.println("Good job!"); */


        //DO WHILE loop will first print and them check conditions
        Scanner scanner = new Scanner(System.in);
        int value = 0;
        do {
            System.out.println("Enter a number : ");//ENTER VALE
            value= scanner.nextInt();//CAPTURE VALUE

        }
        while(value !=5);
        System.out.println("Great JOB!");


    }
}
