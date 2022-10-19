package Gun35Homework;

public class Main {
    public static void main(String[] args) {
        School school1 = new School("E.D.");

        Employees employee1 = new Employees("Ismet", "UK", school1, 9999, TypesOfMember.EMPLOYEE);
        school1.setEmployees(employee1);
        Employees employee2 = new Employees("Halit", "USA", school1, 9999, TypesOfMember.EMPLOYEE);
        school1.setEmployees(employee2);

        Students student1 = new Students("Alp", "GEORGIA", school1, 1400, TypesOfMember.STUDENT);
        school1.setStudents(student1);
        Students student2 = new Students("Sarp", "TURKEY", school1, 1400, TypesOfMember.STUDENT);
        school1.setStudents(student2);

        school1.getEmployees();
        school1.getStudents();

    }
}
