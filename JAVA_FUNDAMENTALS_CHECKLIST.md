# 📚 COMPLETE JAVA FUNDAMENTALS CHECKLIST

Everything You Need to Know as a Beginner — improved with clear explanations, Taglish tips, and precise example outputs.

**Status: Study This Thoroughly Before Writing Any Code**

---

## ✅ SECTION 1: JAVA BASICS & SETUP

### 1.1 What is Java?
- Java is a programming language designed for portability and reliability.
- Java is Object-Oriented (OOP): it models real-world things as classes/objects.
- Java runs on the JVM (Java Virtual Machine) — compile to bytecode, JVM runs it.
- "Write Once, Run Anywhere" (WORA) — same bytecode runs on any JVM.
- Java programs are compiled (`javac`) into .class bytecode, then executed by the JVM (`java`).

> Taglish tip: "Compile ka muna using `javac`, tapos `java` para patakbuhin — parang mag-prepare muna, then run."

### 1.2 Java Installation & Setup
- Install JDK (Java Development Kit) — includes compiler and tools.
- Understand difference: JRE = runtime only; JDK = JRE + dev tools.
- Set `JAVA_HOME` to your JDK folder.
- Add Java `bin` to `PATH` so `java` and `javac` work in terminal.
- Verify with `java -version` and `javac -version`.

### 1.3 Java Development Environment
- Use a plain text editor (VSCode, Notepad++) or an IDE (IntelliJ IDEA, Eclipse) for more support.
- How to compile: `javac FileName.java`
- How to run: `java FileName` (run class name without .class)
- .java files are source; .class files are compiled bytecode.
- Package naming convention: use reverse domain (e.g., `com.example.project`).

### 1.4 Your First Program (line-by-line explanation)
```java
// HelloWorld.java
public class HelloWorld {                   // 1: class declaration - the program's public class must match filename
    public static void main(String[] args) { // 2: program entrypoint
        System.out.println("Hello, World!"); // 3: print to console
    }
}
// Output when run: Hello, World!
// Explanation (Taglish): Ito ang pinaka-basic program. `main` dito ang start point — kapag pinatakbo mo, lalabas ang text sa console.
```

---

## ✅ SECTION 2: VARIABLES & DATA TYPES

### 2.1 What Are Variables?
- Variables store data in memory with a name, type, and value.
- Naming conventions: use `camelCase` for variable names: `myVariable`.
- Declaration vs assignment: `int x;` declares; `x = 5;` assigns.
- Scope determines where variable is accessible (method, block, class).

### 2.2 Primitive Data Types (8 types) — with outputs & Taglish guidance
#### Integer Types
```java
byte age = 25;           // valid range -128..127
short year = 2024;       // used for small integers
int population = 1_000_000; // most commonly used for integer values
long bigNumber = 123456789L; // use L suffix for long literals

// Example print
System.out.println("age: " + age); // Output: age: 25
// Taglish: Gumamit ng long kapag sobra na ang laki ng number — lagyan ng L sa dulo.
```

#### Decimal Types
```java
float price = 19.99f;    // f suffix required for float literal
double salary = 50000.75; // default for decimals (more precise)
System.out.println(price);  // Output: 19.99
System.out.println(salary); // Output: 50000.75
```

#### Character & Boolean
```java
char initial = 'C';         // single quotes only
boolean isStudent = true;
System.out.println(initial);  // Output: C
System.out.println(isStudent); // Output: true
```

### 2.3 Type Casting
- Widening (automatic): smaller → larger type (int → double).
- Narrowing (explicit): must cast; may lose data.
```java
int num = 100;
double decimal = num; // automatic widening

double x = 3.99;
int y = (int) x; // explicit narrowing, decimal lost
System.out.println(y); // Output: 3
// Taglish: Kapag nag-cast ka pababa (double -> int), mawawala ang decimal part — be careful!
```

### 2.4 Reference Types
- Strings, arrays, and objects are reference types stored as references.
```java
String name = "Carl";       // reference type
int[] numbers = {1,2,3};      // array reference
Car myCar = new Car();        // object reference
String noValue = null;        // null reference means "walang value"
```

### 2.5 Variable Declaration Examples
```java
int age = 25;                    // single
int a = 1, b = 2, c = 3;         // multiple
int x; x = 100;                  // declare then assign
final double PI = 3.14159;      // constant - cannot reassign
```

---

## ✅ SECTION 3: OPERATORS

(Keep the list of arithmetic, assignment, comparison, logical, increment/decrement operators.)

Example with output and Taglish explanation:
```java
int x = 10;
x += 5; // x = x + 5
System.out.println(x); // Output: 15
// Taglish: `+=` useful to shorten code kapag nag-a-update ng parehong variable.
```

---

## ✅ SECTION 4: CONTROL FLOW (IF / SWITCH / TERNARY)

### 4.1 If Statement (clear example)
```java
int age = 20;
if (age >= 18) {
    System.out.println("You are an adult"); // Output: You are an adult
}
// Taglish: Simple lang — kung past ang condition, nagp-print siya.
```

### 4.2 If-Else & Else-If
```java
int score = 75;
if (score >= 90) {
    System.out.println("A");
} else if (score >= 70) {
    System.out.println("B"); // Output: B
} else {
    System.out.println("C or below");
}
```

### 4.3 Switch Statement (added; use when comparing discrete values)
- Use `switch` when checking a variable against many constant cases.
- Avoid spaghetti fall-through by using `break` or deliberate fall-through with comment.

```java
int day = 3;
switch (day) {
    case 1:
        System.out.println("Sunday");
        break;
    case 2:
        System.out.println("Monday");
        break;
    case 3:
        System.out.println("Tuesday"); // Output: Tuesday
        break;
    default:
        System.out.println("Unknown day");
}

// String switch example (Java 7+)
String role = "admin";
switch (role) {
    case "admin":
        System.out.println("Full access"); // Output: Full access
        break;
    case "user":
        System.out.println("Limited access");
        break;
    default:
        System.out.println("No access");
}

// Taglish: Kapag marami kang checks na constants, mas readable ang switch kaysa sa maraming else-if.
```

### 4.4 Ternary Operator
```java
int a = 5, b = 3;
int max = (a > b) ? a : b; // max = 5
System.out.println(max); // Output: 5
```

---

## ✅ SECTION 5: LOOPS (clean examples with outputs)
(Keep while, do-while, for, enhanced for, break, continue.)

Example: for loop with array
```java
String[] fruits = {"Apple", "Banana", "Orange"};
for (String fruit : fruits) {
    System.out.println(fruit);
}
// Output:
// Apple
// Banana
// Orange
// Taglish: `for-each` kapag hindi mo kailangan index — less error-prone.
```

---

## ✅ SECTION 6: ARRAYS

(Keep array declaration/access/multi-dimensional examples.)

Important note: when computing average, use floating point division to avoid integer truncation.
```java
int[] arr = {5, 2, 8, 1, 9};
int sum = 0;
for (int num : arr) sum += num;
double average = (double) sum / arr.length; // cast to get decimal
System.out.println(average); // Output: 5.0
// Taglish: Kung int ang division mo, mawawalan ng decimal — mag-cast as double.
```

---

## ✅ SECTION 7: STRINGS

(Keep basics, creation, concatenation, important methods.)

Emphasize correct comparison:
```java
String a = "Hello";
String b = new String("Hello");
System.out.println(a == b); // Output: false (compares references)
System.out.println(a.equals(b)); // Output: true (compares content)
// Taglish: Gumamit ng equals() para siguradong tama ang comparison ng text.
```

---

## ✅ SECTION 8: METHODS

(Keep method syntax, types, overloading, scope explanation.)

Example (clear, line-by-line):
```java
public class MathUtils {
    // 1. Method with parameters and return type
    public static int add(int a, int b) { // parameters: a, b
        return a + b; // returns sum
    }
}

// Usage:
int result = MathUtils.add(5, 3);
System.out.println(result); // Output: 8
// Taglish: Methods help organize logic — parang maliit na function na pwedeng tawagin ulit-ulit.
```

---

## ✅ SECTION 9: INPUT / OUTPUT (proper usage)

### 9.1 Output
(Keep System.out.println / printf notes.)

### 9.2 Input — Scanner (proper using and common pitfall)
- Scanner reads from stdin; always close it when done or use try-with-resources.
- Common pitfall: mixing `nextInt()` and `nextLine()` — `nextInt()` leaves newline in buffer.

```java
import java.util.Scanner;

try (Scanner input = new Scanner(System.in)) { // proper resource management
    System.out.print("Enter age: ");
    int age = input.nextInt();
    input.nextLine(); // consume leftover newline

    System.out.print("Enter name: ");
    String name = input.nextLine();

    System.out.printf("Name: %s, Age: %d%n", name, age);
}
// Example run (user input shown after prompt):
// Enter age: 25
// Enter name: Carl
// Output: Name: Carl, Age: 25
// Taglish: `try-with-resources` auto-closes the Scanner — magandang practice.
```

### 9.3 BufferedReader (efficient) — use try-with-resources and parse explicitly
```java
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
    System.out.print("Enter age: ");
    String rawAge = br.readLine();
    int age = Integer.parseInt(rawAge);
    System.out.println("Age is " + age); // Output: Age is <entered number>
} catch (IOException e) {
    e.printStackTrace();
}
```

---

## ✅ SECTION 10: EXCEPTION HANDLING (clear guidance)

(Keep try-catch-finally, multiple catches, common exceptions.)

Important: prefer specific exception types first, then general Exception last.

Example with explanation:
```java
try {
    int num = Integer.parseInt("abc");
} catch (NumberFormatException e) {
    System.out.println("Please enter a valid number"); // Output: Please enter a valid number
}
```

---

## ✅ SECTION 11: CLASSES & OBJECTS (OOP Basics)

(Keep class/object, constructor, `this`, encapsulation.)

Example with encapsulation and getters/setters (line-by-line, not spaghetti):
```java
public class BankAccount {
    private double balance; // encapsulated field

    // Constructor
    public BankAccount(double initial) {
        this.balance = initial;
    }

    // Method to deposit
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Method to withdraw
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }

    // Getter
    public double getBalance() {
        return this.balance;
    }
}

// Usage:
BankAccount acct = new BankAccount(100.0);
acct.deposit(50.0);
boolean success = acct.withdraw(30.0);
System.out.println(acct.getBalance()); // Output: 120.0
// Taglish: Ginagawa natin private ang balance para hindi basta-basta mabago mula sa labas — kontrolado sa methods.
```

---

## ✅ FINAL NOTES & TEACHING STYLE
- Keep examples short, focused, and with expected output comments so learners can immediately see what happens.
- Use Taglish sparingly to clarify common pitfalls (e.g., "buffer", "casting", "null") so Filipino learners can relate.
- Avoid spaghetti code by: breaking logic into small methods, using descriptive names, and preferring early returns.
- When reading user input, always validate and handle exceptions for robust programs.

If you'd like, I can:
- add more Switch examples (e.g., fall-through vs grouped cases),
- include common exercises with solutions, or
- split the document into separate files (cheatsheets + exercises) for cleaner structure.

---

