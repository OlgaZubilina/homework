public class Employee {
    private final String name;
    private Department department;


    public Employee(String name,Department department){
        this.name=name;
        this.setDepartment(department);
    }



    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }


    @Override
    public String toString() {
        if (department.getBoss()==null){
            return
                    '\'' + name + '\'' +
                            "работает в отделе " + department.getTitle() +
                            ','+" у которого нет начальника";
        }
        if (department.getBoss().equals(this)){
            return
                    '\'' + name + '\'' +
                            " начальник отдела  " + department.getTitle();
        }

        return
                '\'' + name + '\'' +
                "работает в отделе " + department.getTitle() +
                ','+" начальник которого "+ department.getBoss().name;
    }
}
