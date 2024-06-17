public class Main {
  public static void main(String[] args) {
    Car car1 = new Car();
    car1.go();
    Bicycle bike1 = new Bicycle();
    bike1.stop();
    System.out.println(car1.speed);
    System.out.println(bike1.speed);
    System.out.println(bike1.wheels);
    System.out.println(car1.doors);

  }
}
