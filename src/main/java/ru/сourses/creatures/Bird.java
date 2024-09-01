package ru.сourses.creatures;

import java.util.ArrayList;
import java.util.Random;

public class Bird implements Singable {


    public void sing() {
    }
public static void singBirds(ArrayList<Singable> birds){
        for (int i = 0;i<birds.size();i++)
            birds.get(i).sing();
}



    public static void main(String[] args) {
        Singable p1 = new Parrot("khgbjkhgiuyhjkjhj");
        Singable p2 = new Parrot("lkjtyo95ikem,nkjdsf");
        Singable p3 = new Parrot("khgfytjkjhkuhu");
        Singable c1 = new Cuckoo();
        Singable c2 = new Cuckoo();
        Singable c3 = new Cuckoo();
        Singable s1 = new Sparrow();
        Singable s2 = new Sparrow();
        ArrayList<Singable> birds = new ArrayList<>();
        birds.add(p1);
        birds.add(c1);
        birds.add(s1);
        birds.add(p2);
        birds.add(p3);
        birds.add(c2);
        birds.add(c3);
        birds.add(s2);
      //  p1.sing();
      //  c1.sing();
       // s1.sing();
        singBirds(birds);
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
            System.out.print("ку-ку ");
        System.out.println();
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