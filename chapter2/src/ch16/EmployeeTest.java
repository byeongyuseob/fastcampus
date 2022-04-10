package ch16;

class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("Lee soon sin");

        Employee employee1 = new Employee();
        employee1.setName("김유신");

        System.out.println(employee.getId());
        System.out.println(employee1.getId());
    }

}