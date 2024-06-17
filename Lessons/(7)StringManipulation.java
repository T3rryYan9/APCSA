class Main {
  public static void main(String[] args) {
    String name = "Mr. Ashong"; //%s
    String subject = "Math"; //%s
    int grade = 95; //%d
    double gpa = 6.7; //%f
    char percentSign = '%'; //%c
    boolean tellingTheTruth = false;//%b
    
    String combinedString = String.format("%s loves %s. He got a %d on his math exam. His gpa is %f. He is currently ranked in the top 10 %c in his class. Everything he just said is %b", name, subject, grade, gpa, percentSign, tellingTheTruth);
    System.out.println(combinedString); 

    //Counting characters including spaces
    //String name = "Ashong";
    
    System.out.println(name.length()); //Count char + space
    System.out.println(name.isEmpty()); //Checks if its empty

    // Capitalize/ lowercase every character in string

    String firstName = "julian";
    String lastName = "Ashong";
    System.out.println(firstName.toUpperCase());
    System.out.println(lastName.toLowerCase());

    //Comparing Strings

    String name1= new String ("julian Ashong");
    String name2= new String ("Julian Ashong");

    System.out.println(name1.equals(name2));//Checks for characters
    System.out.println(name1.equalsIgnoreCase(name2));//ignores upper case

    //Replacing String
    String lorem=("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");

    //Two different ways of doing it
    String updateText = lorem.replace("laborum","cat");
    System.out.println(updateText);
    
    System.out.println(lorem.replace("consectetur","taco"));

    //Replacing String
    //String lorem=("I hate math.");
    System.out.println(lorem.contains("hate"));

    // Try It

    String text = ("Deep learning is a fast-moving field with sweeping relevance in today's increasingly digital world. Understanding Deep Learning provides an authoritative, accessible, and up-to-date treatment of the subject, covering all the key topics along with recent advances and cutting-edge concepts. Many deep learning texts are crowded with technical details that obscure fundamentals, but Simon Prince ruthlessly curates only the most important ideas to provide a high density of critical information in an intuitive and digestible form. From machine learning basics to advanced models, each concept is presented in lay terms and then detailed precisely in mathematical form and illustrated visually. The result is a lucid, self-contained textbook suitable for anyone with a basic background in applied mathematics.");
    System.out.println(text.contains("machine"));
    
    System.out.println(text.replace("Deep","AI"));
    System.out.println(text.toUpperCase());  
  }
}
