package practice_16;

import java.util.ArrayList;
import java.util.Collection;

public class Order {

    Collection<Item> order;

    public Order(Collection<Item> order) {
        this.order = order;
    }

    public Order() {
        this.order = new ArrayList<>();
    }

    public void add(Item item) {
        order.add(item);
    }

    public void remove(Item item) {
        order.remove(item);
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Item item : order) {
            str.append(item.toString()).append("\n");
        }
        return str.toString();
    }
}
