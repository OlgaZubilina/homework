import java.util.ArrayList;


public class Student {
    private String name;
    public ArrayList<Integer> grades = new ArrayList<Integer>();

    public Student(String name) {
        this.setName(name);

    }
    public Student(String name, int[] integers) {
        this.setName(name);
        this.setGrades(integers);
    }

    private void setName(String name) {
        this.name = name;
    }
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    public void setGrade(int grade) {
        if (grade < 2 || grade > 5)
            throw new IllegalArgumentException("Grade must be > 1 and < 6");
        grades.add(grade);
    }
    public ArrayList<Integer> setGrades(int[] integers) {
        for (int i = 0; i < integers.length; i++) {
            setGrade(integers[i]);
        }
        return grades;
    }


    @Override
    public String toString() {
        return '\"' + name + '\"' + ":" + grades
                ;
    }
}


