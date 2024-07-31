package ru.stepup.payments.mobile;


import java.util.Arrays;

public class MainApplication {
    public static void main(String[] args) {

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
        System.out.println(poly2.getLengthPolylyneWithPoints());
        //3.Получить у Ломаной массив Линий
        System.out.println(Arrays.toString(poly2.getLines()));
        //4.Рассчитать длину массива Линий
        System.out.println(poly2.getLengthPolylyneWithLines());
        //5.Сравнить длину Ломаной и массива Линий: они должны совпасть
        System.out.println(poly2.getLengthPolylyneWithPoints() == poly2.getLengthPolylyneWithLines());
        //6. Изменить координаты Точки {2,8} таким образом, чтобы она стала иметь значение {12,8}.
        // Если изменения отразились в данной точке, в Ломаной и в двух Линиях массива (из пункта 3), то задача решена верно
        poly2.getPoint(1).setX(12);
        poly2.getPoint(1).setY(8);
        System.out.println(poly2);
        System.out.println(Arrays.toString(poly2.getLines()));
    }

}