public class MovableCircleTest {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(10, new MovablePoint(0,0,5,5));
        System.out.println(circle.toString());

        circle.moveRight();
        System.out.println(circle.toString());

        circle.moveUp();
        System.out.println(circle.toString());

        circle.moveLeft();
        System.out.println(circle.toString());

        circle.moveDown();
        System.out.println(circle.toString());
    }
}
