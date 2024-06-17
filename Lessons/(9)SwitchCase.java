import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // int age = 200;
    // if (age < 18) {
    //   System.out.println("You are not old enough to drive.");
    // } else if (age >= 18 && age <= 65) {
    //   System.out.println("You are old enough to drive");
    // } else {
    //   System.out.println("Get an Uber"); 
    // }

    // Switch cases- Allows for variables to be est for equality against a "list" of value
  // String day = "Noday";
  //   switch(day){
  //       case "Monday": System.out.println("Today is Monday");
  //       break;
  //       case "Tuesday": System.out.println("Today is Tuesday");
  //       break;
  //       case "Wednesday": System.out.println("Today is Wednesday");
  //       break;
  //       case "Thursday": System.out.println("Today is Thursday");
  //       break;
  //       case "Friday": System.out.println("Today is Friday");
  //       break;
  //       case "Saturday": System.out.println("Today is Saturday");
  //       break;
  //       case "Sunday": System.out.println("Today is Sunday");
  //       break;
  //     default: System.out.println("This aint a day of da week");
  //   }
    Scanner obj = new Scanner(System.in);
    int score = 0;
    System.out.println("Welcome to this 5 question quiz on American History!");
    System.out.println("First Question, what year did America declare independence? A.) 1776 B.) 2001 C.) 1982 D.) 1726");
    String question1 = obj.nextLine();
    switch (question1){
      case "A": System.out.println("Correct!");
      score = score + 1;
      break;
      case "B": System.out.println("Incorrect!");
      break;
      case "C": System.out.println("Incorrect!");
      break;
      case "D": System.out.println("Incorrect!");
      break;
      default: System.out.println("Please enter your answer as either capital A B C or D");
      break;
    }
      System.out.println("Second Question, who was America's first president? A.) Roy Roc B.) Thomas Paine C.) George Washington D.) idk");
      String question2 = obj.nextLine();
      switch (question2){
      case "C": System.out.println("Correct!");
      score = score + 1;
      break;
      case "B": System.out.println("Incorrect!");
      break;
      case "A": System.out.println("Incorrect!");
      break;
      case "D": System.out.println("Incorrect! Really?");
      break;
      default: System.out.println("Please enter your answer as either capital A B C or D");
      break;
      
    }
    System.out.println("Third Question, who did America declare independence from? A.) America B.) China C.) Japan D.) Great Britain?");
    String question3 = obj.nextLine();
    switch (question3){
      case "A": System.out.println("Incorrect!");
      break;
      case "B": System.out.println("Incorrect!");
      break;
      case "C": System.out.println("Incorrect!");
      break;
      case "D": System.out.println("Correct!");
      score = score + 1;
      break;
      default: System.out.println("Please enter your answer as either capital A B C or D");
      break;
    }
    System.out.println("Fourth Question, How many states does the United States have? A.) 50 B.) 2 C.) 100 D.) 9 ?");
    String question4 = obj.nextLine();
    switch (question4){
      case "A": System.out.println("Correct!");
      score = score + 1;
      break;
      case "B": System.out.println("Incorrect!");
      break;
      case "C": System.out.println("Incorrect!");
      break;
      case "D": System.out.println("Incorrect!");
      break;
      default: System.out.println("Please enter your answer as either capital A B C or D");
      break;
    }
    System.out.println("Fifth and last question Question, who is the current president? A.) Joe Rogen B.) Roy Roc C.) Joe Biden D.) Obama ?");
    String question5 = obj.nextLine();
    switch (question5){
      case "A": System.out.println("Incorrect!");
      break;
      case "B": System.out.println("Incorrect!");
      break;
      case "C": System.out.println("Correct!");
      score = score + 1;
      break;
      case "D": System.out.println("Incorrect!");
      break;
      default: System.out.println("Please enter your answer as either capital A B C or D");
      break;
    }
    System.out.println("You scored " + score + " out of 5");
    System.out.println("You are done with this quiz!");
  }
}
