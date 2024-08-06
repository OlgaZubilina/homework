package ru.stepup.payments.mobile;

public class ClosedPolyLine extends PolyLine {
    public ClosedPolyLine(Point[] points) {
        super(points);
    }

    @Override
    public double getLengthPolylyneWithPoints() {
        double lastLength = Math.sqrt(Math.pow((points[0].getX() - points[points.length - 1].getX()), 2)
                + Math.pow((points[0].getY() - points[points.length - 1].getY()), 2));
        return super.getLengthPolylyneWithPoints() + lastLength;
    }
}
