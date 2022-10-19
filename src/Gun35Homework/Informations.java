package Gun35Homework;

import java.lang.reflect.Member;

public class Informations {
    private String name;
    private String address;
    private School school;
    private TypesOfMember membership;

    public Informations(String name, String address, School school, TypesOfMember membership) {
        setName(name);
        setAddress(address);
        setSchool(school);
        setMembership(membership);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public TypesOfMember getMembership() {
        return membership;
    }

    public void setMembership(TypesOfMember membership) {
        this.membership = membership;
    }

    @Override
    public String toString() {
        return "Informations{" + "Name=" + name + "," + " Address=" + address + "," + " School=" + school + "," + " Membership=" + membership + ",";
    }
}
