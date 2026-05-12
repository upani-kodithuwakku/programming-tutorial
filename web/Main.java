// Parent Class
class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Child Class (Inheritance)
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    // Overriding the method (Polymorphism)
    @Override
    void makeSound() {
        System.out.println(name + " says: Woof! Woof!");
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object
        Animal myDog = new Dog("Buddy");

        System.out.println("Testing Java OOP Concepts:");
        System.out.println("---------------------------");
        
        // Calling the method
        myDog.makeSound();
    }
}