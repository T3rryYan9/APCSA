public class Hero extends Person{
  String power;
//Constructor
  Hero(String name, int age, String power){
    super(name,age);// Constructor of a superclass (parent) for person 
    this.power = power;
  }
}
