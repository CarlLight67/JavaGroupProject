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
}

int result = MathTools.square(5); // no MathTools object required
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
