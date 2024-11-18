1.)Given an array of numbers, you are expected to return the sum of the longest sequence of POSITIVE numbers in the array.

If there are NO positive numbers in the array, you are expected to return -1.

In this question’s scope, the number 0 should be considered as positive.

Note: If there are more than one group of elements in the array having the longest sequence of POSITIVE numbers, you are expected to return the total sum of all those POSITIVE numbers (see example 3 below).

input1 represents the number of elements in the array.

input2 represents the array of integers.

Example 1:

input1 = 16

input2 = {-12, -16, 12, 18, 18, 14, -4, -12, -13, 32, 34, -5, 66, 78, 78, -79}

Expected output = 62

Explanation:

The input array contains four sequences of POSITIVE numbers, i.e. "12, 18, 18, 14", "12", "32, 34", and "66, 78, 78". The first sequence "12, 18, 18, 14" is the longest of the four as it contains 4 elements. Therefore, the expected output = sum of the longest sequence of POSITIVE numbers = 12 + 18 + 18 + 14 = 63.

Example 2:

input1 = 11

input2 = {-22, -24, 16, -1, -17, -19, -37, -25, -19, -93, -61}

Expected output = -1

Explanation:

There are NO positive numbers in the input array. Therefore, the expected output for such cases = -1.

Example 3:

input1 = 16

input2 = {-58, 32, 26, 92, -10, -4, 12, 0, 12, -2, 4, 32, -9, -7, 78, -79}

Expected output = 174

Explanation:

The input array contains four sequences of POSITIVE numbers, i.e. "32, 26, 92", "12, 0, 12", "4, 32", and "78". The first and second sequences "32, 26, 92" and "12, 0, 12” are the longest of the four as they contain 4 elements each. Therefore, the expected output = sum of the longest sequence of POSITIVE numbers = (32 + 26 + 92) + (12 + 0 + 12) = 174.


For example:

Input	                                                           Result
16
-12 -16 12 18 18 14 -4 -12 -13 32 34 -5 66 78 78 -79               62

11
-22 -24 -16 -1 -17 -19 -37 -25 -19 -93 -61                         -1

16
-58 32 26 92 -10 -4 12 0 12 -2 4 32 -9 -7 78 -79                    174

CODE:

import java.util.Scanner;

public class LongestPositiveSequence {
    public static int sumOfLongestPositiveSequence(int n, int[] arr) {
        int maxLength = 0;
        int maxSum = 0;
        int currentLength = 0;
        int currentSum = 0;

        for (int num : arr) {
            if (num >= 0) {  // Count 0 as positive
                currentLength++;
                currentSum += num;
            } else {
                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxSum = currentSum;
                } else if (currentLength == maxLength) {
                    maxSum += currentSum;
                }
                // Reset current sequence
                currentLength = 0;
                currentSum = 0;
            }
        }

        // Final check in case the array ends with a positive sequence
        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxSum = currentSum;
        } else if (currentLength == maxLength) {
            maxSum += currentSum;
        }

        return maxLength > 0 ? maxSum : -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        
        int[] input2 = new int[input1];
        for (int i = 0; i < input1; i++) {
            input2[i] = scanner.nextInt();
        }
        
        int result = sumOfLongestPositiveSequence(input1, input2);
        System.out.println(result);
        
        scanner.close();
    }
}

2.)You are provided with a set of numbers (array of numbers).

You have to generate the sum of specific numbers based on its position in the array set provided to you.

This is explained below:

Example 1:

Let us assume the encoded set of numbers given to you is:

input1:5 and input2: {1, 51, 436, 7860, 41236}

Step 1:

Starting from the 0th index of the array pick up digits as per below:

0th index – pick up the units value of the number (in this case is 1).

1st index - pick up the tens value of the number (in this case it is 5).

2nd index - pick up the hundreds value of the number (in this case it is 4).

3rd index - pick up the thousands value of the number (in this case it is 7).

4th index - pick up the ten thousands value of the number (in this case it is 4).

(Continue this for all the elements of the input array).

The array generated from Step 1 will then be – {1, 5, 4, 7, 4}.

Step 2:

Square each number present in the array generated in Step 1.

{1, 25, 16, 49, 16}

Step 3:

Calculate the sum of all elements of the array generated in Step 2 to get the final result. The result will be = 107.

Note:

1)     While picking up a number in Step1, if you observe that the number is smaller than the required position then use 0.

2)     In the given function, input1[] is the array of numbers and input2 represents the number of elements in input1.

Example 2:

input1: 5 and input1: {1, 5, 423, 310, 61540}

Step 1:

Generating the new array based on position, we get the below array:

{1, 0, 4, 0, 6}

In this case, the value in input1 at index 1 and 3 is less than the value required to be picked up based on position, so we use a 0.

Step 2:

{1, 0, 16, 0, 36}

Step 3:

The final result = 53.

For example:

Input	              Result
5
1 51 436 7860 41236   107

5
1 5 423 310 61540     53

CODE:

import java.util.Scanner;

public class SumOfSquaredDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        
        int[] input2 = new int[input1];
        for (int i = 0; i < input1; i++) {
            input2[i] = scanner.nextInt();
        }
        
        int result = calculateSumOfSquaredDigits(input2);
        System.out.println(result);
        
        scanner.close();
    }
    
    public static int calculateSumOfSquaredDigits(int[] numbers) {
        int[] extractedDigits = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            int digit = 0;
            for (int j = 0; j <= i; j++) {
                digit = number % 10;
                number /= 10;
            }
            extractedDigits[i] = digit;
        }
        int sumOfSquares = 0;
        for (int digit : extractedDigits) {
            sumOfSquares += digit * digit;
        }
        return sumOfSquares;
    }
}

3.)Given an integer array as input, perform the following operations on the array, in the below specified sequence.

1.      Find the maximum number in the array.

2.      Subtract the maximum number from each element of the array.

3.      Multiply the maximum number (found in step 1) to each element of the resultant array.

After the operations are done, return the resultant array.

Example 1:

input1 = 4 (represents the number of elements in the input1 array)

input2 = {1, 5, 6, 9}

Expected Output = {-72, -36, 27, 0}

Explanation:

Step 1: The maximum number in the given array is 9.

Step 2: Subtracting the maximum number 9 from each element of the array:

{(1 - 9), (5 - 9), (6 - 9), (9 - 9)} = {-8, -4, -3, 0}

Step 3: Multiplying the maximum number 9 to each of the resultant array:

{(-8 x 9), (-4 x 9), (3 x 9), (0 x 9)} = {-72, -36, -27, 0}

So, the expected output is the resultant array {-72, -36, -27, 0}.

Example 2:

input1 = 5 (represents the number of elements in the input1 array)

input2 = {10, 87, 63, 42, 2}

Expected Output = {-6699, 0, -2088, -3915, -7395}

Explanation:

Step 1: The maximum number in the given array is 87.

Step 2: Subtracting the maximum number 87 from each element of the array:

{(10 - 87), (87 - 87), (63 - 87), (42 - 87), (2 - 87)} = {-77, 0, -24, -45, -85}

Step 3: Multiplying the maximum number 87 to each of the resultant array:

{(-77 x 87), (0 x 87), (-24 x 87), (-45 x 87), (-85 x 87)} = {-6699, 0, -2088, -3915, -7395}

So, the expected output is the resultant array {-6699, 0, -2088, -3915, -7395}.

Example 3:

input1 = 2 (represents the number of elements in the input1 array)

input2 = {-9, 9}

Expected Output = {-162, 0}

Explanation:

Step 1: The maximum number in the given array is 9.

Step 2: Subtracting the maximum number 9 from each element of the array:

{(-9 - 9), (9 - 9)} = {-18, 0}

Step 3: Multiplying the maximum number 9 to each of the resultant array:

{(-18 x 9), (0 x 9)} = {-162, 0}

So, the expected output is the resultant array {-162, 0}.

Note: The input array will contain not more than 100 elements


For example:

Input	          Result
4
1 5 6 9           -72 -36 -27 0

5
10 87 63 42 2     -6699 0 -2088 -3915 -7395

2
-9 9               -162 0


CODE:

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTransformation {
    public static int[] transformArray(int[] inputArray) {
        int maxNum = Integer.MIN_VALUE;
        for (int num : inputArray) {
            if (num > maxNum) {
                maxNum = num;
            }
        }
        int[] subtractedArray = new int[inputArray.length];
        for (int i = 0; i < inputArray.length; i++) {
            subtractedArray[i] = inputArray[i] - maxNum;
        }
        int[] resultantArray = new int[subtractedArray.length];
        for (int i = 0; i < subtractedArray.length; i++) {
            resultantArray[i] = subtractedArray[i] * maxNum;
        }
        
        return resultantArray;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] inputArray = new int[n];
        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int[] result = transformArray(inputArray);
        for(int i=0;i<n;i++){
            System.out.print(result[i]+" ");
        }
        
        scanner.close();
    }
}

