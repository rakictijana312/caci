package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repl25 {
    public static void main(String[] args) {

        /*The variable "num" holds an integer input from a user
Write a conditional statement starting on line 9 that does the following:

- If num is positive, print "__ is positive"
- If num is negative, print "__ is negative"
- If num is equals to 0, then print "Entered number is equals to 0"

Examples:

```
In: 5
5 is positive
```

```
In: -2
-2 is negative
```

```
In: 0
```

```
Entered number is equals to 0
`
         */

        Scanner scann = new Scanner(System.in);
        System.out.println("Please insert a number: ");
        int num = scann.nextInt();

        if (num > 0) {
            System.out.println(num + " num is positive");
        } else if (num < 0) {
            System.out.println(num + " num is negative");
        } else {
            System.out.println(num + " num is equal to 0");
        }
    }
}