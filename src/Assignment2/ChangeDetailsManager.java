package Assignment2;

import java.util.Collections;

class ChangeDetailsManager extends ChangeDetailsHR {

    //Menu for the hr manager
    void menu3(int id) {

        System.out.println("What would you like to do?");
        System.out.println("1. Change your info");
        System.out.println("2. Change another employee's info");
        System.out.println("3. Create new employee record");
        System.out.println("4. View all employee records");
        System.out.println("5. View your information");
        System.out.println("6. Log out");

        String choice = myScanner.nextLine();
        switch (choice){
            case "1":
                System.out.println("What would you like to change?");
                System.out.println("1. Change your name");
                System.out.println("2. Change your address");
                System.out.println("3. Change your contact information");
                System.out.println("4. Go back");
                String choice1 = myScanner.nextLine();
                switch (choice1){
                    case "1":
                        changeName(id);
                        menu3(id);
                        break;

                    case "2":
                        changeAddress(id);
                        menu3(id);
                        break;

                    case "3":
                        changeContact(id);
                        menu3(id);
                        break;

                    case "4":

                        menu3(id);
                        break;

                    default:
                        System.out.println("Invalid input");

                        menu3(id);
                        break;

                }

            case "2":
                System.out.println("Enter the id of the employee whose details you would like to change");

                String id2String = myScanner.nextLine();

                if (!Login.isNumeric(id2String)) {
                    System.out.println("Invalid input");
                    menu3(id);
                } else {
                    int id2 = Integer.parseInt(id2String);

                    for (Employee b : Login.employeeList) {
                        if (id2 == b.getId()) {

                            System.out.println("What would you like to do?");
                            System.out.println("1. Change their name");
                            System.out.println("2. Change their address");
                            System.out.println("3. Change their contact information");
                            System.out.println("4. View their information");
                            System.out.println("5. Go back");

                            String choice2 = myScanner.nextLine();
                            switch (choice2) {
                                case "1":
                                    changeName(id2);
                                    menu3(id);
                                    break;

                                case "2":
                                    changeAddress(id2);
                                    menu3(id);
                                    break;

                                case "3":
                                    changeContact(id2);
                                    menu3(id);
                                    break;

                                case "4":
                                    viewInfo(id2);
                                    menu3(id);
                                    break;

                                case "5":
                                    menu3(id);
                                    break;

                                default:
                                    System.out.println("Invalid input");
                                    menu3(id);
                            }

                        }
                    }
                }

            case "3":
                createEmployee();
                menu3(id);
                break;


            case "4":
                viewData();
                menu3(id);
                break;

            case "5":
                Login logout = new Login();
                logout.menu();
                break;

            default:
                System.out.println("Invalid input");
                menu3(id);
                break;

        }

    }

    private void viewData() {
        System.out.println("How would you like to sort the data?");
        System.out.println("1. Employee ID, 2. Title, 3. Forename, 4. Surname");
        System.out.println("5. Address, 6. Town/City, 7. County, 8. Postcode");
        System.out.println("9. Contact Number, 10. Email Address, 11. Date of Birth");
        System.out.println("12. Start Date, 13. Position");

        String choice3 = myScanner.nextLine();
        System.out.println("1. Ascending, 2. Descending");
        String choice4 = myScanner.nextLine();
        switch (choice3){
            case "1":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareID);

                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareID.reversed());

                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "2":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareTitle);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareTitle.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "3":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareForename);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareForename.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "4":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareSurname);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareSurname.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "5":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareAddress);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareAddress.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "6":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareTown);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareTown.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "7":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareCounty);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareCounty.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "8":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.comparePostcode);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.comparePostcode.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "9":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareNumber);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareNumber.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "10":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareEmail);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareEmail.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "11":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareDOB);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareDOB.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "12":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.compareStartDate);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.compareStartDate.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

            case "13":
                if (choice4.equals("1")){
                    Collections.sort(Login.employeeList, Employee.comparePosition);
                }
                else if (choice4.equals("2")){
                    Collections.sort(Login.employeeList, Employee.comparePosition.reversed());
                }
                else {
                    System.out.println("Invalid input");
                    viewData();
                }
                break;

                default:
                    System.out.println("Invalid input");
                    viewData();
                    break;

        }

        for (Employee a : Login.employeeList){
            System.out.println(a.id + " " + a.title + " " + a.forename + " " + a.surname + " " + a.address1 +
                    " " + a.town + " " + a.county + " " + a.postcode + " " + a.number + " " + a.email  +
                    " " + a.dob + " " + a.startDate + " " + a.position);
        }

    }
}
