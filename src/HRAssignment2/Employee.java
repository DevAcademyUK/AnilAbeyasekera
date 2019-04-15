package HRAssignment2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Employee {


    public String title;
    public String forename;
    public String surname;
    public String dob;
    public String address1;
    public String town;
    public String county;
    public String postcode;
    public String number;
    public String email;
    public int id;
    public String position;
    public String startDate;


    //Employee constructor
    Employee(String title, String forename, String surname, String dob, String address1, String town,
             String county, String postcode, String number, String email, int id, String position, String startDate) {
        this.title = title;
        this.forename = forename;
        this.surname = surname;
        this.dob = dob;
        this.address1 = address1;
        this.town = town;
        this.county = county;
        this.postcode = postcode;
        this.number = number;
        this.email = email;
        this.id = id;
        this.position = position;
        this.startDate = startDate;

    }


    //Comparators
    static Comparator<Employee> compareTitle = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employee1 = a.title.toLowerCase();
            String employee2 = b.title.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareForename = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employee1 = a.forename.toUpperCase();
            String employee2 = b.forename.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareSurname = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employee1 = a.surname.toUpperCase();
            String employee2 = b.surname.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareDOB = new Comparator<Employee>() {


        @Override
        public int compare(Employee a, Employee b) {

            Long employee1 = Long.parseLong(a.dob.replaceAll("\\s", ""));
            Long employee2 = Long.parseLong(b.dob.replaceAll("\\s", ""));


            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareAddress = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employee1 = a.address1.toUpperCase();
            String employee2 = b.address1.toUpperCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareTown = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employee1 = a.town.toLowerCase();
            String employee2 = b.town.toLowerCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareCounty = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employee1 = a.county.toLowerCase();
            String employee2 = b.county.toLowerCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> comparePostcode = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employee1 = a.postcode.toLowerCase();
            String employee2 = b.postcode.toLowerCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareNumber = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employee1 = a.number.toLowerCase();
            String employee2 = b.number.toLowerCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareEmail = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employee1 = a.email.toLowerCase();
            String employee2 = b.email.toLowerCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareID = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            int employee1 = a.id;
            int employee2 = b.id;

            return Integer.compare(employee1, employee2);
        }
    };

    static Comparator<Employee> comparePosition = new Comparator<Employee>() {
        @Override
        public int compare(Employee a, Employee b) {
            String employee1 = a.position.toLowerCase();
            String employee2 = b.position.toLowerCase();

            return employee1.compareTo(employee2);
        }
    };

    static Comparator<Employee> compareStartDate = new Comparator<Employee>() {

        @Override
        public int compare(Employee a, Employee b) {
            Long employee1 = Long.parseLong(a.startDate.replaceAll("\\s", ""));
            Long employee2 = Long.parseLong(b.startDate.replaceAll("\\s", ""));


            return employee1.compareTo(employee2);
        }
    };

    //Getters
    public String getTitle() {
        return title;
    }

    public String getForename() {
        return forename;
    }

    public String getSurname() {
        return surname;
    }

    public String getDob() {
        return dob;
    }

    public String getAddress1() {
        return address1;
    }

    public String getTown() {
        return town;
    }

    public String getCounty() {
        return county;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public int getId() {
        return id;
    }

    public String getPosition() {
        return position;
    }

    public String getStartDate() {
        return startDate;
    }


    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
}
