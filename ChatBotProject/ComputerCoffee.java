import java.util.Scanner;

    class Main {
    //Declares most of the variables needed for this program as global variables
      private static String name;
      private static int seat;
      private static String place;
      private static String size;
      private static String type;
      private static String temp;
      private static int numIce;
      private static int numEsp;
      private static int numSug;
      private static int numMil;
      private static String food;
      private static String foodType;
      private static String secretSauce;
      private static int secretSauceNum;
      private static String napkin;
      private static int napkinNum;
      private static String donate;
      private static double donateNum;

      public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
      // Quetion #: Data Type: # of Responces: Variable Used (Comment Format) 

      // First Question: String: 1 Responce: NAME
      System.out.println("Hello, welcome to Computer Coffee! \nWhat is your name?");
      name = obj.nextLine();
      System.out.println("What a nice name, " + name + "!");

      // Second Question: String: : 2 Responce: PLACE
      boolean validChoice = false;
      Boolean validChoice1 = false;
      while (!validChoice) {
        System.out.println("Do you want to dine in or order to take out?");
        place = obj.nextLine();

        if (place.equalsIgnoreCase("dine in")) {
          System.out.println("A server will assist you shortly");
          validChoice = true;
      // Third Question: Integer: 1 Responces: SEAT
          while (!validChoice1){
            System.out.println("What seat would you like?, Seats 1-10 are open currently.");
            seat = obj.nextInt();
            if (seat < 1 || seat > 10) {
              validChoice1 = false;
              System.out.println("That is an invalid seat");
            } else {
              validChoice1 = true;
              System.out.println("Ok, please be seated at seat " + seat + ".");
            }
          }
    //***********************************************************************************
        } else if (place.equalsIgnoreCase("take out")) {
          validChoice = true;
          System.out.println("You chose to take out.");
          System.out.println("We will now start with ordering your coffee. Press enter when ready ");
          break;
        } else {
          validChoice = false;
          System.out.println("Invalid choice. Please enter 'dine in' or 'take out'.");
        }
      }
      // Fourth Question: String: 3 Responces: SIZE 
      validChoice = false;
      obj.nextLine(); 
      while(!validChoice){
        System.out.println("Hello, we will start making your coffee by asking what size you want. We offer large, medium and small");
        size = obj.nextLine();
        if (size.equalsIgnoreCase("large")){
          validChoice = true;
          System.out.println("Thirsty, huh?");
        } else if (size.equalsIgnoreCase("medium")){
          validChoice = true; 
          System.out.println("Good Choice");
        } else if (size.equalsIgnoreCase("small")){
          validChoice = true;
          System.out.println("Ok, not super thirsy I see");
        } else {
          validChoice = false;
          System.out.println("That's not a size thats offered here silly");
        }
      }

    // Fifth Question: String: 5 Responces: TYPE
      validChoice = false;
      while(!validChoice){
        System.out.println("What type of coffee would you like? We currently offer 5 difffent types of coffee. Mocha, macchiato, latte, black, and Americano");
        type = obj.nextLine();
        if (type.equalsIgnoreCase("mocha")){
            validChoice = true;
            System.out.println("Ah? A connoisseur of chacolate?");
        } else if (type.equalsIgnoreCase("macchiato")){
            validChoice = true;
            System.out.println("No problem, I see you like cream!");
        } else if (type.equalsIgnoreCase("Latte")){
            validChoice = true;
            System.out.println("I see you like things simple");
        } else if (type.equalsIgnoreCase("Black")){
            validChoice = true;
            System.out.println("Wow,so mature.");
        } else if (type.equalsIgnoreCase("Americano")){
            validChoice = true; 
            System.out.println("Smooth decision ;)");
        } else {
            validChoice = false;
            System.out.println("Invalid option");
        }
      }
    //Sixth Question: String: 2 Responces: TEMP
      validChoice = false;
      while(!validChoice){
        System.out.println("Would you like your coffee hot or iced?");
        temp = obj.nextLine();
        if (temp.equalsIgnoreCase("Hot")){
          validChoice = true;
          System.out.println("Ok, we'll heat it up for you");
        } else if (temp.equalsIgnoreCase("Iced")){
          validChoice = true;
          System.out.println("Ok, the weather must be hot then.");
    // Seventh Question: Integer: 1 Responce: numICE
          validChoice1 = false;
          while(!validChoice1){
          System.out.println("How many cups of ice do you want? We can give you 1,2, or 3 cups");
          numIce = obj.nextInt();
          if (numIce < 1 || numIce > 3){
            validChoice1 = false;
            System.out.println("That is an invald amount");
          } else {
            validChoice1 = true;
            System.out.println("Ok, we'll add it for you");
          }
          }
        }
        }
    //Eigth Question: Integer: 1 Responce: numEsp
      validChoice1 = false;
      while(!validChoice1){
        System.out.println("How many shots of espresso do you want? If none, just put 0");
        numEsp = obj.nextInt();
        if (numEsp < 0){
          validChoice1 = false;
          System.out.println("That is an invald amount");
        } else if (numEsp == 0) {
          validChoice1 = true;
          System.out.println("Ok.");
        } else if (numEsp > 3) {
          validChoice1 = true;
          System.out.println("Wow, you're really tired.");
        } else {
          validChoice1 = true;
          System.out.println("Good amount");
        }
      }
    //Ninth Question: Integer: 1 Responce: numSug
      validChoice1 = false;
      while(!validChoice1){
        System.out.println("How many cups of sugar do you want? If none, just put 0");
        numSug = obj.nextInt();
        if (numSug < 0){
          validChoice1 = false;
          System.out.println("That is an invald amount");
        } else if (numSug == 0) {
          validChoice1 = true;
          System.out.println("Ok.");
        } else if (numSug > 3) {
          validChoice1 = true;
          System.out.println("You have a big sweet tooth.");
        } else {
          validChoice1 = true;
          System.out.println("Ok, we'll add it for you");
        }
      }
     //Tenth Question: Integer: 1 Responce: numMilk
      validChoice1 = false;
      while(!validChoice1){
        System.out.println("How many cups of milk do you want? If none, just put 0");
        numMil = obj.nextInt();
        if (numMil < 0){
          validChoice1 = false;
          System.out.println("That is an invald amount");
        } else if (numMil == 0) {
          validChoice1 = true;
          System.out.println("Ok.");
        } else if (numMil > 3) {
          validChoice1 = true;
          System.out.println("You must want some strong bones.");
        } else {
          validChoice1 = true;
          System.out.println("Good decision");
        }
      }

    //Eleventh Question: String: 2 Responces: food  
      obj.nextLine();
      System.out.println("While it's being made, would you like to check out our food menu? \nYes or No?");
      food = obj.nextLine();
      validChoice = false;
      while(!validChoice){
        if (food.equalsIgnoreCase("Yes")){
          validChoice = true;
          System.out.println("Seems like you're hungry.\n");
    // Twelfth Question: String: 4 Responces: foodType
          System.out.println("Please look at our menu options then! \nWe offer a Breakfast Burrito, a Warm Muffin, a Chocolate Chip Cookie, and a Bacon Egg and Cheese Sandwich \nWhat would you like?");
          validChoice1 = false;
          while(!validChoice1){
            System.out.println("Enter the food item of choice");
            foodType = obj.nextLine();
            if (foodType.equalsIgnoreCase("breakfast burrito")){
              validChoice1 = true;
              System.out.println("A fine healthy choice");
            } else if (foodType.equalsIgnoreCase("warm muffin")){
              validChoice1 = true;
            System.out.println("Can't go wrong with this!");
            } else if (foodType.equalsIgnoreCase("chocolate chip cookie")){
              validChoice1 = true;
              System.out.println("Sweet!");
            } else if (foodType.equalsIgnoreCase("Bacon Egg and Cheese sandwich")){
              validChoice1 = true;
              System.out.println("Excellent");
            } else {
              System.out.println("We do not serve that here");
            }
          }

    //**************************************************************************************** */
        } else if (food.equalsIgnoreCase("No")){
          validChoice = true;
          System.out.println("Ok then, seems like you aren't hungry");
        } else {
          validChoice = false;
          System.out.println("Please enter yes or no");
        }
      }

    //Responce
      System.out.println("\nYour coffee order is ready!");

    //Thirteenth Question: String: 2 Responce: secretSauce 
      System.out.println("Would you like our secret sauce?");
      validChoice = false;
      while(!validChoice){
        secretSauce = obj.nextLine();
        if (secretSauce.equalsIgnoreCase("Yes")){
          validChoice = true;
    //Fourteenth Question: Integer: 1 Responce: secretSauceNum
          validChoice1 = false;
          while(!validChoice1){
            System.out.println("How many cups of secret sauce do you want? We can only give up to 3 cups");
            secretSauceNum = obj.nextInt();
            if (secretSauceNum < 0 || secretSauceNum > 3){
              System.out.println("Invalid Value");
            } else {
              validChoice1 = true;
              System.out.println("Here are your sauces");
            }
          }
    //********************************************************************** */
        } else if (secretSauce.equalsIgnoreCase("No")){
          validChoice = true;
          System.out.println("I guess you don't like our secret sauce. Press enter to continue");
        } else {
          System.out.println("Please type yes or no");
        }
      }
    //Fifthteenth Question: String: 2 Responce: napkin 
      System.out.println("Would you like our napkins? \nYes or no?");
      validChoice = false;
      while(!validChoice){
        napkin = obj.nextLine();
        if (napkin.equalsIgnoreCase("Yes")){
          validChoice = true;
    //Sixteenth Question: Integer: 1 Responce: napkinNum
          validChoice1 = false;
          while(!validChoice1){
            System.out.println("How many napkins do you want?");
            napkinNum = obj.nextInt();
            if (napkinNum < 0){
              System.out.println("Invalid Value");
            } else {
              validChoice1 = true;
              System.out.println("Here are your napkins");
            }
          }
    //********************************************************************** */
        } else if (napkin.equalsIgnoreCase("No")){
          validChoice = true;
          System.out.println("Someone is confident");
        } else {
          System.out.println("Please type yes or no");
        }
      }

      //Seventeenth Question: String: 2 Responce: donate
      System.out.println("Would you like to donate to the American Red Cross and help those in need? \nYes or no?");
      validChoice = false;
      while(!validChoice){
        donate = obj.nextLine();
        if (donate.equalsIgnoreCase("Yes")){
          validChoice = true;
    //Eighteenth Question: Integer: 1 Responce: donateNum
          validChoice1 = false;
          while(!validChoice1){
            System.out.println("How much would you like to donate?");
            donateNum = obj.nextInt();
            if (donateNum < 0){
              System.out.println("Invalid Value");
            } else {
              validChoice1 = true;
              System.out.println("Thank you for your generosity! \n");
            }
          }
    //********************************************************************** */
        } else if (donate.equalsIgnoreCase("No")){
          validChoice = true;
          System.out.println("Another day");
        } else {
          System.out.println("Please type yes or no");
        }
      }

      System.out.println("Thank you for ordering at Computer Coffee!! \nBelow is your receipt.");

      double iceCost = numIce * 1.25; 
      double espCost;
      double sugCost;
      double milCost;
      double foodCost = 5;
      double sSCost = secretSauceNum * 1.2;
      double napkinCost = napkinNum * .9;
    //Printing out receipt: All math operators are included here
      System.out.println("\n******* Here is your receipt *******");
      System.out.println("Name: " + name);

      System.out.println("Place: " + place);
      if (place.equalsIgnoreCase("dine in")){
        System.out.println("Seat Number: " + seat);
      }

      System.out.println("Size: " + size);
      System.out.println("Coffee Type: " + type);
      System.out.println("Coffee Temp: " + temp);

      if (temp.equalsIgnoreCase("iced")){
      System.out.println("Cups of Ice: " + numIce);
      System.out.println("$" + iceCost);
      }

      System.out.println("Espresso Shots: " + numEsp);
      espCost = numEsp * 1.5;
      System.out.println("$" + espCost);

      System.out.println("Cups of Sugar: " + numSug);
      sugCost = numSug * 1.5;
      System.out.println("$" + sugCost);

      System.out.println("Cups of Milk: " + numMil);
      milCost = numMil * 1.25;
      System.out.println("$" + milCost);

      System.out.println("Had Food?: " + food);
      if (food.equalsIgnoreCase("Yes")){
        System.out.println("Food Type:" + foodType);
        System.out.println("$" + foodCost);
      }
      System.out.println("Had Secret Sauce?: " + secretSauce);
      if (secretSauce.equalsIgnoreCase("Yes")){
        System.out.println("Amount of Secret Sauce: " + secretSauceNum);
        sSCost = secretSauceNum * 1.25;
        System.out.println("$" + sSCost);
      }

      System.out.println("Had Napkins?: " + napkin);
      if (napkin.equalsIgnoreCase("Yes")){
        System.out.println("Amount of Napkins: " + napkinNum);
        System.out.println("$" + napkinCost);
      }

      System.out.println("Donated?: " + donate);
      if (donate.equalsIgnoreCase("Yes")){
        System.out.println("Amount Donated: " + "$" + donateNum);
      }
      double subTotal = iceCost + espCost + sugCost + milCost + foodCost + sSCost + napkinCost;
      System.out.println("Subtotal: $" + subTotal);
      double salesTax = Math.ceil((subTotal * .0635) * 100) / 100;
      System.out.println("Sales Tax: $" + salesTax);
      double amountDue = Math.ceil((subTotal + salesTax + donateNum) * 100) / 100;
      System.out.println("Amount Due: $" + amountDue);
      System.out.println("\n");
      }
    }
