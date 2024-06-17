import java.util.Scanner;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
  //overloaded method = method that shares the same name but has different paremeters
    double x = multiply(1.2,2.3);
  System.out.println(x);
    double q = multiply(1.1,2.2,3.4);
  System.out.println(q);
    double w = multiply(1.2,2.3,3.4,4.2);
  System.out.println(w);
    double e = multiply(1.5,2.2,3.5,4.6,5.3);
  System.out.println(e);
    
  }
static double multiply(double a, double b){
  System.out.println("This is overload method 1");
  return a*b;
}
static double multiply(double a, double b, double c){
  System.out.println("This is overload method 2");
  return a*b*c;
}
static double multiply(double a, double b, double c, double d){
  System.out.println("This is overload method 3");
  return a*b*c*d;
}
static double multiply(double a, double b, double c, double d, double e){
  System.out.println("This is overload method 4");
  return a*b*c*d*e;
}

//final key - anything final cannont change.  Very similar to having a constant in algebra.
  final double pi = 3.1415926535914;
  

  // System.out.println(pi);
Scanner scanner = new Scanner(System.in);
    System.out.println("Give the radius of a circle");
    double r = scanner.nextDouble();
    double area = circleArea(r);
    System.out.println("The area of the circle is: " + area);
  }

  static double circleArea(double r) {
    System.out.println("The radius of the circle is: " + r);
    return Math.PI * Math.pow(r, 2);
  }
}

