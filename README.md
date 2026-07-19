# Day 1 - Hello World

## Program

**Hello World in Java**

### Objective

Learn the basic structure of a Java program and print output to the console.

### Code

```java
public class Day01_HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Welcome to my 365 Days of Java Journey!");
    }
}
```

### Concepts Covered

* Java program structure
* `class` declaration
* `main()` method
* `System.out.println()`
* Compiling and running a Java program

### Output

```
Hello, World!
Welcome to my 365 Days of Java Journey!
```

### Learning Summary

Today, I learned how to write, compile, and execute my first Java program. I also understood the purpose of the `main()` method and how Java prints output using `System.out.println()`.

---

**365 Days of Java Challenge** 🚀
**Day 1 Completed** ✅

# Day 2 - Variables and Data Types

## Program

**Variables and Data Types in Java**

### Objective

Understand how to declare variables and use different data types in Java.

### Code

```java
public class Day02_VariablesAndDataTypes {
    public static void main(String[] args) {

        int age = 19;
        double cgpa = 8.35;
        char grade = 'A';
        boolean isStudent = true;
        String name = "Gayatri";

        System.out.println("Name      : " + name);
        System.out.println("Age       : " + age);
        System.out.println("CGPA      : " + cgpa);
        System.out.println("Grade     : " + grade);
        System.out.println("Student   : " + isStudent);
    }
}
```

### Concepts Covered

* Variables
* Primitive Data Types

  * `int`
  * `double`
  * `char`
  * `boolean`
* Non-Primitive Data Type

  * `String`
* Printing variables using `System.out.println()`

### Output

```
Name      : Gayatri
Age       : 19
CGPA      : 8.35
Grade     : A
Student   : true
```

### Learning Summary

Today, I learned how to declare variables and use different data types in Java. I also practiced storing and displaying values using `System.out.println()`.

---

**365 Days of Java Challenge** 🚀
**Day 2 Completed** ✅



# Day 3 - Operators in Java

## Program

**Operators in Java**

### Objective

Learn how to perform arithmetic calculations, compare values, and use logical operations in Java.

### Code

```java
public class Day03_Operators {
    public static void main(String[] args) {

        int a = 15;
        int b = 4;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a > b : " + (a > b));
        System.out.println("a < b : " + (a < b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // Logical Operators
        boolean x = true;
        boolean y = false;

        System.out.println("\nLogical Operators:");
        System.out.println("x && y : " + (x && y));
        System.out.println("x || y : " + (x || y));
        System.out.println("!x : " + (!x));
    }
}
```

### Concepts Covered

* Arithmetic Operators (`+`, `-`, `*`, `/`, `%`)
* Relational Operators (`>`, `<`, `>=`, `<=`, `==`, `!=`)
* Logical Operators (`&&`, `||`, `!`)
* Expression Evaluation
* Boolean Values

### Output

```
Arithmetic Operators:
Addition: 19
Subtraction: 11
Multiplication: 60
Division: 3
Modulus: 3

Relational Operators:
a > b : true
a < b : false
a == b : false
a != b : true

Logical Operators:
x && y : false
x || y : true
!x : false
```

### Learning Summary

Today, I learned about Java operators and how they are used to perform calculations, compare values, and evaluate logical conditions. These operators are essential for writing programs that make decisions and process data efficiently.

---

**365 Days of Java Challenge** 🚀
**Day 3 Completed** ✅


# Day 4 - User Input Using Scanner

## Program

**Taking User Input in Java**

### Objective

Learn how to take dynamic input from the user using the `Scanner` class in Java.

### Code

```java
import java.util.Scanner;

public class Day04_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("\n--- Student Details ---");
        System.out.println("Name : " + name);
        System.out.println("Age  : " + age);
        System.out.println("CGPA : " + cgpa);

        sc.close();
    }
}
```

## Sample Output

```text
Enter your name: Gayatri
Enter your age: 19
Enter your CGPA: 8.35

--- Student Details ---
Name : Gayatri
Age  : 19
CGPA : 8.35
```

## Concepts Covered

* `Scanner` class
* `nextLine()`
* `nextInt()`
* `nextDouble()`
* Taking dynamic input from the user
* Displaying user input
* Closing the `Scanner` object

## Learning Summary

Today, I learned how to take dynamic input from the user using the `Scanner` class in Java. I practiced reading String, integer, and decimal values using different Scanner methods.

---

**365 Days of Java Challenge** 🚀
**Day 4 Completed** ✅


# Day 5 - Conditional Statements

## Program

**Conditional Statements in Java**

### Objective

Learn how to use conditional statements to make decisions in a Java program based on different conditions.

### Code

```java
import java.util.Scanner;

public class Day05_ConditionalStatements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 60) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    }
}
```

## Concepts Covered

* `if` statement
* `else if` statement
* `else` statement
* Conditional expressions
* Comparison operators
* Decision-making in Java
* Dynamic input using `Scanner`

## Sample Output

```text
Enter your marks: 85
Grade: B
```

## Learning Summary

Today, I learned how to use conditional statements in Java to make decisions based on the user's marks. I practiced using `if`, `else if`, and `else` statements to determine the appropriate grade.

---

**365 Days of Java Challenge** 🚀
**Day 5 Completed** ✅


# Day 6 - Loops in Java

## Program

**Loops in Java**

### Objective

Learn how to execute a block of code repeatedly using different types of loops in Java.

### Code

```java
import java.util.Scanner;

public class Day06_Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("\nFor Loop:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\nWhile Loop:");
        int i = 1;
        while (i <= n) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n\nDo-While Loop:");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= n);

        sc.close();
    }
}
```

## Concepts Covered

* `for` loop
* `while` loop
* `do-while` loop
* Loop initialization
* Loop condition
* Increment operation
* Repeated execution
* Dynamic input using `Scanner`

## Sample Output

```text
Enter a number: 5

For Loop:
1 2 3 4 5

While Loop:
1 2 3 4 5

Do-While Loop:
1 2 3 4 5
```

## Learning Summary

Today, I learned about the different types of loops in Java. I practiced using `for`, `while`, and `do-while` loops to repeatedly execute a block of code based on a condition.

---

**365 Days of Java Challenge** 🚀
**Day 6 Completed** ✅


# Day 7 - Pattern Printing

## Program

**Pattern Printing Using Nested Loops in Java**

### Objective

Learn how to use nested `for` loops to print patterns in Java.

### Code

```java
import java.util.Scanner;

public class Day07_PatternPrinting {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
```

## Concepts Covered

* Nested `for` loops
* Outer loop for rows
* Inner loop for columns
* Pattern printing
* Dynamic input using `Scanner`
* Understanding loop execution

## Sample Output

```text
Enter the number of rows: 5

*
* *
* * *
* * * *
* * * * *
```

## Learning Summary

Today, I learned how to use nested loops in Java to print patterns. I understood how the outer loop controls the number of rows and the inner loop controls the number of elements printed in each row.

---

**365 Days of Java Challenge** 🚀
**Day 7 Completed** ✅






