public class Car {
  // private variable so this class can only access it
  private String make;
  private String model;
  private int year;

  // Class constructor

  Car(String make, String model, int year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  // Getter method - allows access to private classes globaly
  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }
// Setter method - Allows you to rewrite a variable globaly to varibles that were set as private
  public void setMake(String make) {
    this.make = make;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public void setYear(int year) {
    this.year = year;
  }
// Method dedicated to copying
  public void copy (Car x){
    this.setMake(x.getMake());
    this.setModel(x.getModel());
    this.setYear(x.getYear());
  }
  
}
