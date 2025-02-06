import java.util.Scanner;
import java.util.UUID;


public class employees implements utility {
    String employeeID;
    String employeeName;
    String employeeDepartment;
    int employeeAge;

    @Override

    public void getDetails() {
        System.out.println("ID: " + employeeID);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Department: " + employeeDepartment);
        System.out.println("Employee Age: " + employeeAge);

    }
    
@Override

public void setDetails() {
    Scanner sc = new Scanner(System.in);
    UUID uuid = UUID.randomUUID();
    employeeID = String.valueOf(uuid);
    System.out.println("================================== ***ENTER EMPLOYEE DETAILS*** ==================================");
    System.out.println();
    System.out.println("EMPLOYEE ID: ");
    employeeID = sc.nextLine();
    System.out.println("EMPLOYEE NAME: ");
    employeeName = sc.nextLine();
    System.out.println("EMPLOYEE DEPARTMENT: ");
    employeeDepartment = sc.nextLine();
    System.out.println("EMPLOYEE AGE: ");
    employeeAge = sc.nextInt();
    
   }
}
