package movieexercise;

public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie ("Parasita", "Bong Joon-ho", 132, 2019);
        Movie movie2 = new Movie ("A Origem", "Christopher Nolan", 148, 2010);

        System.out.println("🎬 Filme 1: " + movie1);
        System.out.println("🎬 Filme 2: " + movie2);
    }
}
