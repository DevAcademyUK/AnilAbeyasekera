package HRAssignment2;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login {

    static List<Employee> employeeList = new ArrayList<Employee>();
    Scanner myScanner = new Scanner(System.in);


    public static void main(String[] args) {
        Login login = new Login();
        login.initialise();

    }


    void initialise() {
        employeeList.add(new Employee("Mr", "Jon", "Smith", "1997 01 28", "5 London Road",
                "Bristol", "Bristol", "BS1 67B", "01727987060", "jonsmith@gmail.com",
                23, "employee", "2018 04 01"));
        employeeList.add(new Employee("Mrs", "Jane", "Smithers", "1995 03 23", "16 Gloucester Road",
                "Bristol", "Bristol", "BS1 F4U", "01828917666", "janesmithers@outlook.com",
                47, "hr", "2015 02 01"));
        employeeList.add(new Employee("Ms", "Anne", "Simpson", "1992 08 02", "2 Swindon Road",
                "Bristol", "Bristol", "BS2 8D2", "01784987273", "annesimpson@yahoo.com",
                92, "hr manager", "2013 09 17"));

        menu();
    }

    //Method to check if a string can be parsed to an integer
    static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    //Login menu
    public void menu() {
        System.out.println("Enter your id");
        String idString = myScanner.nextLine();
        if (!isNumeric(idString)) {
        System.out.println("Invalid input");
         menu();
      }
        else {

           int id = Integer.parseInt(idString);
            for (Employee a : employeeList) {

                if (id == a.getId()) {
                    if (a.getPosition().equals("hr")) {
                        System.out.println("Welcome " + a.getTitle() + " " + a.getForename() + " " + a.getSurname());
                        System.out.println();
                        ChangeDetailsHR hr = new ChangeDetailsHR();
                        hr.menu2(id);
                    } else if (a.getPosition().equals("hr manager")) {
                        System.out.println("Welcome " + a.getTitle() + " " + a.getForename() + " " + a.getSurname());
                        System.out.println();
                        ChangeDetailsManager manager = new ChangeDetailsManager();
                        manager.menu3(id);
                    } else {
                        System.out.println("Welcome " + a.getTitle() + " " + a.getForename() + " " + a.getSurname());
                        System.out.println();
                        ChangeDetails employee = new ChangeDetails();
                        employee.menu1(id);
                    }
                }
            }
            System.out.println("ID not found.");
            menu();
        }

    }
}
