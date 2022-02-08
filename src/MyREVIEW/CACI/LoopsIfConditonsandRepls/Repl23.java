package MyREVIEW.CACI.LoopsIfConditonsandRepls;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

import java.util.Scanner;

public class Repl23 {
    /*
Create a program that will ask a user to input boolean value "Input the boolean value"

If the input is true or false, then the output should look like below:

**Example Output:**

```
Input the boolean value
```

```
The value is true
```

**Example Output:**

```
Input the boolean value
```

```
The value is false
```
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input a boolean value: ");
        boolean value=scanner.hasNextBoolean();
        if (value){
            System.out.println("The value is " +value);
        }
        else{
            System.out.println("The value is " +value);
        }

    }
}
