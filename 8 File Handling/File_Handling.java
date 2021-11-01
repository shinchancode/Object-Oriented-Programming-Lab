/*AARTI RATHI
My website - https://aartirathi17.herokuapp.com/ */

/*Problem Statement :

Implement a program for maintaining a database of student records using Files.Student has Student_id,name, Roll_no, Class, marks and address. Display the data for few students.
1. Create Database
2. Display Database 
3. Delete Records
4. Update Record
5. Search Record */

----------------------------------------------------------------------------------------------------------------

package assign8 
import java.io.*; 
import java.io.File; 
import java.util.*; 
public class Student 
{ 
 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
 
 public void addRecords() throws IOException 
 { 
 // Create or Modify a file for Database 
   PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st.txt",true))); 
   String studentname, address, stu_class; 
   int studentid, rollno; 
   float marks; 
   String s; 
   boolean addMore = false; 
 // Read Data 
   do 
   { 
     System.out.print("Enter Student's Name: "); 
     studentname = br.readLine(); 
     
     System.out.print("Enter Student Id: "); 
     studentid = Integer.parseInt(br.readLine()); 
     
     System.out.print("Enter Roll no: "); 
     rollno = Integer.parseInt(br.readLine()); 
     
     System.out.print("Enter Address: "); 
     address = br.readLine(); 
     
     System.out.print("Enter Class: "); 
     stu_class = br.readLine(); 
     
     System.out.print("Enter Marks : "); 
     marks = Float.parseFloat(br.readLine()); 
 // Print to File 
     pw.println(studentname+" "+studentid+" "+rollno+" "+address+" "+stu_class+" "+marks); 
     System.out.print("\nRecords added successfully !\n\nDo you want to add more records ? (y/n) : "); 
     s = br.readLine(); 
     if(s.equalsIgnoreCase("y")) 
     { 
       addMore = true; 
       System.out.println(); 
     } 
     else 
       addMore = false; 
   } 
   while(addMore); 
   pw.close(); 
 } 
 
 public void readRecords() throws IOException 
 { 
   try 
   { 
 // Open the file 
     BufferedReader file = new BufferedReader(new FileReader("st.txt")); 
     String name; 
     int i=1; 
 // Read records from the file 
     while((name = file.readLine()) != null) 
     { 
       System.out.println(name); 
       System.out.println(""); 
     } 
     file.close(); 
   } 
   catch(FileNotFoundException e) 
   { 
     System.out.println("\nERROR : File not Found !!!"); 
   } 
 } 
 
 public void searchRecords() throws IOException 
 { 
   try 
   { 
 // Open the file 
     BufferedReader file = new BufferedReader(new FileReader("st.txt")); 
     String name; 
     int flag=0; 
     Scanner sc=new Scanner(System.in); 
     System.out.print("Enter an id of the student you want to search: "); 
     String searchname=sc.next(); 
 // Read records from the file 
     while((name = file.readLine()) != null) 
     { 
       
       String[] line = name.split(" "); 
 //System.out.println(line[0]); 
       if(searchname.equalsIgnoreCase(line[1])){ 
         System.out.println("Record found"); 
         System.out.println(name); 
         System.out.println(""); 
         flag=1; 
         break; 
       } 
       
     } 
     if(flag==0) 
       System.out.println("Record not found"); 
     file.close(); 
   } 
   catch(FileNotFoundException e) 
   { 
     System.out.println("\nERROR : File not Found !!!"); 
   } 
 } 
 
 public void deleteRecords() throws IOException 
 { 
   try 
   { 
 // Open the file 
     BufferedReader file1 = new BufferedReader(new FileReader("st.txt")); 
     PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st1.txt",true))); 
     String name; 
     int flag=0; 
     Scanner sc=new Scanner(System.in); 
     System.out.print("Enter the name of the student you want to delete: "); 
     String searchname=sc.next(); 
 // Read records from the file 
     while((name = file1.readLine()) != null) 
     { 
       
       String[] line = name.split(" "); 
 //System.out.println(line[0]); 
       if(!searchname.equalsIgnoreCase(line[0])) 
       { 
         
         pw.println(name); 
         flag=0; 
         
       } 
       else 
       { 
         System.out.println("Record found"); 
         flag=1; 
       } 
       
     } 
     file1.close(); 
     pw.close(); 
     File delName = new File("st.txt"); 
     File oldName = new File("st1.txt"); 
     File newName = new File("st.txt"); 
     if(delName.delete()) 
       System.out.println("deleted successfully"); 
     else 
       System.out.println("Error"); 
     
     
     if (oldName.renameTo(newName)) 
       System.out.println("Renamed successfully"); 
     else 
       System.out.println("Error"); 
     
   } 
   catch(FileNotFoundException e) 
   { 
     System.out.println("\nERROR : File not Found !!!"); 
   } 
 } 
 public void updateRecords() throws IOException 
 { 
   try 
   { 
 // Open the file 
     BufferedReader file1 = new BufferedReader(new FileReader("st.txt")); 
     PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("st1.txt",true))); 
     String name; 
     int flag=0; 
     Scanner sc=new Scanner(System.in); 
     System.out.print("Enter the name of the student you want to update: "); 
     String searchname=sc.next(); 
 // Read records from the file 
     while((name = file1.readLine()) != null && flag==0) 
     { 
       
       String[] line = name.split(" "); 
 //System.out.println(line[0]); 
       if(!searchname.equalsIgnoreCase(line[0])) 
       { 
         
         pw.println(name); 
         flag=0; 
         
       } 
       else 
       { 
         System.out.println("Record found"); 
         System.out.println("Enter updated marks:"); 
         Float number = sc.nextFloat(); 
         pw.println(line[0]+" "+line[1]+" "+line[2]+" "+line[3]+" "+line[4]+" "+number); 
         flag=1; 
       } 
       
     } 
     file1.close(); 
     pw.close(); 
     File delName = new File("st.txt"); 
     File oldName = new File("st1.txt"); 
     File newName = new File("st.txt"); 
     if(delName.delete()) 
       System.out.println("record updated successfully"); 
     else 
       System.out.println("Error"); 
     
     
     if (oldName.renameTo(newName)) 
       System.out.println("Renamed successfully"); 
     else 
       System.out.println("Error"); 
   } 
   catch(FileNotFoundException e) 
   { 
     System.out.println("\nERROR : File not Found !!!"); 
   } 
 } 
 
 public void clear(String filename) throws IOException 
 { 
 // Create a blank file 
   PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(filename))); 
   pw.close(); 
   System.out.println("\nAll Records cleared successfully !"); 
 } 
 
 public void Menu() throws IOException 
 { 
   int ch,in; 
   System.out.println(""); 
   do 
   { 
     System.out.println("[1] Create Database"); 
     System.out.println("[2] Display Database"); 
     System.out.println("[3] Clear Database"); 
     System.out.println("[4] Modify Database"); 
     System.out.println("[5] Search Database\n"); 
     System.out.println("Enter your choice(enter 0 if exit)"); 
     
     ch = Integer.parseInt(br.readLine()); 
     System.out.println(""); 
     
     if(ch==1) 
     { 
       addRecords(); 
     } 
     
     else if(ch==2) 
     { 
       readRecords(); 
     } 
     
     else if(ch==3) 
     { 
       clear("st.txt"); 
     } 
     
     
     else if(ch==4) 
     { 
       System.out.println("[1] DELETE records?\n[2] UPDATE records?"); 
       in = Integer.parseInt(br.readLine()); 
       if(in==1) 
       { 
         deleteRecords(); 
       } 
       else if(in==2) 
       { 
         updateRecords(); 
       } 
       else 
       { 
         System.out.println("Wrong Input :( "); 
       } 
       
     } 
     
     else if(ch==5) 
     { 
       searchRecords(); 
     } 
     
     else if(ch!=0) 
     { 
       System.out.print("\nINVALID INPUT!!\n"); 
     } 
   } 
   while(ch!=0); 
 } 
 
 public static void main(String args[]) throws IOException 
 { 
   Student call = new Student(); 
   Call.Menu(); 
   System.out.print("\nOPERATION COMPLETED!!! Thank you :) "); 
 } 
}
