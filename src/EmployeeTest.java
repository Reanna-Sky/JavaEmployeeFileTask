public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Taylor", 22);
        employees[1] = new Employee("Punia", 25);

        for (Employee employee : employees) {
            System.out.println("Last name: " + employee.getLastName() + ", Age: " + employee.getAge());
        }

        employees[0].incAge();

        for (Employee employee : employees) {
            System.out.println("Last name: " + employee.getLastName() + ", Age: " + employee.getAge());
        }
    }
}
