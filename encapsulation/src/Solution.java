import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

        Student s1 = new Student("Sasha");
        Student s2 = new Student("Vasya", new int[]{2, 5, 4, 3});
        s1.setGrades(new int[]{4,2,3,4,5});
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.getGrades());
        s2.setGrades(new int[]{5,2,3,4,5,4});
        System.out.println(s2.getGrades());
        s1.setGrade(5);
        System.out.println(s1.getGrades());
    }
}