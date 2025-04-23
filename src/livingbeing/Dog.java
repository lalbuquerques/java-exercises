package livingbeing;

public class Dog extends Animal {
    public Dog(String name) {
        super(name, "Dog");
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}
