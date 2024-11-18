1.)Write a program to find whether the given input number is Odd.

If the given number is odd, the program should return 2 else It should return 1.

Note: The number passed to the program can either be negative. positive or zero. Zero should NOT be treated as Odd.


For example:

Input	Result
123     2

456     1

CODE:

import java.util.*;
public class Odd{
    public static void main(String args[]){
        Scanner A=new Scanner(System.in);
        int a=A.nextInt();
        if(a%2==0)
        System.out.println("1");
        else
        System.out.println("2");
    }
}


2.)Write a program that returns the last digit of the given number. Last digit is being referred to the least significant digit i.e. the digit in the ones (units) place in the given number.

The last digit should be returned as a positive number.

For example,

if the given number is 197, the last digit is 7

if the given number is -197, the last digit is 7

For example:

Input	Result
197     7

-197    7

CODE:

import java.util.*;
public class Even{
    public static void main(String args[]){
        Scanner A=new Scanner(System.in);
        int a=A.nextInt();
        a=a%10;
        if(a<0)
        a=a*-1;
        System.out.println(a);
    }
}


3.)Rohit wants to add the last digits of two given numbers.

For example,

If the given numbers are 267 and 154, the output should be 11.

Below is the explanation:

Last digit of the 267 is 7

Last digit of the 154 is 4

Sum of 7 and 4 = 11

Write a program to help Rohit achieve this for any given two numbers.

Note: Tile sign of the input numbers should be ignored.

i.e.

if the input numbers are 267 and 154, the sum of last two digits should be 11

if the input numbers are 267 and -154, the slim of last two digits should be 11

if the input numbers are -267 and 154, the sum of last two digits should be 11

if the input numbers are -267 and -154, the sum of last two digits should be 11


For example:

Input	Result
267     11
154

267     11
-154

-267    11
154

-267    11
-154

CODE:


import java.util.*;
public class Sum_Of_Last{
    public static int Last(int a){
        a=a%10;
        if(a<0)
        a=a*-1;
        return a;
    }
    public static void main(String args[]){
        Scanner A=new Scanner(System.in);
        int a=A.nextInt();
        int b=A.nextInt();
        a=Last(a);
        b=Last(b);
        System.out.println(a+b);
    }
}

