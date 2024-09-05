public abstract class Animal {

    void makeSound(){
        System.out.println("Some generic animal sound");
    }

    void eat(){
        System.out.println("This animal eats food.");
    }

    abstract void sound();
}
