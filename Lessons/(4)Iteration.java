class Main {
  public static void main(String[] args) {
    
    int goal = 1;

    System.out.println(goal++);
    System.out.println(goal);
    
    System.out.println("");
    //Counts 10 to 1 without the use of a loop
    int counter = 10;
    System.out.println(counter);
    counter = counter - 1;
    System.out.println(counter);
    counter = counter - 1;
    System.out.println(counter);
    counter = counter - 1;
    System.out.println(counter);
    counter = counter - 1;
    System.out.println(counter);
    counter = counter - 1;
    System.out.println(counter);
    counter = counter - 1;
    System.out.println(counter);
    counter = counter - 1;
    System.out.println(counter);
    counter = counter - 1;
    System.out.println(counter);
    counter = counter - 1;
    System.out.println(counter);

    System.out.println("");
    //Code that counts down to 10 to 1 with the use of a loop

    int i = 10; //index
    while(i>=1){
      System.out.println(i);
      i--;
    }
    
    System.out.println("");
    //Code that uses a for loop instead. 
    for (i = 10; i >=1; i--){
      System.out.println(i);
    }
  }
}
