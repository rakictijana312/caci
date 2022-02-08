package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.util.Scanner;

public class Repl43 {
    /*
    Write a program to input number "Input a number between 1-12" and when you input a number
    it should display the month using Scanner and Switch statement.

case: 1 will display January

case: 12 will display December

Anything outside of 12 will display "Invalid"

**Example Output:**

```
Input a number between 1-12
```

```
Invalid
```

**Example Output:**

```
Input a number between 1-12
```

```
January
```

     */
    public static void main(String[] args) {
        System.out.println("Input a number between 1-12");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        switch (num) {
            case 1:
                System.out.println("January");
                break;

            case 2:
                System.out.println("February");
                break;

            case 12:
                System.out.println("December");
                break;

            default:
                System.out.println("Invalid");
        }
    }
}