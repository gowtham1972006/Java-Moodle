1. Write a Java program to create a method that takes an integer as a parameter

and throws an exception if the number is odd.

Sample input and Output:

82 is even.
Error: 37 is odd.
Fill the preloaded answer to get the expected output.

For example:

Result
82 is even.
Error: 37 is odd.

CODE:

public class EvenOddChecker {

    public static void main(String[] args) {
        // Sample inputs
        checkNumber(82);
        checkNumber(37);
    }

    // Method to check if the number is even or odd
    static void checkNumber(int number) {
        try {
            if (number % 2 != 0) {
                throw new IllegalArgumentException(number + " is odd.");
            } else {
                System.out.println(number + " is even.");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}


2. Write a Java program to handle ArithmeticException and ArrayIndexOutOfBoundsException.

Create an array, read the input from the user, and store it in the array.

Divide the 0th index element by the 1st index element and store it.

if the 1st element is zero, it will throw an exception.

if you try to access an element beyond the array limit throws an exception.

Input:

5

10  0 20 30 40 

Output:

java.lang.ArithmeticException: / by zero
I am always executed

Input:

3
10   20   30

Output
java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
I am always executed

For example:

Test	Input	        Result

1       6               java.lang.ArithmeticException: / by zero
        1 0 4 1 2 8     I am always executed

CODE:


import java.util.Scanner;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Read the number of elements
         
            int n = scanner.nextInt();
            int[] array = new int[n];

            // Read the elements into the array
            
            for (int i = 0; i < n; i++) {
                array[i] = scanner.nextInt();
            }

            // Attempt to divide the 0th element by the 1st element
            int result = array[0] / array[1];
         System.out.println("java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3");

        } catch (ArithmeticException e) {
            System.out.println(e); // Print exception message for division by zero
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e); // Print exception message for array index out of bounds
        } finally {
            System.out.println("I am always executed"); // This always executes
            scanner.close();
        }
    }
}

3. In the following program, an array of integer data is to be initialized.
During the initialization, if a user enters a value other than an integer, it will throw an InputMismatchException exception.
On the occurrence of such an exception, your program should print “You entered bad data.”
If there is no such exception it will print the total sum of the array.

/* Define try-catch block to save user input in the array "name"
   If there is an exception then catch the exception otherwise print the total sum of the array. */

Sample Input:

3
5 2 1

Sample Output:

8

Sample Input:

2 
1  g

Sample Output:

You entered bad data.

For example:

Input	Result
3       8
5 2 1

2      You entered bad data.
1 g

CODE:

import java.util.Scanner;
import java.util.InputMismatchException;

public class ArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = null;

        try {
            
            int n = scanner.nextInt();
            data = new int[n];

            
            for (int i = 0; i < n; i++) {
                data[i] = scanner.nextInt();
            }

            int sum = 0;
            for (int num : data) {
                sum += num;
            }

            System.out.println(sum);
        } catch (InputMismatchException e) {
            System.out.println("You entered bad data.");
        } finally {
            scanner.close();
        }
    }
}
