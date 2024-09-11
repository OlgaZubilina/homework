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
reverse(numbers);
        System.out.println(numbers.toString());



        }

    public static void reverse(ArrayList<Integer>ints) {
        int n = ints.size() - 1;
        for (int i = 0; i < ints.size() / 2; i++) {
            int temp = ints.get(i);
            ints.set(i,ints.get(n-i));
            ints.set(n-i,temp);
        }
    }


public static void bubbleSort ( int[] intArray){
    for (int i = 0; i < intArray.length - 1; i++) {
        for (int j = 0; j < intArray.length - i - 1; j++) {
            if (intArray[j] > intArray[j + 1]) {
                int temp = intArray[j];
                intArray[j] = intArray[j + 1];
                intArray[j + 1] = temp;
            }
        }}}}