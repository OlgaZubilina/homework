package ru.сourses.creatures;

import java.lang.reflect.Field;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static java.lang.reflect.AccessibleObject.setAccessible;

public class Cat {
    private static String breed = "Persian"; // порода
    public String name;
    private int age;
    private List friendsName = new ArrayList<>();

    public Cat(String name, int age, List friendsName) {
        this.name = name;
        this.age = age;
        this.friendsName = friendsName;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", friendsName=" + friendsName +
                '}';
    }

    public static void main(String[] args) throws NoSuchFieldException {
        Cat cat = new Cat("Vasya", 10, new ArrayList<>(Arrays.asList("Anton", "Oleg", "Igor")));
        System.out.println(cat.toString());
        setNulls(cat);
        System.out.println(cat.toString());
    }

static void setNulls(Object o){
    System.out.println(Arrays.toString(o.getClass().getDeclaredFields()));
    Field[] fields = o.getClass().getDeclaredFields();
    for (Field f : fields) {
        f.setAccessible(true);
        try {

      if (!f.getType().isPrimitive())
      f.set(o,null);
        else f.set(o,0);}catch (IllegalAccessException e){
            throw new RuntimeException(e);
        }
    }
  /*  Stream<Field>fields = Arrays.stream(o.getClass().getDeclaredFields());
    fields.forEach(field -> {field.setAccessible(true);
        try {if(!field.getType().isPrimitive())
            field.set(o,0);

     else field.set(o,null);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

    });*/
}

}