package ch16;

public class Employee {
    private static int serialNumber = 1000;

    private int id;
    private String name, department;

    public Employee() {
        this.id = serialNumber++;
    }

    public static int getSerialNumber() {
        return serialNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
