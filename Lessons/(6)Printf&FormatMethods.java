class Main {
  static String className = "Physics";
  public static void main(String[] args) {
    
    String firstName = "Terry";
    String lastName = "Yang";
    int grade = 10;
    //%s finds the first string %d finds the first integer
    String combinedStrings = String.format("Hello everyone my name is %s %s and I am in the %dth grade.", firstName, lastName, grade);
    System.out.print(combinedStrings);
    System.out.println("");
    
    String classTeacher = "John";

    String newLine = String.format("I am in %s and my teacher's name is %s", className, classTeacher);
    System.out.print(newLine);
      
    /*System.out.println("Hello everyone my name is " + name + " and I am in the " + grade + "th grade.");*/
    
  }
}
