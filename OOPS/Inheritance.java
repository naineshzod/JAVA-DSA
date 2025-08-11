public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.color = "Blue";
        shark.eat();
        shark.breathe();
        shark.swing();
        System.out.println("Shark color: " + shark.color);
}
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eating...");
    }
    void breathe(){
        System.out.println("Breathing...");
    }
}
//Derived class
class Fish extends Animal{
    int fins;
    void swing(){
        System.out.println("Swimming...");
    }
}
