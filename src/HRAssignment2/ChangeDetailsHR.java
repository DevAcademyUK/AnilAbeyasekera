package HRAssignment2;

class ChangeDetailsHR extends ChangeDetails {

    //Menu for hr employees
    void menu2(int id) {

        System.out.println("What would you like to do?");
        System.out.println("1. Change your info");
        System.out.println("2. Change another employee's info");
        System.out.println("3. Create new employee record");
        System.out.println("4. View your information");
        System.out.println("5. Log out");

        String choice = myScanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println("What would you like to change?");
                System.out.println("1. Change your name");
                System.out.println("2. Change your address");
                System.out.println("3. Change your contact information");
                System.out.println("4. Go back");
                String choice1 = myScanner.nextLine();
                switch (choice1) {
                    case "1":
                        changeName(id);
                        menu2(id);
                        break;

                    case "2":
                        changeAddress(id);
                        menu2(id);
                        break;

                    case "3":
                        changeContact(id);
                        menu2(id);

                    case "4":
                        menu2(id);

                    default:
                        System.out.println("Invalid input");
                        menu2(id);

                }

            case "2":
                System.out.println("Enter the id of the employee whose details you would like to change");
                int id2 = Integer.parseInt(myScanner.nextLine());
                for (Employee b : Login.employeeList) {
                    if (id2 == b.getId()) {
                        if (b.getPosition() == "manager") {
                            System.out.println("You do not have permission to edit this employee's records");
                            menu2(id);
                        } else {
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
                                    menu2(id);
                                    break;

                                case "2":
                                    changeAddress(id2);
                                    menu2(id);
                                    break;

                                case "3":
                                    changeContact(id2);
                                    menu2(id);
                                    break;

                                case "4":
                                    viewInfo(id2);
                                    menu2(id);
                                    break;

                                case "5":
                                    menu2(id);
                                    break;

                                default:
                                    System.out.println("Invalid input");
                                    menu2(id);
                            }
                        }
                    }
                }

            case "3":
                createEmployee();
                menu2(id);
                break;


            case "4":
                viewInfo(id);
                menu2(id);
                break;

            case "5":
                Login logout = new Login();
                logout.menu();

            default:
                System.out.println("Invalid input");
                menu2(id);
                break;

        }

    }

    void createEmployee() {
        System.out.println("Title");
        String title = myScanner.nextLine();

        System.out.println("Forename");
        String forename = myScanner.nextLine();

        System.out.println("Surname");
        String surname = myScanner.nextLine();

        System.out.println("Date of birth  (Format: Year Month Date)");
        String dob = myScanner.nextLine();

        System.out.println("Address");
        String address = myScanner.nextLine();

        System.out.println("Town");
        String town = myScanner.nextLine();

        System.out.println("County");
        String county = myScanner.nextLine();

        System.out.println("Post Code");
        String postcode = myScanner.nextLine();

        System.out.println("Contact Number");
        String contactNumber = myScanner.nextLine();

        System.out.println("Email address");
        String emailAddress = myScanner.nextLine();

        System.out.println("Employee ID");
        int employeeID = Integer.parseInt(myScanner.nextLine());

        /*
        String employeeIDString = myScanner.nextLine();
        if (Login.isNumeric(employeeIDString)) {
            int employeeID = Integer.parseInt(employeeIDString);
        } else {
            int employeeID = 0;
        }*/

        System.out.println("Position");
        String position = myScanner.nextLine();

        System.out.println("Start date (Format: Year Month Date)");
        String startDate = myScanner.nextLine();

        Login.employeeList.add(new Employee(title, forename, surname, dob, address, town, county,
                postcode, contactNumber, emailAddress, employeeID, position, startDate));


    }


}
