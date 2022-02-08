package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import java.util.Scanner;

public class Repl22 {
    /*
Write a program to take user name, age and mobile number

First Output: "Enter your name"

Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)

Third Output: "Enter your age"

**Example Output:**

```
Enter your name
```

```
Enter your mobile number
```

```
Enter your age
```

```
Your name is Weqas, your age is 45 and your mobile number is 123-456-7890






     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=scanner.next();
        System.out.println("Please enter your age: ");
        int age=scanner.nextInt();
        System.out.println("Please enter your phone number: ");
        int phoneNumber=scanner.nextInt();
        System.out.println("Your name is " + name + ", your age is " + age + " and your mobile number is " + phoneNumber);

    }
}
