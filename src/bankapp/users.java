package bankapp;

import java.util.ArrayList;

public class users {


    users(String username, String password, Integer cAccountBalance,
          Integer jAccountBalance, Integer sAccountBalance) {
        this.username = username;
        this.password = password;
        this.cAccountBalance = cAccountBalance;
        this.jAccountBalance = jAccountBalance;
        this.sAccountBalance = sAccountBalance;

    }


   /* static Integer cAccountBalance = 0;
    static Integer jAccountBalance = 0;
    static Integer sAccountBalance = 0;

*/


    static boolean validateLoginDetails(String enteredUsername, String enteredPassword) {

       // String username = "User";
       // String password = "Password";


        return enteredUsername.equals() && enteredPassword.equals();
    }

}
