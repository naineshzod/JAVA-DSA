public class Hybrid {
    public static void main(String[] args){
        Tuna tuna = new Tuna();
        tuna.color = "Blue";
        tuna.swim();
        tuna.walk();
        System.out.println("Tuna color: " + tuna.color);

        Shark shark = new Shark();
        shark.color = "Grey";
        shark.bite();
        System.out.println("Shark color: " + shark.color);

        Peacock peacock = new Peacock();
        peacock.color = "Green";
        peacock.dance();
        peacock.fly();
        System.out.println("Peacock color: " + peacock.color);
        Dog dog = new Dog();
        dog.color = "Brown";
        dog.bark();
        System.out.println("Dog color: " + dog.color);
        Cat cat = new Cat();
        cat.color = "Black";
        cat.meow();
        System.out.println("Cat color: " + cat.color);
        Human human = new Human();
        human.color = "White";
        human.speak();
        System.out.println("Human color: " + human.color);
        Bird bird = new Bird();
        bird.color = "Yellow";
        bird.fly();
        System.out.println("Bird color: " + bird.color);

    }
}
    class Animal {
        String color;
        void eat() {
            System.out.println("Eating...");
        }
        void breathe() {
            System.out.println("Breathing...");
        }
    }
    class Fish extends Animal {
        int fins;
        void swim() {
            System.out.println("Swimming...");
        }
    }
    class Tuna extends Fish {
        void walk() {
            System.out.println("Tuna is swimming fast...");
        }
    }
    class Shark extends Fish {
        void bite() {
            System.out.println("Shark is biting...");
        }
    }
    class Bird extends Animal {
        void fly() {
            System.out.println("Bird is flying...");
        }
    }
    class Peacock extends Bird {
        void dance() {
            System.out.println("Peacock is dancing...");
        }
    }
    class Mammal extends Animal {
        void run() {
            System.out.println("Mammal is running...");
        }
    }
    class Dog extends Mammal {
        void bark() {
            System.out.println("Dog is barking...");
        }
    }
    class Cat extends Mammal {
        void meow() {
            System.out.println("Cat is meowing...");
        }
    }
    class Human extends Mammal {
        void speak() {
            System.out.println("Human is speaking...");
        }
    }

