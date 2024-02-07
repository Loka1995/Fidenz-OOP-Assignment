package shapes;

public class Circle implements Shapes {
    private double radius;
    private double borderThickness;

    public Circle(double radius) {
        this.radius = radius;
        this.borderThickness = 0;
    }

    public Circle(double radius, double borderThickness) {
        this.radius = radius;
        this.borderThickness = borderThickness;
    }

    public void setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    public double getBorderThickness() {
        return borderThickness;
    }

    @Override
    public double getInnerArea() {
        return areaCalculateHelper(this.radius);
    }

    @Override
    public double getBorderArea() {
        return getArea() - getInnerArea();
    }

    @Override
    public double getArea() {
        return areaCalculateHelper(this.radius + this.borderThickness);
    }

    private double areaCalculateHelper(double radius) {
        return Math.PI * radius * radius;
    }
}
