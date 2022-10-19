package Gun35Homework;

import java.util.ArrayList;

public class School {
    private String name;
    private final int quota = 12;
    private final ArrayList<Students> students = new ArrayList<>();
    private final ArrayList<Employees> employees = new ArrayList<>();

    public School(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {this.name = name;}

    @Override
    public String toString() {
        return name + ", " + "Student quota = " + quota;
    }

    public void setStudents(Students student) {students.add(student);
    }

    public void setEmployees(Employees employee) {
        employees.add(employee);
    }

    public void getStudents() {
        System.out.println(students);
    }

    public void getEmployees() {
        System.out.println(employees);
    }
}