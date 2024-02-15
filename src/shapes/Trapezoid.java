package shapes;

public class Trapezoid extends Shape {

    private double baseA;
    private double baseB;
    private double height;

    public Trapezoid(double baseA, double baseB, double height) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.borderThickness = 0;
    }

    public Trapezoid(double baseA, double baseB, double height, double borderThickness) {
        this.baseA = baseA;
        this.baseB = baseB;
        this.height = height;
        this.borderThickness = borderThickness;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBaseA(double baseA) {
        this.baseA = baseA;
    }

    public void setBaseB(double baseB) {
        this.baseB = baseB;
    }

    public double getHeight() {
        return height;
    }

    public double getBaseA() {
        return baseA;
    }

    public double getBaseB() {
        return baseB;
    }

    @Override
    public double getAreaWithoutBorder() {
        return areaCalculateHelper(this.baseA, this.baseB, this.borderThickness);
    }

    @Override
    public double getAreaWithBorder() {
        return areaCalculateHelper(this.baseA + (2 * this.borderThickness),
                this.baseB + (2 * this.borderThickness),
                this.height + (2 * this.borderThickness));
    }

    private double areaCalculateHelper(double baseA, double baseB, double height) {
        return (baseA + baseB) * height / 2;
    }
}
