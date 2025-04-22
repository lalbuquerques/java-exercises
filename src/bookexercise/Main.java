package bookexercise;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 328, 1949);
        Book book2 = new Book("Clean Code", "Robert C. Martin", 2008, 2008);

        System.out.println("📚 Livro 1: " + book1);
        System.out.println("📚 Livro 2: " + book2);
    }
}
