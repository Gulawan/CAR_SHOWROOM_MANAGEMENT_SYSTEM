import java.sql.SQLOutput;
import java.util.Scanner;

public class Showroom implements utility {
    
    String showroomName;
    String showroomAddress;
    String managerName;
    int totalEmployees;
    int totalCarsInStock;

    @Override
    public void getDetails() {
        System.out.println("Showroom Name: " + showroomName);
        System.out.println("Showroom Address: " + showroomAddress);
        System.out.println("Manager Name: " + managerName);
        System.out.println("Total Employees: " + totalEmployees);
        System.out.println("Total cars in Stock: " + totalCarsInStock);

    }

@Override

public void setDetails() {
    Scanner sc = new Scanner(System.in);

    System.out.println("================================== ***ENTER SHOWROOM DETAILS*** ==================================");
    System.out.println();
    System.out.println("SHOWROOM NAME: ");
    showroomName = sc.nextLine();
    System.out.println("SHOWROOM ADDRESS: ");
    showroomAddress = sc.nextLine();
    System.out.println("MANAGER NAME: ");
    managerName = sc.nextLine();
    System.out.println("TOTAL EMPLOYEES: ");
    totalEmployees = sc.nextInt();
    System.out.println("TOTAL CARS IN STOCK: ");
    totalCarsInStock = sc.nextInt();
   }

}
