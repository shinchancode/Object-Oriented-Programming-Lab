/*AARTI RATHI
My website - https://shinchancode.github.io/3d-react-portfolio/
*/

/*Problem Statement : 
Identify commonalities and differences between Publication, Book and Magazine classes. Title, Price, Copies are common instance variables and saleCopy is common method. The differences are, Bookclass has author and orderCopies(). Magazine Class has methods orderQty, Current issue, receiveissue().Write a program to find how many copies of the given books are ordered and display total sale of publication. 

----------------------------------------------------------------------------------------------------------------*/

package assign_2; 
import java.util.Scanner; 
class Publication 
{ 
 Scanner sc=new Scanner(System.in); 
 // Title of the publication. 
 private String title; 
 // Price of the publication. 
 private double price; 
 // copies of the publication. 
 private int copies; 
 
 Publication() 
 { 
   title = " "; 
   price = 10.0; 
   copies = 0; 
 } 
 
 public String getTitle() 
 { 
   return this.title; 
 } 
 public void setTitle() 
 { 
   this.title = title; 
 } 
 public void setPrice() 
 { 
   System.out.println("\nEnter Price"); 
   price=sc.nextInt(); 
   if (price > 0) 
   { 
     this.price = price; 
   } 
   else 
   { 
     System.out.println("Invalid price"); 
   } 
 } 
 
 public double getPrice() 
 { 
   return price; 
 } 
 public int getcopies() 
 { 
   return this.copies; 
 } 
 public int setcopies(int copies) 
 { 
   this.copies = copies; 
   return copies; 
 } 
 
 public void sellcopy() 
 { 
   setPrice(); 
   System.out.println("Total Publication sell: $" + (copies * price)); 
 } 
} 
class Book extends Publication 
{ 
 Scanner sc=new Scanner(System.in); 
 // Author of the book. 
 private String author; 
 private int copies; 
 
 public String getAuthor() 
 { 
   return this.author; 
 } 
 
 public void setAuthor() 
 { 
   System.out.println("\nEnter Author Name:"); 
   author=sc.nextLine(); 
 } 
 public int ordercopies(int pcopies) 
 { 
   copies = setcopies(getcopies() + pcopies); 
   return copies; 
 } 
 public void sellcopy() 
 { 
   setPrice(); 
   System.out.println("Total Book sell: $" + (copies * getPrice())); 
 } 
} 

class Magazine extends Publication 
{ 
 private int orderQty; 
 private int copies; 
 private String currIssue; 
 
 public String getcurrIssue() 
 { 
   return this.currIssue; 
 } 
 public void setcurrIssue() 
 { 
   System.out.println("\nEnter Current issue date"); 
   currIssue=sc.nextLine(); 
 } 
 
 public int getorderQty(int pcopies) 
 { 
   copies=setcopies(getcopies() + pcopies); 
   return copies; 
 } 
 public void setorderQty(int copies) 
 { 
   this.orderQty = copies; 
 } 
 public void sellcopy() 
 { 
   setPrice(); 
   System.out.println("Total Magazine sell: $" + (copies * getPrice())); 
 } 
 public void recvNewIssue(String pNewIssue) 
 { 
   setcopies(orderQty); 
   currIssue=pNewIssue; 
 } 
} 

public class New 
{ 
 public static void main(String [] args) 
 { 
   Scanner sc=new Scanner(System.in); 
   System.out.println("\nEnter No. of copies(Book)"); 
   int copies = sc.nextInt(); 
 //accept all details of book to be order such as title, author, price & copies; 
   Book Obj1 = new Book(); 
   
   Obj1.setAuthor(); 
   int bcopy=Obj1.ordercopies(copies); 
   Obj1.sellcopy(); 
   
   System.out.println("\nEnter No. of copies(Magazine)"); 
   copies = sc.nextInt(); 
   Magazine Obj4 = new Magazine(); 
   int mcopy = Obj4.getorderQty(copies); 
   Obj4.setcurrIssue(); 
   Obj4.sellcopy(); 
   
   System.out.println("\nEnter No. of copies"); 
   copies = sc.nextInt(); 
   Publication Obj2 = new Book(); 
   bcopy=bcopy+ Obj2.setcopies(copies); 
 Obj2.sellcopy(); //Overriden method is invoke 
 
 Publication Obj3 = new Publication(); 
 copies=Obj3.setcopies(mcopy+bcopy); 
 Obj3.sellcopy(); 
 
 
 System.out.println("\nOPERATION COMPLETED!!)"); 
} 
} 

/*
 -----------------------------------------------------------------------------------------------------------------------------------------------
OUTPUT :

Enter No. of copies(Book)
12

Enter Author Name:
Aarti Rathi

Enter Price
55
Total Book sell: $660.0

Enter No. of copies(Magazine)
22

Enter Current issue date
21 JANUARY 2020

Enter Price
36
Total Magazine sell: $792.0

Enter No. of copies
8

Enter Price
23
Total Book sell: $0.0

Enter Price
78
Total Publication sell: $3276.0

OPERATION COMPLETED!!)


...Program finished with exit code 0
Press ENTER to exit console.
 */
