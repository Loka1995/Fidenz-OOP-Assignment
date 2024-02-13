package shapes;

public class Triangle implements Shapes {
    private double base;
    private double height;
    private double borderThickness;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.borderThickness = 0;
    }

    public Triangle(double base, double height, double borderThickness) {
        this.base = base;
        this.height = height;
        this.borderThickness = borderThickness;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public double getBorderThickness() {
        return borderThickness;
    }

    @Override
    public double getAreaWithoutBorder() {
        return areaCalculateHelper(this.base, this.height);
    }

    @Override
    public double getAreaOfBorder() {
        return getAreaWithBorder() - getAreaWithoutBorder();
    }

    @Override
    public double getAreaWithBorder() {
        return areaCalculateHelper(this.base + (2 * this.borderThickness),
                this.height + (2 * this.borderThickness));
    }

    private double areaCalculateHelper(double base, double height) {
        return base * height / 2;
    }
}
