# Java Super Fundamentals — Complete README

A **single-file, all-in-one Java fundamentals handbook** for learning the language by writing real programs. It is designed for beginner projects like menu-driven console applications, input-validation tools, text/string experiments, arrays, utility methods, student records, and early GUI applications.

**Recommended version:** JDK 11 or newer. Modern switch expressions require Java 14 or newer; a Java 11-compatible classic `switch` version is included as well.

Inspired by the hands-on exercises in [CarlLight67/JavaGroupProject](https://github.com/CarlLight67/JavaGroupProject), especially the [Java training-lab source](https://github.com/CarlLight67/JavaGroupProject/blob/main/THE_OMEGA/src/Light_Yagami_Project/TRAINING_LAB/String_methods.java).

> **How to study:** Read one topic, type a small example yourself, predict the output, run it, change the values, and test invalid input. Do not only copy code—make sure you can explain why each important line exists.

## Table of contents

- [Quick start](#quick-start)
- [1. The basic shape of a Java program](#1-the-basic-shape-of-a-java-program)
- [2. Naming and a clean project layout](#2-naming-and-a-clean-project-layout)
- [3. Variables and data types](#3-variables-and-data-types)
- [4. Operators](#4-operators)
- [5. if, else if, else, and switch](#5-if-else-if-else-and-switch)
- [6. Loops](#6-loops-while-do-while-for-and-enhanced-for)
- [7. Methods and keywords](#7-methods-public-static-void-parameters-and-return)
- [8. Strings and String methods](#8-strings-and-string-methods)
- [9. Arrays and array utility methods](#9-arrays-and-array-utility-methods)
- [10. User input: Scanner, BufferedReader, and JOptionPane](#10-user-input-scanner-bufferedreader-and-joptionpane)
- [11. Input validation](#11-input-validation-the-reusable-pattern)
- [12. Exception handling](#12-exception-handling-try-catch-finally-throw-and-throws)
- [13. Classes and objects](#13-classes-objects-constructors-and-encapsulation)
- [14. Access modifiers and keywords](#14-access-modifiers-and-common-keywords-at-a-glance)
- [15. Handy standard-library methods](#15-handy-standard-library-methods)
- [16. Collections after arrays](#16-collections-after-arrays)
- [17. Files and text I/O](#17-files-and-text-io-a-preview)
- [18. Clean console menus](#18-building-a-console-menu-with-clean-structure)
- [19. Common mistakes and fixes](#19-common-mistakes-and-fixes)
- [20. Debugging routine](#20-a-simple-debugging-routine)
- [21. Practice projects](#21-practice-projects-ordered-from-easier-to-harder)
- [22. Quick reference](#22-quick-reference)
- [23. Suggested learning roadmap](#23-suggested-learning-roadmap)
- [24. Practice checklist](#24-practice-checklist)
- [25. JOptionPane complete practical reference](#25-joptionpane-complete-practical-reference)
- [26. Logic design and problem-solving process](#26-logic-design-and-problem-solving-process)
- [27. Core algorithm patterns every beginner should know](#27-core-algorithm-patterns-every-beginner-should-know)
- [28. Program structure and clean architecture](#28-program-structure-and-clean-architecture)
- [29. Secure programmer mindset](#29-secure-programmer-mindset)
- [30. Social engineering and manipulation defense](#30-social-engineering-and-manipulation-defense)
- [31. Secure Java coding patterns](#31-secure-java-coding-patterns)
- [32. A secure development process](#32-a-secure-development-process)
- [33. Testing and security review checklists](#33-testing-and-security-review-checklists)
- [34. Logic and security practice projects](#34-logic-and-security-practice-projects)
- [Official references](#official-reference-documentation)

## Quick start

### 1. Check that Java is installed

Open a terminal or command prompt and run:

```bash
java -version
javac -version
```

`java` runs a compiled Java application. `javac` compiles `.java` source files. If either command is not found, install a JDK and configure your environment before continuing.

### 2. Create and run your first program

Save this as **`HelloJava.java`**. The public class name and filename must match exactly.

```java
public class HelloJava {
    public static void main(String[] args) {
        String name = "Java learner";
        int practiceHours = 1;

        System.out.println("Hello, " + name + "!");
        System.out.printf("Today's practice: %d hour(s).%n", practiceHours);
    }
}
```

Compile and run it from the directory containing the file:

```bash
javac HelloJava.java
java HelloJava
```

In IntelliJ IDEA, Eclipse, or VS Code with the Java extensions, you can also run the class using the IDE's Run command.

### 3. A recommended workflow

1. Learn variables and operators before adding control flow.
2. Learn conditions and loops before writing a menu.
3. Learn String methods and arrays before storing many records.
4. Move repeated code into methods.
5. Use classes to represent things such as students, inventory items, or tickets.
6. Add input validation and specific exception handling.
7. Test both valid and invalid inputs.
8. Split a growing program into classes with clear responsibilities.

### 4. Conventions used throughout this README

- **Class names:** `PascalCase`, for example `StringMethodsLab`.
- **Method and variable names:** `camelCase`, for example `readStaffCount()` and `staffCount`.
- **Constants:** `UPPER_SNAKE_CASE`, for example `MAX_CAPACITY`.
- **Packages:** lowercase, for example `com.carl.javafundamentals`.
- **Indentation:** use consistent four-space indentation.
- **Validation:** reject invalid data clearly and reprompt where appropriate.
- **Exceptions:** catch the specific failure you expect instead of catching every exception indiscriminately.

---

# 1. The basic shape of a Java program

```java
package com.carl.training; // optional, but a project normally uses packages

public class HelloJava {
    public static void main(String[] args) {
        System.out.println("Hello, Java!");
    }
}
```

- `package` groups related classes. Package names are conventionally lowercase.
- `public` is an access modifier. It makes this class accessible from other packages.
- `class` declares a class, which is a blueprint for objects and a container for methods and fields.
- `HelloJava` is the class name. If the class is `public`, the filename must be `HelloJava.java`.
- `main` is the entry point used to start this classic Java application.
- `static` lets the JVM call `main` without first creating a `HelloJava` object.
- `void` says the method does not return a value.
- `String[] args` receives command-line arguments.
- `System.out.println(...)` prints a value and then starts a new line.
- `{ }` define a block; `;` ends most statements.

### Output methods

```java
System.out.print("Same line ");
System.out.print("continues\n");
System.out.println("New line");
System.out.printf("Name: %s | Age: %d | Score: %.2f%n", "Carl", 18, 91.25);
```

Useful format tokens: `%s` string, `%d` integer, `%f` floating-point number, `%.2f` two decimal places, `%b` boolean, and `%n` platform-appropriate newline. Make sure the values you pass match the format tokens.

### Compile and run

```bash
javac HelloJava.java
java HelloJava
```

`javac` compiles source code; `java` launches a compiled class. In an IDE, the Run button usually handles these steps.

---

# 2. Naming and a clean project layout

Consistent names make code easier to scan and maintain.

| Element | Convention | Example |
|---|---|---|
| Class / interface | `PascalCase` | `StringMethodsLab` |
| Method | `camelCase` | `readStaffCount()` |
| Variable / parameter | `camelCase` | `staffCount` |
| Constant | `UPPER_SNAKE_CASE` | `MAX_CAPACITY` |
| Package | lowercase | `com.carl.javafundamentals` |
| Source filename | public class name | `Student.java` for `public class Student` |

Recommended separation for a small project:

```text
src/main/java/com/carl/javafundamentals/
    Main.java               // application entry point and menu
    ConsoleInput.java       // reusable input helpers
    Student.java            // one model/class
    StudentService.java     // business rules or operations, when needed
    StringMethodsLab.java   // focused demonstrations
```

Avoid naming every file `Main.java`, making one class do everything, or placing every line inside `main`. A useful rule is **one class, one clear responsibility**.

## Comments

```java
// Short explanation for the next line or block
int maxCapacity = 50;

/* Use a block comment when an explanation
   needs more than one line. */
```

Comments should explain intent or a non-obvious decision. Do not write a comment that merely repeats an obvious line.

---

# 3. Variables and data types

A variable is a named location for a value. Declare the type before using the variable.

```java
int age = 18;             // declaration + initialization
int score;                // declaration only
score = 92;               // assignment
final double TAX_RATE = 0.12;
```

`final` means the variable can be assigned only once. A `final` variable reference cannot be reassigned, although the object it refers to may still be mutable.

## The eight primitive types

| Type | Holds | Example | Common use |
|---|---|---|---|
| `byte` | small signed whole numbers | `byte level = 3;` | compact low-range values |
| `short` | short-range whole numbers | `short year = 2026;` | uncommon in everyday application code |
| `int` | 32-bit signed whole numbers | `int count = 50;` | default choice for whole-number counts |
| `long` | 64-bit signed whole numbers | `long views = 9_000_000_000L;` | very large whole numbers; suffix `L` |
| `float` | 32-bit binary floating point | `float ratio = 0.5f;` | lower precision; suffix `f` |
| `double` | 64-bit binary floating point | `double price = 19.95;` | common decimal calculations |
| `char` | one UTF-16 code unit | `char grade = 'A';` | a single character; single quotes |
| `boolean` | `true` or `false` | `boolean passed = true;` | conditions and states |

`String`, arrays, and objects are reference types, not primitive types.

```java
String name = "Carl";          // double quotes for String
char initial = 'C';            // single quotes for char
int[] numbers = {2, 4, 6};
Student student = new Student("IT-01", "Carl", 85);
```

### Declaration, initialization, and scope

```java
int x;       // declared, not initialized
x = 10;      // initialized later

if (x > 0) {
    int y = 20; // y exists only inside this block
    System.out.println(y);
}
// System.out.println(y); // compile error: y is out of scope
```

Local variables must be initialized before use. Instance fields and static fields receive default values, but explicitly initializing fields is usually clearer.

### Type conversion / casting

```java
int whole = 12;
double decimal = whole;       // widening: int -> double is automatic

double exact = 7.9;
int truncated = (int) exact;  // narrowing: becomes 7; fractional part is lost

String raw = "42";
int parsed = Integer.parseInt(raw);
double parsedDecimal = Double.parseDouble("19.95");
String text = String.valueOf(parsed);
```

Casting `double` to `int` truncates toward zero; it does not round. Use `Math.round()` when rounding is the intended operation. Parsing text can throw `NumberFormatException` if the text is not a valid number.

**Money tip:** binary floating-point values like `double` cannot represent every decimal fraction exactly. For serious money calculations use `BigDecimal` created from text, or store whole cents as an integer when appropriate. For basic exercises, `double` is fine if its limitations are understood.

### `null`

`null` means a reference currently points to no object.

```java
String nickname = null;
// nickname.length(); // NullPointerException

if (nickname != null) {
    System.out.println(nickname.length());
}
```

An empty string `""` is not the same as `null`; whitespace-only text like `"   "` is also different. Use `isEmpty()` or, in Java 11+, `isBlank()` when those distinctions matter.

---

# 4. Operators

## Arithmetic

| Operator | Meaning | Example |
|---|---|---|
| `+` | add or concatenate strings | `5 + 3`, `"Hi " + name` |
| `-` | subtract | `10 - 4` |
| `*` | multiply | `6 * 7` |
| `/` | divide | `10 / 4` with integer operands produces `2` |
| `%` | remainder | `10 % 4` produces `2` |

```java
int result = 10 / 4;           // 2, integer division
 double precise = 10.0 / 4;    // 2.5
boolean isEven = result % 2 == 0;
```

## Comparison

`==`, `!=`, `>`, `<`, `>=`, `<=` produce a boolean result.

Use `==` to compare primitive values. For string content, use `.equals()` or `.equalsIgnoreCase()`—not `==`.

## Logical operators

```java
if (age >= 18 && hasId) { /* both must be true */ }
if (isWeekend || isHoliday) { /* either may be true */ }
if (!isLocked) { /* reverse a boolean */ }
```

`&&` and `||` short-circuit: Java may skip the right side when the left side already determines the result. This is often useful for null checks:

```java
if (name != null && !name.isBlank()) {
    System.out.println(name.strip());
}
```

## Assignment and increment

```java
count += 1; // count = count + 1
count -= 2;
count *= 3;
count++;
count--;
```

`x++` returns the old value in an expression and then increments; `++x` increments first. Use standalone `count++` in ordinary loops to avoid confusion.

## Ternary operator

```java
String status = score >= 75 ? "Passed" : "Failed";
```

Use it for small choices. If the condition is complicated or the alternatives are long, write `if/else` for readability.

---

# 5. `if`, `else if`, `else`, and `switch`

## `if/else`

```java
if (score >= 90) {
    System.out.println("Excellent");
} else if (score >= 75) {
    System.out.println("Passed");
} else {
    System.out.println("Needs improvement");
}
```

Conditions are checked from top to bottom. Order matters: put more specific or higher thresholds first when necessary.

### Guard clauses

A guard clause handles an invalid or special case early, reducing nested blocks.

```java
if (name == null || name.isBlank()) {
    System.out.println("Name is required.");
    return;
}

System.out.println("Hello, " + name.strip());
```

`return` exits the current method. A `return;` is allowed in a `void` method; a method with a return type must return a compatible value on every required path.

## Classic `switch` — compatible with Java 11

```java
int choice = 2;
switch (choice) {
    case 1:
        System.out.println("Create");
        break;
    case 2:
        System.out.println("Display");
        break;
    case 3:
        System.out.println("Update");
        break;
    default:
        System.out.println("Unknown choice");
}
```

In a classic `switch` statement, `break` prevents execution from falling through into the next case. `default` handles unmatched values. Use `switch` for discrete options such as a menu selection; use `if/else` for ranges such as `score >= 75`.

## Modern switch expressions — Java 14+

Newer Java versions support switch expressions that produce a value:

```java
int option = 2;
String action = switch (option) {
    case 1 -> "Create";
    case 2 -> "Display";
    case 3 -> "Update";
    default -> "Unknown choice";
};
System.out.println(action);
```

This syntax is **not available on JDK 11**. Use the classic switch statement if you need JDK 11 compatibility.

---

# 6. Loops: `while`, `do-while`, `for`, and enhanced `for`

## `while`

Use when the number of repetitions is unknown or depends on a condition.

```java
int remaining = 3;
while (remaining > 0) {
    System.out.println(remaining);
    remaining--;
}
```

The condition is checked **before** the body. If it is initially false, the body runs zero times.

## `do-while`

```java
int choice;
do {
    System.out.println("1. Continue");
    System.out.println("0. Exit");
    choice = ConsoleInput.readInt(input, "Choose: ");
} while (choice != 0);
```

The body runs at least once because the condition is checked afterward. This is useful for menus that must be displayed before the first choice.

## `for`

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Index: " + i);
}
```

Parts: initialization (`int i = 0`), continuation condition (`i < 5`), and update (`i++`). The loop prints indexes `0` through `4`, not `5`.

## Enhanced `for` / for-each

```java
String[] names = {"Carl", "Light", "L"};
for (String name : names) {
    System.out.println(name);
}
```

Use this when you need every value but do not need the index. Use a classic `for` when you need an index or want to modify a specific array element.

## `break` and `continue`

- `break` exits the nearest loop or switch.
- `continue` skips the rest of the current loop iteration and starts the next iteration.

Avoid confusing control flow. For input validation, it is usually clearer to print a helpful error message, then `continue` to the top of the validation loop.

## Common loop bug: infinite loop

```java
int count = 0;
while (count < 5) {
    System.out.println(count);
    count++; // progress toward making the condition false
}
```

Always identify what changes inside a loop and how it eventually ends. A `while (true)` loop can be valid for a menu, but provide a clear exit path such as `break` or a boolean flag.

---

# 7. Methods: `public`, `static`, `void`, parameters, and `return`

A method names a reusable task. Good methods are small, focused, and named after an action or result.

## General form

```java
accessModifier staticOrInstance returnType methodName(parameters) {
    // body
    return value; // required when the return type is not void
}
```

## Four useful method shapes

```java
// 1. No parameters, no returned value
public static void printWelcome() {
    System.out.println("Welcome!");
}

// 2. Parameters, no returned value
public static void greet(String name) {
    System.out.println("Hello, " + name);
}

// 3. No parameters, returns a value
public static String getAppName() {
    return "Java Fundamentals Lab";
}

// 4. Parameters and a returned value
public static int add(int first, int second) {
    return first + second;
}
```

Call them like this:

```java
printWelcome();
greet("Carl");
String appName = getAppName();
int sum = add(5, 3);
```

### Parameters vs arguments

- A **parameter** is the variable in the method definition: `String name`.
- An **argument** is the value passed when calling it: `greet("Carl")` passes `"Carl"`.

### What `public`, `private`, `protected`, and package-private mean

| Modifier | Basic access |
|---|---|
| `public` | accessible wherever the class/member is otherwise accessible |
| `private` | only inside the declaring class |
| `protected` | same package, plus subclasses under Java's protected-access rules |
| no modifier (package-private) | accessible within the same package |

Use the narrowest access that works. Keep fields `private` in most model classes and expose needed behavior through public methods.

### What `static` means

`static` means the member belongs to the class itself, not to a particular object.

```java
public class MathTools {
    public static int square(int number) {
        return number * number;
    }

    public static void main(String[] args) {
        int result = MathTools.square(5); // no MathTools object required
        System.out.println(result);       // 25
    }
}
```

A non-static method or field belongs to an object instance. A static method cannot directly use an instance field unless it has an object reference. `main` is static because the JVM must start the program without constructing your application class first.

### What `void` means

`void` means the method does not return a value to the caller. It can still print, change an object's state, or perform another action. Use a return type such as `int`, `boolean`, or `String` when the caller needs a result.

### Method overloading

Methods may share a name when their parameter lists differ.

```java
public static int add(int a, int b) {
    return a + b;
}

public static double add(double a, double b) {
    return a + b;
}
```

Java chooses the matching overload based on the argument types. A different return type alone does **not** create a valid overload.

### Scope and local variables

A local variable exists only in the block where it is declared. Keep variables near the code that needs them. Do not create global mutable fields merely to avoid passing a parameter into a method; passing needed data explicitly often makes methods easier to understand and test.

---

# 8. Strings and String methods

A `String` stores text and is **immutable**: methods such as `toUpperCase()` return a new string rather than changing the original.

```java
String original = "  Hello Java  ";
String cleaned = original.strip();
String uppercase = cleaned.toUpperCase();
System.out.println(original);  // still has spaces and original casing
System.out.println(cleaned);   // Hello Java
System.out.println(uppercase); // HELLO JAVA
```

## Common String methods

| Method | Purpose | Example / note |
|---|---|---|
| `length()` | number of UTF-16 code units | `text.length()` |
| `isEmpty()` | length is zero | `"".isEmpty()` is `true` |
| `isBlank()` | empty or only whitespace (Java 11+) | `"   ".isBlank()` is `true` |
| `charAt(i)` | character at index `i` | first index is `0` |
| `substring(begin)` | from `begin` to the end | `text.substring(3)` |
| `substring(begin, end)` | `begin` inclusive, `end` exclusive | `"Hello".substring(0, 2)` -> `"He"` |
| `contains(part)` | includes a sequence | case-sensitive |
| `startsWith(prefix)` | starts with a prefix | case-sensitive |
| `endsWith(suffix)` | ends with a suffix | case-sensitive |
| `indexOf(part)` | first matching index | `-1` if not found |
| `lastIndexOf(part)` | last matching index | `-1` if not found |
| `equals(other)` | exact content comparison | null-safe if constant is first: `"yes".equals(value)` |
| `equalsIgnoreCase(other)` | content comparison ignoring case | useful for case-insensitive choices |
| `compareTo(other)` | lexicographic comparison | `0` means equal; negative/positive indicate order |
| `toUpperCase()` / `toLowerCase()` | case conversion | may be locale-sensitive |
| `trim()` | removes older/basic leading/trailing whitespace | does not remove all Unicode whitespace |
| `strip()` | Unicode-aware leading/trailing whitespace removal | Java 11+ |
| `replace(old, new)` | literal replacement | does not interpret regex |
| `replaceAll(regex, replacement)` | regex-based replacement | regex symbols have special meaning |
| `split(regex)` | splits into a string array | delimiter is a regular expression |
| `toCharArray()` | returns a `char[]` copy | for character-level exercises |

Example:

```java
String text = "Java is useful";
System.out.println(text.length());              // 14
System.out.println(text.contains("useful"));   // true
System.out.println(text.indexOf("is"));        // 5
System.out.println(text.substring(0, 4));       // Java
System.out.println(text.replace("useful", "powerful"));
String[] words = text.split(" ");
```

**Index safety:** `charAt(i)` and `substring(...)` throw `StringIndexOutOfBoundsException` when indexes are invalid. Check `length()` before indexing.

## `==` vs `.equals()`

```java
String first = new String("Light");
String second = new String("Light");

System.out.println(first == second);       // false: compares object references here
System.out.println(first.equals(second));  // true: compares text content
```

Use `.equals()` for String content. For a case-insensitive response like `yes`, use `"yes".equalsIgnoreCase(answer.strip())`.

## Concatenation and `StringBuilder`

```java
String fullName = firstName + " " + lastName;
String line = String.format("Name: %s, score: %.1f", fullName, score);
String joined = String.join(", ", "HTML", "CSS", "JavaScript");
```

For many repeated modifications inside a loop, `StringBuilder` is more efficient and expressive than repeatedly creating new strings:

```java
StringBuilder output = new StringBuilder();
for (int i = 1; i <= 3; i++) {
    output.append("Item ").append(i).append(System.lineSeparator());
}
System.out.println(output);
```

### `replace()` vs `replaceAll()`

`replace(".", "!")` replaces literal periods. `replaceAll(".", "!")` treats `.` as a regex wildcard and can replace every character. Use `replaceAll` only when regular-expression matching is intended.

### Locale tip

For programmatic normalization, prefer `text.toLowerCase(Locale.ROOT)` rather than assuming every user's language uses the same casing rules. Display text can follow the user's locale; internal comparisons should be deliberate.

---

# 9. Arrays and array utility methods

An array stores a fixed number of values of one element type. Its length cannot grow after creation.

```java
int[] numbers = {10, 20, 30};
System.out.println(numbers[0]); // 10
numbers[1] = 25;
System.out.println(numbers.length); // 3
```

Indexes start at `0`; a length-3 array uses indexes `0`, `1`, and `2`. Accessing an invalid index throws `ArrayIndexOutOfBoundsException`.

## Declaration and creation

```java
int[] scores = new int[5];       // 5 slots, each initially 0
String[] names = new String[3];  // 3 slots, initially null
int[] values = {4, 8, 12};
```

Creating `new String[count]` reserves array slots; it does **not** automatically read names into them. Assign values explicitly.

```java
String[] names = new String[2];
names[0] = "Carl";
names[1] = "Alex";
```

## Traversing arrays

```java
int[] values = {4, 8, 12};

// When you need an index
for (int i = 0; i < values.length; i++) {
    System.out.println("Index " + i + ": " + values[i]);
}

// When you only need values
for (int value : values) {
    System.out.println(value);
}
```

## `java.util.Arrays` essentials

Add `import java.util.Arrays;`.

```java
int[] scores = {88, 65, 92, 74};
System.out.println(Arrays.toString(scores));

int[] copy = Arrays.copyOf(scores, scores.length);
Arrays.sort(copy);
System.out.println(Arrays.toString(copy));

int index = Arrays.binarySearch(copy, 88); // only search a sorted array
boolean same = Arrays.equals(scores, copy); // content + order must match
Arrays.fill(copy, 0);                       // set every element to zero

int[][] grid = {{1, 2}, {3, 4}};
System.out.println(Arrays.deepToString(grid));
```

| Method | Purpose | Important detail |
|---|---|---|
| `Arrays.toString(array)` | readable display | does not sort the array |
| `Arrays.deepToString(array)` | displays nested arrays | useful for 2D arrays |
| `Arrays.sort(array)` | sorts in place | changes the passed array |
| `Arrays.binarySearch(array, key)` | searches a sorted array | sort first; a negative result means not found |
| `Arrays.equals(a, b)` | compares array contents | order matters |
| `Arrays.copyOf(a, length)` | copies to a new array | may truncate or pad with default values |
| `Arrays.fill(array, value)` | fills all slots | changes the array |

`Arrays.binarySearch()` should not be used on an unsorted array if you expect a reliable search result.

## Sum, average, maximum, and minimum patterns

```java
int[] scores = {80, 90, 75};
int sum = 0;
int max = scores[0];
int min = scores[0];

for (int score : scores) {
    sum += score;
    if (score > max) max = score;
    if (score < min) min = score;
}

double average = (double) sum / scores.length;
System.out.printf("Average: %.2f%n", average);
```

This code assumes the array has at least one element. Before using `scores[0]` or dividing by `scores.length`, check that `scores.length > 0` when the length may be zero.

## 2D arrays

```java
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6}
};

System.out.println(matrix[1][2]); // 6
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
    }
    System.out.println();
}
```

A two-dimensional array is an array of arrays. Rows can technically have different lengths, so `matrix[row].length` is safer than assuming every row has the same length.

## When an array is not enough: `ArrayList`

Arrays have a fixed size. If you need a resizable collection, use `ArrayList`.

```java
import java.util.ArrayList;
import java.util.List;

List<String> tasks = new ArrayList<>();
tasks.add("Study strings");
tasks.add("Practice arrays");
System.out.println(tasks.get(0));
tasks.remove("Study strings");
System.out.println(tasks.size());
```

Use wrapper types with generic collections: `List<Integer>`, not `List<int>`. `int` is primitive; `Integer` is its wrapper type.

---

# 10. User input: `Scanner`, `BufferedReader`, and `JOptionPane`

These tools serve different situations. Pick one approach for each input flow rather than mixing them indiscriminately.

## Quick comparison

| Tool | Best for | Reads | Things to remember |
|---|---|---|---|
| `Scanner` | beginner console programs and token parsing | tokens, lines, numbers | `nextInt()` followed by `nextLine()` can surprise you; input validation still matters |
| `BufferedReader` | efficient line-oriented input and text streams | full lines as `String` | parsing numbers is your responsibility; `readLine()` can throw `IOException` |
| `JOptionPane` | simple Swing dialog-based input/output | text dialog values | returned input is a `String`; Cancel/close commonly returns `null`; needs a graphical environment |

### A. `Scanner`

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Full name: ");
            String name = input.nextLine();

            System.out.print("Age: ");
            String rawAge = input.nextLine().trim();
            int age;
            try {
                age = Integer.parseInt(rawAge);
            } catch (NumberFormatException e) {
                System.out.println("Enter age as a whole number.");
                return;
            }

            System.out.println("Hello " + name + "; next year you will be " + (age + 1) + ".");
        }
    }
}
```

Using `nextLine()` then parsing the number gives consistent line-based input and makes it easier to validate. `Scanner` also supports `nextInt()`, `nextDouble()`, `next()`, and other parsing methods. These are useful, but understand the token/line behavior before mixing them.

**The famous `nextInt()` / `nextLine()` issue:** `nextInt()` consumes the digits but usually leaves the line separator. The next `nextLine()` consumes the remainder of that line, which may look like it skipped the user's name.

```java
int age = input.nextInt();
input.nextLine(); // consume the rest of the numeric line
String name = input.nextLine();
```

That extra `nextLine()` is a common fix. An even more consistent approach is to read every field with `nextLine()` and then parse the values you need.

**Do not close a shared Scanner too early.** Closing a `Scanner` wrapping `System.in` also closes the underlying input stream. In a small standalone program, try-with-resources is fine. In a larger app, keep one shared input object and close it only when the whole input flow is finished.

### B. `BufferedReader`

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class BufferedReaderExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in, StandardCharsets.UTF_8))) {
            System.out.print("Enter capacity (1-50): ");
            String raw = reader.readLine();
            if (raw == null) {
                System.out.println("No input received.");
                return;
            }

            int capacity;
            try {
                capacity = Integer.parseInt(raw.strip());
            } catch (NumberFormatException e) {
                System.out.println("Use digits, such as 25.");
                return;
            }

            if (capacity < 1 || capacity > 50) {
                System.out.println("Capacity must be between 1 and 50.");
                return;
            }

            String[] people = new String[capacity];
            System.out.println("Array capacity: " + people.length);
        } catch (IOException e) {
            System.err.println("Input error: " + e.getMessage());
        }
    }
}
```

`BufferedReader.readLine()` returns a line of text or `null` if the stream has reached its end. It does not automatically parse text into an `int`. `Integer.parseInt()` can throw `NumberFormatException`, while `readLine()` can throw `IOException`.

When reading files, `BufferedReader` is also useful. Use try-with-resources so the file handle closes even if an exception happens.

### C. `JOptionPane`

```java
import javax.swing.JOptionPane;

public class DialogExample {
    public static void main(String[] args) {
        String rawAge = JOptionPane.showInputDialog(null, "Enter your age:");
        if (rawAge == null) { // user cancelled or closed the dialog
            return;
        }

        try {
            int age = Integer.parseInt(rawAge.strip());
            JOptionPane.showMessageDialog(null, "Next year: " + (age + 1));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Enter a valid whole number.",
                    "Invalid input", JOptionPane.ERROR_MESSAGE);
        }
    }
}
```

Common methods include `showInputDialog`, `showMessageDialog`, `showConfirmDialog`, and `showOptionDialog`. Even if you name a variable `int age`, a dialog does not return an integer directly: parse the returned `String`. Always consider cancellation (`null`).

### Critical input rule

**Do not casually mix `Scanner` and `BufferedReader` over the same `System.in` stream in the same application.** Both can buffer input, so one can read ahead and make the other's input appear to disappear. Choose one console input strategy. `JOptionPane` is a separate graphical interaction, not another reader for `System.in`.

---

# 11. Input validation: the reusable pattern

Suppose a user must enter a number from `1` to `50`. There are two separate problems:

1. Is the input text a valid integer?
2. Is that integer inside the allowed range?

```java
int capacity;
while (true) {
    System.out.print("Enter capacity (1-50): ");
    String raw = input.nextLine().trim();

    try {
        capacity = Integer.parseInt(raw);
    } catch (NumberFormatException e) {
        System.out.println("Not a whole number. Try again.");
        continue;
    }

    if (capacity < 1 || capacity > 50) {
        System.out.println("Enter a value from 1 through 50.");
        continue;
    }

    break; // both checks passed
}

String[] people = new String[capacity];
```

This pattern is ideal for menus, capacity limits, grades, quantities, and numeric configuration. Give the user a clear error and retry instead of silently skipping the invalid value.

## A review of the pattern in your project

Your `String_methods.java` already tries to:

- clear the console with a helper method;
- read a proposed room/staff capacity using `BufferedReader`;
- use `while (true)` to repeat input;
- parse the text with `Integer.parseInt()`;
- reject values outside the expected range;
- allocate a `String[]` with the selected size.

Improvements to practice:

1. **Blank line path:** after detecting a blank line, your example reads another line and then continues. That second line is discarded and is not validated. Print the error and `continue` immediately so the next loop iteration asks again.
2. **Invalid digits:** `Integer.parseInt(raw)` throws `NumberFormatException` for text like `abc`. Catch that exception inside the loop so one typo does not terminate the whole feature.
3. **Range clarity:** if capacity must be `1–50`, tell the user exactly that. When a number is larger than 50, show a message rather than silently using `continue`.
4. **Specific catches:** avoid `catch (Exception e)` for every error. Catch the error you expect, such as `NumberFormatException` for number parsing and `IOException` for `readLine()`.
5. **Array meaning:** `new String[count]` creates empty slots whose values are initially `null`; it does not automatically collect names. Then use a loop to populate the array if that is the purpose.
6. **Names:** prefer class `StringMethods`, method `clearConsole()`, and variables such as `staffCount` or `capacity` over `String_methods`, `clean()`, and inconsistent variable names. Java will allow many alternative names, but conventional naming makes code easier to read.
7. **Console clearing:** clearing a console depends on the terminal/IDE. Treat it as optional UI polish, not core program logic. A clear screen command may do nothing in some IDE consoles. Do not suppress every exception silently while debugging.

You do not need to solve every issue at once. First make the input loop correct; then refactor the names and console helper.

---

# 12. Exception handling: `try`, `catch`, `finally`, `throw`, and `throws`

An exception represents a problem that interrupts normal execution. Handle expected failures near the operation that can fail, or declare a checked exception for a caller to handle.

## `try/catch`

```java
try {
    int number = Integer.parseInt("abc");
    System.out.println(number);
} catch (NumberFormatException e) {
    System.out.println("That is not a valid integer.");
}
```

## Multiple catches

```java
try {
    int value = Integer.parseInt(raw);
    System.out.println(100 / value);
} catch (NumberFormatException e) {
    System.out.println("Use digits.");
} catch (ArithmeticException e) {
    System.out.println("The divisor cannot be zero.");
}
```

Catch more specific exception types before broader ones. If the code has a clear precondition (`if (value == 0)`), a normal condition check may be more readable than using an exception for expected logic.

## `finally`

```java
try {
    System.out.println("Doing work");
} catch (RuntimeException e) {
    System.out.println("Something unexpected happened.");
} finally {
    System.out.println("This cleanup section normally runs whether the try succeeds or throws.");
}
```

For resources such as files and readers, prefer **try-with-resources**, which closes them automatically:

```java
try (BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
    String line = reader.readLine();
} catch (IOException e) {
    System.err.println("Could not read file: " + e.getMessage());
}
```

This snippet requires imports for `java.io.BufferedReader`, `java.io.IOException`, `java.nio.charset.StandardCharsets`, `java.nio.file.Files`, and a defined `Path path`.

## `throw` vs `throws`

- `throw` actively throws an exception: `throw new IllegalArgumentException("Score is out of range");`
- `throws` declares that a method may pass a checked exception to its caller: `public static void readConfig() throws IOException { ... }`.

Example validation in a constructor:

```java
public Student(String name, double score) {
    if (name == null || name.isBlank()) {
        throw new IllegalArgumentException("Name is required.");
    }
    if (score < 0 || score > 100) {
        throw new IllegalArgumentException("Score must be from 0 to 100.");
    }
    this.name = name.strip();
    this.score = score;
}
```

## Common exceptions to recognize

- `NumberFormatException`: a text value cannot be parsed as a number.
- `NullPointerException`: code tries to use a reference that is `null`.
- `ArrayIndexOutOfBoundsException`: array index is outside its valid range.
- `StringIndexOutOfBoundsException`: invalid index or range for a string.
- `ArithmeticException`: an integer arithmetic operation such as division by zero fails.
- `IOException`: input/output operation failed.
- `IllegalArgumentException`: a method receives an invalid argument, often deliberately thrown by your own validation.

## Exception best practices

- Catch errors you know how to handle.
- Avoid empty catch blocks during development; they hide the cause.
- Avoid `catch (Exception e)` as a default for everything.
- Do not show confusing internal stack traces to ordinary users in polished applications; log useful details for developers instead.
- Keep validation errors friendly and actionable.
- Do not use exceptions as a replacement for ordinary `if/else` checks when invalid values are expected and easy to test.

---

# 13. Classes, objects, constructors, and encapsulation

A **class** describes data and behavior. An **object** is an instance created from a class.

```java
public class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if (score < 0 || score > 100) {
            throw new IllegalArgumentException("Score must be from 0 to 100.");
        }
        this.score = score;
    }
}
```

Create and use an object:

```java
Student student = new Student("Carl", 87.5);
System.out.println(student.getName());
student.setScore(91);
```

## Constructor basics

A constructor:

- has the same name as the class;
- has no return type, not even `void`;
- runs when an object is created with `new`;
- is often used to establish a valid initial state.

If you write no constructor at all, Java supplies a default no-argument constructor. Once you declare any constructor, Java does not automatically add that no-argument constructor.

## `this`

`this` refers to the current object.

```java
public Student(String name) {
    this.name = name; // field = constructor parameter
}
```

The left `this.name` is the instance field, while the right `name` is the parameter.

## Encapsulation

Encapsulation means protecting an object's internal state and providing controlled methods to use or update it. Do not expose mutable fields publicly just for convenience.

```java
private double balance;

public double getBalance() {
    return balance;
}

public void deposit(double amount) {
    if (amount <= 0) {
        throw new IllegalArgumentException("Deposit must be positive.");
    }
    balance += amount;
}
```

## Class vs instance members

```java
public class Counter {
    private static int totalCreated = 0; // shared by the class
    private int value;                   // each object has its own value

    public Counter() {
        totalCreated++;
    }

    public void increment() {
        value++;
    }

    public int getValue() {
        return value;
    }

    public static int getTotalCreated() {
        return totalCreated;
    }
}
```

Use `Counter.getTotalCreated()` for the class-level count and `counter.getValue()` for the instance's state.

## Inheritance, interfaces, and polymorphism: preview

After you are comfortable with classes and constructors, learn:

- `extends` to inherit behavior/state from a superclass;
- `implements` to fulfill an interface contract;
- method overriding using `@Override`;
- polymorphism: use a superclass or interface reference to work with multiple implementations.

Do not rush into inheritance before understanding objects and encapsulation. Favor simple composition when one class can use another class as a field instead of forming a complicated hierarchy.

---

# 14. Access modifiers and common keywords at a glance

| Keyword | Meaning |
|---|---|
| `public` | accessible from other code when the containing type is accessible |
| `private` | visible only in the declaring class |
| `protected` | package/subclass access rules |
| `static` | belongs to the class rather than each instance |
| `void` | method returns no value |
| `final` | variable assigned once; method cannot be overridden; class cannot be subclassed, depending on where used |
| `this` | current object reference |
| `new` | creates an object/array |
| `return` | exits a method and optionally returns a value |
| `import` | lets code refer to types without their fully qualified names |
| `package` | declares a class's package |
| `try`, `catch`, `finally` | structured exception handling |
| `throw`, `throws` | actively throw / declare exception propagation |
| `break` | exits a loop or switch |
| `continue` | skips to the next loop iteration |

The keyword used depends on what you want the code to do; do not add every modifier to every method. For a small private helper called only inside one class, `private` is normally more appropriate than `public`.

---

# 15. Handy standard-library methods

You do not have to implement every utility yourself. Learn what the standard library already provides.

## `Math`

```java
double root = Math.sqrt(81);      // 9.0
double absolute = Math.abs(-12);  // 12.0
long rounded = Math.round(4.6);   // 5
int bigger = Math.max(5, 9);      // 9
double power = Math.pow(2, 3);    // 8.0
```

## Random values

```java
import java.util.concurrent.ThreadLocalRandom;

int secret = ThreadLocalRandom.current().nextInt(1, 101); // 1 through 100
```

The upper bound is exclusive, which is why `101` gives values through `100`. For security-sensitive secrets, do not use ordinary pseudorandom utilities; use `SecureRandom` instead.

## Useful imports

| Class | Import | Purpose |
|---|---|---|
| `Scanner` | `java.util.Scanner` | token/line console input |
| `Arrays` | `java.util.Arrays` | array sorting, copying, comparisons |
| `ArrayList` | `java.util.ArrayList` | resizable list implementation |
| `List` | `java.util.List` | list interface |
| `HashMap` | `java.util.HashMap` | key-value mapping |
| `HashSet` | `java.util.HashSet` | unique values |
| `BufferedReader` | `java.io.BufferedReader` | buffered character/line reading |
| `InputStreamReader` | `java.io.InputStreamReader` | bridge from byte input to character input |
| `JOptionPane` | `javax.swing.JOptionPane` | dialog input and messages |
| `LocalDate` | `java.time.LocalDate` | calendar dates |
| `Objects` | `java.util.Objects` | common object checks/helpers |

`java.lang` is imported automatically; this includes `String`, `Math`, and `System`.

---

# 16. Collections after arrays

Collections are objects designed for groups of values. You will commonly use them after learning arrays.

## `ArrayList`

```java
List<String> projects = new ArrayList<>();
projects.add("Attendance app");
projects.add("Inventory system");
System.out.println(projects.size());
System.out.println(projects.get(0));
projects.set(0, "Attendance tracker");
projects.remove("Inventory system");
```

## `Set` for unique items

```java
Set<String> tags = new HashSet<>();
tags.add("Java");
tags.add("Java"); // duplicate does not add another unique element
System.out.println(tags.size()); // 1
```

## `Map` for key-value pairs

```java
Map<String, Integer> inventory = new HashMap<>();
inventory.put("USB drive", 12);
inventory.put("Mouse", 5);
System.out.println(inventory.get("Mouse"));
System.out.println(inventory.getOrDefault("Keyboard", 0));
```

Choose a collection based on the task: ordered/resizable values (`List`), unique values (`Set`), or key-based lookup (`Map`). Learn arrays well first; collections solve different problems rather than making arrays obsolete.

---

# 17. Files and text I/O: a preview

When a program needs to save data after exiting, console variables and arrays alone are not enough. You can start with text files, then later learn serialization or databases.

Java NIO example (JDK 11+):

```java
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

Path path = Path.of("notes.txt");
try {
    Files.writeString(path, "Java practice notes\n", StandardCharsets.UTF_8);
    List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
    for (String line : lines) {
        System.out.println(line);
    }
} catch (IOException e) {
    System.err.println("File operation failed: " + e.getMessage());
}
```

`Path.of`, `Files.writeString`, and `Files.readString` are available in newer Java releases (including JDK 11). Files can be missing, inaccessible, or located somewhere other than you expect, so handle I/O exceptions and use clear paths.

For a real app, do not store passwords in plain text. Learn data validation, permissions, and secure storage before saving sensitive information.

---

# 18. Building a console menu with clean structure

A menu usually needs:

1. a method that prints the menu;
2. a loop that repeats until the user exits;
3. input validation for the menu choice;
4. `switch` to route the option to a focused method;
5. separate methods/classes for the actual features.

```java
boolean running = true;
while (running) {
    printMenu();
    int choice = readInt(input, "Choose: ");

    switch (choice) {
        case 1:
            runStudentFeature();
            break;
        case 2:
            runStringFeature();
            break;
        case 0:
            running = false;
            break;
        default:
            System.out.println("Invalid menu option.");
    }
}
```

A `switch` keeps discrete menu choices organized. Each feature should live in its own method or class once it becomes more than a few lines. Avoid repeating the same input-validation logic everywhere; put it in a utility method like `ConsoleInput.readInt`.

## Should I clear the console every time?

Not necessarily. `cls` is a Windows command; `clear` is common on Unix-like shells. `ProcessBuilder` can run those commands, but IDE consoles, remote terminals, and restricted environments may behave differently. A repeated header and separator is a more portable default. Add console clearing only when it genuinely improves the user experience.

---

# 19. Common mistakes and fixes

| Mistake | Why it fails | Better approach |
|---|---|---|
| `if (name == "Carl")` | `==` checks reference identity for objects | `"Carl".equals(name)` |
| `String name = 'Carl';` | single quotes are for `char` | `String name = "Carl";` |
| `int result = 5 / 2;` expecting `2.5` | integer division yields `2` | use `5.0 / 2` or cast one operand |
| array loop uses `i <= array.length` | last index is `length - 1` | use `i < array.length` |
| `array.length()` | arrays have a field, not a method | `array.length`; strings use `text.length()` |
| assuming array creation fills names | new reference array slots start as `null` | read values and assign each slot |
| `Arrays.binarySearch` on unsorted data | result is not reliable | sort the array first |
| `nextInt()` then `nextLine()` appears to skip input | newline remains after token read | consume newline or read a full line then parse |
| mixing `Scanner` and `BufferedReader` on `System.in` | competing buffers can consume input unexpectedly | use one console input strategy |
| `catch (Exception e)` everywhere | hides different error causes and poor recovery | catch expected exception types |
| blank input is read again then discarded | user's second line is not validated | `continue` and prompt again at loop top |
| `while` loop never ends | condition never becomes false | update state or provide a reachable exit |
| make every member `public` | breaks encapsulation | keep fields private; expose only needed methods |
| put all logic inside `main` | difficult to read/test/reuse | extract focused methods and classes |
| use cryptic names like `x1`, `rawStuff` | purpose is difficult to infer | use names like `staffCount` and `rawInput` |
| empty `catch` block | failure vanishes silently | handle the error or report useful diagnostic details |
| assume `JOptionPane` always returns text | Cancel may return `null` | check for `null` before parsing |

---

# 20. A simple debugging routine

When the program behaves incorrectly:

1. **Reproduce:** write down the exact input that causes the problem.
2. **Read the error:** look at the exception type and the first line of your own code in the stack trace.
3. **Inspect assumptions:** is the string blank? is the index valid? is the value actually numeric? is a reference `null`?
4. **Print small facts:** display the loop counter, raw input, array length, and chosen branch.
5. **Use breakpoints:** pause before the bad line and inspect variables in the debugger.
6. **Fix the cause:** do not only hide the visible error with a broad catch.
7. **Retest:** valid input, invalid text, boundary values, blank input, and exit behavior.

For capacity `1–50`, test `1`, `50`, `0`, `51`, a blank line, and `abc`. Boundary testing is more useful than testing only `25`.

---

# 21. Practice projects, ordered from easier to harder

These are designed to progress from fundamentals to projects more like a real application.

## Level 1 — one file, simple logic

1. **Number Checker:** positive/negative/zero, odd/even, and range checks.
2. **Grade Calculator:** validate a score from 0–100 and output a grade using `if/else`.
3. **Multiplication Table:** use `for` and `while` loops.
4. **String Inspection Tool:** count characters, find a word, change case, and replace text.
5. **Array Statistics:** sum, average, maximum, minimum, search, and sort.

## Level 2 — reusable methods and menu loops

6. **Super Calculator:** menu-driven operations, separate math methods, division-by-zero validation.
7. **Number Guessing Game:** random number, retry loop, attempt counter, and replay menu.
8. **Attendance Capacity Checker:** allow capacity `1–50`, reject invalid input, and collect names into an array.
9. **Quiz App:** store questions/answers in arrays, compare strings correctly, calculate score.
10. **String Methods Lab:** let a user choose which operation to test from a switch menu.

## Level 3 — classes and collections

11. **Student Record Manager:** create student objects, update scores, search by ID, list records.
12. **Inventory System:** `Product` class, stock quantity, add/remove stock, and low-stock warning.
13. **Helpdesk Ticket Tracker:** `Ticket` class with ID, category, status, and priority; later store tickets in an `ArrayList`.
14. **Attendance Register:** `Student` class, check-in state, summaries, and input validation.
15. **Simple Library Manager:** `Book` class, borrowing status, and search by title.

## Level 4 — persistence and UI

16. **Save/Load Records:** store non-sensitive sample records in a CSV/text file, then handle file errors.
17. **JOptionPane Utility App:** dialogs, confirmation prompts, and clear validation messages.
18. **Swing Desktop App:** forms, buttons, event listeners, and model classes separated from UI logic.
19. **Database-backed Inventory:** learn JDBC and SQL after you can build the in-memory version cleanly.
20. **Authentication Practice:** learn hashing and safe credential handling from trusted references; never store real passwords as plain text.

Choose one project and add one feature at a time. Do not jump from a simple array exercise directly into a large application with many features you do not understand yet.

---

# 22. Quick reference

```java
// Declare and initialize
int count = 5;
String text = "Hello";
final int MAX_CAPACITY = 50;

// Condition
if (count > 0) { /* ... */ } else { /* ... */ }

// Classic switch
switch (choice) {
    case 1: runFeature(); break;
    default: System.out.println("Unknown");
}

// for loop
for (int i = 0; i < count; i++) { /* ... */ }

// while loop
while (condition) { /* make progress toward stopping */ }

// Array
int[] values = {3, 1, 2};
Arrays.sort(values);
System.out.println(Arrays.toString(values));

// Method that returns a result
public static int add(int a, int b) { return a + b; }

// String comparison
if ("yes".equalsIgnoreCase(answer.strip())) { /* ... */ }

// Specific exception
try {
    int value = Integer.parseInt(rawInput);
} catch (NumberFormatException e) {
    System.out.println("Please enter a whole number.");
}

// Object
Student student = new Student("IT-01", "Carl", 90);
```

Remember: arrays have `.length`; strings have `.length()`; collections such as `ArrayList` have `.size()`.

---

# 23. Suggested learning roadmap

**Phase 1 — syntax and logic:** variables, types, operators, output, `if/else`, `switch`, loops.  
**Phase 2 — input and text:** `Scanner`, `BufferedReader`, parsing, validation, String methods.  
**Phase 3 — reusable code:** method parameters, return values, scope, overloading, utility classes.  
**Phase 4 — data:** arrays, `Arrays` utilities, 2D arrays, `ArrayList`, `Set`, `Map`.  
**Phase 5 — OOP:** classes, objects, constructors, `this`, access modifiers, encapsulation.  
**Phase 6 — resilience:** specific exception handling, file I/O, boundary testing, debugging.  
**Phase 7 — apps:** menu-driven console programs, small Swing/JOptionPane tools, then database-backed programs.

You are ready to move to the next phase when you can build a small program from a blank file without pasting the example, explain each important line, and handle at least a few invalid inputs.

---

## Reference documentation

- [Dev.java — Java learning and documentation](https://dev.java/learn/)
- [Oracle Java language basics tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)
- [Oracle Java exception-handling tutorial](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- [Java SE API documentation](https://docs.oracle.com/en/java/javase/)
- [Your JavaGroupProject repository](https://github.com/CarlLight67/JavaGroupProject)

---

# 24. Practice checklist

Mark a topic complete only when you can explain it and write a small example without copying.

## Foundations
- [ ] Explain the role of JDK, `javac`, `java`, and the JVM.
- [ ] Create a class with a correct `public static void main(String[] args)` method.
- [ ] Use `print`, `println`, and `printf`.
- [ ] Declare all eight primitive types and use `String`.
- [ ] Explain declaration, initialization, scope, `final`, `null`, and casting.
- [ ] Use arithmetic, comparison, logical, assignment, and increment operators.

## Conditions and loops
- [ ] Write `if`, `if/else`, and `if/else if/else` conditions.
- [ ] Choose between `if/else` and `switch` appropriately.
- [ ] Explain classic switch `break` and `default`.
- [ ] Use `for`, `while`, `do-while`, and enhanced `for` loops.
- [ ] Use `break` and `continue` without creating confusing control flow.
- [ ] Explain how your loop stops and avoid infinite loops.

## Strings
- [ ] Use `length`, `isEmpty`, `isBlank`, `charAt`, and `substring`.
- [ ] Use `contains`, `startsWith`, `endsWith`, `indexOf`, and `lastIndexOf`.
- [ ] Compare content with `equals` and `equalsIgnoreCase`, not `==`.
- [ ] Use `strip`, `trim`, case conversion, `replace`, `split`, and `String.join`.
- [ ] Explain why String is immutable.
- [ ] Know when `replaceAll` treats a pattern as a regular expression.

## Arrays and collections
- [ ] Declare, allocate, fill, update, and traverse arrays.
- [ ] Explain zero-based indexing and `ArrayIndexOutOfBoundsException`.
- [ ] Compute sum, average, maximum, minimum, and search result.
- [ ] Use `Arrays.toString`, `deepToString`, `sort`, `binarySearch`, `copyOf`, `equals`, and `fill`.
- [ ] Explain why `binarySearch` requires sorted data.
- [ ] Create and traverse a 2D array.
- [ ] Explain when to use `ArrayList`, `Set`, and `Map` instead of an array.

## Methods and classes
- [ ] Create a `void` method and a method that returns a value.
- [ ] Pass parameters and explain parameters vs arguments.
- [ ] Explain `public`, `private`, `protected`, and package-private access.
- [ ] Explain class-level `static` vs instance members.
- [ ] Overload a method by changing its parameter list.
- [ ] Create a class, object, constructor, fields, getters, and setters.
- [ ] Use `this` and encapsulation.
- [ ] Validate object state rather than allowing impossible values.

## Input and error handling
- [ ] Read a full line with `Scanner.nextLine()`.
- [ ] Explain the `nextInt()` / `nextLine()` trap.
- [ ] Read lines with `BufferedReader` and handle `IOException`.
- [ ] Parse strings into numbers and handle `NumberFormatException`.
- [ ] Build a retry loop for a value limited to `1–50`.
- [ ] Use `JOptionPane` for input and output and handle Cancel (`null`).
- [ ] Explain why mixing `Scanner` and `BufferedReader` on `System.in` is risky.
- [ ] Use specific `catch` blocks, `finally` where appropriate, and try-with-resources.
- [ ] Explain `throw` vs `throws`.

## Small projects
- [ ] String inspection tool
- [ ] Array statistics calculator
- [ ] Calculator with a menu loop
- [ ] Attendance capacity checker (1–50)
- [ ] Quiz / grade calculator
- [ ] Student record manager using classes
- [ ] Inventory or helpdesk ticket tracker using `ArrayList`
- [ ] Save and load sample records from a text file

## Testing inputs you should always try

For numeric input, test a normal value, `0`, a negative value, the exact lower limit, the exact upper limit, one outside each limit, blank input, and nonnumeric input such as `abc`.

---

## Official reference documentation

- [Dev.java — Java learning and documentation](https://dev.java/learn/)
- [Oracle Java language basics tutorial](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/index.html)
- [Oracle Java exception-handling tutorial](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- [Java SE API documentation](https://docs.oracle.com/en/java/javase/)
- [CarlLight67/JavaGroupProject](https://github.com/CarlLight67/JavaGroupProject)

---

# 25. `JOptionPane` complete practical reference

`JOptionPane` is part of Swing (`javax.swing`). It creates common modal dialogs without requiring you to design an entire `JFrame`. A dialog is **modal** when the calling code waits until the user closes or answers it. It is useful for small utilities, login-form practice, calculators, confirmations, and simple menu-based desktop programs.

**Important scope note:** the sections below cover the practical capabilities most beginner and intermediate programs need. The official API includes additional overloads, properties, constructors, and lower-level methods; the API documentation is the final reference when you need every signature.

## 25.1 Import and basic syntax

```java
import javax.swing.JOptionPane;

JOptionPane.showMessageDialog(null, "Welcome to Java!");
```

`null` as the parent component is fine for tiny demos and lets Swing choose a default parent/position. In a real windowed app, pass the owning `JFrame` or another component when possible so the dialog is associated with the correct window.

## 25.2 The four main dialog methods

| Method | Use | Return value |
|---|---|---|
| `showMessageDialog(...)` | Display a message and an acknowledgement button | `void` |
| `showInputDialog(...)` | Ask for typed input or let a user select from choices | Usually a `String` for free text; an `Object` for selection overloads |
| `showConfirmDialog(...)` | Ask a yes/no/cancel or OK/cancel question | An integer option constant |
| `showOptionDialog(...)` | Provide custom button labels and a custom choice layout | Selected option index, or `CLOSED_OPTION` |

There are also `showInternalMessageDialog`, `showInternalInputDialog`, `showInternalConfirmDialog`, and `showInternalOptionDialog` variants for dialogs inside a Swing `JDesktopPane` using internal frames. Use those only when your application is intentionally built with a desktop-pane/internal-frame design.

## 25.3 Message types and button option types

### Message types (the icon/style hint)

| Constant | Common purpose |
|---|---|
| `JOptionPane.INFORMATION_MESSAGE` | Successful operation or neutral information |
| `JOptionPane.WARNING_MESSAGE` | A caution or action needing attention |
| `JOptionPane.ERROR_MESSAGE` | An operation failed or input is invalid |
| `JOptionPane.QUESTION_MESSAGE` | A question or choice prompt |
| `JOptionPane.PLAIN_MESSAGE` | No standard message icon |

Example:

```java
JOptionPane.showMessageDialog(
    null,
    "The record was saved.",
    "Save complete",
    JOptionPane.INFORMATION_MESSAGE
);
```

### Standard option sets

| Constant | Typical buttons |
|---|---|
| `JOptionPane.DEFAULT_OPTION` | Look-and-feel default / no standard set requested |
| `JOptionPane.YES_NO_OPTION` | Yes and No |
| `JOptionPane.YES_NO_CANCEL_OPTION` | Yes, No, Cancel |
| `JOptionPane.OK_CANCEL_OPTION` | OK and Cancel |

Do not confuse **message type** with **option type**. The message type describes the kind of message/icon. The option type controls which standard buttons appear.

## 25.4 Display information, warnings, and errors

```java
JOptionPane.showMessageDialog(
    null,
    "Your profile was loaded.",
    "Profile",
    JOptionPane.INFORMATION_MESSAGE
);

JOptionPane.showMessageDialog(
    null,
    "Check the value before continuing.",
    "Warning",
    JOptionPane.WARNING_MESSAGE
);

JOptionPane.showMessageDialog(
    null,
    "The input was not a valid whole number.",
    "Invalid input",
    JOptionPane.ERROR_MESSAGE
);
```

Use short, clear messages. State what happened and what the user should do next. Do not show a raw stack trace, SQL query, filesystem path containing private information, access token, or internal server details to an end user.

## 25.5 Ask for text with `showInputDialog`

```java
String name = JOptionPane.showInputDialog(
    null,
    "Enter your name:",
    "Profile setup",
    JOptionPane.QUESTION_MESSAGE
);

if (name == null) {
    // Cancel or window close. This is not the same as an empty string.
    return;
}

name = name.strip();
if (name.isEmpty()) {
    JOptionPane.showMessageDialog(null, "Name cannot be blank.");
    return;
}

JOptionPane.showMessageDialog(null, "Hello, " + name + "!");
```

Remember the three possible input states:

1. `null`: the user canceled or closed the dialog.
2. `""` or whitespace: the user submitted no useful text.
3. Nonblank text: still needs validation for the field's rules and maximum length.

Do not call `raw.strip()` before checking for `null`; that can cause a `NullPointerException` after Cancel.

## 25.6 Parse numbers safely and reprompt

`showInputDialog` does not directly return an `int`, `double`, or `boolean` when asking for free text. It returns a string that you must validate and parse.

```java
import javax.swing.JOptionPane;

public class DialogNumberInput {
    public static void main(String[] args) {
        Integer capacity = askForInteger("Capacity (1-50):", 1, 50);

        if (capacity == null) {
            JOptionPane.showMessageDialog(null, "Operation cancelled.");
            return;
        }

        JOptionPane.showMessageDialog(null, "Approved capacity: " + capacity);
    }

    // Returns null only when the user cancels or closes the dialog.
    public static Integer askForInteger(String prompt, int min, int max) {
        while (true) {
            String raw = JOptionPane.showInputDialog(null, prompt);
            if (raw == null) {
                return null;
            }

            try {
                int value = Integer.parseInt(raw.strip());
                if (value < min || value > max) {
                    JOptionPane.showMessageDialog(
                        null,
                        "Enter a value from " + min + " through " + max + ".",
                        "Out of range",
                        JOptionPane.WARNING_MESSAGE
                    );
                    continue;
                }
                return value;
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(
                    null,
                    "Enter a whole number, such as 25.",
                    "Invalid number",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        }
    }
}
```

Design choice: this method returns `Integer` so `null` can mean cancellation. A primitive `int` cannot represent `null`. Another good design is to return a small result object or use a separate cancellation status when the program needs to distinguish cancellation from every possible data value.

## 25.7 Ask for confirmation and handle every result

```java
int answer = JOptionPane.showConfirmDialog(
    null,
    "Do you want to delete this draft?",
    "Confirm deletion",
    JOptionPane.YES_NO_CANCEL_OPTION,
    JOptionPane.WARNING_MESSAGE
);

if (answer == JOptionPane.YES_OPTION) {
    // Run the deletion operation after validating authorization and target.
} else if (answer == JOptionPane.NO_OPTION) {
    // Keep the draft.
} else if (answer == JOptionPane.CANCEL_OPTION
        || answer == JOptionPane.CLOSED_OPTION) {
    // Treat cancel/window close as no action.
}
```

**Safety rule:** a confirmation dialog is not authorization. For a real application, still check that the current user is permitted to delete that record and that the operation targets the correct record.

## 25.8 Create your own button labels with `showOptionDialog`

Use it when the standard Yes/No buttons do not describe the action clearly.

```java
Object[] options = {"Save changes", "Discard changes", "Go back"};

int choice = JOptionPane.showOptionDialog(
    null,
    "You have unsaved changes. What should happen?",
    "Unsaved changes",
    JOptionPane.DEFAULT_OPTION,
    JOptionPane.QUESTION_MESSAGE,
    null,       // Use the default icon.
    options,    // Custom button labels.
    options[0]  // Initially selected button.
);

switch (choice) {
    case 0 -> System.out.println("Save selected");
    case 1 -> System.out.println("Discard selected");
    case 2 -> System.out.println("Return to editing");
    case JOptionPane.CLOSED_OPTION -> System.out.println("Dialog closed; do nothing");
    default -> System.out.println("Unexpected option value");
}
```

The arrow-style `switch` above requires Java 14+. For Java 11, use the classic `switch` shown earlier in this README. With `showOptionDialog`, the result refers to the position in the custom options array, not `YES_OPTION` or `NO_OPTION`.

## 25.9 Let users select from predefined values

A selection overload can display a combo box or another selection UI depending on the Swing look and feel.

```java
Object[] departments = {"IT Support", "Software Development", "Networking", "Cybersecurity"};

Object selected = JOptionPane.showInputDialog(
    null,
    "Choose an area:",
    "Training preferences",
    JOptionPane.QUESTION_MESSAGE,
    null,
    departments,
    departments[0]
);

if (selected != null) {
    String department = selected.toString();
    System.out.println("Selected: " + department);
}
```

A `null` selection means the user canceled or closed the dialog. When a selection comes from known values, prefer comparing against those known options rather than blindly trusting arbitrary object text.

## 25.10 Show several messages or custom components in one dialog

`message` accepts an `Object`, not only a string. Swing can display a component directly or render an `Object[]` as a vertical stack of message items.

```java
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

String report = "Total records: 18\nValid: 16\nNeeds review: 2";
JTextArea area = new JTextArea(report, 8, 28);
area.setEditable(false);
area.setCaretPosition(0);

JOptionPane.showMessageDialog(
    null,
    new JScrollPane(area),
    "Import report",
    JOptionPane.INFORMATION_MESSAGE
);
```

A compact form can use labels and input components together:

```java
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

JTextField usernameField = new JTextField(18);
JTextField emailField = new JTextField(18);
Object[] form = {
    new JLabel("Username:"), usernameField,
    new JLabel("Email:"), emailField
};

int result = JOptionPane.showConfirmDialog(
    null, form, "Create profile", JOptionPane.OK_CANCEL_OPTION,
    JOptionPane.PLAIN_MESSAGE
);

if (result == JOptionPane.OK_OPTION) {
    String username = usernameField.getText().strip();
    String email = emailField.getText().strip();
    // Validate both values before storing or sending them anywhere.
}
```

For complex forms, validation messages, multiple pages, tables, menus, or persistent navigation, build a real `JFrame` with `JPanel` and layout managers rather than opening a chain of dialogs for every field.

## 25.11 Collect a password more carefully

A `JPasswordField` masks typed characters and exposes a `char[]` through `getPassword()`. This is preferable to immediately storing a password in an immutable `String`, but it **does not by itself make authentication secure** and cannot guarantee that all copies are erased from memory.

```java
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.util.Arrays;

JPasswordField passwordField = new JPasswordField(18);
int result = JOptionPane.showConfirmDialog(
    null,
    passwordField,
    "Enter password",
    JOptionPane.OK_CANCEL_OPTION,
    JOptionPane.PLAIN_MESSAGE
);

if (result == JOptionPane.OK_OPTION) {
    char[] password = passwordField.getPassword();
    try {
        // Pass to a properly designed authentication routine.
        // Do not print it, log it, email it, or store it as plain text.
    } finally {
        Arrays.fill(password, '\0');
        passwordField.setText("");
    }
}
```

A real sign-in system also needs safe password storage on the server, rate limiting, secure transport, session controls, and multi-factor authentication where appropriate. Never create your own password-hashing algorithm.

## 25.12 Use a custom icon

You can use standard look-and-feel icons or provide your own `Icon`.

```java
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

Icon icon = UIManager.getIcon("OptionPane.informationIcon");
JOptionPane.showMessageDialog(
    null,
    "The operation completed.",
    "Status",
    JOptionPane.INFORMATION_MESSAGE,
    icon
);
```

If you load an image from a file or resource, handle the case where it is missing. A decorative icon must not replace a clear text label. Consider users who rely on screen readers or cannot distinguish colors.

## 25.13 Keep the dialog flow organized

```java
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class DialogMenu {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(DialogMenu::runMenu);
    }

    private static void runMenu() {
        boolean running = true;
        while (running) {
            String[] options = {"Show message", "Calculate square", "Exit"};
            Object picked = JOptionPane.showInputDialog(
                null,
                "Choose an action:",
                "Java utility",
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]
            );

            if (picked == null) {
                running = false;
                continue;
            }

            switch (picked.toString()) {
                case "Show message":
                    JOptionPane.showMessageDialog(null, "Keep methods small and focused.");
                    break;
                case "Calculate square":
                    String raw = JOptionPane.showInputDialog(null, "Enter a whole number:");
                    if (raw == null) break;
                    try {
                        int number = Integer.parseInt(raw.strip());
                        JOptionPane.showMessageDialog(null, "Square: " + ((long) number * number));
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(null, "Please enter a whole number.",
                                "Invalid input", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case "Exit":
                    running = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Unknown action.",
                            "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
```

This menu demonstrates the event-dispatch-thread startup, reusable loop, cancellation handling, selection, numeric parsing, and separation of actions. For a growing app, move calculations and business rules out of `runMenu()` into ordinary methods/classes so they can be tested without opening a dialog.

## 25.14 When to use the instance API or a different Swing component

The static `showXxxDialog` methods are sufficient for most small tasks. The `JOptionPane` instance API becomes useful when you need control over properties such as message, options, selection values, icon, or input behavior. Relevant methods include:

- Constructors: `new JOptionPane(...)` to configure the message and options.
- `createDialog(...)` to create a `JDialog` containing the option pane.
- `createInternalFrame(...)` for an internal dialog in a desktop pane.
- Getters/setters such as `getMessage`, `setMessage`, `getOptions`, `setOptions`, `getOptionType`, `setOptionType`, `getMessageType`, `setMessageType`, `getIcon`, `setIcon`, `getSelectionValues`, `setSelectionValues`, `getInputValue`, and `setWantsInput`.
- Internal dialog helpers when you are using `JDesktopPane` and `JInternalFrame` intentionally.

You usually do **not** need to construct a `JOptionPane` manually just to show one message. Also, do not call blocking dialogs from a long-running computation on Swing's event-dispatch thread. Keep GUI event handlers short and move long-running work to an appropriate background task, then update Swing components on the event-dispatch thread.

## 25.15 `JOptionPane` checklist

- [ ] Choose the correct dialog method for message, input, confirmation, or custom options.
- [ ] Set an appropriate title and message type.
- [ ] Handle `null` from input/selection dialogs.
- [ ] Treat blank text separately from cancellation.
- [ ] Parse numeric strings and handle `NumberFormatException`.
- [ ] Validate ranges, length, and allowed values before using input.
- [ ] Handle Cancel and window close without accidentally performing an action.
- [ ] Use `JPasswordField` for password entry, but never log or store raw passwords.
- [ ] Use custom components only when needed; use a full Swing window for more complex interactions.
- [ ] Keep business logic outside the dialog code so it is easy to test.

---

# 26. Logic design and problem-solving process

Programming is not mainly typing syntax. It is converting a problem into clear, testable steps and then expressing those steps in code. Use the following process before writing a large class or method.

## 26.1 The 10-step process

1. **Understand the problem.** Rewrite it in your own words. Identify the user, the goal, and what counts as a correct result.
2. **List inputs.** Which values arrive from a keyboard, form, file, database, or another method? What type should each value have?
3. **List outputs.** What must be displayed, returned, saved, changed, or sent?
4. **Write rules and constraints.** Include ranges, required fields, permissions, business rules, rounding rules, and what should happen when input is invalid or cancelled.
5. **Break the task into smaller jobs.** Give each job a clear name such as `readCapacity`, `validateEmail`, `calculateTotal`, or `saveRecord`.
6. **Choose data structures.** Use variables for single values, arrays for fixed-size indexed data, collections for changing groups, and classes for related state and behavior.
7. **Write pseudocode or a flowchart.** Confirm that the logic is understandable before worrying about Java syntax.
8. **Dry-run with sample data.** Track variable values manually in a trace table. Test typical, boundary, invalid, and cancellation cases.
9. **Implement the smallest working version.** Compile early. Add one behavior at a time and avoid mixing every feature into `main`.
10. **Test, debug, refactor, and document.** Fix the cause of a problem, not just the visible symptom. Remove duplication and explain non-obvious decisions.

## 26.2 Use the IPO model: Input → Process → Output

Example requirement: store the names of between 1 and 50 people.

| Part | Design |
|---|---|
| Input | Capacity entered by the user; then the names |
| Validation | Capacity must be an integer from 1 through 50; names cannot be blank |
| Process | Create a `String[]`; read each name; count valid entries |
| Output | Display the accepted names and the number stored |
| Failure handling | Re-prompt on bad numbers; handle cancel/end-of-input; do not create an invalid-sized array |

Write this down before deciding whether input should use `Scanner`, `BufferedReader`, or `JOptionPane`. The input technology should not change the fundamental business rules.

## 26.3 Write pseudocode first

Pseudocode expresses intent without requiring perfect Java syntax.

```text
START
    REPEAT
        ASK for capacity
        IF the user cancelled THEN
            STOP safely
        END IF

        IF capacity is not an integer THEN
            SHOW a helpful error
        ELSE IF capacity is outside 1..50 THEN
            SHOW the allowed range
        ELSE
            EXIT the validation loop
        END IF
    UNTIL capacity is valid

    CREATE an array of the approved capacity

    FOR each valid array index
        REPEAT
            ASK for a name
            IF the user cancelled THEN
                STOP safely
            END IF
            IF the name is blank THEN
                SHOW a helpful error
            END IF
        UNTIL the name is not blank
        STORE the name
    END FOR

    DISPLAY the records
END
```

Pseudocode is a thinking tool, not a formal language. Agree with yourself on what Cancel means before implementing it. For example, cancellation could stop the entire task or skip one optional field; make the behavior intentional.

## 26.4 Flowchart symbols

Common flowchart conventions:

| Shape (typical) | Meaning |
|---|---|
| Oval / rounded terminator | Start or end |
| Rectangle | Processing step or assignment |
| Parallelogram | Input or output |
| Diamond | Decision with labeled outcomes, such as Yes/No |
| Arrow | Direction of flow |
| Connector circle | Continue flow elsewhere on the page |

Text flowcharts can work too:

```text
[Start]
   |
[Read score]
   |
{score between 0 and 100?}
   | Yes                  | No
[Classify score]      [Show error]
   |                      |
[Show result]          [Read score again]
   |                      |
 [End] <------------------+
```

Every decision branch should have a defined next step. A retry branch should return to the correct input step, not accidentally skip validation.

## 26.5 Decision logic and Boolean expressions

A condition evaluates to `true` or `false`.

```java
boolean hasValidAge = age >= 18 && age <= 120;
boolean canEnter = isStaff || hasValidGuestPass;
boolean shouldReject = input == null || input.isBlank();
```

- `&&` means AND: every required condition must be true.
- `||` means OR: at least one condition must be true.
- `!` means NOT: reverse a Boolean value.
- `&&` and `||` use **short-circuit evaluation**. If the left side already determines the result, Java may not evaluate the right side.

That is why this null-safe condition works:

```java
if (name != null && !name.isBlank()) {
    System.out.println(name.strip());
}
```

When `name` is `null`, Java does not evaluate `name.isBlank()`.

### A truth-table reminder

| A | B | `A && B` | `A || B` |
|---|---|---|---|
| false | false | false | false |
| false | true | false | true |
| true | false | false | true |
| true | true | true | true |

Correct range checks:

```java
boolean validScore = score >= 0 && score <= 100;
boolean outOfRange = score < 0 || score > 100;
```

A common mistake is using `&&` to test whether a value is outside both ends of a range:

```java
if (score < 0 && score > 100) {
    // This condition cannot be true for an ordinary number.
}
```

For an inclusive valid range, use `value >= min && value <= max`. For an invalid range, use `value < min || value > max`.

### Operator precedence advice

Parentheses improve readability, even when Java precedence rules would produce the same result.

```java
if ((isAdmin || isOwner) && recordIsActive) {
    // The record is active, and the person is an admin or its owner.
}
```

Avoid squeezing complex conditions into one line. Name parts of the logic:

```java
boolean hasRole = isAdmin || isOwner;
boolean canReadRecord = hasRole && recordIsActive;
```

## 26.6 Use a trace table to dry-run code

A trace table records how variables change on each loop iteration. Consider:

```java
int total = 0;
for (int i = 1; i <= 3; i++) {
    total += i;
}
```

| Iteration | `i` before body | `total` before | `total` after |
|---:|---:|---:|---:|
| 1 | 1 | 0 | 1 |
| 2 | 2 | 1 | 3 |
| 3 | 3 | 3 | 6 |

After the third iteration, `i` becomes 4, the condition `i <= 3` is false, and the loop ends. Trace tables reveal off-by-one errors, incorrect updates, counters that never change, and branches that do not run as expected.

## 26.7 Requirements, assumptions, and edge cases

For each feature, ask:

- What is allowed? What is not allowed?
- Can the value be empty, `null`, zero, negative, very large, or duplicated?
- What happens when the user presses Cancel or closes the window?
- What happens if a file is missing or a database is unavailable?
- Who is allowed to view, edit, or delete the data?
- Is data sensitive? Does the app really need to collect or save it?
- What happens when two users change the same record?
- Which result should happen if the input is valid syntactically but violates a business rule?

Separate **validation** from **business rules**: a string may be a valid integer but the value may still be an invalid age, quantity, or permission level.

---

# 27. Core algorithm patterns every beginner should know

Algorithms are repeatable approaches to problems. Learn their structure instead of memorizing one example.

## 27.1 Count, sum, and average

```java
int count = 0;
int sum = 0;

for (int value : values) {
    if (value >= 0) {
        count++;
        sum += value;
    }
}

double average = count == 0 ? 0.0 : (double) sum / count;
```

Initialize counters to `0`. Update a count once per item that meets the rule. Avoid division by zero. Cast before division when a decimal result is intended: `(double) sum / count`.

## 27.2 Find a maximum or minimum

Do not automatically initialize `max` to `0`, because all values might be negative. For a nonempty array:

```java
int max = values[0];
for (int i = 1; i < values.length; i++) {
    if (values[i] > max) {
        max = values[i];
    }
}
```

Check for an empty array before accessing index `0`.

## 27.3 Linear search

```java
public static int findIndex(String[] items, String target) {
    for (int i = 0; i < items.length; i++) {
        if (target.equals(items[i])) {
            return i;
        }
    }
    return -1; // agreed signal meaning “not found”
}
```

This requires `target` to be non-null. Alternatively, validate it before calling the method. Linear search checks items one by one and takes O(n) time in the worst case.

## 27.4 Count matches

```java
int matches = 0;
for (int score : scores) {
    if (score >= 75) {
        matches++;
    }
}
```

## 27.5 Menu loop

A menu usually needs a loop that continues until Exit is chosen. Keep each action in its own method:

```java
do {
    printMenu();
    int choice = readChoice();

    switch (choice) {
        case 1:
            addRecord();
            break;
        case 2:
            displayRecords();
            break;
        case 0:
            System.out.println("Goodbye.");
            break;
        default:
            System.out.println("Choose a listed option.");
    }
} while (choice != 0);
```

The snippet assumes `choice` remains in scope at the loop condition; declare it before the loop if needed. Keep input reading in one place so you do not duplicate parsing and validation logic.

## 27.6 Sentinel-controlled input

A **sentinel** is a special value that means “stop,” such as `done` in a list-building exercise. Ensure the sentinel is not treated as ordinary data and document whether matching is case-sensitive.

```java
while (true) {
    String line = input.nextLine().strip();
    if (line.equalsIgnoreCase("done")) {
        break;
    }
    // Validate and process line.
}
```

For sensitive workflows, do not use a sentinel that could be confused with valid data; prefer a clear menu action or explicit button.

## 27.7 Array traversal and mutation

- Read every value: enhanced `for` is usually clear.
- Update an element by index: classic `for` is often needed.
- Remove items frequently: consider `ArrayList` instead of shifting array elements manually.
- Search sorted data: `Arrays.binarySearch` requires sorting first and returns a negative insertion-point encoding if the target is not found; read the method documentation before decoding the result.

## 27.8 Time complexity: a first look

Complexity describes how work grows as input grows; it is not the same as measuring actual seconds on one computer.

| Complexity | Typical example | Intuition |
|---|---|---|
| O(1) | Read `values[4]` when index is valid | Constant number of operations |
| O(n) | Inspect every item once | Work grows approximately with item count |
| O(n²) | Nested loop comparing each pair | Work can grow roughly with the square of item count |
| O(log n) | Binary search on sorted data | Each step removes a large portion of the search range |

Do not optimize prematurely. First write correct, readable code, then measure the real bottleneck and select a suitable algorithm.

---

# 28. Program structure and clean architecture

A growing program becomes easier to change when each part has one clear responsibility. This structure works for console applications and Swing/JOptionPane projects alike.

## 28.1 Separate interface, rules, and storage

Think in three layers:

1. **Presentation / UI:** reads input, displays messages, and handles user actions (`Scanner`, `JOptionPane`, Swing components).
2. **Business logic / service:** applies rules, calculates results, checks whether an action is permitted, and coordinates work.
3. **Data access:** reads or writes records in memory, files, or a database.

The UI should call a method such as `inventoryService.addItem(item)` rather than contain the entire inventory algorithm inside an event handler. This allows the same business method to be used later by a console UI, Swing GUI, web API, or test.

## 28.2 Single-responsibility example

Prefer small methods such as:

```java
printMenu();
int choice = readMenuChoice();
handleMenuChoice(choice);
```

Instead of one giant method that prints the menu, parses data, modifies records, saves files, and handles every possible failure, divide those jobs into focused methods. Each method should have a name that describes its task, clear inputs, and a defined result or side effect.

## 28.3 A simple project layout

For a beginner's project, a practical package layout could be:

```text
src/
  com/example/inventory/
    Main.java                 // program entry point / wiring
    ui/
      ConsoleMenu.java        // user interaction
      DialogMenu.java         // JOptionPane/Swing interaction if used
    model/
      InventoryItem.java      // represents a domain object
    service/
      InventoryService.java   // rules and operations
    data/
      InventoryRepository.java // file/database access boundary
```

Do not create dozens of empty classes just to look professional. Start small and separate a responsibility when there is enough behavior to justify it.

## 28.4 Pure logic is easier to test

A method that returns a result based only on its parameters is often easy to test:

```java
public static double calculateDiscountedPrice(double price, double discountRate) {
    if (price < 0 || discountRate < 0 || discountRate > 1) {
        throw new IllegalArgumentException("Invalid price or discount rate");
    }
    return price * (1 - discountRate);
}
```

A production financial application must also choose suitable numeric types and rounding rules; `double` is used here only to illustrate a calculation. For currency, commonly use `BigDecimal` with an explicit scale/rounding policy or store integer minor units when appropriate.

Prefer to keep `System.out.println`, JOptionPane calls, file writes, and database calls outside the core calculation when possible. Then the calculation can be tested without opening a dialog, requiring a file, or contacting a database.

## 28.5 State and object invariants

An **invariant** is a condition that should always remain true for an object or operation. Examples:

- inventory quantity cannot be negative;
- a capacity must remain from 1 through 50;
- a record ID cannot change after creation;
- a user cannot approve their own unauthorized role change;
- a total must be recalculated when line items change.

Enforce an invariant at the point where data is accepted or changed, not merely in the first screen that displays the form. If the same object can be created or updated through multiple methods, those paths must all preserve the rule.

---

# 29. Secure programmer mindset

Security is a process, not a final feature that can simply be switched on. The goal is to make unsafe behavior harder, limit the damage if something fails, and recover safely.

This section is defensive education for securing your own devices, accounts, Java programs, and projects. Test only systems you own or have explicit permission to assess.

## 29.1 Think in assets, threats, and controls

Before coding a feature, ask what needs protection and how it could be abused.

| Item | Questions to ask |
|---|---|
| Assets | Which data, accounts, API keys, files, or actions matter? |
| Entry points | Can input arrive through a form, file, URL, database, environment variable, or external API? |
| Trust boundaries | Which values come from a user, third-party service, browser, plug-in, or another machine? |
| Threats | Could someone read, change, delete, impersonate, overload, or trick the system? |
| Controls | What validation, authorization, encryption, isolation, logging, or recovery step reduces the risk? |
| Verification | How will you test that the protection actually works? |

A beginner's threat model can be a one-page list. It does not need expensive software to be useful.

## 29.2 Treat input as untrusted

Assume that any externally supplied data can be malformed, unexpected, too large, duplicated, or intentionally designed to trigger bugs. This includes data from users you trust, imported files, external APIs, and database records that may have been modified elsewhere.

Use **allowlist validation** when possible: define the values and formats the feature actually accepts. Validate type, length, range, and business rules. For names and free text, do not reject every punctuation mark without reason; different languages and legitimate names use different characters. Validation should match the purpose of the field.

Client-side validation is helpful for usability, but it is not a security boundary. In a web app, server-side code must validate again because an attacker can bypass the interface and send a request directly.

## 29.3 Authentication is not authorization

- **Authentication:** who are you? Example: a user signs in.
- **Authorization:** what may you do? Example: a user can view their own record but cannot delete another person's record.

Hiding an Admin button, protecting a menu choice, or checking a role only in a Java desktop screen is not sufficient for a remote service or database. Check permissions where the operation is enforced, such as the server/service or database policy. Deny by default, grant the smallest set of permissions needed, and check ownership as well as role.

## 29.4 Least privilege

Give a program, account, API key, database user, and operating-system process only the permissions it needs.

- Do not run everyday code with administrator/root privileges.
- Use a database account that cannot drop unrelated tables or administer the whole database.
- Keep development, testing, and production credentials separate.
- Restrict who can edit a repository, deploy a project, or access its secrets.
- Avoid sharing an account among several people; separate accounts improve accountability.

## 29.5 Protect passwords, tokens, and personal data

- Never commit passwords, API keys, private keys, session tokens, database URLs containing credentials, or private user files to Git.
- Never store user passwords as plain text or with a fast general-purpose hash such as plain SHA-256. Use a maintained password-hashing implementation configured for a password-specific algorithm such as Argon2id, bcrypt, scrypt, or an appropriate PBKDF2 configuration.
- Use a unique salt for each password through the trusted password-hashing library; do not invent your own password scheme.
- Prefer a password manager and unique passwords. Enable MFA or passkeys for important accounts where available.
- Do not collect sensitive data unless the application genuinely needs it. Limit access and retention, and provide a safe deletion process.
- Do not put passwords, access tokens, session IDs, recovery codes, or unnecessary personal data in logs, screenshots, exception messages, or bug reports.

If a real secret is accidentally committed, assume it may already be copied. **Revoke or rotate it immediately**; deleting the latest line or making a repository private does not make the exposed secret safe again. Check repository history and affected services as part of cleanup.

## 29.6 Keep devices, tools, and dependencies trustworthy

- Install Java, IDEs, libraries, browser extensions, and tools from trusted, official sources.
- Check project names, maintainers, package coordinates, domains, and versions before adding dependencies.
- Review a dependency's license, maintenance status, known security advisories, and whether you actually need it.
- Keep the operating system, browser, JDK, libraries, and security tools updated through trusted channels.
- Do not disable antivirus/security controls just because an installer, build script, or unknown person says to.
- Be especially careful with untrusted `.jar`, `.exe`, shell scripts, Gradle/Maven plugins, IDE extensions, and build tasks: code can run during build or when the program is launched.
- Use a disposable virtual machine/container or a separate non-admin account to inspect untrusted code when appropriate. Isolation reduces risk but does not guarantee safety.

## 29.7 Use cryptography correctly

Use established libraries and well-reviewed protocols. Do not design your own encryption algorithm, password hash, token format, or authentication protocol. Use HTTPS/TLS for network connections and do not disable certificate validation to “fix” a connection error. Use Java's `SecureRandom` for security-sensitive random values; `Math.random()` is not intended for tokens, reset codes, or cryptographic keys.

Encryption does not replace access controls. If an attacker can read the key or access the program after data is decrypted, they may still access the data. Protect keys separately from the data they secure.

## 29.8 Error handling and logging

- Show users a helpful, non-sensitive message; retain technical details in restricted logs when appropriate.
- Do not swallow exceptions silently. Handle a specific exception when you know how to recover; otherwise allow the appropriate layer to report the failure safely.
- Never log credentials, access tokens, full payment details, private keys, or unnecessary personal information.
- Limit user-controlled text written to logs and avoid logging it in a way that lets newline/control characters forge fake log entries.
- Restrict log access and define how long logs should be retained.

## 29.9 Backups and recovery

Keep backup copies of important projects and data in a separate location or protected account. A backup that has never been tested may not be recoverable. Test restoring a small sample, protect backups with access controls, and avoid syncing confidential data into a public repository. Backups are part of security because they reduce the damage caused by ransomware, accidental deletion, hardware failure, or a bad update.

---

# 30. Social engineering and manipulation defense

Cybersecurity failures often begin by manipulating a person rather than breaking a program. Attackers may impersonate a recruiter, classmate, professor, bank, software maintainer, delivery service, or technical support agent. They may use urgency, fear, authority, curiosity, embarrassment, or a fake reward to pressure someone into skipping checks.

## 30.1 Warning signs

Be cautious when someone:

- Demands immediate action and tells you not to verify the request.
- Requests your password, one-time passcode (OTP), MFA approval, recovery code, API key, private key, or screen-sharing access.
- Sends an unexpected attachment, shortened link, QR code, code snippet, executable, or “test project” and pressures you to run it.
- Asks you to install remote-access software, disable security tools, paste commands into a terminal, or run a script as administrator.
- Claims a job, prize, scholarship, investment, or account recovery will be lost unless you pay or reveal information immediately.
- Asks for payment to obtain a job, asks you to receive/transfer money for someone, or asks you to use your personal account to move funds.
- Uses a slightly misspelled domain or an unfamiliar account that resembles a real person or organization.
- Tries to turn a technical discussion into a request for broad permissions, production secrets, or personal information unrelated to the task.

A polished message, a familiar logo, a convincing voice, or knowledge of your public GitHub profile does not prove the sender is genuine. Attackers can copy public information and impersonate people.

## 30.2 A process for verifying suspicious requests

Use this routine: **Pause → Verify → Limit → Report**.

1. **Pause.** Do not click, pay, share secrets, approve MFA, or run commands under pressure.
2. **Verify independently.** Contact the person or organization using a phone number, address, app, or website you already know is genuine—not contact information supplied in the suspicious message.
3. **Inspect the exact action.** Understand what a command, script, permission prompt, app, OAuth grant, or repository workflow will do before accepting it.
4. **Limit access.** Share only the minimum information needed. Use a test account and fake sample data instead of real user records or production credentials.
5. **Report and preserve evidence.** Use the official reporting channel for your school, employer, platform, or provider. Preserve relevant message details without forwarding malicious files to others.

If a person says “do not tell anyone” or “skip your normal approval process,” treat that as a reason to verify—not a reason to comply.

## 30.3 Protect your accounts

- Use a password manager to generate unique passwords; do not reuse a main email password on GitHub or other sites.
- Enable MFA/passkeys on email, GitHub, cloud providers, and accounts that can reset other accounts.
- Never share an OTP, MFA approval, recovery code, or session cookie with a recruiter, “support agent,” friend, or developer.
- Check login alerts, connected applications, authorized devices, recovery email/phone, and repository access periodically.
- Use official domains and bookmark high-value sign-in pages instead of trusting message links.
- Set private visibility for sensitive projects and remove real secrets and personal data from test files.
- Use separate work and personal accounts where reasonable and avoid committing private configuration into public repos.

MFA is valuable, but users can still be tricked into approving a fraudulent login or giving away a one-time code. Read each prompt and make sure it matches an action you initiated.

## 30.4 Protect your developer workflow

Before running a project from a stranger or accepting a contribution:

1. Review the README and all setup commands.
2. Inspect build scripts, dependency declarations, install hooks, shell/PowerShell scripts, and workflows that run automatically.
3. Check whether code requests access to browser profiles, SSH keys, cloud credentials, environment variables, or unrelated directories.
4. Never put your real API keys in a sample `.env` file or test environment for an unknown project.
5. Use a fresh temporary environment and non-admin user when feasible.
6. Ask a teacher, teammate, mentor, or trusted technical peer for a second review when something is unexplained.

Do not assume that code is harmless because it is hosted on GitHub, has stars, or was generated by an AI tool. AI-generated code can be incorrect or insecure. Read it, test it, and understand what it can access before using it.

## 30.5 If you may have been tricked

- From a clean, trusted device, change the affected password and any reused passwords.
- Revoke active sessions, app passwords, personal access tokens, SSH keys, OAuth grants, and API keys that may be exposed.
- Contact the official provider or school/employer security contact and follow their incident procedure.
- If financial information is involved, contact the relevant bank/payment provider using its official channel immediately.
- Disconnect a suspected compromised device from networks if appropriate, but preserve evidence and follow professional guidance rather than randomly deleting files.
- Restore from a known-good backup only after understanding and containing the incident.
- Do not retaliate, attempt to “hack back,” or run unknown cleanup tools recommended by the suspicious party.

Report promptly. Acting quickly can reduce harm; do not hide an incident out of embarrassment.

---

# 31. Secure Java coding patterns

Security depends on how data crosses trust boundaries. The examples below illustrate safe direction, not a substitute for a complete architecture review.

## 31.1 SQL: use parameterized queries

**Unsafe pattern to avoid:** building a SQL query by concatenating user-provided text. It can allow that text to change the query's meaning.

Use a `PreparedStatement` and bind data as parameters:

```java
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public static void findUser(Connection connection, String username) throws SQLException {
    String sql = "SELECT id, display_name FROM users WHERE username = ?";

    try (PreparedStatement statement = connection.prepareStatement(sql)) {
        statement.setString(1, username);
        try (ResultSet results = statement.executeQuery()) {
            while (results.next()) {
                int id = results.getInt("id");
                String displayName = results.getString("display_name");
                System.out.println(id + ": " + displayName);
            }
        }
    }
}
```

This example assumes the connection is supplied by a properly configured data-access layer. It does not demonstrate authentication, authorization, safe logging, or database credentials. Validate the expected data and apply access rules separately. SQL identifiers such as table/column names generally cannot be bound with `?`; if a query needs a variable sort column, choose it from a fixed allowlist rather than accepting arbitrary SQL text.

## 31.2 Avoid shell/command injection

Do not join user input into a command string and pass it to a system shell. Prefer a Java library/API for the task. If a child process is genuinely required, use a fixed executable and a list of arguments, validate each argument according to the command's rules, avoid invoking a shell, and run with low privileges. Never run an arbitrary command supplied by a remote user.

`ProcessBuilder` can separate an executable and its arguments, but **it is not automatically safe** if the executable or arguments are untrusted or if the process has excessive permissions.

## 31.3 File paths and file access

Never assume a filename supplied by a user is a harmless filename. Prefer a server-generated ID mapped to an allowed file. For a simple local directory exercise, normalize and constrain the result:

```java
import java.nio.file.Path;

Path baseDirectory = Path.of("data").toAbsolutePath().normalize();
String suppliedName = userSuppliedFilename; // untrusted text
Path requestedPath = baseDirectory.resolve(suppliedName).normalize();

if (requestedPath.equals(baseDirectory) || !requestedPath.startsWith(baseDirectory)) {
    throw new SecurityException("File path is outside the allowed file target.");
}
```

This is an illustration, not a universal complete defense. Symbolic links, races, file permissions, and how the path is opened may add risks. For an application exposed to untrusted users, use fixed/allowlisted filenames or server-generated identifiers and test the complete file-access flow. Do not expose arbitrary read/write access to the filesystem.

## 31.4 Security-sensitive random values

```java
import java.security.SecureRandom;

SecureRandom secureRandom = new SecureRandom();
int sixDigitCode = 100_000 + secureRandom.nextInt(900_000);
```

This produces a six-digit number, but does **not** create a complete OTP system. A real verification code also needs a short expiration, one-time use, rate limiting, secure delivery, abuse monitoring, and careful storage. Do not print a real verification code in production logs.

Use `SecureRandom` for cryptographic tokens where appropriate. Do not use `new Random()` or `Math.random()` for password reset tokens, session identifiers, API secrets, or encryption keys.

## 31.5 Passwords and secret management

Do not save passwords in a text file, source code, hard-coded array, or database column as plaintext. In production, store a salted password hash generated by a reputable password-storage library, using a currently recommended password-specific algorithm and parameters. Verify passwords through that library's verification API; do not decrypt stored passwords because a properly designed password hash is not meant to be reversible.

For project/API secrets:

- Read secrets from a properly configured secret manager or protected runtime configuration.
- Keep local `.env`/configuration files out of Git and provide an `.env.example` containing placeholders only.
- Limit each API key's permissions and allowed origins/IPs when the provider supports it.
- Rotate keys and monitor their usage.
- Never ship private server credentials inside a Java desktop app, browser bundle, mobile app, or public repository. A secret distributed with client code is not secret.

## 31.6 Exceptions, logs, and errors

Bad:

```java
catch (Exception ex) {
    System.out.println(ex); // May expose internal details and still gives poor recovery.
}
```

Better pattern: catch the expected exception where a meaningful recovery action is possible, show a safe message, and record only necessary diagnostic details through a properly configured, restricted logger. Keep secrets and personal data out of logs. Do not silently ignore failures that affect security or data integrity.

## 31.7 Serialization and external data

Treat files, serialized objects, JSON, XML, and other imported data as untrusted. Validate schema, type, size, and allowed values. Do not blindly deserialize Java-native serialized objects received from untrusted sources; use safer, constrained data formats and parsing approaches where possible. Set size limits to reduce resource exhaustion, and avoid allowing imported data to select classes, commands, file locations, or permissions.

## 31.8 Dependency and build security

- Keep a record of dependencies and versions.
- Remove unused libraries and plugins.
- Prefer maintained packages from known publishers.
- Review the code and permission requested by build plugins and IDE extensions.
- Use automated dependency vulnerability checks where available, then investigate the result rather than assuming a clean scan proves safety.
- Do not put deploy secrets in pull-request builds from unknown contributors.

## 31.9 Data privacy by design

Before adding a field to a form or database, ask whether you truly need it. Collect the minimum data necessary, explain its purpose, restrict access, secure storage/transmission, define retention, and implement deletion when appropriate. Do not publish private data merely because it is easy to display. A resume request form that emails a notification can be designed to avoid exposing the actual resume file or private contact details publicly.

---

# 32. A secure development process

Use this process for each meaningful feature, not only at the end of a project.

## Step 1 — Define scope and data

Write down the feature's purpose, who can use it, what data it reads/writes, and what external systems it touches. Identify secrets, personal information, important files, and irreversible actions.

## Step 2 — Model abuse and failures

Think through misuse cases: invalid input, unauthorized user, repeated requests, duplicate records, malicious file, compromised dependency, service outage, lost device, accidental deletion, and a user being tricked into approving something.

## Step 3 — Design the controls

Choose validation rules, access checks, minimal permissions, protected secrets, appropriate APIs, safe error handling, logging, backups, and recovery behavior. If something needs a different role to approve it, make that a real control—not a warning message only.

## Step 4 — Implement the simplest clear design

Use small classes and methods with explicit responsibilities. Prefer well-maintained libraries and standard APIs over custom cryptography or shell commands. Keep demo credentials and test data separate from real data.

## Step 5 — Test happy paths and failure paths

Try correct inputs, missing inputs, wrong types, oversized values, boundary values, duplicate requests, cancel/close, file-not-found, permission-denied, network failure, and unauthorized actions. Check both the visible message and whether the underlying data changed.

## Step 6 — Review before release

Read the changed code as if you did not trust it. Search for hard-coded secrets, broad exception handling, unsafe SQL concatenation, direct shell execution, unrestricted paths, plaintext passwords, excessive permissions, and logs containing private data. Review new dependencies and build scripts.

## Step 7 — Release carefully

Use separate development and production configuration. Restrict who can deploy. Back up important data first. Have a rollback plan and avoid publishing secrets or test data.

## Step 8 — Monitor and improve

Review relevant errors and security alerts without logging sensitive information. Update dependencies, remove old accounts/tokens, rotate secrets when appropriate, test backups, and revise controls when the application changes.

## Step 9 — Have an incident plan

Know who to contact, how to revoke credentials, where backup copies are, and how to preserve evidence. Do not improvise destructive cleanup while unsure what happened.

---

# 33. Testing and security review checklists

## 33.1 Logic and correctness checklist

- [ ] Can I restate the problem and expected output clearly?
- [ ] Have I defined valid inputs, invalid inputs, boundaries, and cancellation behavior?
- [ ] Are variables initialized intentionally and named clearly?
- [ ] Does each loop have a clear stopping condition and progress step?
- [ ] Do array indexes stay between `0` and `length - 1`?
- [ ] Have I tested empty arrays/collections and `null` where they are possible?
- [ ] Do I handle integer division, overflow, rounding, and division by zero deliberately?
- [ ] Are return values and error states clear to the caller?
- [ ] Are methods short enough to test and explain?
- [ ] Can I test the business rules without showing a UI or opening a file?

## 33.2 `JOptionPane` checklist

- [ ] Is cancellation distinct from blank text?
- [ ] Are all numeric conversions wrapped in the correct specific exception handling?
- [ ] Does window close behave safely?
- [ ] Are destructive actions confirmed in a clear way?
- [ ] Does business logic still enforce rules and permissions after confirmation?
- [ ] Are error messages useful without exposing internal details?
- [ ] Is the UI responsive, and are lengthy tasks kept off the Swing event-dispatch thread?

## 33.3 Defensive security checklist

- [ ] Do I treat all external input as untrusted?
- [ ] Do I validate type, format, length, range, and business rules?
- [ ] Does server-side code enforce authorization for protected actions?
- [ ] Are passwords handled by an established password-hashing library and never stored in plaintext?
- [ ] Are API keys, passwords, tokens, and private files absent from source control and logs?
- [ ] Are database queries parameterized with `PreparedStatement` or equivalent safe APIs?
- [ ] Do file operations stay within the intended access boundary?
- [ ] Do I avoid shelling out where a library can do the task?
- [ ] Do I use secure randomness for security-sensitive values?
- [ ] Are dependencies and IDE/build plugins reviewed and updated?
- [ ] Are errors safe, logs restricted, and sensitive fields minimized?
- [ ] Are permissions least-privilege and production/test configurations separate?
- [ ] Have I tested unauthorized actions and failure conditions, not just valid input?
- [ ] Are backups restorable and is there an incident response contact/process?
- [ ] Have I verified suspicious requests independently rather than trusting urgency or branding?

## 33.4 A small test matrix

| Test category | Example | Expected behavior |
|---|---|---|
| Normal | Capacity `20` | Accepted |
| Lower boundary | Capacity `1` | Accepted if range is 1–50 |
| Upper boundary | Capacity `50` | Accepted if range is 1–50 |
| Below range | Capacity `0` | Reject and explain allowed range |
| Above range | Capacity `51` | Reject and explain allowed range |
| Wrong type | `abc` | Parse error; re-prompt safely |
| Blank | empty or spaces | Reject as blank |
| Cancel | close dialog / press Cancel | No accidental save/delete; follow documented behavior |
| Unauthenticated | call protected feature without valid sign-in | Deny access safely |
| Unauthorized | signed-in user tries another user's record | Deny or return only authorized data |
| Dependency failure | database unavailable | Safe failure; no secret leakage |
| Secret leak check | search commit diff/log output | No credential, token, or private data exposed |

---

# 34. Logic and security practice projects

Build these in order. For each project, finish the logic and tests before adding the next feature. Use fictitious data while practicing.

1. **Decision trainer:** ask for numbers and classify positive/negative, even/odd, and ranges. Draw its decision flow first.
2. **Input validation toolkit:** reusable methods to read integers, doubles, nonblank strings, and bounded choices. Explicitly model cancel/end-of-input.
3. **String analyzer:** count characters, words, vowels, digits, spaces, and occurrences. Decide how to handle Unicode and case.
4. **Array statistics lab:** count, sum, average, minimum, maximum, search, and sorted output. Test empty and negative values.
5. **JOptionPane mini utility:** custom menu, input field, combo-box selection, confirmation, error dialog, and cancel handling.
6. **Student record manager:** model classes, private fields, constructors, validation, and an `ArrayList`. Do not use real student personal information.
7. **Inventory system:** item IDs, quantity limits, search, update, and deletion confirmation. Enforce business rules in the service methods.
8. **File-backed notes app:** read/write text files, handle missing files, validate the chosen file name, and avoid arbitrary filesystem access.
9. **Helpdesk ticket tracker:** status transitions, ownership rules, input validation, and an audit trail without storing passwords or unnecessary personal data.
10. **Parameterized database practice:** use a local test database and `PreparedStatement`; compare your design against the OWASP Java security checklist.
11. **Security review lab:** inspect a small program you wrote, document assets and threats, write tests for unauthorized and malformed input, then fix findings.
12. **Secure project release drill:** remove secrets from a sample project, set least-privilege configuration, review dependencies, create a backup, and document recovery steps.

For each project, keep a short engineering log: requirement, input/output, pseudocode, data structures, tests, bugs found, security risks, and what you changed. This builds the habit of explaining design decisions, not only showing a working result.

---

## Additional official and security references

- [Oracle Java SE `JOptionPane` API](https://docs.oracle.com/en/java/javase/26/docs/api/java.desktop/javax/swing/JOptionPane.html) — methods, constants, options, selection values, and lower-level API.
- [Oracle Swing tutorial: How to Make Dialogs](https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html) — standard dialog usage and customization.
- [OWASP Java Security Cheat Sheet](https://cheatsheetseries.owasp.org/cheatsheets/Java_Security_Cheat_Sheet.html) — defensive Java coding guidance.
- [OWASP SQL Injection Prevention Cheat Sheet](https://cheatsheetseries.owasp.org/cheatsheets/SQL_Injection_Prevention_Cheat_Sheet.html) — parameterized queries and data/query separation.
- [OWASP Password Storage Cheat Sheet](https://cheatsheetseries.owasp.org/cheatsheets/Password_Storage_Cheat_Sheet.html) — password-hashing algorithms, salt, and work factors.
- [OWASP Secure Code Review Cheat Sheet](https://cheatsheetseries.owasp.org/cheatsheets/Secure_Code_Review_Cheat_Sheet.html) — review controls for input validation, authentication, and data handling.
- [CISA Secure Our World](https://www.cisa.gov/secure-our-world) — phishing awareness, strong passwords/password managers, MFA, and software updates.
- [Dev.java — Java learning and documentation](https://dev.java/learn/)
- [Java SE API documentation](https://docs.oracle.com/en/java/javase/)

> **Final principle:** Understand the requirement, design the logic, validate the input, test the edge cases, enforce permissions, protect data, and review the result. A working program is the beginning; a reliable and secure program is the goal.

