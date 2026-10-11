# 📚 COMPLETE JAVA FUNDAMENTALS CHECKLIST
## Everything You Need to Know as a Beginner

**Status: Study This Thoroughly Before Writing Any Code**

---

## ✅ SECTION 1: JAVA BASICS & SETUP

### 1.1 What is Java?
- [ ] Java is a programming language
- [ ] Java is Object-Oriented (OOP)
- [ ] Java runs on JVM (Java Virtual Machine)
- [ ] "Write Once, Run Anywhere" (WORA)
- [ ] Java is compiled then interpreted

### 1.2 Java Installation & Setup
- [ ] JDK (Java Development Kit) installed
- [ ] JRE (Java Runtime Environment) vs JDK difference
- [ ] JAVA_HOME environment variable set
- [ ] PATH variable includes Java bin folder
- [ ] Verify: `java -version` command works

### 1.3 Java Development Environment
- [ ] Text Editor (Notepad, VSCode) OR IDE (IntelliJ, Eclipse)
- [ ] How to compile: `javac FileName.java`
- [ ] How to run: `java FileName`
- [ ] Understanding .java files vs .class files
- [ ] Package naming convention (reverse domain)

### 1.4 Your First Program
- [ ] Understand class structure
- [ ] Understand main() method
- [ ] `public static void main(String[] args)`
- [ ] System.out.println() for output
- [ ] Semicolons end statements

---

## ✅ SECTION 2: VARIABLES & DATA TYPES

### 2.1 What Are Variables?
- [ ] Variables store data in memory
- [ ] Variable = container with name, type, value
- [ ] Naming conventions (camelCase for variables)
- [ ] Declaration vs Assignment
- [ ] Scope of variables (where they exist)

### 2.2 Primitive Data Types (8 types)

#### Integer Types (whole numbers, no decimals)
- [ ] **byte** - 8 bits (-128 to 127)
  ```java
  byte age = 25;
  ```
- [ ] **short** - 16 bits (-32,768 to 32,767)
  ```java
  short year = 2024;
  ```
- [ ] **int** - 32 bits (-2.1 billion to 2.1 billion) - **MOST COMMON**
  ```java
  int population = 1000000;
  ```
- [ ] **long** - 64 bits (very large numbers)
  ```java
  long bigNumber = 123456789L;  // L suffix required
  ```

#### Decimal Types (numbers with decimals)
- [ ] **float** - 32 bits (less precise)
  ```java
  float price = 19.99f;  // f suffix required
  ```
- [ ] **double** - 64 bits (more precise) - **MOST COMMON**
  ```java
  double salary = 50000.75;
  ```

#### Character Type
- [ ] **char** - Single character (16 bits)
  ```java
  char initial = 'C';  // Single quotes only!
  ```

#### Boolean Type
- [ ] **boolean** - true or false only (1 bit)
  ```java
  boolean isStudent = true;
  boolean isActive = false;
  ```

### 2.3 Type Casting
- [ ] **Widening (Automatic)**: byte → short → int → long → float → double
  ```java
  int num = 100;
  double decimal = num;  // Automatic conversion
  ```
- [ ] **Narrowing (Explicit)**: Must force conversion
  ```java
  double decimal = 100.5;
  int num = (int) decimal;  // Must cast explicitly
  ```
- [ ] Data loss can occur in narrowing
  ```java
  double x = 3.99;
  int y = (int) x;  // y = 3, decimal part lost!
  ```

### 2.4 Reference Data Types
- [ ] **String** - Text/words
  ```java
  String name = "Carl";
  String empty = "";
  ```
- [ ] **Arrays** - Multiple values of same type
  ```java
  int[] numbers = {1, 2, 3};
  ```
- [ ] **Objects** - Instance of a class
  ```java
  Car myCar = new Car();
  ```
- [ ] **null** - No value
  ```java
  String noValue = null;
  ```

### 2.5 Variable Declaration Examples
```java
// One variable
int age = 25;

// Multiple variables same type
int a = 1, b = 2, c = 3;

// Without initialization
int x;
x = 100;  // Later assignment

// Constants (never change)
final double PI = 3.14159;  // final keyword makes it constant
```

---

## ✅ SECTION 3: OPERATORS

### 3.1 Arithmetic Operators
- [ ] **Addition (+)**: `5 + 3 = 8`
  ```java
  int sum = 10 + 20;  // 30
  ```
- [ ] **Subtraction (-)**: `5 - 3 = 2`
  ```java
  int diff = 20 - 10;  // 10
  ```
- [ ] **Multiplication (*)**: `5 * 3 = 15`
  ```java
  int product = 5 * 4;  // 20
  ```
- [ ] **Division (/)**: `15 / 3 = 5`
  ```java
  int quotient = 20 / 4;  // 5
  double result = 20.0 / 4;  // 5.0
  ```
- [ ] **Modulo (%)**: Remainder after division
  ```java
  int remainder = 10 % 3;  // 1 (10 divided by 3 leaves 1)
  ```

### 3.2 Assignment Operators
- [ ] **= (assign)**: `x = 5;`
- [ ] **+= (add and assign)**: `x += 3;` means `x = x + 3;`
  ```java
  int x = 10;
  x += 5;  // x is now 15
  ```
- [ ] **-= (subtract and assign)**: `x -= 3;` means `x = x - 3;`
- [ ] **\*= (multiply and assign)**: `x *= 2;`
- [ ] **/= (divide and assign)**: `x /= 2;`
- [ ] **%= (modulo and assign)**: `x %= 5;`

### 3.3 Comparison Operators (return true/false)
- [ ] **== (equal to)**: `5 == 5` → true
  ```java
  if (age == 18) { }
  ```
- [ ] **!= (not equal to)**: `5 != 3` → true
  ```java
  if (name != "Admin") { }
  ```
- [ ] **> (greater than)**: `10 > 5` → true
- [ ] **< (less than)**: `3 < 5` → true
- [ ] **>= (greater than or equal)**: `5 >= 5` → true
- [ ] **<= (less than or equal)**: `3 <= 5` → true

### 3.4 Logical Operators
- [ ] **&& (AND)**: Both must be true
  ```java
  if (age >= 18 && hasLicense) {  // Both conditions true?
      System.out.println("Can drive");
  }
  ```
- [ ] **|| (OR)**: At least one must be true
  ```java
  if (isWeekend || isHoliday) {  // Either condition true?
      System.out.println("No work!");
  }
  ```
- [ ] **! (NOT)**: Reverses boolean
  ```java
  if (!isRaining) {  // If NOT raining
      System.out.println("Go outside");
  }
  ```

### 3.5 Increment/Decrement Operators
- [ ] **++ (increment)**: Add 1
  ```java
  int x = 5;
  x++;  // x is now 6
  ```
- [ ] **-- (decrement)**: Subtract 1
  ```java
  int y = 10;
  y--;  // y is now 9
  ```
- [ ] **Pre vs Post increment**
  ```java
  int a = 5;
  int b = a++;  // b = 5, then a = 6 (post)
  
  int c = 5;
  int d = ++c;  // c = 6, then d = 6 (pre)
  ```

---

## ✅ SECTION 4: CONTROL FLOW (IF-ELSE)

### 4.1 If Statement
- [ ] Executes code if condition is TRUE
```java
if (age >= 18) {
    System.out.println("You are an adult");
}
```

### 4.2 If-Else Statement
- [ ] If condition true → execute first block
- [ ] If condition false → execute else block
```java
if (score >= 70) {
    System.out.println("Pass");
} else {
    System.out.println("Fail");
}
```

### 4.3 If-Else If-Else (Multiple conditions)
- [ ] Check multiple conditions in order
```java
if (age < 13) {
    System.out.println("Child");
} else if (age < 18) {
    System.out.println("Teenager");
} else if (age < 65) {
    System.out.println("Adult");
} else {
    System.out.println("Senior");
}
```

### 4.4 Nested If
- [ ] If statement inside another if statement
```java
if (hasLicense) {
    if (age >= 18) {
        System.out.println("Can drive");
    }
}
```

### 4.5 Ternary Operator (Short if-else)
- [ ] Condition ? valueIfTrue : valueIfFalse
```java
String status = (age >= 18) ? "Adult" : "Minor";
int max = (a > b) ? a : b;  // Returns larger number
```

---

## ✅ SECTION 5: LOOPS

### 5.1 While Loop
- [ ] Repeats while condition is TRUE
- [ ] Check condition BEFORE executing
```java
int counter = 0;
while (counter < 5) {
    System.out.println(counter);
    counter++;  // Must increment or infinite loop!
}
// Output: 0 1 2 3 4
```

### 5.2 Do-While Loop
- [ ] Executes FIRST, then checks condition
- [ ] Always runs at least once
```java
int counter = 0;
do {
    System.out.println(counter);
    counter++;
} while (counter < 5);
// Runs at least once even if condition false initially
```

### 5.3 For Loop
- [ ] Most common loop
- [ ] Format: for (init; condition; increment)
```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// Output: 0 1 2 3 4

// Parts:
// i = 0         <- Initial value
// i < 5         <- Condition to continue
// i++           <- Increment after each loop
```

### 5.4 Enhanced For Loop (For-Each)
- [ ] Easier way to loop through arrays/collections
```java
String[] fruits = {"Apple", "Banana", "Orange"};
for (String fruit : fruits) {
    System.out.println(fruit);
}
// No need for index!
```

### 5.5 Break Statement
- [ ] Exit loop immediately
```java
for (int i = 0; i < 10; i++) {
    if (i == 5) {
        break;  // Exit loop when i = 5
    }
    System.out.println(i);
}
// Output: 0 1 2 3 4
```

### 5.6 Continue Statement
- [ ] Skip current iteration, go to next
```java
for (int i = 0; i < 5; i++) {
    if (i == 2) {
        continue;  // Skip when i = 2
    }
    System.out.println(i);
}
// Output: 0 1 3 4
```

### 5.7 Infinite Loop (AVOID!)
- [ ] Loop that never stops
```java
while (true) {
    System.out.println("This repeats forever!");
    // Need break to exit
}

for (int i = 0; ; i++) {  // No condition = infinite
    System.out.println(i);
}
```

---

## ✅ SECTION 6: ARRAYS

### 6.1 What is an Array?
- [ ] Collection of same data type
- [ ] Fixed size (size decided at creation)
- [ ] Indexed (start from 0)
- [ ] Stores multiple values

### 6.2 Array Declaration
```java
// Method 1: Declare then create
int[] numbers;
numbers = new int[5];  // Array of 5 integers

// Method 2: Declare and create together
int[] numbers = new int[5];

// Method 3: Declare, create, and initialize
int[] numbers = {10, 20, 30, 40, 50};

// Method 4: Any data type
String[] names = {"John", "Sarah", "Mike"};
double[] prices = {19.99, 29.99, 39.99};
```

### 6.3 Accessing Array Elements
- [ ] Use index (0-based)
```java
int[] numbers = {10, 20, 30, 40, 50};

int first = numbers[0];   // 10 (first element)
int third = numbers[2];   // 30
int last = numbers[4];    // 50 (last element)

// Change element
numbers[1] = 25;  // Change second element to 25
```

### 6.4 Array Length
- [ ] `.length` property
```java
int[] numbers = {10, 20, 30};
System.out.println(numbers.length);  // 3

// Use in loops
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
```

### 6.5 Common Array Operations
```java
int[] arr = {5, 2, 8, 1, 9};

// Find maximum
int max = arr[0];
for (int i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
        max = arr[i];
    }
}

// Find sum
int sum = 0;
for (int num : arr) {
    sum += num;
}

// Find average
double average = sum / arr.length;
```

### 6.6 Multi-dimensional Arrays
- [ ] Array of arrays (2D, 3D, etc)
```java
// 2D Array (rows and columns)
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

int value = matrix[1][2];  // Row 1, Column 2 = 6

// Access with nested loops
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.println(matrix[row][col]);
    }
}
```

---

## ✅ SECTION 7: STRINGS

### 7.1 String Basics
- [ ] Text data type (Reference type, not primitive)
- [ ] Immutable (cannot change once created)
- [ ] Use double quotes (not single quotes)
```java
String name = "John";         // Correct
String name = 'John';         // Wrong! Single quotes = char
String empty = "";            // Empty string
String noValue = null;        // No value (null)
```

### 7.2 String Creation
```java
// Method 1: String literal
String name = "John";

// Method 2: new keyword
String name = new String("John");

// Method 3: Concatenation
String fullName = "John" + " " + "Doe";
```

### 7.3 String Concatenation (Combining)
```java
String firstName = "John";
String lastName = "Doe";

// Method 1: + operator
String fullName = firstName + " " + lastName;

// Method 2: concat() method
String fullName = firstName.concat(" ").concat(lastName);

// Method 3: String format/interpolation
String fullName = String.format("%s %s", firstName, lastName);

// Method 4: with other types
String message = "Age: " + 25 + " years";  // "Age: 25 years"
```

### 7.4 Important String Methods

```java
String text = "Hello World";

// Length
int len = text.length();  // 11

// Character at index
char ch = text.charAt(0);  // 'H'

// Substring
String sub = text.substring(0, 5);  // "Hello"
String sub2 = text.substring(6);    // "World"

// Case conversion
String upper = text.toUpperCase();   // "HELLO WORLD"
String lower = text.toLowerCase();   // "hello world"

// Trimming
String padded = "  Hello  ";
String trimmed = padded.trim();     // "Hello"

// Replace
String replaced = text.replace("World", "Java");  // "Hello Java"

// Split
String csv = "John,25,Engineer";
String[] parts = csv.split(",");    // {"John", "25", "Engineer"}

// Contains
boolean has = text.contains("World");  // true

// Starts/Ends with
boolean starts = text.startsWith("Hello");  // true
boolean ends = text.endsWith("World");      // true

// Index of
int pos = text.indexOf("World");  // 6
int pos2 = text.indexOf("o");     // 4 (first occurrence)

// Equals (comparison)
String a = "Hello";
String b = "Hello";
boolean same = a.equals(b);           // true
boolean ignoreCase = a.equalsIgnoreCase("hello");  // true

// Compare (alphabetically)
int result = a.compareTo(b);  // 0 if equal
```

### 7.5 String Comparison
```java
String a = "Hello";
String b = "Hello";

// ❌ WRONG - compares memory address
if (a == b) { }

// ✅ CORRECT - compares content
if (a.equals(b)) { }

// ✅ CORRECT - ignores case
if (a.equalsIgnoreCase(b)) { }
```

### 7.6 String is Immutable
```java
String original = "Hello";
String modified = original.toUpperCase();  // "HELLO"

// original is still "Hello" (didn't change)
// modified is new string "HELLO"
```

---

## ✅ SECTION 8: METHODS

### 8.1 What is a Method?
- [ ] Reusable block of code
- [ ] Performs specific task
- [ ] Reduces code duplication
- [ ] Makes code organized and readable

### 8.2 Method Syntax
```java
accessModifier returnType methodName(parameters) {
    // Method body
    // Code to execute
    return value;  // If returnType not void
}

// Example:
public static int add(int a, int b) {
    int sum = a + b;
    return sum;
}
```

### 8.3 Method Components
- [ ] **Access Modifier**: `public`, `private`, `protected` (later)
- [ ] **Return Type**: `void`, `int`, `String`, etc.
- [ ] **Method Name**: camelCase
- [ ] **Parameters**: Input values (optional)
- [ ] **Method Body**: Code in curly braces
- [ ] **Return Statement**: Returns value (if not void)

### 8.4 Method Types

#### Type 1: No parameters, No return
```java
public static void greet() {
    System.out.println("Hello!");
}

greet();  // Call method
```

#### Type 2: With parameters, No return
```java
public static void greet(String name) {
    System.out.println("Hello, " + name);
}

greet("John");  // Call method
```

#### Type 3: No parameters, With return
```java
public static String getName() {
    return "John";
}

String name = getName();  // Call and store result
```

#### Type 4: With parameters, With return
```java
public static int add(int a, int b) {
    return a + b;
}

int result = add(5, 3);  // 8
```

### 8.5 Parameters vs Arguments
```java
// Definition - parameters
public static void display(String message) {
    //            ^^^^^^^^^^^^^^
    // "message" is parameter
}

// Call - arguments
display("Hello");
// "Hello" is argument
```

### 8.6 Method Overloading
- [ ] Same method name, different parameters
```java
public static int add(int a, int b) {
    return a + b;
}

public static double add(double a, double b) {
    return a + b;
}

public static String add(String a, String b) {
    return a + b;
}

int result1 = add(5, 3);          // Uses first method
double result2 = add(5.5, 3.3);   // Uses second method
String result3 = add("Hello", "World");  // Uses third method
```

### 8.7 Variable Scope
```java
public static void example() {
    int x = 10;  // Local variable - exists only in this method
    
    if (true) {
        int y = 20;  // Local to if block
        System.out.println(x);  // Can use x here
    }
    
    System.out.println(y);  // ERROR! y doesn't exist here
}
```

---

## ✅ SECTION 9: INPUT/OUTPUT

### 9.1 Output - System.out
- [ ] Display information to console
```java
// Print with newline
System.out.println("Hello");  // println = print line

// Print without newline
System.out.print("Hello");    // print = no newline
System.out.print(" World");
// Output: Hello World

// Print formatted output
System.out.printf("Name: %s, Age: %d%n", "John", 25);
// Output: Name: John, Age: 25
// %s = string, %d = integer, %n = newline
```

### 9.2 Input - Scanner Class
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);

// Read next integer
int age = input.nextInt();

// Read next double
double price = input.nextDouble();

// Read next line (text)
String name = input.nextLine();

// Read next word
String word = input.next();

// Close scanner when done
input.close();
```

### 9.3 Scanner vs BufferedReader
- [ ] **Scanner** - Easier, more methods (for numbers/words)
- [ ] **BufferedReader** - More efficient for large text

```java
// Scanner (Easier)
Scanner input = new Scanner(System.in);
int num = input.nextInt();
String text = input.nextLine();

// BufferedReader (More efficient)
BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
String text = input.readLine();
int num = Integer.parseInt(text);
```

### 9.4 Scanner Input Examples
```java
import java.util.Scanner;

Scanner input = new Scanner(System.in);

System.out.print("Enter age: ");
int age = input.nextInt();
input.nextLine();  // Clear buffer (important!)

System.out.print("Enter name: ");
String name = input.nextLine();

System.out.print("Enter price: ");
double price = input.nextDouble();

input.close();
```

### 9.5 BufferedReader Input Examples
```java
import java.io.*;

BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

try {
    System.out.print("Enter age: ");
    String rawAge = input.readLine();
    int age = Integer.parseInt(rawAge);
    
    System.out.print("Enter name: ");
    String name = input.readLine();
    
} catch (IOException e) {
    System.out.println("Error reading input");
}
```

### 9.6 Formatted Output with printf
```java
// %d = integer
System.out.printf("Number: %d%n", 25);

// %f = floating point
System.out.printf("Price: %.2f%n", 19.999);  // 19.99 (2 decimals)

// %s = string
System.out.printf("Name: %s%n", "John");

// %b = boolean
System.out.printf("Status: %b%n", true);

// Multiple values
System.out.printf("Name: %s, Age: %d, Price: %.2f%n", "John", 25, 19.99);
```

---

## ✅ SECTION 10: EXCEPTION HANDLING

### 10.1 What are Exceptions?
- [ ] Errors that happen during runtime
- [ ] Program stops if not handled
- [ ] Examples: dividing by zero, reading non-existent file, wrong input type

### 10.2 Try-Catch Block
```java
try {
    // Code that might cause error
    int num = Integer.parseInt("abc");  // Error! "abc" is not number
} catch (NumberFormatException e) {
    // Handle the error
    System.out.println("Please enter a valid number");
}
```

### 10.3 Try-Catch-Finally
```java
try {
    // Code that might error
    int result = 10 / 0;  // Error!
} catch (ArithmeticException e) {
    // Handle error
    System.out.println("Cannot divide by zero");
} finally {
    // Always runs (error or no error)
    System.out.println("Operation complete");
}
```

### 10.4 Multiple Catch Blocks
```java
try {
    String num = "abc";
    int x = Integer.parseInt(num);
    
    int[] arr = {1, 2, 3};
    int value = arr[10];  // Index out of bounds
    
} catch (NumberFormatException e) {
    System.out.println("Invalid number format");
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Array index out of range");
} catch (Exception e) {
    System.out.println("Unknown error occurred");
}
```

### 10.5 Common Exceptions
```java
// NumberFormatException
Integer.parseInt("abc");  // Error!

// ArrayIndexOutOfBoundsException
int[] arr = {1, 2};
int x = arr[5];  // Error! Only 0, 1 exist

// NullPointerException
String name = null;
int len = name.length();  // Error! null has no length

// ArithmeticException
int x = 10 / 0;  // Error! Division by zero

// IOException
BufferedReader input = new BufferedReader(...);
String line = input.readLine();  // Might throw IOException
```

### 10.6 Throws Keyword
```java
// Method declares it might throw exception
public static void readFile() throws IOException {
    BufferedReader input = new BufferedReader(...);
    String line = input.readLine();  // Doesn't need try-catch here
}

// Caller must handle it
public static void main(String[] args) {
    try {
        readFile();
    } catch (IOException e) {
        System.out.println("File error");
    }
}
```

---

## ✅ SECTION 11: CLASSES & OBJECTS (OOP Basics)

### 11.1 What is a Class?
- [ ] Blueprint for creating objects
- [ ] Contains data (variables) and actions (methods)
- [ ] Defines what an object should have

### 11.2 What is an Object?
- [ ] Instance of a class
- [ ] Real thing created from blueprint
- [ ] Has state (data) and behavior (methods)

### 11.3 Simple Class Example
```java
// Blueprint (Class)
public class Car {
    // Data (Variables)
    String color;
    String brand;
    int year;
    
    // Action (Method)
    void drive() {
        System.out.println("Car is driving");
    }
}

// Create Object (Instance)
Car myCar = new Car();
myCar.color = "Red";
myCar.brand = "Toyota";
myCar.year = 2024;
myCar.drive();  // Call method
```

### 11.4 Constructor
- [ ] Special method to initialize object
- [ ] Same name as class
- [ ] No return type
- [ ] Called when object is created

```java
public class Car {
    String color;
    String brand;
    
    // Constructor
    public Car(String color, String brand) {
        this.color = color;
        this.brand = brand;
    }
}

// Create object with values
Car myCar = new Car("Red", "Toyota");
```

### 11.5 This Keyword
- [ ] Refers to current object
- [ ] Distinguishes instance variables from parameters

```java
public class Person {
    String name;
    int age;
    
    public Person(String name, int age) {
        this.name = name;  // this.name = parameter name
        this.age = age;
    }
}
```

### 11.6 Encapsulation (Private/Public)
- [ ] Private: Only accessible within class
- [ ] Public: Accessible from anywhere

```java
public class BankAccount {
    private double balance;  // Cannot access directly
    
    // Public method to access private variable
    public double getBalance() {
        return balance;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
```

### 11.7 Getters and Setters
```java
public class Student {
    private String name;
    private int age;
    
    // Getter
    public String getName() {
        return name;
    }
    
    // Setter
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
        if (age > 0) {  // Validation
            this.age = age;
        }
    }
}

// Usage
Student student = new Student();
student.setName("John");
student.setAge(20);
System.out.println(student.getName());  // John
```

---

## ✅ SECTION 12: FINAL IMPORTANT CONCEPTS

### 12.1 Static Keyword
- [ ] Belongs to class, not object
- [ ] Shared by all objects
- [ ] Access with ClassName.variable or ClassName.method()

```java
public class Counter {
    static int count = 0;  // Shared by all objects
    
    public Counter() {
        count++;
    }
    
    public static void printCount() {
        System.out.println(count);
    }
}

Counter c1 = new Counter();  // count = 1
Counter c2 = new Counter();  // count = 2
Counter.printCount();        // 2 (all objects share)
```

### 12.2 Constant (Final Keyword)
- [ ] Value cannot change once set
- [ ] Usually UPPERCASE naming
- [ ] Use static final for class constants

```java
public class MathConstants {
    public static final double PI = 3.14159;
    public static final double E = 2.71828;
}

// Use it
double area = MathConstants.PI * radius * radius;
```

### 12.3 Comments
```java
// Single line comment

/* Multi-line
   comment */

/** Javadoc comment
    Used for documentation
    @param name description
    @return description
*/
```

### 12.4 Naming Conventions
```java
// Classes: PascalCase (first letter uppercase)
class StudentManagementSystem { }

// Methods: camelCase (first letter lowercase)
void calculateTotal() { }

// Variables: camelCase
String firstName;
int totalPrice;

// Constants: UPPER_SNAKE_CASE
static final double TAX_RATE = 0.08;
static final int MAX_ATTEMPTS = 3;
```

### 12.5 Package Organization
```java
// At top of file
package com.example.app;  // Package name

// Then imports
import java.util.Scanner;
import java.io.*;

// Then class
public class Main { }
```

---

## 📊 QUICK REFERENCE TABLE

| Concept | Example | Purpose |
|---------|---------|---------|
| **Variable** | `int age = 25;` | Store data |
| **Operator** | `age > 18` | Perform operations |
| **If-Else** | `if (age > 18) { }` | Make decisions |
| **Loop** | `for (int i=0; i<5; i++)` | Repeat code |
| **Array** | `int[] nums = {1,2,3};` | Store multiple values |
| **String** | `String name = "John";` | Store text |
| **Method** | `void greet() { }` | Reusable code block |
| **Class** | `class Car { }` | Blueprint |
| **Object** | `Car myCar = new Car();` | Instance of class |
| **Try-Catch** | `try { } catch { }` | Handle errors |

---

## 🎯 STUDY STRATEGY

1. **Read** entire section
2. **Write** code examples yourself (don't copy-paste)
3. **Run** code and see output
4. **Modify** code and experiment
5. **Repeat** until comfortable

---

## ✅ PRACTICE EXERCISES FOR EACH SECTION

### After Section 2 (Variables)
- [ ] Create variables of each data type
- [ ] Try casting between types
- [ ] See what happens with overflow

### After Section 3 (Operators)
- [ ] Calculate complex expressions
- [ ] Compare different data types
- [ ] Use logical operators in conditions

### After Section 4 (If-Else)
- [ ] Create programs with multiple conditions
- [ ] Use nested if statements
- [ ] Try ternary operator

### After Section 5 (Loops)
- [ ] Print patterns with loops
- [ ] Calculate sum and average of numbers
- [ ] Find max/min in array

### After Section 6 (Arrays)
- [ ] Reverse an array
- [ ] Find duplicate elements
- [ ] Sort array elements

### After Section 7 (Strings)
- [ ] Manipulate strings (reverse, uppercase, etc)
- [ ] Validate input (email, phone)
- [ ] Extract information from strings

### After Section 8 (Methods)
- [ ] Create utility methods
- [ ] Practice method overloading
- [ ] Understand parameter passing

### After Section 9 (Input/Output)
- [ ] Create interactive programs
- [ ] Handle multiple inputs
- [ ] Format output nicely

### After Section 10 (Exception Handling)
- [ ] Handle different exceptions
- [ ] Validate user input properly
- [ ] Prevent program crashes

### After Section 11 (Classes/Objects)
- [ ] Create simple classes
- [ ] Use constructors
- [ ] Practice encapsulation

---

## 📝 NEXT STEPS

1. ✅ **Mark sections** you already know
2. ✅ **Study sections** you don't know
3. ✅ **Code examples** for each concept
4. ✅ **Combine concepts** (e.g., loops + arrays, methods + classes)
5. ✅ **Build small projects** using multiple concepts

---

**This is the COMPLETE foundation. Master these, and you're ready for professional Java!**

**Questions? Need examples for specific topics?**
