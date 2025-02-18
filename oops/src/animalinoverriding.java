// Parent class,Same method name in parent and child class.
class Animali {
    void sound() {
        System.out.println("Animals make sounds.");
    }
}

// Child class
class Dogs extends Animali {
    void sound() {
        System.out.println(" dos is over barks.");
    }
}

public class animalinoverriding{
    public static void main(String[] args) {
        Animali myAnimal = new Dogs(); // Parent class reference, child class object
        myAnimal.sound(); // Calls Dog's sound() method

    }
}
