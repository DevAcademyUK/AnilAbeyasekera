package songs;

import java.util.Scanner;

public class theDuckSong {

    public static void main(String[] args) {
        theDuckSong duckduck = new theDuckSong();
        duckduck.duck();
    }

    private void duck() {

        Scanner duckScanner = new Scanner(System.in);
        System.out.println("How many ducks are there?");
        System.out.println("");
        int ducks = duckScanner.nextInt();
        System.out.println("");

        String numberOfDucks = "ducks";
        String back = "back";


        for (int i = ducks; i > -1; i--) {

            String d = i + " little";

            if (i == 0) {
                d = "Mother";
               // System.out.println("Mother duck went swimming one day,");
            }


            System.out.println( d + " " + numberOfDucks + " went swimming one day,");
            System.out.println("Over the hills and far away.");
            System.out.println("Mother duck said, 'quack quack quack quack',");

            if (i < 2) {
                back = "swimming back";
            }

            if (i == 1) {
                System.out.println("But no little ducks came " + back + ".");

            } else if (i == 0) {
                System.out.println("And all " + ducks + " little ducks came " + back + ".");
            } else {

                int newDuck = i - 1;
                if (newDuck == 1) {
                    numberOfDucks = "duck";
                }

                System.out.println("And only " + newDuck + " little " + numberOfDucks + " came " + back + ".");
            }

            System.out.println("");
        }
    }
}