import com.company.calculator.Read;

import java.util.Scanner;

public class Login {

    public boolean isLoggedIn(){
        Scanner scan = new Scanner(System.in);
        String username = "Username";
        String password = "Pass123";

        System.out.println("Enter username: ");
        String givenUsername = scan.next();
        System.out.println("Enter password: ");
        String givenPassword = scan.next();


        if (username.equals(givenUsername) && password.equals(givenPassword)){
            System.out.println("Success! You are logged in!");
            return true;
        }else {
            System.out.println("Incorrect! You are not logged in. Try again!");
            return false;
        }
    }

    public boolean loginSuccesfull(){
        boolean repeat;
        int count = 0;
        do {
            repeat = isLoggedIn();
            count++;
        }while (!repeat && count <3);
        return repeat;
    }








}
