// for each - this allows you to acess every element in your list.
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // String name = ""; //Condition to be checking for
    // //while loop to constantly check if the user input is blank
    // while(name.isBlank()){
    //   System.out.println("Enter your name:");
    //   name = scanner.nextLine();
    // }
    // System.out.println("Your name is " + name);

    String[] Animals = {"cat", "dog", "bird", "fish", "snake", "chicken"};
      for (String i: Animals){
        System.out.println(i);
      }
    Scanner scanner = new Scanner(System.in);
    String email = "";
    while (email.isBlank() || !email.contains("@")) {
      System.out.println("Please enter a valid email address.");
      email = scanner.nextLine();
    }
    System.out.println("Your email is " + email);
  }
}
