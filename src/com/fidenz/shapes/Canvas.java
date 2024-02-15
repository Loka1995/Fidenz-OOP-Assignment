package com.fidenz.shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private final List<Shape> shapesInCanvas;

    public Canvas() {
        this.shapesInCanvas = new ArrayList<>();
    }

    public void addToCanvas(Shape shape){
        this.shapesInCanvas.add(shape);
    }

    public double totalAreaWithBorders() {
        return areaHelper(Shape::getAreaWithBorder);
    }

    public double totalAreaOfBorders() {
        return areaHelper(Shape::getAreaOfBorder);
    }

    public double totalAreaWithoutBorders() {
        return areaHelper(Shape::getAreaWithoutBorder);
    }

    private double areaHelper(Function<Shape, Double> valueExtractor) {
        if (shapesInCanvas.isEmpty()) {
            return 0;
        }

        double total = 0;
        for (Shape shape : shapesInCanvas) {
            total += valueExtractor.apply(shape);
        }
        return total;
    }

}
