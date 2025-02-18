// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1 - Dog
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Child class 2 - Cat
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

// Main class to test method overriding
public class Parentinoverridden {
    public static void main(String[] args) {
        // Parent class reference pointing to child class objects
        Animal myAnimal1 = new Dog(); // Upcasting
        Animal myAnimal2 = new Cat();

        // Calling overridden methods
        myAnimal1.makeSound(); // Calls Dog's makeSound() method
        myAnimal2.makeSound(); // Calls Cat's makeSound() method
    }
}
