import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int rows;
    int columns;
    String symbol = "";

    System.out.println("Enter the amount of rows");
    rows = scanner.nextInt();

    System.out.println("Enter the amount of columns");
    columns = scanner.nextInt();

    System.out.println("Enter a symbol");
    scanner.nextLine();
    symbol = scanner.nextLine();

    for (int i = 1; i <= rows; i++) {
        System.out.println();
        for (int j = 1; j <= columns; j++) {
            System.out.print(symbol);
        }
    }
    public static void main(String[] args) {
      String [] animals = {"dog", "cat", "bird", "fish", "horse"};
      for (String i: animals )
      System.out.println(i);

    
  }
}
