public class Demo3 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle("Circle1", 5),
                new Ellipse("Ellipse1", 4, 3),
                new Triangle("Triangle1", 3, 4, 5),
                new EquilateralTriangle("EquilateralTriangle1", 6)
        };

        System.out.println("Before scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        scaleShapes((Scalable[]) shapes, 2);

        System.out.println("\nAfter scaling:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}