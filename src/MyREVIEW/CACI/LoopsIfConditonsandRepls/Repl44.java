package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.util.Scanner;

public class Repl44 {
    /*


Prompt user with questions: "Please enter your favorite car make"

- if user enters  BMW -->  carOrigin = "german car"
- if user enters  Toyota -->  carOrigin = " japanese car"
- if user enters  Maserati -->  carOrigin = "italian car"
- anything else besides those values --> carOrigin = "unknown"



```
The output of your program should be:
```

```
"Your favorite car is ___"
```
     */

    public static void main(String[] args) {
        System.out.println("Please enter your favorite car make");
        Scanner scanner=new Scanner(System.in);
        String car= scanner.next();

        switch(car){
            case "BMW":
                System.out.println("german car");
                break;

            case "Toyota":
                System.out.println(" japanese car");
                break;

            case "Maserati":
                System.out.println("italian car");
                break;

            default:
                System.out.println("unknown");

        }
    }
}
