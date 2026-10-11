# JavaGroupProject
This is for educational learning for our java learning path

---

# 🎓 JAVA FUNDAMENTALS - VISUAL CODE GUIDE

Here's organized by **difficulty level** with code you can copy and paste:

## **LEVEL 0: Your First Program** (EASIEST)

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Understanding it:**
- `public class HelloWorld` - Create a class
- `public static void main(String[] args)` - Entry point (must have this!)
- `System.out.println()` - Print to console
- `;` - End each statement
- `{}` - Group code

---

## **LEVEL 1: Variables & Data Types** (EASY)

```java
public class VariablesExample {
    public static void main(String[] args) {
        // INTEGER TYPES
        int age = 25;              // Whole number
        long bigNumber = 1000000L; // Very big number
        
        // DECIMAL TYPES
        double salary = 50000.75;  // With decimals
        float price = 19.99f;      // Less precise
        
        // OTHER TYPES
        char initial = 'C';        // Single character
        boolean isStudent = true;  // true or false
        String name = "Carl";      // Text
        
        // PRINT them
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        System.out.println("Is Student: " + isStudent);
    }
}
```

**Output:**
```
Name: Carl
Age: 25
Salary: $50000.75
Is Student: true
```

---

## **LEVEL 2: Operators** (EASY)

```java
public class OperatorsExample {
    public static void main(String[] args) {
        // ARITHMETIC
        int a = 10, b = 3;
        System.out.println("Add: " + (a + b));       // 13
        System.out.println("Subtract: " + (a - b));  // 7
        System.out.println("Multiply: " + (a * b));  // 30
        System.out.println("Divide: " + (a / b));    // 3
        System.out.println("Remainder: " + (a % b)); // 1
        
        // COMPARISON
        System.out.println("a > b: " + (a > b));     // true
        System.out.println("a == b: " + (a == b));   // false
        System.out.println("a != b: " + (a != b));   // true
        
        // LOGICAL
        boolean x = true, y = false;
        System.out.println("x && y: " + (x && y));   // false (both must be true)
        System.out.println("x || y: " + (x || y));   // true (at least one true)
        System.out.println("!x: " + (!x));           // false (not true)
    }
}
```

---

## **LEVEL 3: If-Else Statements** (EASY)

```java
public class IfElseExample {
    public static void main(String[] args) {
        int score = 75;
        
        // Simple if
        if (score >= 70) {
            System.out.println("Pass!");
        }
        
        // If-else
        if (score >= 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        // If-else if-else
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80) {
            System.out.println("Grade: B");
        } else if (score >= 70) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }
        
        // Ternary (short if-else)
        String result = (score >= 70) ? "Pass" : "Fail";
        System.out.println(result);
    }
}
```

---

## **LEVEL 4: Loops** (MEDIUM)

```java
public class LoopsExample {
    public static void main(String[] args) {
        // FOR LOOP
        System.out.println("For Loop (0 to 4):");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        
        // WHILE LOOP
        System.out.println("\nWhile Loop:");
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }
        
        // FOR-EACH (Array loop)
        System.out.println("\nFor-Each Loop:");
        String[] fruits = {"Apple", "Banana", "Orange"};
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        // BREAK
        System.out.println("\nUsing Break:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) break;  // Exit loop
            System.out.println(i);
        }
        
        // CONTINUE
        System.out.println("\nUsing Continue:");
        for (int i = 0; i < 5; i++) {
            if (i == 2) continue;  // Skip this iteration
            System.out.println(i);
        }
    }
}
```

---

## **LEVEL 5: Arrays** (MEDIUM)

```java
public class ArraysExample {
    public static void main(String[] args) {
        // CREATE ARRAY
        int[] numbers = {10, 20, 30, 40, 50};
        String[] names = {"John", "Sarah", "Mike"};
        
        // ACCESS ELEMENTS
        System.out.println("First number: " + numbers[0]);    // 10
        System.out.println("First name: " + names[0]);        // John
        
        // MODIFY ELEMENTS
        numbers[1] = 25;  // Change 20 to 25
        System.out.println("Modified: " + numbers[1]);        // 25
        
        // ARRAY LENGTH
        System.out.println("Array length: " + numbers.length);  // 5
        
        // LOOP THROUGH ARRAY
        System.out.println("All numbers:");
        for (int num : numbers) {
            System.out.println(num);
        }
        
        // FIND SUM
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum: " + sum);  // 155
        
        // 2D ARRAY (rows and columns)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Element at [1][2]: " + matrix[1][2]);  // 6
    }
}
```

---

## **LEVEL 6: Strings** (MEDIUM)

```java
public class StringsExample {
    public static void main(String[] args) {
        String text = "Hello World";
        
        // LENGTH
        System.out.println("Length: " + text.length());  // 11
        
        // CHARACTER AT INDEX
        System.out.println("Char at 0: " + text.charAt(0));  // H
        
        // SUBSTRING
        System.out.println("Substring (0-5): " + text.substring(0, 5));  // Hello
        System.out.println("Substring from 6: " + text.substring(6));    // World
        
        // CASE
        System.out.println("Upper: " + text.toUpperCase());    // HELLO WORLD
        System.out.println("Lower: " + text.toLowerCase());    // hello world
        
        // CONTAINS
        System.out.println("Contains 'World': " + text.contains("World"));  // true
        System.out.println("Contains 'Java': " + text.contains("Java"));    // false
        
        // REPLACE
        System.out.println("Replace: " + text.replace("World", "Java"));  // Hello Java
        
        // SPLIT
        String csv = "John,25,Engineer";
        String[] parts = csv.split(",");
        for (String part : parts) {
            System.out.println(part);
        }
        
        // EQUALS (correct way)
        String a = "Hello";
        String b = "Hello";
        System.out.println("Equals: " + a.equals(b));  // true
        
        // TRIM
        String padded = "  Hello  ";
        System.out.println("Trimmed: '" + padded.trim() + "'");  // 'Hello'
    }
}
```

---

## **LEVEL 7: Methods** (MEDIUM)

```java
public class MethodsExample {
    
    // Method 1: No parameters, no return
    public static void greet() {
        System.out.println("Hello!");
    }
    
    // Method 2: With parameters, no return
    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }
    
    // Method 3: No parameters, with return
    public static int getAge() {
        return 25;
    }
    
    // Method 4: With parameters, with return
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method 5: Multiple parameters
    public static double calculatePrice(double quantity, double price) {
        return quantity * price;
    }
    
    // Main method
    public static void main(String[] args) {
        // Call methods
        greet();              // Hello!
        greet("Carl");        // Hello, Carl
        
        int age = getAge();
        System.out.println("Age: " + age);  // Age: 25
        
        int sum = add(5, 3);
        System.out.println("Sum: " + sum);  // Sum: 8
        
        double total = calculatePrice(3, 19.99);
        System.out.println("Total: $" + total);  // Total: $59.97
    }
}
```

---

## **LEVEL 8: Input & Output** (MEDIUM)

```java
import java.util.Scanner;

public class InputOutputExample {
    public static void main(String[] args) {
        // CREATE SCANNER
        Scanner input = new Scanner(System.in);
        
        // GET INPUT
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
        System.out.print("Enter your salary: ");
        double salary = input.nextDouble();
        
        // DISPLAY OUTPUT
        System.out.println("\n--- Your Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
        
        // FORMATTED OUTPUT
        System.out.printf("Employee: %s, Age: %d, Salary: $%.2f%n", name, age, salary);
        
        // CLOSE SCANNER
        input.close();
    }
}
```

**Run and try it:**
```
Enter your name: Carl
Enter your age: 25
Enter your salary: 50000

--- Your Information ---
Name: Carl
Age: 25
Salary: $50000.0
Employee: Carl, Age: 25, Salary: $50000.00
```

---

## **LEVEL 9: Try-Catch (Error Handling)** (MEDIUM-HARD)

```java
public class TryCatchExample {
    public static void main(String[] args) {
        // Example 1: NumberFormatException
        try {
            String text = "abc";
            int num = Integer.parseInt(text);  // Error! "abc" is not a number
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid number");
        }
        
        // Example 2: ArrayIndexOutOfBoundsException
        try {
            int[] arr = {1, 2, 3};
            int value = arr[10];  // Error! Index doesn't exist
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index out of range");
        }
        
        // Example 3: Division by zero
        try {
            int result = 10 / 0;  // Error!
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }
        
        // Example 4: Try-Catch-Finally
        try {
            System.out.println("Trying something...");
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught error: " + e.getMessage());
        } finally {
            System.out.println("This always runs!");
        }
    }
}
```

---

## **LEVEL 10: Classes & Objects** (HARD)

```java
// Step 1: Create a class (blueprint)
public class Student {
    // Data (variables)
    String name;
    int age;
    double gpa;
    
    // Constructor (initialize object)
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    // Method
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
    }
    
    // Getter
    public String getName() {
        return name;
    }
    
    // Setter
    public void setName(String newName) {
        name = newName;
    }
}

// Step 2: Use the class
public class StudentDemo {
    public static void main(String[] args) {
        // Create object (instance)
        Student student1 = new Student("John", 20, 3.8);
        Student student2 = new Student("Sarah", 21, 3.9);
        
        // Use object
        student1.displayInfo();
        System.out.println();
        student2.displayInfo();
        
        // Modify using setter
        student1.setName("Jonathan");
        System.out.println("Updated name: " + student1.getName());
    }
}
```

**Output:**
```
Name: John
Age: 20
GPA: 3.8

Name: Sarah
Age: 21
GPA: 3.9

Updated name: Jonathan
```

---

## **COMPLETE PROJECT EXAMPLE: Cinema Ticket (Puts It All Together)**

```java
import java.util.Scanner;

public class CinemaTicket {
    // Constants
    static final double REGULAR_PRICE = 12.00;
    static final double VIP_PRICE = 20.00;
    static final double TAX_RATE = 0.08;
    static final double STUDENT_DISCOUNT = 0.10;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        try {
            // Get inputs
            System.out.print("Regular tickets: ");
            int regular = input.nextInt();
            
            System.out.print("VIP tickets: ");
            int vip = input.nextInt();
            
            System.out.print("Are you a student? (yes/no): ");
            input.nextLine();  // Clear buffer
            String studentStatus = input.nextLine();
            
            boolean isStudent = studentStatus.equalsIgnoreCase("yes");
            
            // Calculate
            double subtotal = (regular * REGULAR_PRICE) + (vip * VIP_PRICE);
            double discount = isStudent ? (subtotal * STUDENT_DISCOUNT) : 0;
            double discountedSubtotal = subtotal - discount;
            double tax = discountedSubtotal * TAX_RATE;
            double total = discountedSubtotal + tax;
            
            // Display receipt
            System.out.println("\n=== RECEIPT ===");
            System.out.println("Regular: " + regular + " × $" + REGULAR_PRICE);
            System.out.println("VIP: " + vip + " × $" + VIP_PRICE);
            System.out.println("Subtotal: $" + subtotal);
            if (isStudent) {
                System.out.println("Student Discount: -$" + discount);
            }
            System.out.println("Tax: $" + tax);
            System.out.println("TOTAL: $" + total);
            
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers");
        } finally {
            input.close();
        }
    }
}
```

---

# 📊 QUICK LOOKUP TABLE

| What You Want | Code | Example |
|---------------|------|---------|
| Print text | `System.out.println()` | `System.out.println("Hello");` |
| Get number input | `Scanner.nextInt()` | `int age = input.nextInt();` |
| Check if equal | `.equals()` | `if (name.equals("John"))` |
| Loop through array | `for-each` | `for (int num : array)` |
| Add to number | `+=` | `total += 5;` |
| If condition | `if-else` | `if (age > 18) { }` |
| Define method | `public static` | `public static void greet() { }` |
| Create class | `class Name { }` | `class Student { }` |
| Create object | `new` | `Student s = new Student();` |
| Handle error | `try-catch` | `try { } catch { }` |

---

## 🎯 WHICH SECTION DO YOU NEED MOST HELP WITH?

Let me know:
1. Which level is hardest for you?
2. Which concept from the checklist is confusing?
3. Do you want more examples for specific topics?

I can create detailed, step-by-step tutorials for any topic!
