package ru.сourses.things;

public class Sauce {
    String name;
    ESpiciness sp;

    public Sauce(String name,ESpiciness sp) {
        this.name = name;
        this.sp = sp;

    }


    @Override
    public String toString() {
        return "Coyc" + '\'' + name + '\'' +":" + sp;
    }

    public static void main(String[] args) {
        Sauce s = new Sauce("Барбекю",ESpiciness.HOT);
        System.out.println(s.toString());
    }
}
enum ESpiciness{
VERYHOT,HOT,NOSPICY
}

