package io.github.akcps.solid.ocp.bad;

public class AreaCalculator2 {
    public double area(Object[] shapes) {
        double area = 0;
        for (Object shape : shapes) {
            if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                area += rectangle.getHeight() * rectangle.getWidth();
            } else {
                Circle circle = (Circle) shape;
                area += circle.getRadius() * circle.getRadius() * Math.PI;
            }
        }
        return area;
    }
}
