package practice_3.part_1;

public class Square extends Rectangle{
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }

    public double getSide(){
        return getWidth();
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setWidth(side);


    }

    @Override
    public String toString() {
        return "This is a square:\n" + "Side: " + this.getSide() + ", color: "+ this.color + ", filled: " + this.filled;
    }
}
