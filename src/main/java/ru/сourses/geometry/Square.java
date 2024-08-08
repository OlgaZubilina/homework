package ru.сourses.geometry;

public class Square {
    private Point point;
    private int sideLength;

    public Square(Point point, int sideLength) {
        this.setPoint(point);
        this.setSideLength(sideLength);
    }


    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public int getSideLength() {
        return sideLength;
    }

    public void setSideLength(int sideLength) {
        if (sideLength <= 0)
            throw new IllegalArgumentException("sideLength must be positive");
        this.sideLength = sideLength;
    }

    @Override
    public String toString() {
        return
                "Квадрат в точке (" + point.getX() + "," + point.getY() +
                        ") со стороной " + sideLength;
    }
}
