package practice_16;

public final class Dish implements Item{

    private int price;
    private String title;
    private String description;

    public Dish(String title, String description) {
        this.price = 0;
        this.title = title;
        this.description = description;
    }

    public Dish(int price, String title, String description) {
        this.price = price;
        this.title = title;
        this.description = description;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Name: " +
                title +
                ", price: " +
                price +
                ", description: " +
                description;
    }
}
