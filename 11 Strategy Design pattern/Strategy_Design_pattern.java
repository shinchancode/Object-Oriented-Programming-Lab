/*AARTI RATHI
My website - https://shinchancode.github.io/3d-react-portfolio/ */

/*Problem Statement :
Implement and apply Strategy Design pattern for simple Shopping Cart where three payment strategies are used such as Credit Card, PayPal, Bit Coin. Create an interface for strategy pattern and give concrete implementation for payment 

----------------------------------------------------------------------------------------------------------------*/

// ShoppingCartTest.java 

package assign_11; 
import java.util.*; 
public class ShoppingCartTest 
{ 
 public static void main(String[] args) 
 { 
   int ch1,ch2; 
   Scanner sc = new Scanner(System.in); 
   ShoppingCart cart = new ShoppingCart(); 
   System.out.println("Enter first value"); 
   ch1 = sc.nextInt(); 
   System.out.println("Enter second value"); 
   ch2 = sc.nextInt(); 
   Item item1 = new Item("1234",ch1); 
   Item item2 = new Item("5678",ch2); 

   cart.addItem(item1); 
   cart.addItem(item2); 

 //pay by paypal 
   cart.pay(new PaypalStrategy("aarti.rathi1710@gmail.com", "pwd")); 

 //pay by credit card 
   cart.pay(new CreditCardStrategy("Aarti Rathi", "1234567890123456", "786", "12/15")); 
   System.out.print("\nOPERATION COMPLETED!!! Thank you :) "); 
 } 
} 
----------------------------------------------------------------------------------------------
// CreditCardStrategy.java 

package assign_11; 
public class CreditCardStrategy implements PaymentStrategy 
{ 
 private String name; 
 private String cardNumber; 
 private String cvv; 
 private String dateOfExpiry; 
 
 public CreditCardStrategy(String nm, String ccNum, String cvv, String expiryDate){ 
   this.name=nm; 
   this.cardNumber=ccNum; 
   this.cvv=cvv; 
   this.dateOfExpiry=expiryDate; 
 } 
 @Override 
 public void pay(int amount) 
 { 
   System.out.println(amount +" paid with credit/debit card"); 
 } 
} 
---------------------------------------------------------------------------------------------
// Item.java 

package assign_11; 
public class Item 
{ 
 private String upcCode; 
 private int price; 
 
 public Item(String upc, int cost) 
 { 
   this.upcCode=upc; 
   this.price=cost; 
 } 
 public String getUpcCode() 
 { 
   return upcCode; 
 } 
 public int getPrice() 
 { 
   return price; 
 } 
 
} 
------------------------------------------------------------------------------------------------
// PaymentStrategy.java 

package assign_11; 
public interface PaymentStrategy 
{ 
 public void pay(int amount); 
} 
-----------------------------------------------------------------------------------------------
// PaypalStrategy.java 

package assign_11; 
public class PaypalStrategy implements PaymentStrategy 
{ 
 private String emailId; 
 private String password; 
 
 public PaypalStrategy(String email, String pwd) 
 { 
   this.emailId=email; 
   this.password=pwd; 
 } 
 @Override 
 public void pay(int amount) 
 { 
   System.out.println(amount + " paid using Paypal."); 
 } 
} 
--------------------------------------------------------------------------------------------------
// ShoppingCart.java 

package assign_11; 
import java.text.DecimalFormat; 
import java.util.ArrayList; 
import java.util.List; 
public class ShoppingCart 
{ 
 //List of items 
 List<Item> items; 
 
 public ShoppingCart() 
 { 
   this.items=new ArrayList<Item>(); 
 } 
 
 public void addItem(Item item) 
 { 
   this.items.add(item); 
 } 
 
 public void removeItem(Item item) 
 { 
   this.items.remove(item); 
 } 
 
 public int calculateTotal() 
 { 
   int sum = 0; 
   for(Item item : items) 
   { 
     sum += item.getPrice(); 
   } 
   return sum; 
 } 
 
 public void pay(PaymentStrategy paymentMethod) 
 { 
   int amount = calculateTotal(); 
   paymentMethod.pay(amount); 
 } 
} 
