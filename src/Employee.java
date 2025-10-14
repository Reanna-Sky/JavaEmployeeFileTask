public class Employee {
    private static int retirementAge = 65;
    private String firstName;
    private String lastName;
    private int age;

    // Constructors
    public Employee(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
    }

    public Employee(String firstName, String lastName, int age) {
        this(lastName, age);
        this.firstName = firstName;
    }


    public void incAge() {if (age < retirementAge) age += 1;}

    // Setters
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {this.age = age;}
    public static void setRetirementAge(int age) {retirementAge = age;}

    // Getters
    public String getName() {return firstName + " " + lastName;}
    public int getAge() {return age;}

    public String getDetails(){
        StringBuilder employeeDetails = new StringBuilder();
        employeeDetails.append(this.getName());
        employeeDetails.append(", ");
        employeeDetails.append(this.getAge());
        return employeeDetails.toString();
    }
}
