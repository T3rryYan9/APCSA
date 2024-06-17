public class Main {
  public static void main(String[] args) {
//Encapsulation -= attributes of a class will be hidden or private, can be accessed only through methods. Must use Getter and setters.  You should make attributes private if you dont have a reason to make them public/protected.

// Copying objcts = the goal is to have the same object but a unique digital address.  Then each address can be used independently 

    

    Car car1 = new Car("Toyota", "Highlander", 2024);
    Car car2 = new Car("BMW", "X5", 2024);

// what not to do
  //  car1 = car2; It only copies the digital address
    // instead do this
    car2.copy(car1);
    
    System.out.println(car1); //print out digital address of object
    System.out.println(car2);

     System.out.println("");
    
// getter method, gets values
    System.out.println(car1.getMake());
    System.out.println(car1.getYear());
    System.out.println(car1.getModel());

    System.out.println("");

    System.out.println(car2.getMake());
    System.out.println(car2.getYear());
    System.out.println(car2.getModel());

    System.out.println("");
    
// setter method
// set changes values
    car1.setYear(2012);
    car1.setModel("Lexus");
    car1.setMake("Taco");
    System.out.println(car1.getMake());
    System.out.println(car1.getYear());
    System.out.println(car1.getModel());
  }
}
