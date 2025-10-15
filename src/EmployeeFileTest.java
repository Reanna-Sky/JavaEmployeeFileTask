import java.io.*;

public class EmployeeFileTest {

    public static final String filePath = "/Users/rgo895/Documents/Java/exercises/student/JavaEmployeeFileTask/src/data.txt";

    public static void main(String[] args) {
        try {
            inputEmployee();
            showEmployees();
//            We are naming the exception as e
        }catch(Employee.UnderAgeException e){
            System.out.println(e.getMessage());
        }catch(FileNotFoundException e) {
            System.out.println("Invalid file name.");
        }catch (IOException e ){
            System.out.println("Problem with file handling");
        }
    }

    public static String getInput(String prompt) throws IOException {
        System.out.println(prompt);

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(input);
        return buffer.readLine();

    }
//    Asks for employees details
    public static void inputEmployee() throws IOException, Employee.UnderAgeException {
        String firstName = getInput("Enter the Employees first name: ");
        String lastName = getInput("Enter the Employees last name: ");
        String name = firstName + " " + lastName;
        String strAge = getInput("Enter the Employees age: ");

        try {
            int age = Integer.parseInt(strAge);

            if (age < 18){
                throw new Employee.UnderAgeException(age, "Age is below 18");
            }
        }catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " is an invalid age!");
        }


    }
//    Displayes content of file
    public static void showEmployees() throws IOException{
        FileInputStream file = new FileInputStream(filePath);
        InputStreamReader inputReader = new InputStreamReader(file);
        BufferedReader buffer = new BufferedReader(inputReader);

        String data;
        do {
            data = buffer.readLine();
            System.out.println(data);
        } while (data != null);

        buffer.close();



    }
}
