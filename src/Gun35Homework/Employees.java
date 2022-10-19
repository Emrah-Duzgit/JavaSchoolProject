package Gun35Homework;

public class Employees extends Informations {
    private double wage;

    public Employees(String name, String address, School school, double wage, TypesOfMember membership) {
        super(name, address, school, membership);
        setWage(wage);
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Fee =" + wage + "}";
    }
}
