package bankapp;

public class users {


    static Integer cAccountBalance = 0;
    static Integer jAccountBalance = 0;
    static Integer sAccountBalance = 0;



    static boolean validateLoginDetails(String enteredUsername, String enteredPassword) {
        String password = "Password";
        String username = "User";
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

}
