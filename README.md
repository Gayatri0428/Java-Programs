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
import java.util.*;

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
import java.util.*;

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
import java.util.*;

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
import java.util.*;

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
# Day 8 - Arrays in Java

## Program

**Array Input and Traversal in Java**

### Objective

Learn how to create an array, store multiple values, accept elements dynamically from the user, and traverse the array using loops.

### Code

```java
import java.util.*;

public class Day08_Arrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nArray Elements:");

        for (int i = 0; i < n; i++) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
```

## Concepts Covered

* Array declaration
* Array initialization
* Dynamic array size
* Storing multiple values in an array
* Accessing array elements using indexes
* Array traversal using `for` loops
* Dynamic input using `Scanner`

## Sample Output

```text
Enter the number of elements: 5
Enter 5 elements:
10 20 30 40 50

Array Elements:
10 20 30 40 50
```

## Learning Summary

Today, I learned how to create and use arrays in Java. I practiced taking the array size and elements dynamically from the user and traversing the array using a `for` loop.

---

**365 Days of Java Challenge** 🚀
**Day 8 Completed** ✅


# Day 9 - Array Sum and Average

## Program

**Calculate the Sum and Average of Array Elements**

### Objective

Learn how to calculate the sum and average of elements in an array using a loop.

### Code

```java
import java.util.*;

public class Day09_ArraySumAndAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];
        int sum = 0;

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / n;

        System.out.println("\nSum: " + sum);
        System.out.println("Average: " + average);

        sc.close();
    }
}
```

## Concepts Covered

* Arrays
* Array traversal
* `for` loop
* Sum calculation
* Average calculation
* Type casting from `int` to `double`
* Dynamic input using `Scanner`

## Sample Output

```text
Enter the number of elements: 5
Enter 5 elements:
10 20 30 40 50

Sum: 150
Average: 30.0
```

## Learning Summary

Today, I learned how to calculate the sum and average of array elements. I used a `for` loop to traverse the array and added each element to calculate the total sum. I also learned how type casting helps calculate the average accurately.

---

**365 Days of Java Challenge** 🚀
**Day 9 Completed** ✅


# Day 10 - Largest and Smallest Element

## Program

**Find the Largest and Smallest Element in an Array**

### Objective

Learn how to find the maximum and minimum values in an array using a loop and conditional statements.

### Code

```java
import java.util.*;

public class Day10_LargestSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int largest = numbers[0];
        int smallest = numbers[0];

        for (int i = 1; i < n; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }

            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("\nLargest Element: " + largest);
        System.out.println("Smallest Element: " + smallest);

        sc.close();
    }
}
```

## Concepts Covered

* Arrays
* Array traversal
* Finding the maximum element
* Finding the minimum element
* `if` conditions
* Dynamic input using `Scanner`

## Sample Output

```text
Enter the number of elements: 5
Enter 5 elements:
25 10 45 5 30

Largest Element: 45
Smallest Element: 5
```

## Learning Summary

Today, I learned how to find the largest and smallest elements in an array. I initialized both values with the first array element and compared the remaining elements using conditional statements.

---

**365 Days of Java Challenge** 🚀
**Day 10 Completed** ✅


# Day 11 - Linear Search

## Program

**Search for an Element in an Array Using Linear Search**

### Objective

Learn how to search for a specific element in an array by checking each element one by one.

### Code

```java id="1y43j6"
import java.util.*;

public class Day11_SearchElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (numbers[i] == target) {
                System.out.println("Element found at index: " + i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
```

## Concepts Covered

* Arrays
* Linear Search
* Array traversal
* `for` loop
* `if` condition
* Boolean variable
* `break` statement
* Dynamic input using `Scanner`

## Sample Output

```text id="9r6ry3"
Enter the number of elements: 5
Enter 5 elements:
10 20 30 40 50
Enter the element to search: 30

Element found at index: 2
```

## Learning Summary

Today, I learned how to perform a linear search in an array. The program checks each element one by one until the target element is found. I also learned how to use a boolean variable to track whether the element exists in the array.

---

**365 Days of Java Challenge** 🚀
**Day 11 Completed** ✅

# Day 12 - Reverse an Array

## Program

**Reverse the Elements of an Array**

### Objective

Learn how to traverse an array in reverse order and display its elements from the last index to the first index.

### Code

```java id="b7ud3j"
import java.util.*;

public class Day12_ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nArray in Reverse Order:");

        for (int i = n - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }

        sc.close();
    }
}
```

## Concepts Covered

* Arrays
* Array indexes
* Reverse traversal
* `for` loop
* Dynamic input using `Scanner`
* Accessing elements from the last index to the first index

## Sample Output

```text id="m0zv0r"
Enter the number of elements: 5
Enter 5 elements:
10 20 30 40 50

Array in Reverse Order:
50 40 30 20 10
```

## Learning Summary

Today, I learned how to reverse the order of elements in an array. Instead of traversing the array from index `0` to `n - 1`, I traversed it from the last index `n - 1` to the first index `0`.

---

**365 Days of Java Challenge** 🚀
**Day 12 Completed** ✅

# Day 13 - Array Palindrome

## Program

**Check Whether an Array Is a Palindrome**

### Objective

Learn how to check whether an array reads the same from left to right and right to left.

### Code

```java
import java.util.Scanner;

public class Day13_ArrayPalindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {
            if (numbers[i] != numbers[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The array is a palindrome.");
        } else {
            System.out.println("The array is not a palindrome.");
        }

        sc.close();
    }
}
```

## Concepts Covered

* Arrays
* Array indexing
* Comparing elements from both ends
* `for` loop
* Boolean variables
* `break` statement
* Dynamic input using `Scanner`

## Sample Output

```text
Enter the number of elements: 5
Enter 5 elements:
1 2 3 2 1

The array is a palindrome.
```

## Learning Summary

Today, I learned how to check whether an array is a palindrome. I compared the first element with the last element, the second element with the second-last element, and continued until the middle of the array.

---

**365 Days of Java Challenge** 🚀
**Day 13 Completed** ✅

# Day 14 - Sorting an Array

## Program

**Sort an Array in Ascending Order Using Bubble Sort**

### Objective

Learn how to sort array elements in ascending order using the Bubble Sort algorithm.

### Code

```java
import java.util.*;

public class Day14_SortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("\nArray in Ascending Order:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        sc.close();
    }
}
```

## Concepts Covered

* Arrays
* Bubble Sort
* Nested loops
* Swapping elements
* Sorting in ascending order
* Enhanced `for` loop
* Dynamic input using `Scanner`

## Sample Output

```text
Enter the number of elements: 5
Enter 5 elements:
40 10 50 20 30

Array in Ascending Order:
10 20 30 40 50
```

## Learning Summary

Today, I learned how to sort an array in ascending order using the Bubble Sort algorithm. I understood how adjacent elements are compared and swapped repeatedly until the array is sorted.

---

**365 Days of Java Challenge** 🚀
**Day 14 Completed** ✅

# Day 15 - Binary Search

## Program

**Search for an Element Using Binary Search**

### Objective

Learn how to search for an element efficiently in a sorted array using the Binary Search algorithm.

### Code

```java
import java.util.*;

public class Day15_BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " sorted elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        int left = 0;
        int right = n - 1;
        int index = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (numbers[mid] == target) {
                index = mid;
                break;
            } else if (numbers[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}
```

## Concepts Covered

* Binary Search
* Sorted arrays
* `while` loop
* Finding the middle element
* Searching in the left and right halves
* Time complexity: **O(log n)**
* Dynamic input using `Scanner`

## Sample Output

```text
Enter the number of elements: 5
Enter 5 sorted elements:
10 20 30 40 50
Enter the element to search: 40

Element found at index: 3
```

## Learning Summary

Today, I learned how to implement Binary Search on a sorted array. Instead of checking every element one by one, Binary Search repeatedly divides the search range into half, making it more efficient than Linear Search for sorted data.

---

**365 Days of Java Challenge** 🚀
**Day 15 Completed** ✅


# Day 16 - String Basics

## Program

**Introduction to Strings in Java**

### Objective

Learn the fundamentals of strings in Java, including how to accept string input from the user and perform common string operations.

### Code

```java
import java.util.*;

public class Day16_StringBasics {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        System.out.println("\nString: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Lowercase: " + text.toLowerCase());
        System.out.println("First Character: " + text.charAt(0));
        System.out.println("Last Character: " + text.charAt(text.length() - 1));

        sc.close();
    }
}
```

## Concepts Covered

* String declaration
* User input using `Scanner`
* `length()` method
* `toUpperCase()` method
* `toLowerCase()` method
* `charAt()` method
* Accessing the first and last characters of a string

## Sample Output

```text
Enter a string: Java Programming

String: Java Programming
Length: 16
Uppercase: JAVA PROGRAMMING
Lowercase: java programming
First Character: J
Last Character: g
```

## Learning Summary

Today, I learned the basics of working with strings in Java. I practiced taking string input from the user and explored commonly used string methods such as `length()`, `toUpperCase()`, `toLowerCase()`, and `charAt()`. These methods are essential for performing string manipulation and solving text-based programming problems.

---

**365 Days of Java Challenge** 🚀
**Day 16 Completed** ✅

# Day 17 - Reverse a String

## Program

**Reverse a String Using a Loop**

### Objective

Learn how to reverse a string by traversing it from the last character to the first using a `for` loop.

### Code

```java
import java.util.*;

public class Day17_ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String reverse = "";

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse += text.charAt(i);
        }

        System.out.println("Reversed String: " + reverse);

        sc.close();
    }
}
```

## Concepts Covered

* String input using `Scanner`
* `length()` method
* `charAt()` method
* `for` loop
* String concatenation
* Reversing a string character by character

## Sample Output

```text
Enter a string: Java Programming

Reversed String: gnimmargorP avaJ
```

## Learning Summary

Today, I learned how to reverse a string in Java using a `for` loop. I traversed the string from the last character to the first and built a new reversed string using the `charAt()` method and string concatenation. This is a fundamental string manipulation technique and a common programming interview question.

---

**365 Days of Java Challenge** 🚀
**Day 17 Completed** ✅
# Day 18 - Palindrome String

## Program

**Check Whether a String Is a Palindrome**

### Objective

Learn how to determine whether a string is a palindrome by reversing the string and comparing it with the original string.

### Code

```java id="x8d7mk"
import java.util.*;

public class Day18_PalindromeString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String original = text.toLowerCase();
        String reverse = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reverse += original.charAt(i);
        }

        if (original.equals(reverse)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        sc.close();
    }
}
```

## Concepts Covered

* String input using `Scanner`
* `toLowerCase()` method
* `length()` method
* `charAt()` method
* `equals()` method
* String concatenation
* `for` loop
* Palindrome checking

## Sample Output

```text id="gwd2wj"
Enter a string: madam

The string is a palindrome.
```

```text id="0l4vju"
Enter a string: Java

The string is not a palindrome.
```

## Learning Summary

Today, I learned how to check whether a string is a palindrome in Java. I reversed the input string using a `for` loop and compared it with the original string using the `equals()` method. I also used `toLowerCase()` to make the comparison case-insensitive.

---

**365 Days of Java Challenge** 🚀
**Day 18 Completed** ✅

# Day 19 - Count Vowels and Consonants

## Program

**Count the Number of Vowels and Consonants in a String**

### Objective

Learn how to count the number of vowels and consonants in a string by traversing each character and checking whether it is a vowel, consonant, or a non-alphabetic character.

### Code

```java
import java.util.Scanner;

public class Day19_CountVowelsConsonants {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine().toLowerCase();

        int vowels = 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of Vowels: " + vowels);
        System.out.println("Number of Consonants: " + consonants);

        sc.close();
    }
}
```

## Concepts Covered

* String input using `Scanner`
* `toLowerCase()` method
* `charAt()` method
* `Character.isLetter()` method
* `for` loop
* Nested `if-else` statements
* Counting vowels
* Counting consonants

## Sample Output

```text
Enter a string: Java Programming

Number of Vowels: 5
Number of Consonants: 10
```

## Learning Summary

Today, I learned how to count vowels and consonants in a string in Java. I used a `for` loop to traverse each character, `Character.isLetter()` to ignore spaces and special characters, and conditional statements to classify each alphabet as either a vowel or a consonant.

---

**365 Days of Java Challenge** 🚀
**Day 19 Completed** ✅

# Day 20 - String Comparison and Common String Methods

## Program

**Compare Strings and Explore Common String Methods in Java**

### Objective

Learn how to compare two strings and use frequently used String methods to manipulate and analyze text.

### Code

```java
import java.util.*;

public class Day20_StringComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();

        // String Comparison
        System.out.println("\n=== String Comparison ===");
        System.out.println("equals(): " + str1.equals(str2));
        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));
        System.out.println("compareTo(): " + str1.compareTo(str2));

        // Common String Methods
        System.out.println("\n=== Common String Methods ===");
        System.out.println("Length: " + str1.length());
        System.out.println("Uppercase: " + str1.toUpperCase());
        System.out.println("Lowercase: " + str1.toLowerCase());
        System.out.println("Contains \"Java\": " + str1.contains("Java"));
        System.out.println("Starts with \"J\": " + str1.startsWith("J"));
        System.out.println("Ends with \"a\": " + str1.endsWith("a"));

        sc.close();
    }
}
```

## Concepts Covered

* String comparison using `equals()`
* Case-insensitive comparison using `equalsIgnoreCase()`
* Lexicographical comparison using `compareTo()`
* `length()` method
* `toUpperCase()` method
* `toLowerCase()` method
* `contains()` method
* `startsWith()` method
* `endsWith()` method
* User input using `Scanner`

## Sample Output

```text
Enter first string: Java
Enter second string: java

=== String Comparison ===
equals(): false
equalsIgnoreCase(): true
compareTo(): -32

=== Common String Methods ===
Length: 4
Uppercase: JAVA
Lowercase: java
Contains "Java": true
Starts with "J": true
Ends with "a": true
```

## Learning Summary

Today, I learned how to compare strings in Java using `equals()`, `equalsIgnoreCase()`, and `compareTo()`. I also explored several commonly used String methods such as `length()`, `toUpperCase()`, `toLowerCase()`, `contains()`, `startsWith()`, and `endsWith()`. These methods are essential for string manipulation and are frequently used in Java applications.

---

**365 Days of Java Challenge** 🚀
**Day 20 Completed** ✅

# Day 21 - Count Words in a Sentence

## Program

**Count the Number of Words in a Sentence**

### Objective

Learn how to count the number of words in a sentence by splitting the input string based on whitespace.

### Code

```java
import java.util.*;

public class Day21_CountWords {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().trim();

        if (sentence.isEmpty()) {
            System.out.println("Number of Words: 0");
        } else {
            String[] words = sentence.split("\\s+");
            System.out.println("Number of Words: " + words.length);
        }

        sc.close();
    }
}
```

## Concepts Covered

* String input using `Scanner`
* `trim()` method
* `isEmpty()` method
* `split()` method
* Regular expression `\\s+`
* Arrays
* Counting words in a sentence

## Sample Output

```text
Enter a sentence: Java is a powerful programming language

Number of Words: 6
```

## Learning Summary

Today, I learned how to count the number of words in a sentence in Java. I used the `trim()` method to remove leading and trailing spaces, `split("\\s+")` to divide the sentence into words using one or more whitespace characters, and then counted the words using the length of the resulting array.

---

**365 Days of Java Challenge** 🚀
**Day 21 Completed** ✅

# Day 22 - Remove Spaces from a String

## Program

**Remove Spaces from a String**

### Objective

Learn how to remove all spaces from a string using the `replace()` method in Java.

### Code

```java
import java.util.*;

public class Day22_RemoveSpaces {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = text.replace(" ", "");

        System.out.println("String after removing spaces: " + result);

        sc.close();
    }
}
```

## Concepts Covered

* String input using `Scanner`
* `replace()` method
* String manipulation
* Removing whitespace
* User input handling

## Sample Output

```text
Enter a string: Java Programming Language

String after removing spaces: JavaProgrammingLanguage
```

## Learning Summary

Today, I learned how to remove spaces from a string in Java using the `replace()` method. This technique is useful for formatting text, cleaning user input, and preparing strings for further processing.

---

**365 Days of Java Challenge** 🚀
**Day 22 Completed** ✅
# Day 23 - Find Duplicate Characters in a String

## Program

**Find Duplicate Characters in a String**

### Objective

Learn how to identify duplicate characters in a string and count their occurrences using nested loops.

### Code

```java
import java.util.*;

public class Day23_DuplicateCharacters {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine().toLowerCase();

        char[] chars = text.toCharArray();

        System.out.println("Duplicate Characters:");

        for (int i = 0; i < chars.length; i++) {

            if (chars[i] == ' ') {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    count++;
                    chars[j] = '0';
                }
            }

            if (count > 1 && chars[i] != '0') {
                System.out.println(chars[i] + " : " + count);
            }
        }

        sc.close();
    }
}
```

## Concepts Covered

* String input using `Scanner`
* `toLowerCase()` method
* `toCharArray()` method
* Character arrays
* Nested `for` loops
* Duplicate character detection
* Counting character frequency
* Conditional statements

## Sample Output

```text
Enter a string: Programming

Duplicate Characters:
r : 2
g : 2
m : 2
```

## Learning Summary

Today, I learned how to find duplicate characters in a string using nested loops. I converted the string into a character array, compared each character with the remaining characters, counted duplicates, and displayed only the characters that appeared more than once.

---

**365 Days of Java Challenge** 🚀
**Day 23 Completed** ✅

# Day 24 - Check Anagram Strings

## Program

**Check Whether Two Strings Are Anagrams**

### Objective

Learn how to determine whether two strings are anagrams by removing spaces, converting them to lowercase, sorting their characters, and comparing the sorted arrays.

### Code

```java
import java.util.*;

public class Day24_AnagramCheck {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        System.out.print("Enter second string: ");
        String str2 = sc.nextLine().replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        } else {

            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            if (Arrays.equals(arr1, arr2)) {
                System.out.println("The strings are anagrams.");
            } else {
                System.out.println("The strings are not anagrams.");
            }
        }

        sc.close();
    }
}
```

## Concepts Covered

* String input using `Scanner`
* `replaceAll()` method
* `toLowerCase()` method
* `toCharArray()` method
* Character arrays
* `Arrays.sort()`
* `Arrays.equals()`
* Conditional statements
* Anagram checking

## Sample Output

```text
Enter first string: listen
Enter second string: silent

The strings are anagrams.
```

```text
Enter first string: java
Enter second string: python

The strings are not anagrams.
```

## Learning Summary

Today, I learned how to check whether two strings are anagrams in Java. I removed spaces, converted both strings to lowercase, sorted their characters using `Arrays.sort()`, and compared the sorted arrays using `Arrays.equals()`. This approach is simple, efficient, and commonly used in string-based programming problems.

---

**365 Days of Java Challenge** 🚀
**Day 24 Completed** ✅

# Day 25 - StringBuilder and StringBuffer

## Program

**Working with StringBuilder and StringBuffer in Java**

### Objective

Learn how to use `StringBuilder` and `StringBuffer` for modifying strings efficiently. Unlike `String`, both are mutable, which means their contents can be changed without creating a new object for every modification.

### Code

```java
import java.util.*;

public class Day25_StringBuilderBuffer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        // StringBuilder
        StringBuilder builder = new StringBuilder(text);

        builder.append(" Java");
        builder.insert(0, "Hello ");
        builder.reverse();

        System.out.println("\nStringBuilder Result: " + builder);

        // StringBuffer
        StringBuffer buffer = new StringBuffer(text);

        buffer.append(" Programming");

        System.out.println("StringBuffer Result: " + buffer);

        sc.close();
    }
}
```

## Concepts Covered

* `StringBuilder`
* `StringBuffer`
* Mutable strings
* `append()` method
* `insert()` method
* `reverse()` method
* Dynamic input using `Scanner`
* Difference between `StringBuilder` and `StringBuffer`

## Sample Output

```text
Enter a string: World

StringBuilder Result: avaJ dlroW olleH
StringBuffer Result: World Programming
```

## StringBuilder vs StringBuffer

| Feature         | StringBuilder            | StringBuffer                |
| --------------- | ------------------------ | --------------------------- |
| Mutable         | Yes                      | Yes                         |
| Thread-safe     | No                       | Yes                         |
| Performance     | Faster                   | Slightly slower             |
| Synchronization | Not synchronized         | Synchronized                |
| Common Use      | Single-threaded programs | Multi-threaded environments |

## Learning Summary

Today, I learned about `StringBuilder` and `StringBuffer`, which are mutable alternatives to `String`. I practiced modifying strings using `append()`, `insert()`, and `reverse()`. I also learned that `StringBuilder` is generally faster, while `StringBuffer` provides thread safety through synchronization.

---

**365 Days of Java Challenge** 🚀
**Day 25 Completed** ✅


# Day 26 - Character Frequency

## Program

**Count the Frequency of Each Character in a String**

### Objective

Learn how to count how many times each character appears in a string using nested loops and a boolean array.

### Code

```java
import java.util.*;

public class Day26_CharacterFrequency {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.nextLine().toLowerCase();

        boolean[] counted = new boolean[text.length()];

        System.out.println("\nCharacter Frequency:");

        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == ' ' || counted[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < text.length(); j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    count++;
                    counted[j] = true;
                }
            }

            System.out.println(text.charAt(i) + " : " + count);
        }

        sc.close();
    }
}
```

## Concepts Covered

* Character frequency
* String traversal
* `charAt()` method
* Boolean arrays
* Nested `for` loops
* Counting character occurrences
* `continue` statement
* Case-insensitive string processing
* Ignoring spaces

## Sample Output

```text
Enter a string: Java Programming

Character Frequency:
j : 1
a : 2
v : 1
p : 1
r : 2
o : 1
g : 2
m : 2
i : 1
n : 1
```

## How It Works

1. The user enters a string.
2. The string is converted to lowercase.
3. Each character is checked one by one.
4. A nested loop counts how many times the character occurs.
5. The `counted` array prevents the same character from being displayed again.
6. Spaces are ignored.
7. The frequency of each character is displayed.

## Learning Summary

Today, I learned how to find the frequency of each character in a string. I practiced using nested loops, `charAt()`, and a boolean array to count and track characters efficiently.

---

**365 Days of Java Challenge** 🚀
**Day 26 Completed** ✅

























