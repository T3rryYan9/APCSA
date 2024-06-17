import java.util.Scanner;
import java.lang.Math;

class Main {
  //start of method (Kinda like functions/parameters in python)
  static void hello(String name, int age, String food){
    System.out.println("Hello " + name);
    System.out.println("You are " + age + " years old.");
    System.out.println("You like " +food);
  }
// start of actual code
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
    
  System.out.println("What's your name?");
  String name = scanner.nextLine();
    
  System.out.println("What is your age?");
  int age = scanner.nextInt();

  scanner.nextLine(); //important to consume the nextInt 
    
  System.out.println("What is your favorite food?");
  String food = scanner.nextLine();
  
  hello(name, age, food);
  }
  
  //integer thingie
  static int add(int a, int b){
    return a+b;
  }
  
  public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
    
   System.out.println("Give A");
   int a = scanner.nextInt();
    
   System.out.println("Give B");
   int b = scanner.nextInt();  
    
   System.out.println("The sum of a and b is " + add(a,b));
  }

  static double areaOfCircle(double r) {
      return Math.PI * Math.pow(r, 2);
  }

  
    public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      
      System.out.println("Give the radius of a circle");
      double r = scanner.nextDouble();
      
      scanner.close();

      System.out.println("The area of this circle is " + areaOfCircle(r));
 
                  
    }   
   }
