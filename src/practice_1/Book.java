package practice_1;

public class Book {

    private String title;
    private int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public Book(String title) {
        this.title = title;
        this.numberOfPages = 10;
    }

    public Book(int numberOfPages) {
        this.title = "Book";
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Title of the book is " + this.title + ", number of pages - " + this.numberOfPages;
    }
}
