package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.util.Scanner;

public class Repl45 {
    /*

Ask the user to enter any number from 1-7.

Based on the number define the day of the week

**Example Output:**

```
Input a number between 1-7
```

```
Friday
```

**Example Output:**

```
Input a number between 1-7
```

```
Invalid
```
     */

    public static void main(String[] args) {
        System.out.println("Enter any number: ");
        Scanner scannner = new Scanner(System.in);
        int num = scannner.nextInt();

        switch (num) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            default:
                System.out.println("Invalid");
        }


    }
}
