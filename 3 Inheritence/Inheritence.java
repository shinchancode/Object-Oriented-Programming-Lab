/*AARTI RATHI
My website - https://shinchancode.github.io/3d-react-portfolio/ */

/*Problem Statement : 

Design and develop inheritance for a given case study, identify objects and relationships and implement inheritance wherever applicable. Employee class hasEmp_name, Emp_id, Address, Mail_id, and Mobile_noas members. Inherit the classes: Programmer, Team Lead, Assistant Project Manager and Project Manager from employee class. Add Basic Pay (BP) as the member of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP for staff club fund. Generate pay slips for the employees with their gross and net salary */

----------------------------------------------------------------------------------------------------------------

package assign_3; 
import java.util.Scanner; 
class Employee 
{ 
 String Emp_name; 
 int Emp_id; 
 String Address; 
 String Mail_id; 
 String Mobile_n; 
 
 Employee() 
 { 
   Emp_name=""; 
   Emp_id=0000; 
   Address=""; 
   Mail_id=""; 
   Mobile_n=""; 
 } 
 Scanner sc=new Scanner(System.in); 
 public void get_emp() 
 { 
   System.out.println("Enter Employee's Name "); 
   Emp_name=sc.nextLine(); 
   System.out.println("\nEnter Employee's Address "); 
   Address=sc.nextLine(); 
   System.out.println("\nEnter Employee's Email id"); 
   Mail_id=sc.nextLine(); 
   System.out.println("\nEnter Employee's Mobile no."); 
   Mobile_n=sc.nextLine(); 
   System.out.println("\nEnter Employee's Employee Id"); 
   Emp_id=sc.nextInt(); 
 } 
 
 void display() 
 { 

  System.out.println("\n********************************************"); 
  System.out.println("EMPLOYEE PERSONAL INFORMATION"); 

  System.out.println("********************************************"); 
  System.out.println("Employee Name :"+Emp_name); 
  System.out.println("Employee id :"+Emp_id); 
  System.out.println("Mail id :"+ Mail_id); 
  System.out.println("Address :"+ Address); 
  System.out.println("Mobile Number :"+ Mobile_n); 
} 

} 
class Programmer extends Employee 
{ 
 double bp; 
 double da; 
 double hra; 
 double pf; 
 double club_fund; 
 double gross; 
 double net_pay; 
 
 public Programmer() 
 { 

   bp=0; 
   hra=0; 
   da=0; 
   pf=0; 
   club_fund=0; 
 } 
 
 public void get_pay() 
 { 
   System.out.println("\nEnter basic pay of programmer"); 
   bp=sc.nextDouble(); 
 } 
 
 void payslip() 
 { 
   da=(0.97 * bp); 
   hra=(0.10 * bp); 
   pf=(0.12 * bp); 
   club_fund=(0.001 * bp); 
   gross=(bp+da+hra); 
   net_pay = (gross-pf-club_fund); 
   System.out.println("\n********************************************"); 
   System.out.println("PAY SLIP FOR PROGRAMMER"); 
   System.out.println("********************************************"); 
   System.out.println("Basic Pay: Rs."+bp); 
   System.out.println("DA: Rs."+da); 
   System.out.println("HRA: Rs."+hra); 
   System.out.println("PF: Rs."+pf); 
   System.out.println("CLUB: Rs."+ club_fund+"\n \n"); 
   System.out.println("---------------------------------------------"); 
   System.out.println("GROSS PAY: Rs."+ gross); 
   System.out.println("NET PAY: Rs."+ net_pay); 
   System.out.println("---------------------------------------------"); 
 } 
 
} 
class Team_Lead extends Employee 
{ 
 double bp; 
 double da; 
 double hra; 
 double pf; 
 double club_fund; 
 double gross; 
 double net_pay; 
 
 public Team_Lead(){ 

   bp=0; 
   hra=0; 
   da=0; 
   pf=0; 
   club_fund=0; 
 } 
 public void get_pay() 
 { 
   System.out.println("\nEnter basic pay of Team Lead "); 
   bp=sc.nextDouble(); 
 } 
 public void payslip() 
 { 
   da=(0.97 * bp); 
   hra=(0.10 * bp); 
   pf=(0.12 * bp); 
   club_fund=(0.001 * bp); 
   gross=(bp+da+hra); 
   net_pay = (gross-pf-club_fund); 
   System.out.println("\n********************************************"); 
   System.out.println("PAY SLIP FOR TEAM LEAD"); 
   System.out.println("********************************************"); 
   System.out.println("Basic Pay: Rs."+bp); 
   System.out.println("DA: Rs."+da); 
   System.out.println("HRA: Rs."+hra); 
   System.out.println("PF: Rs."+pf); 
   System.out.println("CLUB: Rs."+ club_fund+"\n \n"); 
   System.out.println("---------------------------------------------"); 
   System.out.println("GROSS PAY: Rs."+ gross); 
   System.out.println("NET PAY: Rs."+ net_pay); 
   System.out.println("---------------------------------------------"); 
 } 
} 
class Assistant_Project_Manager extends Employee 
{ 
 double bp; 
 double da; 
 double hra; 
 double pf; 
 double club_fund; 
 double gross; 
 double net_pay; 
 
 public Assistant_Project_Manager(){ 

   bp=0; 
   hra=0; 
   da=0; 
   pf=0; 
   club_fund=0; 
 } 
 public void get_pay() 
 { 
   System.out.println("\nEnter basic pay of Assistant Project Manager"); 
   bp=sc.nextDouble(); 
 } 
 void payslip() 
 { 
   da=(0.97 * bp); 
   hra=(0.10 * bp); 
   pf=(0.12 * bp); 
   club_fund=(0.001 * bp); 
   gross=(bp+da+hra); 
   net_pay = (gross-pf-club_fund); 
   System.out.println("\n********************************************"); 
   System.out.println("PAY SLIP FOR Assistant Project Manager"); 
   System.out.println("********************************************"); 
   System.out.println("Basic Pay: Rs."+bp); 
   System.out.println("DA: Rs."+da); 
   System.out.println("HRA: Rs."+hra); 
   System.out.println("PF: Rs."+pf); 
   System.out.println("CLUB: Rs."+ club_fund+"\n \n"); 
   System.out.println("---------------------------------------------"); 
   System.out.println("GROSS PAY: Rs."+ gross); 
   System.out.println("NET PAY: Rs."+ net_pay); 
   System.out.println("---------------------------------------------"); 
 } 
} 
class Project_Manager extends Employee 
{ 
 double bp; 
 double da; 
 double hra; 
 double pf; 
 double club_fund; 
 double gross; 
 double net_pay; 
 
 public Project_Manager(){ 

   bp=0; 
   hra=0; 
   da=0; 
   pf=0; 
   club_fund=0; 
 } 
 public void get_pay() 
 { 
   System.out.println("\nEnter basic pay of Project_Manager"); 
   bp=sc.nextDouble(); 
 } 
 void payslip() 
 { 
   da=(0.97 * bp); 
   hra=(0.10 * bp); 
   pf=(0.12 * bp); 
   club_fund=(0.001 * bp); 
   gross=(bp+da+hra); 
   net_pay = (gross-pf-club_fund); 
   System.out.println("\n********************************************"); 
   System.out.println("PAY SLIP FOR Project Manager"); 
   System.out.println("********************************************"); 
   System.out.println("Basic Pay: Rs."+bp); 
   System.out.println("DA: Rs."+da); 
   System.out.println("HRA: Rs."+hra); 
   System.out.println("PF: Rs."+pf); 
   System.out.println("CLUB: Rs."+ club_fund+"\n \n"); 
   System.out.println("---------------------------------------------"); 
   System.out.println("GROSS PAY: Rs."+ gross); 
   System.out.println("NET PAY: Rs."+ net_pay); 
   System.out.println("---------------------------------------------"); 
 } 
} 
public class Office 
{ 
 public static void main(String[] args) 
 { 
   int ch,in; 
   do 
   { 
     System.out.println(" [1] Programmer \n [2] Team Lead \n [3] Assistant Project Manager \n [4] Project Manager "); 
     Scanner c = new Scanner(System.in); 

     System.out.print(" \nEnter Your Choice: ") ; 
     ch= c.nextInt(); 

     switch(ch) 
     { 
       case 1: 
       { 
         Programmer p=new Programmer(); 
         p.get_emp(); 
         p.get_pay(); 
         p.display(); 
         p.payslip(); 
         break; 
       } 

       case 2: 
       { 
         Team_Lead a =new Team_Lead(); 
         a.get_emp(); 
         a.get_pay(); 
         a.display(); 
         a.payslip(); 
         break; 
       } 

       case 3: 
       { 
         Assistant_Project_Manager m=new Assistant_Project_Manager(); 
         m.get_emp(); 
         m.get_pay(); 
         m.display(); 
         m.payslip(); 
         break; 
       } 
       case 4: 
       { 
         Project_Manager proj = new Project_Manager(); 
         proj.get_emp(); 
         proj.get_pay(); 
         proj.display(); 
         proj.payslip(); 
         break; 
       } 
       default: 
       { 
         System.out.print("\nINVALID INPUT!!"); 
       } 

     } 
     System.out.print("\nDO you want to continue?(Enter 1 if yes) "); 
     in = c.nextInt(); 

   } 

   while(in==1); 
   System.out.print("\nOPERATION COMPLETED!!! Thank you :) "); 
 } 
}
