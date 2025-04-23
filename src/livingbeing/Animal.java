package livingbeing;

public non-sealed class Animal extends LivingBeing {
    protected String species;

    public Animal(String name, String species) {
        super(name);
        this.species = species;
    }

    @Override
    public String getInfo() {
        return "Animal Name: " + name + ", Species: " + species;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}
