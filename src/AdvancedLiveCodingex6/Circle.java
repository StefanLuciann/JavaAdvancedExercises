package AdvancedLiveCodingex6;

public class Circle implements Movable, Resizable{

    private final Point2D center;
    private final Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return center.distanceFrom(point);
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MovableDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        point.move(new MovableDirection(getRadius() *resizeFactor, getRadius()*resizeFactor));

    }
}
