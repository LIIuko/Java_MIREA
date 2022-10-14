package practice_12_15.practice_13;

public class TestAddress {
    public static void main(String[] args) {
        Address address1 = new Address("country, region, city, street, house, corpus, flat");
        Address address2 = new Address("country, region: city. street- house/ corpus; flat");
    }
}
