package shapes;

public abstract class Shape implements Shapes{
    protected double borderThickness = 0;

    public void setBorderThickness(double borderThickness) {
        this.borderThickness = borderThickness;
    }

    public double getBorderThickness() {
        return borderThickness;
    }

    @Override
    public double getAreaOfBorder() {
        return getAreaWithBorder() - getAreaWithoutBorder();
    }
}
