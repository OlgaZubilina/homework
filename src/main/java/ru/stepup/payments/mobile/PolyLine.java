package ru.stepup.payments.mobile;


import java.util.Arrays;

public class PolyLine {
    static Point[] points;

    public PolyLine(Point[] points) {
        PolyLine.points = points;
    }

    public Point getPoint(int n) {
        return points[n];

    }

    public Line[] getLines() {
        Line[] lines = new Line[points.length - 1];
        for (int i = 0; i < points.length - 1; i++)
            lines[i] = new Line(points[i], points[i + 1]);
        return lines;
    }

    public double getLengthPolylyneWithPoints() {
        double length = 0.0;
        for (int i = 0; i < points.length - 1; i++)
            length = length + Math.sqrt(Math.pow((points[i + 1].getX() - points[i].getX()), 2) + Math.pow((points[i + 1].getY() - points[i].getY()), 2));
        return length;
    }

    public double getLengthPolylyneWithLines() {
        double length = 0.0;
        Line[] lines = getLines();
        for (int i = 0; i < lines.length; i++)
            length = length + lines[i].getLength();
        return length;
    }

    @Override
    public String toString() {
        return "Ломаная линия из точек:" + Arrays.toString(points)
                ;
    }

}