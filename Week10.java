1. Given an ArrayList, the task is to get the first and last element of the ArrayList in Java.

Input: ArrayList = [1, 2, 3, 4] 
Output: First = 1, Last = 4

Input: ArrayList = [12, 23, 34, 45, 57, 67, 89] 
Output: First = 12, Last = 89
Approach:

1. Get the ArrayList with elements.
2. Get the first element of ArrayList using the get(index) method by passing index = 0.
3. Get the last element of ArrayList using the get(index) method by passing index = size – 1.

CODE:

import java.util.*;
class prog{
    public static void main(String[] args){
        Scanner h=new Scanner(System.in);
        int a=h.nextInt();
        int[] arr=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=h.nextInt();
        }
        System.out.println("ArrayList: " +Arrays.toString(arr));
        System.out.print("First : " + arr[0] +",");
        System.out.print(" Last : "+arr[a-1]);
    }
}


2. The given Java program is based on the ArrayList methods and its usage. The Java program is partially filled. Your task is to fill in the incomplete statements to get the desired output.

list.set();

list.indexOf());

list.lastIndexOf())

list.contains()

list.size());

list.add();

 list.remove();

The above methods are used for the below Java program. 


CODE:

import java.util.ArrayList;
import java.util.Scanner;

class prog {

public static void main(String[] args)
{
 Scanner sc= new Scanner(System.in);
 int n = sc.nextInt();

 ArrayList<Integer> list = new ArrayList<Integer>();

 for(int i = 0; i<n;i++)
 list.add(sc.nextInt());

 // printing initial value ArrayList
 System.out.println("ArrayList: " + list);

//Replacing the element at index 1 with 100

list.set(1,100);

 //Getting the index of first occurrence of 100
System.out.println("Index of 100 = "+ list.indexOf(100)             );

//Getting the index of last occurrence of 100
 System.out.println("LastIndex of 100 = "+ list.lastIndexOf(100)           ); 
// Check whether 200 is in the list or not
System.out.println(list.contains(200)          ); //Output : false
 // Print ArrayList size
 System.out.println("Size Of ArrayList = "+ list.size()       );
//Inserting 500 at index 1
    list.add(1,500);                             // code here
 //Removing an element from position 3
    list.remove(3);                           // code here
  System.out.print("ArrayList: " + list);
 }
}


3. Write a Java program to reverse elements in an array list.

Sample input and Output:
Red
Green
Orange
White
Black
Sample output
List before reversing :                                                
[Red, Green, Orange, White, Black]                                     
List after reversing :                                                 
[Black, White, Orange, Green, Red] 

CODE:

import java.util.*;
class prog{
    public static void main(String[] args){
        Scanner h=new Scanner(System.in);
        int a=h.nextInt();
        ArrayList<String> List=new ArrayList<String>();
        for(int i=0;i<a;i++){
            List.add(h.next());
        }
        System.out.println("List before reversing : \n" + List);
        Collections.reverse(List);
        System.out.println("List after reversing : \n"+ List);
    }
}

