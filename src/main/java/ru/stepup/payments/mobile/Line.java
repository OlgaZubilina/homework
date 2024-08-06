package ru.stepup.payments.mobile;

public class Line implements Measurable{
    private Point point1;
    private Point point2 ;

public Line(Point point1, Point point2){
    this.point1 = point1;
    this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;

    }
public double getLength (){
    return  Math.sqrt(Math.pow((getPoint2().getX() - getPoint1().getX()),2)+Math.pow((getPoint2().getY() - getPoint1().getY()),2));
}
    @Override
    public String toString() {
        return "Линия от " + getPoint1() +
                " до " + getPoint2()
                ;
    }


}
