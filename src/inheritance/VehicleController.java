package inheritance;

import java.util.Scanner;

public class VehicleController {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){
        VehicleController vc = new VehicleController();
        vc.menu();
    }
    private void menu(){
        System.out.println("Which vehicle would you like to create?");
        System.out.println("1 - Car");
        System.out.println("2 - Bus");
        System.out.println("3 - Truck");
        System.out.println("4 - Train");
        System.out.println("5 - Motorbike");
        System.out.println("6 - Bicycle");
        int input = Integer.parseInt(myScanner.nextLine());

        switch (input){
            case 1:
                createCar();
                break;
            case 2:
                createBus();
            case 3:
                createTruck();
            case 4:
                createTrain();
            case 5:
                createMotorbike();
            case 6:
                createBicycle();

                default:
                    System.out.println("Invalid input");
                    menu();
        }
    }

    private void createCar() {
        Car c = new Car((short) 5, (short) 4);
        String vehicle = "c";
        function();

    }


    private void createBus() {
        Bus b = new Bus((short)16, (short)4);


    }

    private void createTruck() {
    }

    private void createTrain() {
    }

    private void createMotorbike() {
    }

    private void createBicycle() {
    }

    public void function(String) {
        System.out.println("What would you like to do with your vehicle?");
        System.out.println("1. Accelerate, 2. Steer, 3. Brake, 4. Create a new vehicle");
        int input = Integer.parseInt(myScanner.nextLine());
        switch (input) {
            case 1:
                c.accelerate();
                b.accelerate();
                return;
            case 2:
                System.out.println("Which direction would you like to steer?");
                String dir = myScanner.nextLine();
                c.steer(dir);
                b.steer(dir);
                return;
            case 3:
                c.brake();
                return;
            case 4:
                menu();

            default:
                System.out.println("Invalid input");
                return;
        }

    }
}
