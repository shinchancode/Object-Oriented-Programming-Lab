/*AARTI RATHI
My website - https://shinchancode.github.io/3d-react-portfolio/ */

/*Problem Statement :
Implement a program to handle Arithmetic exception, Array Index Out of Bounds. The user enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If Num1 and Num2 are not integers, the program would throw a Number Format Exception. If Num2 were zero, the program would throw an Arithmetic Exception. Display the exception.

---------------------------------------------------------------------------------------------------------------- */

package assign6 
import java.util.Scanner; 
class Assign6_oop 
{ 
  static void arrayindexcheck() 
  { 
    System.out.println("enter the size of array"); 
    Scanner sc=new Scanner(System.in); 
    int n=sc.nextInt(); 
    int arr[]=new int[n]; 
    for(int i=0;i<n;i++) 
    { 
      System.out.println("enter the element "+ (i+1)); 
      int x=sc.nextInt(); 
      arr[i]=x; 
    } 
    System.out.println("Enter the index needs to be accesssed "); 
    int a=sc.nextInt(); 
    System.out.println("the value is : " + arr[a]); 
  } 
  static void numberformatcheck() 
  { 
    Scanner sc=new Scanner(System.in); 
    System.out.println("enter the first number "); 
    int a=Integer.parseInt(sc.next()); 
    System.out.println("enter the second number "); 
    int b=Integer.parseInt(sc.next()); 
    int c=a/b; 
    System.out.println("the division is "+ c); 
  } 
  public static void main(String[] args) 
  { 
    Scanner sc=new Scanner(System.in); 
    int choice; 
    do 
    { 
      System.out.println("ENTER YOUR CHOICE!!" + "\n[1] Array Out of Bound" + "\n[2] Number Format Exception" + "\n[0] EXIT"); 
      choice = sc.nextInt(); 
      if(choice==1) 
      { 
        try 
        { 
          arrayindexcheck(); 
        } 
        catch(ArrayIndexOutOfBoundsException e) 
        { 
          System.out.println(e.getMessage()+" Array Index Out Of Bounds Exception occured \n"); 
        } 
      } 
      else if(choice==2) 
      { 
        try 
        { 
          numberformatcheck(); 
        } 
        catch(NumberFormatException ne) 
        { 
          System.out.println("Number Format Exception : one or both numbers may not be integers\n"); 
        } 
        catch(ArithmeticException ae) 
        { 
          System.out.println(ae.getMessage()+" Arithmetic Exception: occured\n"); 
        } 
      } 
      else if(choice!=0) 
      { 
        System.out.println("\n INVALID INPUT :( "); 
      } 
    } 
    while(choice!=0); 
  } 
}
