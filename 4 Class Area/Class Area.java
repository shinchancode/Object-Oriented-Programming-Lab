/*AARTI RATHI
My website - https://aartirathi17.herokuapp.com/ */

/*Problem Statement : 
Design a base class shape with two double type values and member functions to input the data and compute_area() for calculating area of shape. Derive two classes: triangle and rectangle. Make compute_area() as abstract function and redefine this function in the derived class to suit their requirements. Write a program that accepts dimensions of triangle/rectangle and display calculated area. Implement dynamic binding for given case study. */

----------------------------------------------------------------------------------------------------------------

package oop_assign4; 
import java.util.*; 
public class Oop_assign4 
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
     System.out.println("Enter the value of choice for operation 0=>exit , 1=>triangle , 2=>rectangle "); 
     choice=sc.nextInt(); 
     switch(choice){ 
       case 1: 
       Triangle t=new Triangle(); 
       t.calculate_Area(); 
       break; 
       case 2: 
       Rectangle r=new Rectangle(); 
       r.calculate_Area(); 
       break; 
     } 
   } 
   while(choice!=0); 
 } 
} 
package oop_assign4; 
public abstract class BaseShape 
{ 
 double a; 
 double b; 
 public abstract void calculate_Area(); 
} 
package oop_assign4; 
import java.util.*; 
public class Triangle extends BaseShape 
{ 

 @Override 
 public void calculate_Area() 
 { 
   Scanner st=new Scanner(System.in); 

   System.out.println("Enter the value of base"); 
   a=st.nextDouble(); 
   System.out.println("Enter the value of height"); 
   b=st.nextDouble(); 
   double result=(a*b)/2.0; 
   System.out.println("The value of area of triangle is "+result); 
 } 
} 
package oop_assign4; 
import java.util.*; 
public class Rectangle extends BaseShape 
{ 
 @Override 
 public void calculate_Area() { 
   Scanner sr=new Scanner(System.in); 
   System.out.println("Enter the length of rectangle "); 
   a=sr.nextDouble(); 
   System.out.println("Enter the breadth of rectangle "); 
   b=sr.nextDouble(); 
   double area=a*b; 
   System.out.println("The area of rectangle is "+area); 
 } 
}
