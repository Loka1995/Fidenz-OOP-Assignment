import shapes.*;

public class Main {
    public static void main(String[] args) {
        Shapes square = new Rectangle(9, 9,2);
        Shapes rectangle = new Rectangle(4,3,2);
        Shapes circle = new Circle(4,2);
        Shapes triangle = new Triangle(4,3,2);
        Shapes trapezoid = new Trapezoid(4,6,7,2);
        Canvas canvas = new Canvas();

        System.out.println(square.getAreaOfBorder());
        System.out.println(square.getAreaWithoutBorder());
        System.out.println(square.getAreaWithBorder());

        System.out.println(rectangle.getAreaOfBorder());
        System.out.println(rectangle.getAreaWithoutBorder());
        System.out.println(rectangle.getAreaWithBorder());

        System.out.println(circle.getAreaOfBorder());
        System.out.println(circle.getAreaWithoutBorder());
        System.out.println(circle.getAreaWithBorder());

        System.out.println(triangle.getAreaOfBorder());
        System.out.println(triangle.getAreaWithoutBorder());
        System.out.println(triangle.getAreaWithBorder());

        System.out.println(trapezoid.getAreaOfBorder());
        System.out.println(trapezoid.getAreaWithoutBorder());
        System.out.println(trapezoid.getAreaWithBorder());

        canvas.addToCanvas(square);
        canvas.addToCanvas(rectangle);
        canvas.addToCanvas(circle);
        canvas.addToCanvas(triangle);
        canvas.addToCanvas(trapezoid);
        System.out.println(canvas.totalAreaOfBorders());
        System.out.println(canvas.totalAreaWithoutBorders());
        System.out.println(canvas.totalAreaWithBorders());
    }
}