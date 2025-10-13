public class Employee {
    private String lastName;
    private int age;

    // Constructor
    public Employee(String lastName, int age) {
        this.lastName = lastName;
        this.age = age;
    }

    public void incAge() {
        if (age < 65) age += 1;
    }

    // Setters
    public void setLastName(String lastName) {this.lastName = lastName;}
    public void setAge(int age) {this.age = age;}

    // Getters
    public String getLastName() {return lastName;}
    public int getAge() {return age;}
}
