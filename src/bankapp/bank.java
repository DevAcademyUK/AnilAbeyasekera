package bankapp;

import java.util.List;
import java.util.Scanner;

public class bank {



    private Integer depositAmount;
    private Integer withdrawAmount;
    private Integer transferAmount;

    Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        bank s = new bank();
        s.init();
    }


    private void init() {


        System.out.println("Username: ");
        String enteredUsername = myScanner.nextLine();
        System.out.println("Password: ");
        String enteredPassword = myScanner.nextLine();



        if (users.validateLoginDetails(enteredUsername, enteredPassword)) {
            mainMenu();
        } else {
            System.out.println();
            System.out.println("Invalid details have been entered. Please try again");
            init();

        }
    }

    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private void mainMenu() {
        System.out.println();
        System.out.println("What would you like to do?");
        System.out.println("Display Balance [1], Deposit [2], Withdraw [3],");
        System.out.println("Transfer [4], Log Out [5]");
        String input = myScanner.nextLine();
        getAction(input);
    }

    private void getAction(String input) {
        switch (input) {

            case "1":
                checkBalance();
                System.out.println();
                break;

            case "2":
                deposit();
                System.out.println();
                break;

            case "3":
                withdraw();
                System.out.println();
                break;

            case "4":
                transfer();
                System.out.println();
                break;

            case "5":
                logout();
                System.out.println();
                break;

            default:
                System.out.println("Incorrect input received");
                mainMenu();
        }
    }

    private void checkBalance() {
        System.out.println();
        System.out.println("Which account would you like to check the balance of?");
        System.out.println("Current [1], Joint [2], Savings [3], All [4], Go Back [5]");
        String input = myScanner.nextLine();
        if (input.equals("5")) mainMenu();
        else {

            System.out.println();
            switch (input) {
                case "1":
                    System.out.println("Your current account balance is: " + users.cAccountBalance);
                    System.out.println();
                    mainMenu();
                    break;

                case "2":
                    System.out.println("Your joint account balance is: " + users.jAccountBalance);
                    System.out.println();
                    mainMenu();
                    break;

                case "3":
                    System.out.println("Your savings account balance is: " + users.sAccountBalance);
                    System.out.println();
                    mainMenu();
                    break;

                case "4":
                    System.out.println("Your current account balance is: " + users.cAccountBalance);
                    System.out.println("Your joint account balance is: " + users.jAccountBalance);
                    System.out.println("Your savings account balance is: " + users.sAccountBalance);
                    System.out.println();
                    mainMenu();
                    break;

                default:
                    System.out.println("Invalid input");
                    checkBalance();

            }

        }
    }


    private void deposit() {

        System.out.println("Which account would you like to make a deposit to?");
        System.out.println("Current [1], Joint [2], Savings [3], Go Back [4]");

        String input = myScanner.nextLine();
        if (input.equals("4")) mainMenu();

        else if (!(List.of("1", "2", "3").contains(input))) {

            System.out.println("Invalid account option provided");
            System.out.println();
            deposit();
        } else {

            System.out.println();
            System.out.println("How much would you like to deposit?");
            String depositAmount1 = myScanner.nextLine();


            if (!(isNumeric(depositAmount1) && Integer.parseInt(depositAmount1) > 0)) {
                System.out.println();
                System.out.println("Invalid deposit amount entered.");
                deposit();
            } else {
                depositAmount = Integer.parseInt(depositAmount1);

                System.out.println();

                switch (input) {
                    case "1":
                        users.cAccountBalance += depositAmount;
                        mainMenu();
                        break;

                    case "2":
                        users.jAccountBalance += depositAmount;
                        mainMenu();
                        break;

                    case "3":
                        users.sAccountBalance += depositAmount;
                        mainMenu();
                        break;

                }
            }
        }
    }

    private void withdraw() {
        System.out.println();

        System.out.println("Which account would you like to make a withdrawal from?");
        System.out.println("Current [1], Joint [2], Savings [3], go back [4]");
        String input = myScanner.nextLine();
        if (input.equals("4")) mainMenu();

        else if (!(List.of("1", "2", "3").contains(input))) {

            System.out.println("Invalid account option provided");
            System.out.println();
            withdraw();
        } else {

            System.out.println();
            System.out.println("How much would you like to withdraw?");
            String withdrawAmount1 = myScanner.nextLine();


            if (!(isNumeric(withdrawAmount1) && Integer.parseInt(withdrawAmount1) > 0)) {
                System.out.println();
                System.out.println("Invalid withdraw amount entered.");
                withdraw();
            } else {

                withdrawAmount = Integer.parseInt(withdrawAmount1);

                System.out.println();


                switch (input) {
                    case "1":
                        if (withdrawAmount <= users.cAccountBalance) {
                            users.cAccountBalance += withdrawAmount;
                            mainMenu();
                        } else
                            System.out.println("Insufficient Funds");
                        System.out.println();
                        mainMenu();
                        break;

                    case "2":
                        if (withdrawAmount <= users.jAccountBalance) {
                            users.jAccountBalance += withdrawAmount;
                            mainMenu();
                        } else
                            System.out.println("Insufficient Funds");
                        System.out.println();
                        mainMenu();
                        break;

                    case "3":
                        if (withdrawAmount <= users.sAccountBalance) {
                            users.sAccountBalance -= withdrawAmount;
                            mainMenu();
                        } else
                            System.out.println("Insufficient Funds");
                        System.out.println();
                        mainMenu();
                        break;

                }
            }
        }
    }


    private void transfer() {
        System.out.println();

        System.out.println("Which account would you like to transfer from?");
        System.out.println("Current [1], Joint [2], Savings [3], Go Back [4]");
        String source = myScanner.nextLine();
        if (source.equals("4")) mainMenu();

        else if (!(List.of("1", "2", "3").contains(source))) {

            System.out.println("Invalid account option provided");
            System.out.println();
            transfer();
        } else {

            System.out.println();

            System.out.println("Which account would you like to transfer to?");
            System.out.println("Current [1], Joint [2], Savings [3], Go Back [4]");
            String destination = myScanner.nextLine();

            if (destination.equals("4")) {
                System.out.println();
                mainMenu();
            } else if (!(List.of("1", "2", "3").contains(destination))) {

                System.out.println("Invalid transfer destination provided");
                System.out.println();
                transfer();
            } else {

                System.out.println();
                System.out.println("How much would you like to transfer?");

                String transferAmount1 = myScanner.nextLine();


                if (!(isNumeric(transferAmount1) && Integer.parseInt(transferAmount1) > 0)) {
                    System.out.println();
                    System.out.println("Invalid transfer amount entered.");
                    transfer();
                } else {
                    transferAmount = Integer.parseInt(transferAmount1);

                    System.out.println();

                    switch (source) {
                        case "1":
                            if (users.cAccountBalance >= transferAmount) {
                                switch (destination) {
                                    case "2":
                                        users.jAccountBalance += transferAmount;
                                        users.cAccountBalance -= transferAmount;
                                        mainMenu();
                                        break;

                                    case "3":
                                        users.sAccountBalance += transferAmount;
                                        users.cAccountBalance -= transferAmount;
                                        mainMenu();
                                        break;

                                    default:
                                        System.out.println("Invalid destination account");
                                        transfer();
                                }
                            } else
                                System.out.println("Insufficient funds to transfer.");
                            System.out.println();
                            transfer();


                        case "2":
                            if (users.jAccountBalance >= transferAmount) {
                                switch (destination) {
                                    case "1":
                                        users.cAccountBalance += transferAmount;
                                        users.jAccountBalance -= transferAmount;
                                        mainMenu();
                                        break;

                                    case "3":
                                        users.sAccountBalance += transferAmount;
                                        users.jAccountBalance -= transferAmount;
                                        mainMenu();
                                        break;

                                    default:
                                        System.out.println("Invalid destination account");
                                        transfer();
                                }
                            } else
                                System.out.println("Insufficient funds to transfer.");
                            System.out.println();
                            transfer();

                        case "3":
                            if (users.sAccountBalance >= transferAmount) {
                                switch (destination) {
                                    case "1":
                                        users.cAccountBalance += transferAmount;
                                        users.sAccountBalance -= transferAmount;
                                        mainMenu();
                                        break;

                                    case "2":
                                        users.jAccountBalance += transferAmount;
                                        users.sAccountBalance -= transferAmount;
                                        mainMenu();
                                        break;

                                    default:
                                        System.out.println("Invalid destination account");
                                        transfer();
                                }
                            } else
                                System.out.println("Insufficient funds to transfer.");
                            System.out.println();
                            transfer();

                        default:
                            System.out.println("Invalid source account");
                            System.out.println();
                            transfer();

                    }

                }
            }
        }
    }

    private void logout() {
        System.out.println();
        System.out.println("Logging Out...");
        System.out.println();
        init();
    }

}




