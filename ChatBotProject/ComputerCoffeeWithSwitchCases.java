import java.util.Scanner;

class Main {
// REMEMBER SWITCHES DOES NOT ALLOW INEQUALITIES. LIKE X== OR X>1
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
  private static int donateNum;

  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
  // Quetion #: Data Type: # of Responces: Variable Used (Comment Format) 

  // First Question
  System.out.println("Hello, welcome to Computer Coffee! \nWhat is your name?");
  name = obj.nextLine();
  System.out.println("What a nice name, " + name + "!");
//Second Question
  boolean validChoice = false;
  boolean validChoice1 = false;
while (!validChoice) {
System.out.println("Do you want to dine in or order to take out?");
place = obj.nextLine().toLowerCase();
switch (place) {
case "dine in":
 System.out.println("A server will assist you shortly");
    while (!validChoice1) {
//Third Question
System.out.println("What seat would you like?, Seats 1-10 are open currently.");
 seat = obj.nextInt();
switch (seat) {
  case 1:
case 2:
case 3:
case 4:
 case 5:
case 6:
case 7:
case 8:
case 9:
case 10:
validChoice1 = true;
System.out.println("Ok, please be seated at seat " + seat + ".");
break;
default:
validChoice1 = false;
System.out.println("That is an invalid seat. Please choose a seat between 1 and 10.");
break;
}
}
validChoice = true;
break;
case "take out":
validChoice = true;
System.out.println("You chose to take out.");
System.out.println("We will now start with ordering your coffee. Press enter when ready ");
break;
default:
validChoice = false;
System.out.println("Invalid choice. Please enter 'dine in' or 'take out'.");
break;
}
}
  // Fourth Question: String: 3 Responces: SIZE
  validChoice = false;
obj.nextLine(); 
  while (!validChoice) {
    System.out.println("Hello, we will start making your coffee by asking what size you want. We offer large, medium, and small");
size = obj.nextLine().toLowerCase();
switch (size) {
case "large":
 validChoice = true;
System.out.println("Thirsty, huh?");
break;
case "medium":
validChoice = true;
System.out.println("Good Choice");
break;
case "small":
validChoice = true;
System.out.println("Ok, not super thirsty I see");
break;
default:
validChoice = false;
System.out.println("That's not a size that's offered here silly");
break;
    }
}

// Fifth Question: String: 5 Responces: TYPE
  validChoice = false;
while (!validChoice) {
    System.out.println("What type of coffee would you like? We currently offer 5 different types of coffee: Mocha, Macchiato, Latte, Black, and Americano");
    type = obj.nextLine().toLowerCase();

    switch (type) {
        case "mocha":
            validChoice = true;
            System.out.println("Ah? A connoisseur of chocolate?");
            break;

        case "macchiato":
            validChoice = true;
            System.out.println("No problem, I see you like cream!");
            break;

        case "latte":
            validChoice = true;
            System.out.println("I see you like things simple");
            break;

        case "black":
            validChoice = true;
            System.out.println("Wow, so mature.");
            break;

        case "americano":
            validChoice = true;
            System.out.println("Smooth decision ;)");
            break;

        default:
            validChoice = false;
            System.out.println("Invalid option");
            break;
    }
}

//Sixth Question: String: 2 Responces: TEMP
  validChoice = false;
while (!validChoice) {
    System.out.println("Would you like your coffee hot or iced?");
    temp = obj.nextLine().toLowerCase();

    switch (temp) {
        case "hot":
            validChoice = true;
            System.out.println("Ok, we'll heat it up for you");
            break;

        case "iced":
            validChoice = true;
            System.out.println("Ok, the weather must be hot then.");
//Seventh Question
            validChoice1 = false;
            while (!validChoice1) {
                System.out.println("How many cups of ice do you want? We can give you 1, 2, or 3 cups");
                numIce = obj.nextInt();

              switch (numIce) {
              case 1:
              case 2:
              case 3:
              validChoice1 = true;
             System.out.println("Ok, we'll add it for you");
              break;
              default:
              validChoice1 = false;
             System.out.println("That is an invalid amount");
               break;
                }
            }
            break;
 
        default:
          validChoice = false;
          System.out.println("Invalid option. Please enter 'hot' or 'iced'.");
          break;
    }
}

//Eigth Question: Integer: 1 Responce: numEsp
validChoice1 = false;

while (!validChoice1) {
    System.out.println("How many shots of espresso do you want? If none, just put 0");
    numEsp = obj.nextInt();

    int condition = 0;  

    switch (numEsp) {
        case 0:
            condition = 1; 
            break;
        case 1:
        case 2:
        case 3:
            condition = 1; 
            break;
        default:
            condition = (numEsp < 0) ? 2 : 3;
            break;
    }

    switch (condition) {
        case 1:
            validChoice1 = true;
            System.out.println("Ok.");
            break;
        case 2:
            System.out.println("That is an invalid amount");
            break;
        case 3:
            validChoice1 = true;
            System.out.println("Wow, you're really tired.");
            break;
    }
}

//Ninth Question: Integer: 1 Responce: numSug
  validChoice1 = false;
while (!validChoice1) {
    System.out.println("How many cups of sugar do you want? If none, just put 0");
    numSug = obj.nextInt();

    switch (numSug) {
        case 0:
            validChoice1 = true;
            System.out.println("Ok.");
            break;

        case 1:
        case 2:
        case 3:
            validChoice1 = true;
            System.out.println("Ok, we'll add it for you");
            break;
//NEEDS IF STATMENT, can't substitute for switch as values cannot directly be transformed into booleans. 
        default:
            validChoice1 = false;
            if (numSug < 0) {
                System.out.println("That is an invalid amount");
            } else {
              validChoice1 = true;
                System.out.println("You have a big sweet tooth.");
            }
            break;
    }
}

 //Tenth Question: Integer: 1 Responce: numMilk
  validChoice1 = false;
while (!validChoice1) {
    System.out.println("How many cups of milk do you want? If none, just put 0");
    numMil = obj.nextInt();

    switch (numMil) {
        case 0:
            validChoice1 = true;
            System.out.println("Ok.");
            break;

        case 1:
        case 2:
        case 3:
            validChoice1 = true;
            System.out.println("Ok, we'll add it for you");
            break;
//NEEDS IF STATMENT, can't substitute for switch as values cannot directly be transformed into booleans. 
        default:
            validChoice1 = false;
            if (numMil < 0) {
                System.out.println("That is an invalid amount");
            } else {
              validChoice1 = true;
                System.out.println("You must want some strong bones.");
            }
            break;
    }
}

//Eleventh Question: String: 2 Responces: food  
 obj.nextLine();
System.out.println("While it's being made, would you like to check out our food menu? \nYes or No?");
food = obj.nextLine();
validChoice = false;

while (!validChoice) {
    switch (food.toLowerCase()) {
        case "yes":
            validChoice = true;
            System.out.println("Seems like you're hungry.\n");

            // Twelfth Question: String: 4 Responses: foodType
            System.out.println("Please look at our menu options then! \nWe offer a Breakfast Burrito, a Warm Muffin, a Chocolate Chip Cookie, and a Bacon Egg and Cheese Sandwich \nWhat would you like?");
            validChoice1 = false;

            while (!validChoice1) {
                System.out.println("Enter the food item of choice");
                foodType = obj.nextLine().toLowerCase();

                switch (foodType) {
                    case "breakfast burrito":
                        validChoice1 = true;
                        System.out.println("A fine healthy choice");
                        break;
                    case "warm muffin":
                        validChoice1 = true;
                        System.out.println("Can't go wrong with this!");
                        break;
                    case "chocolate chip cookie":
                        validChoice1 = true;
                        System.out.println("Sweet!");
                        break;
                    case "bacon egg and cheese sandwich":
                        validChoice1 = true;
                        System.out.println("Excellent");
                        break;
                    default:
                        System.out.println("We do not serve that here");
                        break;
                }
            }

            break;
        case "no":
            validChoice = true;
            System.out.println("Ok then, seems like you aren't hungry");
            break;
        default:
            validChoice = false;
            System.out.println("Please enter 'yes' or 'no'");
            food = obj.nextLine();
            break;
    }
}
//Responce
  System.out.println("\nYour coffee order is ready!");

//Thirteenth Question: String: 2 Responce: secretSauce 
  System.out.println("Would you like our secret sauce?");
validChoice = false;

while (!validChoice) {
    secretSauce = obj.nextLine().toLowerCase();

    switch (secretSauce) {
        case "yes":
            validChoice = true;

            // Fourteenth Question: Integer: 1 Response: secretSauceNum
            validChoice1 = false;

            while (!validChoice1) {
                System.out.println("How many cups of secret sauce do you want? We can only give up to 3 cups");
                secretSauceNum = obj.nextInt();

                switch (secretSauceNum) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        validChoice1 = true;
                        System.out.println("Here are your sauces");
                        break;

                    default:
                        System.out.println("Invalid Value");
                        break;
                }
            }
            break;

        case "no":
            validChoice = true;
            System.out.println("I guess you don't like our secret sauce. Press enter to continue");
            break;

        default:
            System.out.println("Please type 'yes' or 'no'");
            break;
    }
}

//Fifthteenth Question: String: 2 Responce: napkin 
  System.out.println("Would you like our napkins? \nYes or no?");
validChoice = false;

while (!validChoice) {
    napkin = obj.nextLine().toLowerCase();

    switch (napkin) {
        case "yes":
            validChoice = true;

            // Sixteenth Question: Integer: 1 Response: napkinNum
            validChoice1 = false;

            while (!validChoice1) {
                System.out.println("How many napkins do you want?");
                napkinNum = obj.nextInt();

                switch (napkinNum) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        validChoice1 = true;
                        System.out.println("Here are your napkins");
                        break;

                    default:
                        System.out.println("Invalid Value");
                        break;
                }
            }
            break;

        case "no":
            validChoice = true;
            System.out.println("Someone is confident");
            break;

        default:
            System.out.println("Please type 'yes' or 'no'");
            break;
    }
}

  //Seventeenth Question: String: 2 Responce: donate
  System.out.println("Would you like to donate to the American Red Cross and help those in need? \nYes or no?");
validChoice = false;

while (!validChoice) {
    donate = obj.nextLine().toLowerCase();

    switch (donate) {
        case "yes":
            validChoice = true;
  // Eighteenth Question
            System.out.println("How much would you like to donate? Donate either 1, 5, or 10");
            int donateNum = obj.nextInt();

            switch (donateNum) {
                case 1:
                    System.out.println("Thank you for your donation of $1! \n");
                    break;
                case 5:
                    System.out.println("Thank you for your donation of $5! \n");
                    break;
                case 10:
                    System.out.println("Thank you for your donation of $10! \n");
                    break;
                default:
                    System.out.println("Invalid donation amount. Please consider donating another time. \n");
                    break;
            }
            break;

        case "no":
            validChoice = true;
            System.out.println("Another day");
            break;

        default:
            System.out.println("Please type 'yes' or 'no'");
            break;
    }
}


  System.out.println("Thank you for ordering at Computer coffee!! \nBelow is your receipt.");

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
