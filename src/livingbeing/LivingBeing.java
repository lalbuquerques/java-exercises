package livingbeing;

public sealed abstract class LivingBeing permits Animal, Human {
    protected String name;

    public LivingBeing(String name) {
        this.name = name;
    }

    public abstract String getInfo();
}
