# How to run the application.
1. The assignment is implemented in **Java**.
2. Clone the repository to a preferred location in the local environment.
3. Open the project folder in a **Java** IDE.
4. Select the **Main.java** file and run the application.
5. All the classes, interface are inside a package named **shapes**.

# Assignment solution details.
1. Inside the **shapes** package the interface **Shapes** defines the contract for the individual shapes classes.
   - Different shapes implement **Shapes** and provide,
     - `getInnerArea()`, which returns the area of a shape without borders.
     - `getBorderArea()`, which returns area of the border of the shape,
     - `getArea()`, which return total area of the shape.
   - Getters and Setters are also provided.
   - The **Canvas** class holds methods for the canvas.
2. `addToCanvas()` method in the Canvas class accepts any shape of type **Shapes**.
3. `totalArea()` method in the Canvas class returns the total area consumed by all the shapes in the canvas.
4. If new shapes should be introduced to the canvas the programme is designed as such that only the class for
   the new shape has to be created with implementations for **Shapes** interface.
5. As mentioned above in number 4, `totalArea()` does not depend on new shapes added through new classes, so long
   as they implement **Shapes** interface.
6. `getTotalBorderArea()`, `getTotalInnerArea()` additionally provide area sizes of total borders, total area
   sizes of shapes without borders, respectively.

# Changes to the Programme(1).
1. In the **Shapes** interface methods were renamed to `getAreaWithoutBorder()`, `getAreaOfBorder()`
   and `getAreaWithBorder()`.
2. In the **Canvas** class methods were renamed to `totalAreaWithBorders()`, `totalAreaOfBorders()` 
   and `totalAreaWithoutBorders()`.
3. In the **Canvas** class, to calculate only the border area of the shapes in the canvas, each shape's 
   `getAreaOfBorder()` method has been used. (This will reduce the extra loop used in the previous programme)
4. **Function** functional interface has been introduced to avoid code duplications in the functions 
   mentioned in number 2.

# Changes to the Programme(2).
1. **Square** class was removed from the package. It was noted that the class was redundant since square was
   a special case of rectangle.
2. Abstract class **Shape** was introduced to remove duplicate code across concrete classes. Namely `borderThickness`,
   `setBorderThickness(double borderThickness)`, `getBorderThickness()` and `getAreaOfBorder()` have now been 
   declared and defined in the **Shape** class.