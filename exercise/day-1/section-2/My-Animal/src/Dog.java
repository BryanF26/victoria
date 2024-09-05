public class Dog extends Animal{

    void bark(){
        System.out.println("The dog barks.");
    }

    @Override
    void makeSound() {
        System.out.println("Woof");
    }

    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}
