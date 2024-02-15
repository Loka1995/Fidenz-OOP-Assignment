package shapes;

public class Rectangle implements Shapes {
    private double length;
    private double height;
    private double borderThickness;

    public Rectangle(double length, double height) {
        this.height = height;
        this.length = length;
        this.borderThickness = 0;
    }

    public Rectangle(double length, double height, double borderThickness) {
        this.height = height;
        this.length = length;
        this.borderThickness = borderThickness;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
    }

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    public double getBorderThickness() {
        return borderThickness;
    }

    @Override
    public double getAreaWithoutBorder() {
        return areaCalculateHelper(this.length, this.height);
    }

    @Override
    public double getAreaOfBorder() {
        return getAreaWithBorder() - getAreaWithoutBorder();
    }

    @Override
    public double getAreaWithBorder() {
        return areaCalculateHelper(this.length + (2 * this.borderThickness),
                this.height + (2 * this.borderThickness));
    }

    private double areaCalculateHelper(double length, double height) {
        return length * height;
    }
}
