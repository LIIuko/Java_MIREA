package practice_12_15.practice_13;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    private String flat;

    public Address(String address) {
        System.out.println(splitAddress(address));
    }

    private StringBuilder splitAddress(String address){
        String[] addresses = address.split("(, )|(: )|(; )|(/ )|(- )|(. )");
        country = addresses[0];
        region = addresses[1];
        city = addresses[2];
        street = addresses[3];
        house = addresses[4];
        corpus = addresses[5];
        flat = addresses[6];
        return new StringBuilder().append(country).append(" ")
                .append(region).append(" ")
                .append(city).append(" ")
                .append(street).append(" ")
                .append(house).append(" ")
                .append(corpus).append(" ")
                .append(flat);
    }
}
