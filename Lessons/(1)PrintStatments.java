class Main {
  static int grade = 5; //Defined Global variable
  static String greeting = "Hello"; // Assignment/ Global Var

  public static void main(String[] args) {
    int age = 10;//This defines the variable age into an int and sets the value to 10.
    int age1 = 11;//Local variable
    
    System.out.println("I am " + age1 + " years old." + " I am in grade " + grade ); //This line prints out a statement with the age of a person

    //Try it on your own 
    String easyGreeting = "Hello my man";//Local Var
    System.out.println(" ");
    System.out.println(easyGreeting + " said the dog." + greeting + " said the cat.");
    //End
  }
  
}
