package switches;

import java.util.Scanner;

public class parking {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args){

        parking p = new parking();
        p.getInput();
    }

    private void getInput() {
        System.out.println("What day is it?");
        String day = myScanner.nextLine();
        day.toLowerCase();
        System.out.println("How long will you be staying?");
        int duration = Integer.parseInt(myScanner.nextLine());
        System.out.println("What position do you hold within the college? (Staff/Student/Visitor)");
        String position = myScanner.nextLine();
        position.toLowerCase();

        calculateFees(day, duration, position);
    }

    private void calculateFees(String day, int duration, String position) {

        int cost;
        int hourlyrate = 0;
        int multiplier = 0;

        switch (position) {
            case "staff":
                multiplier = 2;
                break;

            case "student":
                multiplier = 1;
                break;

            case "visitor":
                multiplier = 3;
                break;

            default:
                System.out.println("Invalid input for position, aborting, please retry.");
                getInput();
        }

        switch (day) {
            case "monday":
                hourlyrate = 2;
                break;

            case "tuesday":
                hourlyrate = 2;
                break;

            case "wednesday":
                hourlyrate = 3;
                break;

            case "thursday":
                hourlyrate = 2;
                break;

            case "friday":
                hourlyrate = 3;
                break;

            case "saturday":
                hourlyrate = 4;
                break;

            case "sunday":
                hourlyrate = 5;
                break;

            default:
                System.out.println("Invalid input for day, aborting, please retry.");
                getInput();
        }

        cost = (hourlyrate * multiplier) * duration;
        System.out.println("Thanks for parking at Gateshead College. Please pay " + cost);

    }
}
