/*AARTI RATHI
My website - https://shinchancode.github.io/3d-react-portfolio/ */

/*Problem Statement :

Using concepts of Object-Oriented programming develop solution for any one application
Banking system having following operations :

1. Create an account 
2. Deposit money 
3. Withdraw money 
4. Honor daily withdrawal limit
5. Check the balance 
6. Display Account information. 

---------------------------------------------------------------------------------------------------------------*/

// Banking.java 
package assign9; 
import java.util.Scanner; 
public class Banking 
{ 

 public static Scanner sc=new Scanner(System.in); 
 public SavingsAccount a=new SavingsAccount(); 
 public Customer c=new Customer(); 
 public SavingsAccount createAccount() 
 { 
   System.out.print("\n********************************************\n"); 
   sc.nextLine(); 
   System.out.print("Enter your name: "); 
   String customername=sc.nextLine(); 
   System.out.print("Enter your age: "); 
   int customerage=sc.nextInt(); 
   if(customerage<18) 
   { 
     do 
     { 
       System.out.print("Minimum age should be 18 to create an account.\nPlease enter valid age: "); 
       customerage=sc.nextInt(); 
     } 
     while(customerage<18); 
   } 

   System.out.print("Enter your account Id: "); 
   int accountid=sc.nextInt(); 
   System.out.print("Enter your account type: "); 
   String accounttype=sc.next(); 
   System.out.print("Enter balance: "); 
   double balance=sc.nextDouble(); 
   System.out.print("Enter minimum balance: "); 
   double minbalance=sc.nextDouble(); 
   c.setCustomerName(customername); 
   c.setCustomerAge(customerage); 
   a.setAccountId(accountid); 
   a.setAccountType(accounttype); 
   a.setBalance(balance); 
   a.setMinimumBalance(minbalance); 
   a.setCustomerObject(c); 
   System.out.println("\n********************************************"); 
   return a; 

 } 
 public void getWithdrawAmount() 
 { 
   System.out.print("\n********************************************\n"); 
   System.out.print("Enter the amount you want to withdraw: "); 
   double amount=sc.nextDouble(); 
   if(amount>20000) 
   { 
     System.out.println("****Withdrawal failed****.\nMaximum limit of withdrawal in one transaction is [ Rs.20000 ]"); 
   } 
   else 
   { 
     if(a.withdraw(amount)==true) 
     { 
       System.out.println("-----Withdrawal successful-----\n AVAILABLE BALANCE is: "+a.getBalance()); 
     } 
     else 
       System.out.println("SORRYYY!!! NOT ENOUGH BALANCE"); 
   } 
   System.out.println("\n********************************************"); 
 } 
 
 public void depositAmount(double amount) 
 { 
   System.out.print("\n********************************************\n"); 
   System.out.println("Amount deposited successfully. ") ; 

   System.out.println("AVAILABLE BALANCE is: "+a.getBalance()+ " + "+amount); 
   double bal=a.getBalance()+amount; 
   a.setBalance(bal); 
   System.out.println(a.getBalance()); 
   System.out.println("\n********************************************"); 
 } 
 
 public void checkBalance() 
 { 
   System.out.print("\n********************************************\n"); 
   System.out.println("AVAILABLE BALANCE is: "+a.getBalance()); 
   System.out.println("\n********************************************"); 
 } 
 
 public void displayAccountInformation() 
 { 
   System.out.print("\n********************************************"); 
   System.out.println("\nWelcome "+c.getCustomerName()+"! Following are your account details:"); 
   System.out.print("\n********************************************\n"); 
   System.out.println("Age :"+c.getCustomerAge()); 
   System.out.println("Account Id: "+a.getAccountId()); 
   System.out.println("Account Type: "+a.getAccountType()); 
   System.out.println("Balance: "+a.getBalance()); 
   System.out.println("Minimum balance: "+a.getMinimumBalance()); 
   System.out.println("\n********************************************"); 
 } 
 public static void main(String[] args) 
 { 
   SavingsAccount a; 
   Banking bm=new Banking(); 
   int ch; 
   do 
   { 
     System.out.println("\n1.Create an Account \n2.Display Account Information\n3.Check the Balance\n4.Deposit Money\n5.Withdraw Money"); 
     System.out.print("Enter your choice(enter 0 if exit)\n"); 
     ch=sc.nextInt(); 
     System.out.println(""); 

     if(ch==1) 
     { 
       a=bm.createAccount(); 
     } 

     else if(ch==2) 
     { 
       bm.displayAccountInformation(); 
     } 

     else if(ch==3) 
     { 
       bm.checkBalance(); 
     } 


     else if(ch==4) 
     { 
       System.out.print("Enter the amount you want to deposit: "); 
       double amount=sc.nextDouble(); 
       bm.depositAmount(amount); 
     } 

     else if(ch==5) 
     { 
       bm.getWithdrawAmount(); 
     } 

     else if(ch!=0) 
     { 
       System.out.print("\nINVALID INPUT!!\n"); 
     } 
   } 
   while(ch!=0); 
   System.out.print("\nOPERATION COMPLETED!!! Thank you :) "); 
 } 
} 
---------------------------------------------------------------------------------------------------------------
// Account.java 

package assign9; 
class Customer 
{ 
 private String customerName; 
 private int customerAge; 
 public void setCustomerName(String customerName) 
 { 
   this.customerName=customerName; 
 } 
 
 public String getCustomerName() 
 { 
   return customerName; 
 } 
 
 public void setCustomerAge(int customerAge) 
 { 
   this.customerAge=customerAge; 
 } 
 
 public int getCustomerAge() 
 { 
   return customerAge; 
 } 
} 
public abstract class Account 
{ 
 protected double balance; 
 protected int accountId; 
 protected String accountType; 
 protected Customer custobj; 
 
 public void setBalance(double balance) 
 { 
   this.balance=balance; 
 } 
 
 public double getBalance(){ 
   return balance; 
 } 
 
 public void setAccountId(int accountId) 
 { 
   this.accountId=accountId; 
 } 
 
 public int getAccountId(){ 
   return accountId; 
 } 
 
 public void setAccountType(String accountType) 
 { 
   this.accountType=accountType; 
 } 
 
 public String getAccountType(){ 
   return accountType; 
 } 
 
 public void setCustomerObject(Customer custobj) 
 { 
   this.custobj=custobj; 
 } 
 
 public Customer getCustomerObject() 
 { 
   return custobj; 
 } 
 public abstract boolean withdraw(double amount); 
} 
class SavingsAccount extends Account 
{ 
 private double minimumBalance; 
 
 public void setMinimumBalance(double minimumBalance){ 
   this.minimumBalance=minimumBalance; 
 } 
 
 public double getMinimumBalance(){ 
   return minimumBalance; 
 } 
 
 public boolean withdraw(double amount){ 
   if((balance-amount)>minimumBalance){ 
     balance-=amount; 
     return true; 
   } 
   else 
     return false; 
 } 
} 
