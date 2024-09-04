package ru.сourses.things;

import java.util.Scanner;

public class Sum {

    static double sum(String[] args) {
        double s = 0.0;

        for (int i = 0; i < args.length; i++) {
            Scanner cs = new Scanner(args[i]);
            if (cs.hasNextDouble())
                s = s + Double.parseDouble(args[i]);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(args));
    }

}