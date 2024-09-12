package ru.сourses.things;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("qwe");
        arrayList.add("rty");
        arrayList.add("asd");
        Stream<String> listStream = arrayList.stream();
        System.out.println(getStringFromStream(listStream));
        printList(numbers);
        }

    public static String getStringFromStream(Stream stringStream) {
       return (String) stringStream.collect(Collectors.joining(" "));

    }
    public static void printList(ArrayList list) {
        Stream<Integer> stream = list.stream();
         stream.forEach(integer -> System.out.println(integer));
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