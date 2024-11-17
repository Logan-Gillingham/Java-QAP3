public class Demo2 {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(10, 15, 2, 3);
        System.out.println(p1);

        p1.move();
        System.out.println(p1);
    }
}