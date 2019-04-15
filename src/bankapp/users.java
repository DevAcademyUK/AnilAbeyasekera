package bankapp;


public class users {

/*
    users(String username, String password, Integer cAccountBalance,
          Integer jAccountBalance, Integer sAccountBalance) {
       users.username = username;
        users.password = password;
        users.cAccountBalance = cAccountBalance;
        users.jAccountBalance = jAccountBalance;
        users.sAccountBalance = sAccountBalance;
    }
*/

    //Declaration of accounts balances

    static Integer cAccountBalance = 0;
    static Integer jAccountBalance = 0;
    static Integer sAccountBalance = 0;


    //Method to validate login details
    static boolean validateLoginDetails(String enteredUsername, String enteredPassword) {


        String username = "User";
        String password = "password";

        return (enteredUsername.equals(username) && enteredPassword.equals(password));
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

}
