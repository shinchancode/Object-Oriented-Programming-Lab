/*AARTI RATHI
My website - https://aartirathi17.herokuapp.com/ */

/*Problem Statement :
Design and develop a context for given case study and implement an interface for Vehicles Consider the example of vehicles like bicycle, car and bike. All Vehicles have common functionalities such as Gear Change, Speed up and apply breaks. Make an interface and put all these common functionalities. Bicycle, Bike, Car classes should be implemented for all these functionalities in their own class in their own way. */

----------------------------------------------------------------------------------------------------------------

package oopassign5; 
import java.util.*; 
public class OopAssign5 
{ 
 /** 
 * @param args the command line arguments 
 */ 
 public static void main(String[] args) 
 { 
   Scanner sc=new Scanner(System.in); 
   int choice; 
   do 
   { 
     System.out.println("Enter the value of choice ---- 0=>exit ---- 1=>bicyle ---- 2=>car -----3=>bike"); 
     choice=sc.nextInt(); 

     switch(choice){ 

       case 1: 
       Bicycle b=new Bicycle(); 
       b.apply_break(); 
       b.gear_change(); 
       b.speed_up(); 
       break; 

       case 2: 
       Car c=new Car(); 
       c.apply_break(); 
       c.gear_change(); 
       c.speed_up(); 
       break; 

       case 3: 
       Bike B=new Bike(); 
       B.apply_break(); 
       B.gear_change(); 
       B.speed_up(); 
       break; 

     } 
   } 
   while(choice!=0); 
 } 
} 
public abstract interface Vehicle { 

 abstract void gear_change(); 
 abstract void speed_up(); 
 abstract void apply_break(); 
 
} 
public class Bicycle implements Vehicle{ 
 @Override 
 public void gear_change() 
 { 
   System.out.println("The gear of bicyle has changed"); 
 } 
 @Override 
 public void speed_up() 
 { 
   System.out.println("The bicycle is speeding up"); 
 } 
 @Override 
 public void apply_break() { 
   System.out.println("The brakes of bicycle has been applied"); 
 } 
} 
public class Car implements Vehicle{ 
 @Override 
 public void gear_change() 
 { 
   System.out.println("The gear of car has changed"); 
 } 
 @Override 
 public void speed_up() 
 { 
   System.out.println("The car is speeding up"); 
 } 
 @Override 
 public void apply_break() 
 { 
   System.out.println("The breaks of car has been applied"); 
 } 
} 
public class Bike implements Vehicle{ 
 @Override 
 public void gear_change() { 
   System.out.println("The gear of bike has been changed "); 
 } 
 @Override 
 public void speed_up() { 
   System.out.println("The bike is speeding up"); 
 } 
 @Override 
 public void apply_break() { 
   System.out.println("The breaks of bike has been applied"); 
 } 
}
