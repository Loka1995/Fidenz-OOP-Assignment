package shapes;

public class Square implements Shapes{

    private double length;
    private double borderThickness;

    public Square(double length) {
        this.length = length;
        this.borderThickness = 0;
    }

    public Square(double length, double borderThickness) {
        this.length = length;
        this.borderThickness = borderThickness;
    }

    public void setLength (double length) {
        this.length = length;
    }

    public void setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
    }

    public double getBorderThickness() {
        return borderThickness;
    }

    public double getLength () {
        return length;
    }

    @Override
    public double getInnerArea() {
        return areaCalculateHelper(this.length);
    }

    @Override
    public double getBorderArea() {
        return getArea() - getInnerArea();
    }

    @Override
    public double getArea() {
        return areaCalculateHelper(this.length + (2 * this.borderThickness));
    }

    private double areaCalculateHelper(double length) {
        return length * length;
    }
}
