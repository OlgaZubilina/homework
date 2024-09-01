package ru.сourses.geometry;

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

        Point p1 = new Point(5,8);
        Point p2 = new Point( 9,15);
        Line l1 = new Line(p1,p2);
        Line l2 = l1.clone();
        System.out.println(l2==l1);
        System.out.println(l2.equals(l1));
        System.out.println(l1.equals(l2));
        l2.start.x=88;
        System.out.println(l2.equals(l1));
        System.out.println(l1.equals(l2));





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
}