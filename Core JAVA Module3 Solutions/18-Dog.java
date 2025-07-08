public class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog = new Dog();
        dog.makeSound();
    }
}
