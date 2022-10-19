package Gun35Homework;

public class Students extends Informations {
    private double fee;

    public Students(String name, String address, School school, double fee, TypesOfMember membership) {
        super(name, address, school, membership);
        setFee(fee);
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return super.toString() + " " + "Fee =" + fee + "}";
    }
}
