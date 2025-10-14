public class Manager extends Employee {
    private final Employee[] manages;
    private int index = 0;

    public Manager(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        manages = new Employee[100];

    }

    public void addEmployee(Employee employee){
        if (index < manages.length) {
            manages[index] = employee;
            index++;
        } else {
            System.out.println("indexing outside of array");
        }
    }

    public String getEmployeeNames(){
        StringBuilder namesList = new StringBuilder();
        for (Employee employee : manages) {
            if (employee != null) {
                namesList.append(employee.getName());
                namesList.append(", ");
            }
        }
        return namesList.toString();
    }

    public String getDetails(){
        String employee = super.getDetails();
        return employee + " manages: " + this.getEmployeeNames();
    }
}
