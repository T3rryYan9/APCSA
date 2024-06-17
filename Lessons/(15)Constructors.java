// constructor = special method that is called when an object is created 
// the point of this assignmnet is to make an object and access different attibutes

public class Main {
  public static void main(String[] args) {
    Human human1 = new Human("John", 35, 150, "Doe", 1231123, 10000);

    System.out.println(human1.name);
    System.out.println(human1.age);
    System.out.println(human1.weight);
    System.out.println(human1.lastName);
    System.out.println(human1.ssn);
    System.out.println(human1.salary);
    human1.eat();
    human1.drinking();
    
    System.out.println("");

    
//Try it 

    Car car1 = new Car("Toyota", 2011, 3263, "Sedan", 4, 20195);

    car1.brand();
    car1.year();
    System.out.println("Car year: " + car1.year);
    System.out.println("Car weight in lbs: " + car1.weight);
    System.out.println("Car make: " + car1.make);
    System.out.println("Car tire number: " + car1.tireNum);
    System.out.println("Car MSRP: " + car1.cost);
  }
}
