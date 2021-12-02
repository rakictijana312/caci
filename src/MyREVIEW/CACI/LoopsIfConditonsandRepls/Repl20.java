package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Repl20 {
    /*SCANNER CLASS

Write  a program that takes user's first name and last name and prints in console

Instruct the user to enter first name: "Please Enter First Name"

Capture the first name

Instruct the user to enter last name:"Please Enter Last Name"

Capture last name

Print first name and last name

**Final Output:**

```
Example:
```

```
Please Enter First Name
```

```
Please Enter Last Name
```

```
Cindy Crawford
     */
    public static void main(String[] args) {
        System.out.println("Please enter a first name?");
        Scanner scan=new Scanner(System.in);
        String name=scan.next();
        System.out.println("Print enter the last name");
        String lastname=scan.next();
        System.out.println(name + " " +lastname);

    }
}