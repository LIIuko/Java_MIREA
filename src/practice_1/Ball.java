package practice_1;

public class Ball {
    private int radius;
    private String color;

    public Ball(int radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public Ball(int radius) {
        this.radius = radius;
        this.color = "white";
    }

    public Ball(String color) {
        this.radius = 1;
        this.color = color;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " radius = " + this.radius + " , color - " + this.color;
    }
}
