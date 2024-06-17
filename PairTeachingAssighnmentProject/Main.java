import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
// Polymorphism 
    Soup soup = new Soup();
    Taco taco = new Taco();
    Rice rice = new Rice();

    soup.eat();
    taco.eat();
    rice.eat();

// Dynamic Polymorphism 
    Scanner scanner = new Scanner(System.in);
    Food food;
    System.out.println("What do you want to eat");
    System.out.println("Type 1 for Soup, Type 2 for Taco, Type 3 for Rice ");
    int choice = scanner.nextInt();
    if(choice==1){
      food = new Soup();
      food.eat();
    } else if(choice ==2){
      food = new Taco();
      food.eat();
    } else if (choice ==3){
      food = new Rice();
      food.eat();
    } else {
      System.out.println("That was not a choice silly");
    }

  }
}
