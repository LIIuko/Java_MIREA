package practice_1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(10, "blue");
        Ball b2 = new Ball("black");
        Ball b3 = new Ball(15);

        b1.setRadius(20);
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
}
