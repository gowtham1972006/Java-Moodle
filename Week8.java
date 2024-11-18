1. As a logic building learner you are given the task to extract the string which has vowel as the first and last characters from the given array of Strings.

Step1: Scan through the array of Strings, extract the Strings with first and last characters as vowels; these strings should be concatenated.

Step2: Convert the concatenated string to lowercase and return it.

If none of the strings in the array has first and last character as vowel, then return no matches found  

input1: an integer representing the number of elements in the array.

input2: String array.

Example 1:

input1: 3

input2: {“oreo”, “sirish”, “apple”}

output: oreoapple

Example 2:

input1: 2

input2: {“Mango”, “banana”}

output: no matches found

Explanation:

None of the strings has first and last character as vowel.

 

Hence the output is no matches found.

Example 3:

input1: 3

input2: {“Ate”, “Ace”, “Girl”}

output: ateace


For example:

Input	             Result
3                    oreoapple
oreo sirish apple

2                    no matches found
Mango banana

3                    ateace
Ate Ace Girl


CODE:

import java.util.Scanner;

public class VowelStringExtractor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = 0;

        // Step 1: Input number of elements
        if (scanner.hasNextInt()) {
            n = scanner.nextInt();
            scanner.nextLine(); // Consume the newline
        } else {
            System.out.println("Invalid input");
            return;
        }

        // Step 2: Input the string array
        String inputLine = scanner.nextLine();
        String[] strings = inputLine.split(" ");

        // Validate number of strings
        if (strings.length != n) {
            System.out.println("Number of strings does not match the input count");
            return;
        }

        // Step 3: Concatenate valid strings
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            if (str.length() > 0 && isVowel(str.charAt(0)) && isVowel(str.charAt(str.length() - 1))) {
                result.append(str);
            }
        }

        // Step 4: Output the result
        if (result.length() > 0) {
            System.out.println(result.toString().toLowerCase());
        } else {
            System.out.println("no matches found");
        }

        scanner.close();
    }

    private static boolean isVowel(char c) {
        char lowerC = Character.toLowerCase(c);
        return lowerC == 'a' || lowerC == 'e' || lowerC == 'i' || lowerC == 'o' || lowerC == 'u';
    }
}

2. 

1. Final Variable:
Once a variable is declared final, its value cannot be changed after it is initialized.
It must be initialized when it is declared or in the constructor if it's not initialized at declaration.
It can be used to define constants
 final int MAX_SPEED = 120;  // Constant value, cannot be changed

2. Final Method:
A method declared final cannot be overridden by subclasses.
It is used to prevent modification of the method's behavior in derived classes.
public final void display() {
    System.out.println("This is a final method.");
}

3. Final Class:
A class declared as final cannot be subclassed (i.e., no other class can inherit from it).
It is used to prevent a class from being extended and modified.
public final class Vehicle {
    // class code
}
Given a Java Program that contains the bug in it, your task is to clear the bug to the output.

you should delete any piece of code. 

For example:

Test	Result
1       The maximum speed is: 120 km/h
        This is a subclass of FinalExample.

CODE:

public class FinalExample {

    // Final variable
    public static final int MAX_SPEED = 120; // Corrected initialization

    // Final method
    public final void display() {
        System.out.println("The maximum speed is: " + MAX_SPEED + " km/h");
    }

    public static void main(String[] args) {
        FinalExample example = new FinalExample(); // Corrected object creation
        example.display(); // Corrected method call
        System.out.println("This is a subclass of FinalExample."); // Complete the output statement
    }
}


3. Create a base class Shape with a method called calculateArea(). Create three subclasses: Circle, Rectangle, and Triangle. Override the calculateArea() method in each subclass to calculate and return the shape's area.

In the given exercise, here is a simple diagram illustrating polymorphism implementation:

Polymorphism: Shape Class with Circle, Rectangle, and Triangle Subclasses for Area Calculation

 abstract class Shape {
    public abstract double calculateArea() ;
    }
}

System.out.printf("Area of a Triangle :%.2f%n",((0.5)*base*height));  // use this statement

sample Input :

4    // radius of the circle to calculate area PI*r*r

5   //  length of the rectangle

6  // breadth of the rectangle to calculate the area of a rectangle

4    // base of the triangle

3   //  height of the triangle

OUTPUT:

Area of a circle :50.27
Area of a Rectangle :30.00
Area of a Triangle :6.00

For example:

Test	Input	Result

1       4       Area of a circle: 50.27
        5       Area of a Rectangle: 30.00
        6       Area of a Triangle: 6.00
        4
        3

2
        7       Area of a circle: 153.94
        4.5     Area of a Rectangle: 29.25
        6.5     Area of a Triangle: 4.32
        2.4
        3.6


CODE:

import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius; // Area = π * r²
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea() {
        return length * breadth; // Area = length * breadth
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height; // Area = 0.5 * base * height
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Circle
        double radius = scanner.nextDouble();
        Shape circle = new Circle(radius);
        System.out.printf("Area of a circle: %.2f%n", circle.calculateArea());

        // Input for Rectangle
        double length = scanner.nextDouble();
        double breadth = scanner.nextDouble();
        Shape rectangle = new Rectangle(length, breadth);
        System.out.printf("Area of a Rectangle: %.2f%n", rectangle.calculateArea());

        // Input for Triangle
        double base = scanner.nextDouble();
        double height = scanner.nextDouble();
        Shape triangle = new Triangle(base, height);
        System.out.printf("Area of a Triangle: %.2f%n", triangle.calculateArea());

        scanner.close();
    }
}
