/*package bankapp;

import java.util.Scanner;

public class logIn {

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        logIn create = new logIn();
        create.enterUserName();
    }

    private void enterUserName(){
        System.out.println("Enter your username.");
        String userID = myScanner.nextLine();

        if (userID.equals("user1")){
            System.out.println("Welcome. Enter your password.");
            String userPassword = myScanner.nextLine();
            if (userPassword.equals("password")){
                user1();
            }
            else {
                System.out.println("Incorrect password.");
                enterUserName();
            };
        }
        else if (userID.equals("user2")) {
            System.out.println("Welcome. Enter your password.");
            String userPassword = myScanner.nextLine();
            if (userPassword.equals("password")) {
                user2();
            }
        }
        else {
            System.out.println("There is no account with that name.");
            enterUserName();
        }



    }
    private void user1() {
        System.out.println("Choose Account [1], Log Out [2]");
        int option = Integer.parseInt(myScanner.nextLine());
        switch (option){
            case 1:
            System.out.println("Which account would you like to access?");
            System.out.println("Current Account [1], Joint Account [2], Savings Account [3]," +
                    "Transfer [4], Log Out [5]");
            int account = Integer.parseInt(myScanner.nextLine());
            switch (account) {
                case 1: currentAccount1();
                case 2: jointAccount1();
                case 3: savingsAccount1();
                case 4: transfer1();
                default: enterUserName();
            }
            default: enterUserName();
        }


    }

    private void currentAccount1() {


        System.out.println("Show Balance [1], Deposit [2], Withdraw [3], Return to Account [4]");
        int option = Integer.parseInt(myScanner.nextLine());
        switch (option){
            case 1: {
                System.out.println("Your balance is " + balance);
                currentAccount1.returnBalance();
            }
            case 2: {
                System.out.println("Enter how much you would like to deposit.");
                double deposit = Double.parseDouble(myScanner.nextLine());
                currentAccount1.makeDeposit();
            }
            case 3: {
                System.out.println("Enter how much you would like to withdraw.");
                double withdraw = Double.parseDouble(myScanner.nextLine());
                currentAccount1.makeWithdraw();
            }
            default: user1();

        }

    }

    private void jointAccount1() {
    }

    private void savingsAccount1() {
    }

    private void transfer1() {
    }

    private void user2() {
    }
}
*/

