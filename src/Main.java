import shapes.*;

public class Main {
    public static void main(String[] args) {
        Shapes square = new Square(9,2);
        Shapes rectangle = new Rectangle(4,3,2);
        Shapes circle = new Circle(4,2);
        Shapes triangle = new Triangle(4,3,2);
        Shapes trapezoid = new Trapezoid(4,6,7,2);
        Canvas canvas = new Canvas();

        System.out.println(square.getBorderArea());
        System.out.println(square.getInnerArea());
        System.out.println(square.getArea());

        System.out.println(rectangle.getBorderArea());
        System.out.println(rectangle.getInnerArea());
        System.out.println(rectangle.getArea());

        System.out.println(circle.getBorderArea());
        System.out.println(circle.getInnerArea());
        System.out.println(circle.getArea());

        System.out.println(triangle.getBorderArea());
        System.out.println(triangle.getInnerArea());
        System.out.println(triangle.getArea());

        System.out.println(trapezoid.getBorderArea());
        System.out.println(trapezoid.getInnerArea());
        System.out.println(trapezoid.getArea());

        canvas.addToCanvas(square);
        canvas.addToCanvas(rectangle);
        canvas.addToCanvas(circle);
        canvas.addToCanvas(triangle);
        canvas.addToCanvas(trapezoid);
        System.out.println(canvas.getTotalBorderArea());
        System.out.println(canvas.getTotalInnerArea());
        System.out.println(canvas.totalArea());
    }
}