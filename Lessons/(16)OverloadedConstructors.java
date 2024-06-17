class Main {
  public static void main(String[] args) {
    Pizza pizza = new Pizza("Crusted", "Tomatos", "Pepper Jack", "Bacon");
    System.out.println("This is your ingredients to your pizza");
    System.out.println(pizza.bread);
    System.out.println(pizza.sause);
    System.out.println(pizza.cheese);
    System.out.println(pizza.topping);

    Taco taco = new Taco("Corn Tortilla", "Tomatos", "jalapeno cheese", "lengua");
    System.out.println("\nThis is your ingredients to your taco");
    System.out.println(taco.tortilla);
    System.out.println(taco.vegetables);
    System.out.println(taco.cheese);
    System.out.println(taco.meat);
    
  }
}
