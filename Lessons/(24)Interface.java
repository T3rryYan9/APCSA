// Create the law or Create the Structure

interface Polygon{
  void getArea(int length, int breadth);
}

// Implement the polygon interface in other words we will pass the law

class Rectangle implements Polygon {

  public void getArea(int length, int breadth){
    System.out.println("The area of the rectangle is " + (length * breadth));
  }
}

//use or apply the law
class Main{
  public static void main(String[] args){
// declare an object
    Rectangle r1 = new Rectangle();
    r1.getArea(5, 6);
  }
}
