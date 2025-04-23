package livingbeing;

import java.util.Objects;

public final class Human extends LivingBeing {
    private int age;

    public Human(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public String getInfo() {
        return "Human Name: " + name + ", Age: " + age;
    }

    public void introduce() {
        System.out.println("Hi, I'm " + name + ".");
    }

    public void introduce(String language) {
        System.out.println("Hi, I'm " + name + " and I speak " + language + ".");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Human human = (Human) obj;
        return age == human.age && Objects.equals(name, human.name);
    }
}
