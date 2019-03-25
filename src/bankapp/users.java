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


    static Integer cAccountBalance = 0;
    static Integer jAccountBalance = 0;
    static Integer sAccountBalance = 0;


    static boolean validateLoginDetails(String enteredUsername, String enteredPassword) {

        String username = "User";
        String password = "password";

        return (enteredUsername.equals(username) && enteredPassword.equals(password));
    }

    static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
