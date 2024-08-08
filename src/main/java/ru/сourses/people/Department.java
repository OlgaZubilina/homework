package ru.сourses.people;

public class Department {
   private final String title;
   private Employee boss;

    public Department (String title){
        this.title = title;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee employee) {
        if (!(employee.getDepartment().equals(this)))
            throw new IllegalArgumentException("this employee doesn't work in this department");
        this.boss=employee;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        if (boss == null)
            return "Отдел " +
                    title + '\'' +
                    ", Начальник отсутствует ";
        return "Отдел " +
                 title + '\'' +
                ", Начальник " + '\''+ getBoss() +
                '\'';
    }
}
