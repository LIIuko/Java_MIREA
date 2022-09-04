package practice_3.part_2;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "Coordinates point are: x - " + x + " y - " + y + ", speed = " + Math.sqrt(Math.pow(xSpeed, 2) + Math.pow(ySpeed, 2));
    }

    @Override
    public void moveUp() {
        x += xSpeed;
    }

    @Override
    public void moveDown() {
        x -= xSpeed;
    }

    @Override
    public void moveLeft() {
        y -= ySpeed;
    }

    @Override
    public void moveRight() {
        y += ySpeed;
    }
}
