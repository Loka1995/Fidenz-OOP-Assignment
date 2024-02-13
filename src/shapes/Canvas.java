package shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private final List<Shapes> shapesInCanvas;

    public Canvas() {
        this.shapesInCanvas = new ArrayList<>();
    }

    public void addToCanvas(Shapes shape){
        this.shapesInCanvas.add(shape);
    }

    public double totalAreaWithBorders() {
        return areaHelper(Shapes::getAreaWithBorder);
    }

    public double totalAreaOfBorders() {
        return areaHelper(Shapes::getAreaOfBorder);
    }

    public double totalAreaWithoutBorders() {
        return areaHelper(Shapes::getAreaWithoutBorder);
    }

    private double areaHelper(Function<Shapes, Double> valueExtractor) {
        if (shapesInCanvas.isEmpty()) {
            return 0;
        }

        double total = 0;
        for (Shapes shape : shapesInCanvas) {
            total += valueExtractor.apply(shape);
        }
        return total;
    }

}
