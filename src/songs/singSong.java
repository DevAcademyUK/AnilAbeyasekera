package songs;

import java.util.Scanner;

public class singSong { //defines body of the class {}
                        // dont nest classes

    private void sing() { //method declaration. "void" returns nothing. parenthesise define constructor

        Scanner myScanner = new Scanner(System.in); //Scanner defines data type
                                                    // new creates new instance
        System.out.println("How many bottles of beer are there on the wall?");
        int bottles = myScanner.nextInt(); // myScanner.nextInt() accesses

        String word = "bottles"; //new string variable called "word"
        for (int i = bottles; i > 0; i--) { // i initialiser; condition; increment
            System.out.println(i + " " + word + " of beer on the wall,"); //concatination
            System.out.println(i + " " + word + " of beer,");
            System.out.println("Take one down,");
            System.out.println("Pass it around,");
            if (i == 1) { //conditional logic controls the flow
                System.out.println("No more bottles of beer on the wall.");
            }
            else {
                int newNum = i - 1;
                if (newNum == 1) {
                    word = "bottle";
                }

                System.out.println(newNum + " " + word + " beer on the wall.");
                System.out.println();
            }
        }
    }

    public static void main(String[] args) { // main method/ function
        singSong singing = new singSong(); // create singing reference variable in singSong class
                                            // calling default constructor
        singing.sing(); // access sing method in singing object

    }

}

