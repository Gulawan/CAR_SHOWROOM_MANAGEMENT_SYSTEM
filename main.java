import java.util.*;
import java.lang.*;

interface utility {

    public void getDetails();
    public void setDetails();
    
}


public class main {
    static void mainMenu() {
        System.out.println();
        System.out.println("================================== ***WELCOME TO CARSHOWROOM MANAGEMENT SYSTEM*** ==================================");
        System.out.println();
        System.out.println("================================== ***ENTER YOUR CHOICE*** ==================================");
        System.out.println();
        System.out.println("1]. ADD SHOWROOM \t\t\t 2]. ADD EMPLOYEES \t\t\t 3]. ADD CAR");
        System.out.println();
        System.out.println("4]. GET SHOWROOM \t\t\t 2]. GET EMPLOYEES \t\t\t 3]. GET CAR");
        System.out.println();
        System.out.println("================================== ***ENTER 0 TO EXIT*** ==================================");
  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Showroom show[] = new Showroom[5];
        employees emp[] = new employees[5];
        cars car[] = new cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;
        while(choice != 0) {
            mainMenu();

            choice = sc.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        show[showroom_counter] = new Showroom();
                        show[showroom_counter].setDetails();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1].ADD NEW SHOWROOM");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 2:
                        emp[employees_counter] = new employees();
                        emp[employees_counter].setDetails();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2].ADD NEW EMPLOYEE");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 3:
                        car[car_counter] = new cars();
                        car[car_counter].setDetails();
                        car_counter++;
                        System.out.println();
                        System.out.println("3].ADD NEW CAR");
                        System.out.println("9].GO BACK TO MAIN MENU");
                        choice = sc.nextInt();
                        break;
                    case 4:
                        for (int i = 0; i < showroom_counter; i++) {
                            show[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 5:
                        for (int i = 0; i < employees_counter; i++) {
                            emp[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            car[i].getDetails();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9].GO BACK TO MAIN MENU");
                        System.out.println("0].EXIT");
                        choice = sc.nextInt();
                        break;
                    default:
                        System.out.println("ENTER VALID CHOICE: ");
                        break;

                }
                
            }

        }

    }
}
