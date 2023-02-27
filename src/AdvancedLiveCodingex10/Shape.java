package AdvancedLiveCodingex10;

/**
 * Create an abstract 3DShape class that extends the Shape class from the previous task.
 * Add an additional method calculateVolume(). Create Cone and Qube classes by extending the 3DShape class,
 * properly implementing abstract methods. Verify the solution correctness
 *
 * Create a Fillable interface with the fill() method.
 * Implement the method in the 3DShape class from the previous task or separately in the Cone and Qube classes.
 * The fill() method should take a parameter, e.g. int, and check whether after the action of filling the figure: •
 * will pour too much water into the figure and overflow, •
 * fill the figure with water to the brim, •
 * not pouring enough water. For each situation, it should write the status information in the console. Use the calculateVolume() method.
 */
public abstract class Shape {

    private final int numberOfSides;

    public Shape(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();

    public int getNumberOfSides() {
        return numberOfSides;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "numberOfSides=" + numberOfSides +
                '}';
    }
}
