1.)Create a Class Mobile  with the attributes listed below,

private String manufacturer;
private String operating_system;
public String color;
private int cost;

Define a Parameterized constructor to initialize the above instance variables. 

Define getter and setter methods for the attributes above. 

for example : setter method for manufacturer is 

void setManufacturer(String manufacturer){

this.manufacturer= manufacturer;

}

String getManufacturer(){

 return manufacturer;}

Display the object details by overriding the toString() method. 

For example:

Test	Result
1       manufacturer = Redmi
        operating_system = Andriod
        color = Blue
        cost = 34000

CODE:

public class Mobile {
    private String manufacturer;
    private String operating_system;
    public String color;
    private int cost;
    public Mobile(String manufacturer, String operating_system, String color, int cost) {
        this.manufacturer = manufacturer;
        this.operating_system = operating_system;
        this.color = color;
        this.cost = cost;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }
    public void setOperatingSystem(String operating_system) {
        this.operating_system = operating_system;
    }

    public String getOperatingSystem() {
        return operating_system;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }
    @Override
    public String toString() {
        return  "manufacturer = " + manufacturer + '\n' +"operating_system = " + operating_system + '\n' +"color = " + color + '\n' +"cost = " + cost;
    }

    // Main method for testing
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Redmi", "Andriod", "Blue", 34000);
        System.out.println(mobile);
    }
}

2.)Create a class Student with two private attributes, name and roll number. Create three objects by invoking different constructors available in the class Student. 

Student()

Student(String name)

Student(String name, int rollno)

Input:

No input

Output:

No-arg constructor is invoked
1 arg constructor is invoked
2 arg constructor is invoked
Name =null , Roll no = 0
Name =Rajalakshmi , Roll no = 0
Name =Lakshmi , Roll no = 101

For example:

Test	Result
1       No-arg constructor is invoked
        1 arg constructor is invoked
        2 arg constructor is invoked
        Name =null , Roll no = 0
        Name =Rajalakshmi , Roll no = 0
        Name =Lakshmi , Roll no = 101

CODE:

public class Student {
    private String name;
    private int rollNo;
    public Student() {
        this.name = null;
        this.rollNo = 0;
        System.out.println("No-arg constructor is invoked");
    }
    public Student(String name) {
        this.name = name;
        this.rollNo = 0;
        System.out.println("1 arg constructor is invoked");
    }
    public Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        System.out.println("2 arg constructor is invoked");
    }
    public void displayInfo() {
        System.out.println("Name =" + name + " , Roll no = " + rollNo);
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student("Rajalakshmi");
        Student student3 = new Student("Lakshmi", 101);
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
    }
}

3.)Create a class called "Circle" with a radius attribute. You can access and modify this attribute using getter and setter methods. Calculate the area and circumference of the circle.

Area of Circle = πr2 

Circumference = 2πr

Input:

2

Output:

Area = 12.57
Circumference = 12.57

For example:

Test	Input	Result
1       4       Area = 50.27
                Circumference = 25.13

CODE:

import java.io.*;
import java.util.Scanner;
class Circle
{
    private double radius;
    public Circle(double radius){
        // set the instance variable radius
       this.radius=radius;
        
    }
    public void setRadius(double radius){
        // set the radius
       this.radius=radius;
        
    }
    public double getRadius()    {
        // return the radius
       return radius;
        
    }
    public double calculateArea()  { // complete the below statement
       return Math.PI*radius*radius;
        
    }
    public double calculateCircumference()    { 
        // complete the statement
       return  2*Math.PI*radius;
    }
}
class prog{
    public static void main(String[] args)  {
        int r;
        Scanner sc = new Scanner(System.in);
        r=sc.nextInt();
        Circle c= new Circle(r);
        System.out.println("Area = "+String.format("%.2f", c.calculateArea()));
        System.out.println("Circumference = "+String.format("%.2f",c.calculateCircumference()));
        // invoke the calculatecircumference method
        
        
    }
}
