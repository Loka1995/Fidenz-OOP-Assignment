package com.fidenz.shapes;

public class Rectangle extends Shape {
    private double length;
    private double height;

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

    public double getLength() {
        return length;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getAreaWithoutBorder() {
        return areaCalculateHelper(this.length, this.height);
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
