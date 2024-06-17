import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Main {
// Array is another term to refer to ists or basically a variable that can hold multiple values. 
// Loops allows you to do a command over and over again.  There are for and while loops 
// For loops will keep running untill a condiion is met
  public static void main(String[] args) {
   String [] cars = { "Volvo", "BMW", "Ford", "Mazda"};
 System.out.println(cars[2]);

    
    String[] cars = new String[4];
    cars[0] = "Volvo";
    cars[1] = "BMW";
    cars[2] = "Ford";
    cars[3] = "Mazda";
    System.out.println(cars[1]);
int = data type
//i = index = where you start counting from
//i<5 = the argument presented
//i++ counts up for every iteration that happened. 
  
   for(int i = 0; i < 5; i++){
     System.out.println(i);
    
 // Print Every string in the list
ArrayList<String> food = new ArrayList<String>();

food.add("Pizza");
food.add("Cheeseburger");
food.add("Rice");
food.add("Hot Dog");
food.set(1,"Sushi");
    food.clear ();
for (int i = 0; i < food.size(); i++) {
    System.out.println(food.get(i));
}
    List<String> hwList = new ArrayList<>(Arrays.asList("Math", "English", "Science", "History", "PE"));

System.out.println("\nBefore ");
for (int i = 0; i < hwList.size(); i++) {
  System.out.println(hwList.get(i));
}
    
System.out.println("\nAfter ");
hwList.add("Computer Science");
    for (int i = 0; i < hwList.size(); i++) {
      System.out.println(hwList.get(i));
    }

   
  }
}
