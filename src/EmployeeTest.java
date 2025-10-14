public class EmployeeTest {

    public static void main(String[] args) {
        Employee[] employees = new Employee[4];

        Employee employee1 = new Employee("Harry", "Taylor", 22);
        Employee employee2 = new Employee("Joravar", "Punia", 25);
        Manager manager = new Manager("Ayaz", "Baig", 22);
        Manager seniorManager = new Manager("Taran", "Che", 22);

        manager.addEmployee(employee1);
        manager.addEmployee(employee2);
        seniorManager.addEmployee(manager);
//        manager.addEmployee(seniorManager);

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = manager;
        employees[3] = seniorManager;

        for (Employee employee : employees) {
            System.out.println(employee.getDetails());
        }






//        Employee.setRetirementAge(70);
//
//        int increments = 100;
//        for (int i = 0; i < increments; i++) employees[0].incAge();
//
//        for (Employee employee : employees) {
//            System.out.println("Name: " + employee.getName() + ", Age: " + employee.getAge());
//        }
    }
}
