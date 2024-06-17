class Main {
  public static void main(String[] args) {
    // String [][] cars = new String [3][3];
    // cars [0][0] = "Camaro";
    // cars [0][1] = "Corvette";
    // cars [0][2] = "Mercedes";
    // cars [1][0] = "Land Rover";
    // cars [1][1] = "Honda";
    // cars [1][2] = "Nissan";
    // cars [2][0] = "Dodge";
    // cars [2][1] = "BMW";
    // cars [2][2] = "Tesla";
    String [][] cars = {{"Camero", "Corvette", "Mercedes"}, {"Land Rover","Honda", "Nissan"}, {"Dodge", "BMW", "Telsa"}};

    for(int i=0; i<cars.length; i++ ){
      System.out.println();
      for(int j=0;j<cars[i].length;j++){
        System.out.println(cars[i][j]+"");
      }
    }

    
  //   String [][] subjects = {{"Math", "Science", "Engineering"}, {"English","History", "Seminar"}, {"Art", "Theater", "DMCA"}};

  //   for(int i=0; i<subjects.length; i++ ){
  //     System.out.println();
  //     for(int j=0;j<subjects[i].length;j++){
  //       System.out.println(subjects[i][j]+"");
  //     }
  //   }
 
    
  // }
}
