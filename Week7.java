1. Create interfaces shown below. 

 interface Sports {
public void setHomeTeam(String name);
public void setVisitingTeam(String name); 
}
 interface Football extends Sports {
public void homeTeamScored(int points);
public void visitingTeamScored(int points);}
create a class College that implements the Football interface and provides the necessary functionality to the abstract methods. 

sample Input:

Rajalakshmi
Saveetha
22
21

Output:

Rajalakshmi 22 scored
Saveetha 21 scored
Rajalakshmi is the Winner!

For example:

Test	           Input	Result

1                  Rajalakshmi  Rajalakshmi 22 scored
                   Saveetha     Saveetha 21 scored
                   22           Rajalakshmi is the winner!
                   21
                   
CODE:

                                                                                                                                                                              import java.util.Scanner;
 interface Sports {
public void setHomeTeam(String name);
public void setVisitingTeam(String name); 
   
}
 interface Football extends Sports {
public void homeTeamScored(int points);
public void visitingTeamScored(int points);

}
class College implements Football {
    String homeTeam;
    String visitingTeam;
   
    public void setHomeTeam(String name){
        homeTeam=name;
          
   }
public void setVisitingTeam(String name){
  visitingTeam=name;
}
public void homeTeamScored(int points){
    System.out.println(homeTeam+" "+points+" scored");
}
public void visitingTeamScored(int points){
  System.out.println(visitingTeam+" "+points+" scored");
}
public void winningTeam(int p1, int p2){
    if(p1>p2){
        System.out.println(homeTeam+" is the winner!");
    }
    else if(p1<p2){
        System.out.println(visitingTeam+" is the winner!");
    }
    else{
        System.out.println("It's a tie match.");
    }
    
}
}
public class Main{
    public static void main(String[] args){
        String hname;
        Scanner sc= new Scanner(System.in);
        hname= sc.nextLine();
        String  vteam=sc.nextLine();
        int htpoints=sc.nextInt();
        int vtpoints=sc.nextInt();
   College s= new College();
    s.setHomeTeam(hname);
    s.setVisitingTeam(vteam);
    s.homeTeamScored(htpoints);
    s.visitingTeamScored(vtpoints);
    s.winningTeam(htpoints,vtpoints);

}
}

2. RBI issues all national banks to collect interest on all customer loans.

Create an RBI interface with a variable  String parentBank="RBI" and abstract method rateOfInterest().

RBI interface has two more methods default and static method.

default void policyNote() {

System.out.println("RBI has a new Policy issued in 2023.");

}

static void regulations(){

System.out.println("RBI has  updated new regulations on 2024.");

}

Create two subclasses SBI and Karur which implements the RBI interface.

Provide the necessary code for the abstract method in two sub-classes. 

Sample Input/Output:

RBI has a new Policy issued in 2023
RBI has updated new regulations in 2024.
SBI rate of interest: 7.6 per annum.
Karur rate of interest: 7.4 per annum.

For example:

Test	Result

1       RBI has a new Policy issued in 2023
        RBI has updated new regulations in 2024.
        SBI rate of interest: 7.6 per annum.
        Karur rate of interest: 7.4 per annum.

CODE:

                                                                                                                                                                        import java.util.*;
interface RBI{
    String pb="RBI";
    void roi();
    default void pn(){
        System.out.println("RBI has a new Policy issued in 2023");
    }
    static void r(){
        System.out.println("RBI has updated new regulations in 2024.");
    }
}
class SBI implements RBI{
    
    public void roi(){
        System.out.println("SBI rate of interest: 7.6 per annum.");
    }
}
class Karur implements RBI{
    Karur(){
        System.out.println("RBI has a new Policy issued in 2023");
        System.out.println("RBI has updated new regulations in 2024.");
    }
    public void roi(){
        System.out.println("Karur rate of interest: 7.4 per annum.");
    }
}
public class Main{
    public static void main(String[] args){
        SBI s=new SBI();
        Karur k=new Karur();
       
        s.roi();
        k.roi();
    }
}


3. create an interface Playable with a method play() that takes no arguments and returns void. Create three classes Football, Volleyball, and Basketball that implement the Playable interface and override the play() method to play the respective sports.

interface Playable {
    void play();
}

class Football implements Playable {
    String name;
    public Football(String name){
        this.name=name;
    }
  public void play() {
    System.out.println(name+" is Playing football");
   }
}

Similarly, create Volleyball and Basketball classes.

Sample output:

Sadhvin is Playing football
Sanjay is Playing volleyball
Sruthi is Playing basketball
For example:

Test	Input	  Result

1       Sadhvin   Sadhvin is Playing football
        Sanjay    Sanjay is Playing volleyball
        Sruthi    Sruthi is Playing basketball



2       Vijay     Vijay is Playing football
        Arun      Arun is Playing volleyball
        Balaji    Balaji is Playing basketball


CODE:

import java.util.*;
interface P{
    void play();
}
class F implements P {
    String n;
    F(String h){
        n=h;
    }
    public void play(){
        System.out.println(n+" is Playing football");
    }
}
class V implements P{
    String n;
    V(String h){
        n=h;
    }
    public void play(){
        System.out.println(n+" is Playing volleyball");
    }
}
class B implements P{
    String n;
    B(String h){
        n=h;
    }
    public void play(){
        System.out.println(n+" is Playing basketball");
    }
}
public class Main{
    public static void main(String[] args){
        Scanner ob=new Scanner(System.in);
        String p=ob.nextLine();
        String q=ob.nextLine();
        String r=ob.nextLine();
        F f=new F(p);
        V v=new V(q);
        B b=new B(r);
        f.play();
        v.play();
        b.play();
        
        
    }
    
}   
