public class method_overriding {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.makeSound(); // Calls Dog's makeSound() method
    }
}

class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}
