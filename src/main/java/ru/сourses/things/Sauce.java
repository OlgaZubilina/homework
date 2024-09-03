package ru.сourses.things;

public class Sauce {
    String name;
    ESpiciness sp;

    public Sauce(String name, ESpiciness sp) {
        this.name = name;
        this.sp = sp;

    }


    @Override
    public String toString() {
        return "Coyc" + '\'' + name + '\'' + ":" + sp;
    }

    public static void main(String[] args) {
        System.out.println(Case.CASE1.m(1, 2));
    }
}

enum ESpiciness {
    VERYHOT, HOT, NOSPICY
}

enum Case {
    CASE1 {
        public int m(int x, int y) {
            return x + y;
        }
    }, CASE2 {
        public int m(int x, int y) {
            return x - y;
        }
    }, CASE3 {
        public int m(int x, int y) {
            return x * y;
        }
    }, CASE4 {
        public int m(int x, int y) {
            return x / y;
        }
    };

    int m(int x, int y) {
        return 0;
    }

    ;
}