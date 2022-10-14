package practice_12_15.practice_14;

public class Shirt {
    private String id;
    private String name;
    private String color;
    private String size;

    public void addValues(String values){
        String[] arrValues = values.split(",");
        id = arrValues[0];
        name = arrValues[1];
        color = arrValues[2];
        size = arrValues[3];
    }

    @Override
    public String toString() {
        return "Shirt{\n\t" + id + ",\n\t" + name + ",\n\t" + color + ",\n\t" + size + "}";
    }
}
