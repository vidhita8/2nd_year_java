// Problem 4: Rectangle Class with Wrapper Classes
// Description: Create a Rectangle class using wrapper classes:
// ● Use Integer for length and width instead of primitive int
// ● Methods: calculateArea(), calculatePerimeter(), isSquare()
// ● Constructor overloading for different scenarios
// ● Handle null values appropriately
// Expected Output:
// Rectangle 1 Area: 24, Perimeter: 20, Is Square: false
// Rectangle 2 Area: 25, Perimeter: 20, Is Square: true
// Default Rectangle Area: 1, Perimeter: 4, Is Square: true

class Rectangle {
    // Wrapper classes
    private Integer length;
    private Integer width;

    // Static variable to count rectangles
    private static int totalRectangles = 0;

    // Instance variable for ID
    private int rectangleId;

    // 🏗️ Default constructor
    Rectangle() {
        this.length = 1;
        this.width = 1;
        totalRectangles++;
        this.rectangleId = totalRectangles;

        System.out.println("Default Rectangle Area: " + calculateArea() +
                           ", Perimeter: " + calculatePerimeter() +
                           ", Is Square: " + isSquare());
    }

    // 🏗️ Constructor for a square
    Rectangle(Integer side) {
        if (side == null || side <= 0) side = 1;
        this.length = side;
        this.width = side;
        totalRectangles++;
        this.rectangleId = totalRectangles;

        System.out.println("Rectangle " + this.rectangleId + " Area: " + calculateArea() +
                           ", Perimeter: " + calculatePerimeter() +
                           ", Is Square: " + isSquare());
    }

    // 🏗️ Constructor for rectangle
    Rectangle(Integer length, Integer width) {
        if (length == null || length <= 0) length = 1;
        if (width == null || width <= 0) width = 1;
        this.length = length;
        this.width = width;
        totalRectangles++;
        this.rectangleId = totalRectangles;

        System.out.println("Rectangle " + this.rectangleId + " Area: " + calculateArea() +
                           ", Perimeter: " + calculatePerimeter() +
                           ", Is Square: " + isSquare());
    }

    // Methods
    int calculateArea() {
        return this.length * this.width;
    }

    int calculatePerimeter() {
        return 2 * (this.length + this.width);
    }

    boolean isSquare() {
        return this.length.equals(this.width);
    }
}

public class oops4 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(6, 4); // Normal rectangle
        Rectangle r2 = new Rectangle(5);    // Square
        Rectangle r3 = new Rectangle();     // Default rectangle
    }
}
