package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repl21 {
    /*

Write a program that asks the user's age: "Enter your age  "

Then display it by adding 10 (i.e age + 10) in your final output.

**Example Output:**

```
Enter your age 30
Your age after 10 years is 40
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age=scanner.nextInt();
        System.out.println("Your age after 10 years is "+ (age+10));

    }
}
