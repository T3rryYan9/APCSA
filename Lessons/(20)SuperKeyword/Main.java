public class Main {
  public static void main(String[] args) {
// Super is a keyword that refers to the superclass (parent) of an object similar to the this class
    Hero hero1 = new Hero("Batman", 42, "Wealthy");
    System.out.println(hero1.name);
    System.out.println(hero1.age);
    System.out.println(hero1.power);
  }
}
