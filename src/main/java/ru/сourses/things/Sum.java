package ru.сourses.things;

public class Sum {

    static double sum(String[] args) {
        double s = 0.0;
        for (int i = 0; i < args.length; i++) {
            try {
                s = s + Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                s = s + 0.0;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(args));

    }
}
