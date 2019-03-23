package games;

import java.util.Scanner;

public class multiplicationdoodad { // class declaration. A class is a blueprint for an object.

    Scanner myScanner = new Scanner(System.in);
    // myScanner is an instance variable. Can be seen throughout the whole class

    public static void main(String[] args) {
        multiplicationdoodad mdd = new multiplicationdoodad();
        mdd.getValues();
    }

    private void getValues() {
        System.out.println("What number would you like the multiplication tables for?");
        int number = Integer.parseInt(myScanner.nextLine());
        System.out.println("What is the maximum multiplication you wish to calculate?");
        int multiplier = Integer.parseInt(myScanner.nextLine());
        calculate(number, multiplier);
    }

    private void calculate(int number, int multiplier) {
        for (int i = 1; i < multiplier + 1; i++) {
            System.out.println(i + " times " + number + " is " + i * number);
        }
    }
}
