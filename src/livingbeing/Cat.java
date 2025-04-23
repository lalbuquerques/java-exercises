package livingbeing;

public class Cat extends Animal {
    public Cat(String name) {
        super(name, "Cat");
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}
