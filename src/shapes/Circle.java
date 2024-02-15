package shapes;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.borderThickness = 0;
    }

    public Circle(double radius, double borderThickness) {
        this.radius = radius;
        this.borderThickness = borderThickness;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getAreaWithoutBorder() {
        return areaCalculateHelper(this.radius);
    }

    @Override
    public double getAreaWithBorder() {
        return areaCalculateHelper(this.radius + this.borderThickness);
    }

    private double areaCalculateHelper(double radius) {
        return Math.PI * radius * radius;
    }
}
