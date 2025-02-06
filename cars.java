import java.util.Scanner;


public class cars extends Showroom implements utility {
  String carName;
  String carColor;
  String carType;
  String carFuelType;
  String carTransmission;
  int carPrice;

  @Override
  
  public void getDetails() {
    System.out.println("CAR NAME: " + carName);
    System.out.println("CAR COLOR: " + carColor);
    System.out.println("TYPE: " + carType);
    System.out.println("FUEL TYPE: " + carFuelType);
    System.out.println("TRANSMISSION: " + carTransmission);
    System.out.println("PRICE: " + carPrice);
  }
    
  @Override

  public void setDetails() {
    Scanner sc = new Scanner(System.in);
    System.out.println("================================== ***ENTER CAR DETAILS*** ==================================");
    System.out.println();
    System.out.println("CAR NAME: ");
    carName = sc.nextLine();
    System.out.println("CAR COLOR: ");
    carColor = sc.nextLine();
    System.out.println("CAR TYPE: ");
    carType = sc.nextLine();
    System.out.println("CAR FUEL TYPE(PETROL/DIESEL): ");
    carFuelType = sc.nextLine();
    System.out.println("CAR TRANSMISSION TYPE(AUTOMATIC/MANUAL): ");
    carTransmission = sc.nextLine();
    System.out.println("CAR PRICE: ");
    carPrice = sc.nextInt();
    totalCarsInStock++;
}
}
