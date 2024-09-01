package ru.сourses.geometry;

import java.util.Arrays;
import java.util.Objects;

public class Point implements Cloneable {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


    @Override
    public String toString() {
        return "{" +
                "x=" + getX() +
                ", y=" + getY() +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public Point clone() throws CloneNotSupportedException {
        return (Point) super.clone();
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    public static void main(String[] args) throws Exception {

        PolyLine p1 = new PolyLine(new Point(1,2),new Point(3,4),new Point(5,6));
        PolyLine p2 = new PolyLine(new Point(1,2),new Point(3,4),new Point(5,6));
        PolyLine p3 = new PolyLine(new Point(1,2),new Point(3,3),new Point(5,6));

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p3.equals(p1));
        System.out.println(p2.equals(p1));



    }
     static class Line implements Cloneable{
        @Override
        protected Line clone() throws CloneNotSupportedException {
            Line l =  (Line) super.clone();
            l.end = (Point)this.end.clone();
            l.start = (Point)this.start.clone();
            return l;
        }

        Point start,end;
        public Line(Point start, Point end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Line line = (Line) o;
            return Objects.equals(start, line.start) && Objects.equals(end, line.end);
        }

        @Override
        public int hashCode() {
            return Objects.hash(start, end);
        }
    }

    static class PolyLine{

        Point[] points;

        public PolyLine(Point... points) {

            this.points = points;

        }

        public double length(){

            double sum=0,len1,len2;

            for(int i=0;i<points.length-1;i++){

                len1=points[i].x-points[i-1].x;

                len2=points[i].y-points[i-1].y;

                sum+=Math.sqrt(len1*len1+len2*len2);

            }

            return sum;

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            PolyLine polyLine = (PolyLine) o;
            return Objects.deepEquals(points, polyLine.points);
        }

        @Override
        public int hashCode() {
            return Arrays.hashCode(points);
        }
    }
}