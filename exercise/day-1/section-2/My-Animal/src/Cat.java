public class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meow");
    }

    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}
