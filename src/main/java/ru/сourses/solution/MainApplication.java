package ru.сourses.solution;


import ru.сourses.geometry.*;
import ru.сourses.people.Department;
import ru.сourses.people.Employee;
import ru.сourses.people.Student;

import java.util.Arrays;


import static java.lang.Integer.parseInt;
import static java.lang.Math.pow;

public class MainApplication {


    public static void main(String[] args) {

     getPow(args[0],args[1]);

       Point a = new Point(1, 3);
        Point b = new Point(5, 8);
        Point c = new Point(10, 11);
        Point d = new Point(15, 19);
        Line ab = new Line(a, b);
        Line bc = new Line(c, d);
        Line cd = new Line(ab.getPoint2(), bc.getPoint1());

        cd.getPoint1().setX(1);
        cd.getPoint1().setY(23);
        cd.getPoint2().setX(3);
        cd.getPoint2().setY(54);
        System.out.println(cd);
        System.out.println(cd.getLength() + bc.getLength() + ab.getLength());
        //Создаем ломаную линию
       //Задание №3 Объекты и классы. Ломаная линия
        //1 Создать Ломаную, проходящую через точки {1;5}, {2;8}, {5;3}, {8,9}
        PolyLine poly2 = new PolyLine(new Point[]{
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(8, 9)});
        System.out.println(poly2);
        //2. Рассчитать длину Ломаной
        System.out.println(poly2.getLength());
        //3.Получить у Ломаной массив Линий
        System.out.println(Arrays.toString(poly2.getLines()));
        //4.Рассчитать длину массива Линий
        System.out.println(poly2.getLengthPolylyneWithLines());
        //5.Сравнить длину Ломаной и массива Линий: они должны совпасть
        System.out.println(poly2.getLength() == poly2.getLengthPolylyneWithLines());
        //6. Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}.
        // Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
        poly2.getPoint(1).setX(12);
        poly2.getPoint(1).setY(8);
        System.out.println(poly2);
        System.out.println(Arrays.toString(poly2.getLines()));
        ClosedPolyLine poly1 = new ClosedPolyLine(new Point[]{
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(8, 9)});
        System.out.println(poly1.getLength());
        PolyLine poly3 = new ClosedPolyLine(new Point[]{
                new Point(1, 5),
                new Point(2, 8),
                new Point(5, 3),
                new Point(8, 9)});
        System.out.println(poly3.getLength());

        Measurable m = poly2;
        Measurable f = poly1;
        System.out.println(m.getLength());
        System.out.println(f.getLength());
        System.out.println(m.getLength("string"));


      Square abcd = new Square(new Point(9,4),5);
        System.out.println(abcd);
        Point pointA = new Point(6,4);
        abcd.setPoint(pointA);
        System.out.println(abcd);
        System.out.println(abcd.getPoint());
        System.out.println(abcd.getSideLength());
        Point3D f1 = new Point3D(4,5,6);
        System.out.println(f1);

        Student s1 = new ru.сourses.people.Student("Sasha");
        Student s2 = new ru.сourses.people.Student("Vasya", new int[]{2, 5, 4, 3});
        s1.setGrades(new int[]{4,2,3,4,5});
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.getGrades());
        s2.setGrades(new int[]{5,2,3,4,5,4});
        System.out.println(s2.getGrades());
        s1.setGrade(5);
        System.out.println(s1.getGrades());
        Department dep1 = new ru.сourses.people.Department("develop");
       Department dep2 = new ru.сourses.people.Department("analityc");
       Department dep3 = new ru.сourses.people.Department("qa");
        Employee y1 = new ru.сourses.people.Employee("Vanya",dep1);
        Employee y2 = new ru.сourses.people.Employee("Olga",dep1);
        Employee y3 = new ru.сourses.people.Employee("Petya",dep2);
        Employee y4 = new ru.сourses.people.Employee("Ilya",dep3);
        Employee y5 = new ru.сourses.people.Employee("Danya",dep2);
        System.out.println(y2);
        dep3.setBoss(y4);
        dep2.setBoss(y3);
        System.out.println(dep1);
        System.out.println(y1);
        System.out.println(y2);
        System.out.println(y3);
        System.out.println(y5);
        System.out.println(y4);

        

}
   public static void getPow(String strX, String strY) {
        double x = parseInt(strX);
        double y = parseInt(strY);
        System.out.println(pow(x,y));
    }
}
