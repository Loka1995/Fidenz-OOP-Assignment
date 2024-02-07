package shapes;

import java.util.ArrayList;
import java.util.List;

public class Canvas {
    private double totalArea;
    private double totalBorderArea;
    private double totalInnerArea;
    private final List<Shapes> shapesInCanvas;

    public Canvas() {
        this.shapesInCanvas = new ArrayList<>();
        this.totalArea = 0;
        this.totalBorderArea = 0;
        this.totalInnerArea = 0;
    }

    public void addToCanvas(Shapes shape){
        this.shapesInCanvas.add(shape);
    }

    public double totalArea() {
        if(shapesInCanvas.isEmpty()) return 0;
        else {
            this.totalArea = 0;
            for(Shapes shape: shapesInCanvas) {
                this.totalArea += shape.getArea();
            }
            return this.totalArea;
        }
    }

    public double getTotalBorderArea() {
        this.totalBorderArea = totalArea() - getTotalInnerArea();
        return this.totalBorderArea;
    }

    public double getTotalInnerArea() {
        if(shapesInCanvas.isEmpty()) return 0;
        else {
            this.totalInnerArea = 0;
            for(Shapes shape: shapesInCanvas) {
                this.totalInnerArea += shape.getInnerArea();
            }
            return this.totalInnerArea;
        }
    }
}
