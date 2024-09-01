package ru.сourses.creatures;

import java.util.ArrayList;
import java.util.Random;

public class Bird implements Singable {


    public void sing() {
    }

    ;


    public static void main(String[] args) {
        Singable p1 = new Parrot("khgbjkhgiuyhjkjhj");
        Singable c1 = new Cuckoo();
        Singable s1 = new Sparrow();
        ArrayList<Singable> birds = new ArrayList<>();
        birds.add(p1);
        birds.add(c1);
        birds.add(s1);
        p1.sing();
        c1.sing();
        s1.sing();
    }


}

class Sparrow extends Bird {

    @Override
    public void sing() {
        System.out.println("чырык");
    }


}

class Cuckoo extends Bird {
    @Override
    public void sing() {
        int x = 0;
        while (x == 0) x = new Random().nextInt(10);
        for (int i = 0; i < x; i++)
            System.out.println("ку-ку");
    }
}

class Parrot extends Bird {
    String text;

    Parrot(String text) {
        this.text = text;
    }

    @Override
    public void sing() {
        int x = 0;
        while (x == 0) x = new Random().nextInt(text.length());

        for (int i = 0; i < x; i++)
            System.out.print(text.charAt(i));
        System.out.println();
    }
}