class Main {
  static int x1 = 10; //Global variables
  static float y1 = 6.5F;
  public static void main(String[] args) {
    //interger types
    int car = 10;//integer variable
    long money = 145435457665912L; 

    //float
    float money2 = 10000.2F;

    //boolean  
    boolean dayOfTheWeek = false;
    boolean dayOfTheDay = true;
    
    System.out.println("this number is very long " + money2);
    
    //Math in Java
    int number1 = 10;
    int number2 = 20;
    //addition
    System.out.println(number2 + number1);
    //subraction
    System.out.println(number2 - number1);
    //multiplication
    System.out.println(number2 * number1);
    //Division
    System.out.println(number2 / number1);
    //Mod
    System.out.println(number2 % number1);

    //Practice 9/8/23
    int x2 = 2;
    float y2 = 2.5F;

    //point slope equation
    float rise = y1 - y2;
    int run = x1 - x2;
    float slope = rise/run;
    System.out.println("The slope between (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + ") is " + slope + ".");
  

  }
}
