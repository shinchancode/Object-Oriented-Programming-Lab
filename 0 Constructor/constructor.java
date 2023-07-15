/*AARTI RATHI
My website - https://shinchancode.github.io/3d-react-portfolio/
*/

/*Problem Statement :
Design a class ‘Complex ‘with data members for real and imaginary part. Provide default and Parameterized constructors. Write a program to perform all arithmetic operations of two complex numbers. */

-------------------------------------------------------------------------------------------------------------------------------------------------------------------

import java.io.*;
import java.util.*; 
public class Main 
{ 
  public static void main(String args[]) 
  { 
    char ch; 
    float a,b,c; 
    complex op = new complex() ; 
    Scanner input = new Scanner(System.in); 
    do 
    { 
      System.out.print("Enter real and imaginary part of complex no 1:\n"); 
      a = input.nextInt(); 
      b = input.nextInt(); 
      complex cmplx1 = new complex(a,b); 
      System.out.print("Enter real and imaginary part of complex no 2:\n"); 
      a = input.nextInt(); 
      b = input.nextInt(); 
      complex cmplx2 = new complex(a,b); 
      op.add(cmplx1,cmplx2); 
      op.sub(cmplx1,cmplx2); 
      op.mul(cmplx1,cmplx2);
      op.div(cmplx1,cmplx2); 
      System.out.print("DO YOU WANT TO CONTINUE FOR ANOTHER INPUTS 
        (ENTER 'Y' OR 'y') IF YES \n "); 
      ch = input.next().charAt(0); 
    } 
    while(ch=='Y' || ch=='y'); 
    System.out.print("OPERATION COMPLETED!!"); 
  } 
} 
class complex 
{ 
  private float r,i; 
complex() // default constructor
{ 
  r=0; 
  i=0; 
} 
complex(float a1,float a2) // parameterized constructor
{ 
  r=a1; 
  i=a2; 
} 
void add(complex C1,complex C2) 
{ 
  float r,i; 
  this.r = (C1.r + C2.r);
  this.i = (C1.i + C2.i); 
  System.out.println("Addition is:("+this.r+") + ("+this.i+")i" ); 
} 
void sub(complex C1,complex C2) 
{ 
  float r,i; 
  this.r = (C1.r - C2.r); 
  this.i = (C1.i - C2.i); 
  System.out.println("Difference is:("+this.r+") + ("+this.i+")i" ); 
} 
void mul(complex C1,complex C2) 
{ 
  float r,i; 
  this.r = (C1.r * C2.r)-(C1.i * C2.i); 
  this.i = (C1.r * C2.i)+(C2.r * C1.i); 
  System.out.println("Multiplication is:("+this.r+") + ("+this.i+")i" ); 
} 
void div(complex C1,complex C2) 
{ 
  if(C2.r!=0 || C2.i!=0) 
  { 
    float r,i,d; 
    this.r = (C1.r * C2.r)-(C1.i * (-1)*(C2.i)); 
    this.i = (C1.r * (-1)*C2.i)+(C2.r * (C1.i)); 
    d = (C2.r*C2.r)+(C2.i*C2.i); 
    System.out.println("Division is:(("+this.r+") + ("+this.i+")i ) /" + d );
  }
  else 
  { 
    System.out.println("Not Defined!!!" ); 
  } 
} 
} 
