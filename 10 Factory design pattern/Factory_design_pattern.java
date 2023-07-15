/*AARTI RATHI
My website - https://shinchancode.github.io/3d-react-portfolio/
*/

/*Problem Statement :

Implement Factory design pattern for the given context. Consider Car building process, which requires many steps from allocating accessories to final makeup. These steps should be written as methods and should be called while creating an instance of a specific car type. Hatchback, Sedan, SUV could be the subclasses of Car class. Car class and its subclasses, CarFactory and Test Factory Pattern should be implemented 

----------------------------------------------------------------------------------------------------*/

// Car.java 

package aasign_10; 
public abstract class Car 
{ 

 public Car(CarType model) 
 { 
   this.model = model; 
   arrangeParts(); 
 } 
 
 private void arrangeParts() 
 { 
 // Do one time processing here 
 } 
 
 // Do subclass level processing in this method 
 protected abstract void construct(); 
 
 private CarType model = null; 
 
 public CarType getModel() 
 { 
   return model; 
 } 
 
 public void setModel(CarType model) 
 { 
   this.model = model; 
 } 
}
------------------------------------------------------------------------------------------------
// CarFactory.java 

package aasign_10; 
public class CarFactory 
{ 
 public static Car buildCar(CarType model) 
 { 
   Car car = null; 
   switch (model) { 
     case HATCHBACK: 
     car = new SmallCar(); 
     break; 

     case SEDAN: 
     car = new SedanCar(); 
     break; 

     case SUV: 
     car = new LuxuryCar(); 
     break; 

     default: 
 // throw some exception 
     break; 
   } 
   return car; 
 } 
} 
-------------------------------------------------------------------------------------------------------
// CarFactory.java

package aasign_10; 
public enum CarType 
{ 
 HATCHBACK, SEDAN, SUV 
} 
-----------------------------------------------------------------------------------------------------
// LuxuryCar.java -

package aasign_10; 
public class LuxuryCar extends Car 
{ 
 LuxuryCar() 
 { 
   super(CarType.SUV); 
   construct(); 
 } 
 @Override 
 protected void construct() 
 { 
   System.out.println("Building luxury car"); 
 // add accessories 
 } 
} 
------------------------------------------------------------------------------------------------------
// SedanCar.java 

package aasign_10; 
public class SedanCar extends Car 
{ 
 SedanCar() { 
   super(CarType.SEDAN); 
   construct(); 
 } 
 @Override 
 protected void construct() 
 { 
   System.out.println("Building sedan car"); 
 // add accessories 
 } 
} 

-----------------------------------------------------------------------------------------------------------------------
// SmallCar.java 

package aasign_10; 
public class SmallCar extends Car 
{ 

 SmallCar() 
 { 
   super(CarType.HATCHBACK); 
   construct(); 
 } 
 @Override 
 protected void construct() 
 { 
   System.out.println("Building small car"); 
 // add accessories 
 } 
} 
---------------------------------------------------------------------------------------------------------------------
// TestFactoryPattern.java 

package aasign_10; 
class TestFactoryPattern 
{ 
 public static void main(String[] args) 
 { 
   System.out.println(CarFactory.buildCar(CarType.HATCHBACK)); 
   System.out.println(CarFactory.buildCar(CarType.SEDAN)); 
   System.out.println(CarFactory.buildCar(CarType.SUV)); 
 } 
}
