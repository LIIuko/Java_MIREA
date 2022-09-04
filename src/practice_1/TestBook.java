package practice_1;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Good book", 0);
        Book b2 = new Book("Java or Kotlin");
        Book b3 = new Book(120);
        b1.setNumberOfPages(30);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
