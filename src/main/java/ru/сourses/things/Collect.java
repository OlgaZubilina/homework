package ru.сourses.things;


import java.util.ArrayList;
import static java.util.Collections.swap;

public class Collect {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
            System.out.println(numbers.get(i));
        }
        for (int i = 0; i < numbers.size(); i = i + 2) {
            swap(numbers, i + 1, i);
        }
        System.out.println(numbers.toString());
    }}
