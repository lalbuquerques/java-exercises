package livingbeing;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Buddy");
        Animal cat = new Cat("Whiskers");
        Human human = new Human("Alice", 30);
        Human human2 = new Human("Bob", 30);
        Human human3 = new Human("Alice", 30);

        System.out.println("🐶 " + dog.getInfo());
        dog.makeSound();

        System.out.println("🐱 " + cat.getInfo());
        cat.makeSound();

        System.out.println("👤 " + human.getInfo());
        System.out.println("👤 " + human2.getInfo());
        System.out.println("👤 " + human3.getInfo());
        System.out.println("Are human and human3 equal? " + human.equals(human3) + "\n Human code: " + human.hashCode() + "\n Human 3 code:  " + human3.hashCode());
    }
}
