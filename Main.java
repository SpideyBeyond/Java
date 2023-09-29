package testPolimarphism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new DOG();
        animal.makeSound();
        
        Animal animal1 = new CAT();
        animal1.makeSound();
    }
}