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


