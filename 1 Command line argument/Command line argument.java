/*AARTI RATHI
My website - https://shinchancode.github.io/3d-react-portfolio/
*/

/*Problem Statement :
Write a Java code to perform addition of two complex numbers using a concept of command line arguments */

----------------------------------------------------------------------------------------------------------------

public class Main
{
	public static void main(String[] args)
	{
		int r1=Integer.paraseInt(args[0]);
		int i1=Integer.paraseInt(args[1]);
		int r2=Integer.paraseInt(args[2]);
		int i2=Integer.paraseInt(args[3]);

		int add_r=r1+r2;
		int add_i=i1+i2;
		int diff_r=r1-r2;
		int diff_i=i1-i2;

		System.out.print("Addition and Substraction using concept of command line arguments : ");

		System.out.println("Addition of two complex number is : ");
		System.out.println(add_r+" + "+add_i+"i");

		System.out.println("Subtraction of two complex number is : ");
		System.out.println(diff_r+" +("+diff_i+")i ");
	}
}

--------------------------------------------------------------------------------------------------------------
INPUT :
Command Line arguments : 6 4 8 9

OUTPUT :
Addition and Substraction using concept of command line arguments :

Addition of two complex number is :

14 + 13i

Subtraction of two complex number is :  

-2 + (-5)i
