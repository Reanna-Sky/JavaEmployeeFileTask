import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EmployeeFileTest {
    public static void main(String[] args) {
        try {
            inputEmployee();
//            We are naming the exception as e
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
    public static void inputEmployee() throws IOException {
        String firstName = getInput("Enter the Employees first name: ");
        String lastName = getInput("Enter the Employees last name: ");
        String name = firstName + " " + lastName;
        String strAge = getInput("Enter the Employees age: ");

        try {
            int age = Integer.parseInt(strAge);
        }catch (NumberFormatException e) {
            System.out.println(e.getMessage() + " is an invalid age!");
        }


    }
//    Displayes content of file
    public static void showEmployees() {


    }
}
