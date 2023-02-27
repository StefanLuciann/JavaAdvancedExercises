package AdvancedLiveCodingex10;

import org.w3c.dom.css.Rect;

/**
 * Create an abstract Shape class with the abstract methods calculatePerimeter()
 * for calculating the perimeter and calculateArea() for calculating the area.
 * Create Rectangle, Triangle, Hexagon classes, extending the Shape class,
 * and implementing abstract methods accordingly. Verify the solution correctness.
 *
 *
 */
public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(23.1,55.31);

        System.out.println(rectangle);
        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());

        Cube cube = new Cube(12);
        cube.fill(1728);
        cube.fill(1329);
        cube.fill(2789);
    }
}
