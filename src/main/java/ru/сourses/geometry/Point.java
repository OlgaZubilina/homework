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
        Point p1 = new Point(1, 5);
        Point p2 = p1.clone();
        System.out.println(p2 == p1);
        System.out.println(p2.equals(p1));
        System.out.println(p1.equals(p2));
        System.out.println(p1.x == p2.x);
        System.out.println(p1.y == p2.y);
    }
}