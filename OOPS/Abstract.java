public class Abstract {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color);
        Chicken c = new Chicken();
        c.eat();
        c.walk();
        System.out.println(c.color);
    }
}
abstract class Animal{
    String color;
    Animal()
    {
        color = "Brown";

    }
    void eat(){
        System.out.println("animals eat");
    }
    abstract void walk(); // Abstract method
}
class Horse extends Animal{
    String color="Black";
    void changeColor(){
        super.color = this.color; // Using super to access the parent class's color field
    }
     void walk(){
    System.out.println("walk on 4 legs");
 }
}
class Chicken extends Animal{
    void changeColor(){
        color="White";
    }
    void walk(){
        System.out.println("walk on 2 legs");
    }
}
