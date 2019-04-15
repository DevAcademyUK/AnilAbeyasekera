package Assignment2;

import java.util.Scanner;

class ChangeDetails {
    Scanner myScanner = new Scanner(System.in);

    //Menu for non hr employees
    void menu1(int id) {

        System.out.println("What would you like to do?");
        System.out.println("1. Change your name");
        System.out.println("2. Change your address");
        System.out.println("3. Change your contact information");
        System.out.println("4. View your information");
        System.out.println("5. Log out");
        String choice = myScanner.nextLine();
        switch (choice){
            case "1":
                changeName(id);
                menu1(id);

            case "2":
                changeAddress(id);
                menu1(id);

            case "3":
                changeContact(id);
                menu1(id);

            case "4":
                viewInfo(id);
                menu1(id);

            case "5":
                Login logout = new Login();
                logout.menu();

                default:
                    System.out.println("Invalid input");
                    menu1(id);

        }
    }

    void viewInfo(int id) {
        for (Employee a : Login.employeeList){
            if (id == a.getId()){
                System.out.println("Name: " + a.getTitle() + " " + a.getForename() + " " + a.getSurname());
                System.out.println("Address: " + a.getAddress1() + ", " + a.getTown() + ", " + a.getCounty() + ", " +
                        a.getPostcode());
                System.out.println("Email Address: " + a.getEmail());
                System.out.println("Contact Number: " + a.getNumber());

            }
        }
    }

    void changeName(int id){
        for (Employee a : Login.employeeList){
            if (id == a.getId()){

                System.out.println("Title:");
                String title = myScanner.nextLine();
                a.setTitle(title);
                System.out.println("Forename:");
                String forename = myScanner.nextLine();
                a.setForename(forename);
                System.out.println("Surname:");
                String surname = myScanner.nextLine();
                a.setSurname(surname);


            }
        }

    }

    void changeAddress(int id) {
        for (Employee a : Login.employeeList){
            if (id == a.getId()){

                System.out.println("Address:");
                String address1 = myScanner.nextLine();
                a.setAddress1(address1);
                System.out.println("Town/City:");
                String towncity = myScanner.nextLine();
                a.setTown(towncity);
                System.out.println("County:");
                String county = myScanner.nextLine();
                a.setCounty(county);
                System.out.println("Post Code:");
                String postcode = myScanner.nextLine();
                a.setPostcode(postcode);


            }
        }
    }

    void changeContact(int id) {
        for (Employee a : Login.employeeList) {
            if (id == a.getId()) {
                System.out.println("Email Address:");
                String email = myScanner.nextLine();
                a.setEmail(email);
                System.out.println("Contact Number:");
                String number = myScanner.nextLine();
                a.setNumber(number);

            }
        }
    }
}
