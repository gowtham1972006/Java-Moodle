1.)You and your friend are movie fans and want to predict if the movie is going to be a hit!
The movie’s success formula depends on 2 parameters:
the acting power of the actor (range 0 to 10)
the critic’s rating of the movie (range 0 to 10)
The movie is a hit if the acting power is excellent (more than 8) or the rating is excellent (more than 8). This holds true except if either the acting power is poor (less than 2) or rating is poor (less than 2), then the movie is a flop. Otherwise the movie is average.
Write a program that takes 2 integers:
the first integer is the acting power
second integer is the critic’s rating.
You have to print Yes if the movie is a hit, Maybe if the movie is average and No if the movie is flop.

Example input:

9 5

Output:

Yes

Example input:

1 9

Output:

No

Example input:

6 4

Output:

Maybe


For example:

Input	Result
9 5     Yes

1 9     No

6 4     Maybe

CODE:

import java.util.*;
public class Movie{
    public static void main(String args[]){
        Scanner A=new Scanner(System.in);
        int p=A.nextInt();
        int r=A.nextInt();
        if(p>2 && r>2){
            if(p>8||r>8)
            System.out.println("Yes");
            else System.out.println("Maybe");
        }
        else System.out.println("No");
        
    }
}


2.)Consider the following sequence:

1st term: 1

2nd term: 1 2 1

3rd term: 1 2 1 3 1 2 1

4th term: 1 2 1 3 1 2 1 4 1 2 1 3 1 2 1

And so on. Write a program that takes as parameter an integer n and prints the nth terms of this sequence.

Example Input:

1

Output:

1

Example Input:

4

Output:

1 2 1 3 1 2 1 4 1 2 1 3 1 2 1


For example:

Input	                            Result
1                                   1

2                                   1 2 1


3                                   1 2 1 3 1 2 1

4                                   1 2 1 3 1 2 1 4 1 2 1 3 1 2 1

CODE:

import java.util.Scanner;

public class SequenceGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        generateSequence(n);
    }

    private static void generateSequence(int n) {
        if(n==0) return;
        generateSequence(n - 1);
        System.out.print(n + " ");
        generateSequence(n - 1);
    }
}

3.)You have recently seen a motivational sports movie and want to start exercising regularly. Your coach tells you that it is important to get up early in the morning to exercise. She sets up a schedule for you:

On weekdays (Monday - Friday), you have to get up at 5:00. On weekends (Saturday & Sunday), you can wake up at 6:00. However, if you are on vacation, then you can get up at 7:00 on weekdays and 9:00 on weekends.

Write a program to print the time you should get up.

Input Format

Input containing an integer and a boolean value.

The integer tells you the day it is (1-Sunday, 2-Monday, 3-Tuesday, 4-Wednesday, 5-Thursday, 6-Friday, 7-Saturday). The boolean is true if you are on vacation and false if you’re not on vacation.

You have to print the time you should get up.

Example Input:

1 false

Output:

6:00

Example Input:

5 false

Output:

5:00

Example Input:

1 true

Output:

9:00


For example:

Input	Result
1 false 6:00

5 false 5:00

1 true  9:00

CODE:

import java.util.*;
public class Fate{
    public static void main(String args[]){
        Scanner A=new Scanner(System.in);
        int a=A.nextInt();
        boolean b=A.nextBoolean();
        if(!b){
            if(a==1 || a==7)
            System.out.println("6:00");
            else System.out.println("5:00");}
        else{ 
        if(a==1||a==7)
        System.out.println("9:00");
        else System.out.println("7:00");
        }
    }
}

