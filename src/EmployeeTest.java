public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        employees[0] = new Employee("Harry", "Taylor", 22);
        employees[1] = new Employee("Jorovar", "Punia", 25);

        for (Employee employee : employees) {
            System.out.println("Last name: " + employee.getName() + ", Age: " + employee.getAge());
        }

        Employee.setRetirementAge(70);

        int increments = 100;
        for (int i = 0; i < increments; i++) employees[0].incAge();

        for (Employee employee : employees) {
            System.out.println("Last name: " + employee.getName() + ", Age: " + employee.getAge());
        }
    }
}
