import java.util.Scanner;

class Main {
  public static void main(String[] args) {
   /*
    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = scanner.nextLine();
    System.out.println("My name is " + name);
    scanner.close();
    */
    
    Scanner obj = new Scanner(System.in);
    System.out.println("What is your name?");
    String name = obj.nextLine();
    
    System.out.println("What is your grade");
    int grade = obj.nextInt();
    
    
    System.out.print("Hello " + name + ". Welcome to the City of Norwalk. We are glad to have you in the " + grade + "th grade.");
    //scanner.close();
  }
}
