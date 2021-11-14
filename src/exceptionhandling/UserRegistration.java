/*A student portal provides user to register their profile.
        During registration the system needs to validate the user should be located in India.
        If not the system should throw an exception.

        Step 1: Create a user defined exception class named “InvalidCountryException”.
        Step 2: Overload the respective constructors.
        Step 3: Create a main class “UserRegistration”, add the following method,
        void registerUser(String username,String userCountry) with the below implementation
        • if userCountry is not equal to  “India” throw a InvalidCountryException with the message
        “User Outside India  cannot be registered”
        • if userCountry is equal to  “India”,  print the message “User registration done successfully”

        Invoke the method registerUser from the main method with the data specified and see how the
        program behaves.*/

package exceptionhandling;

import java.util.Scanner;

class InvalidCountryException extends Exception {
    InvalidCountryException(String s )
    {
        super( s );
    }

}
public class UserRegistration {
    public static void main(String[] args) throws InvalidCountryException {
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();
        String usercountry = sc.nextLine();
        UserRegistration u = new UserRegistration();
        try {
            u.registerUser( username, usercountry);
        }
        catch(InvalidCountryException e) {
            System.out.println(e.getMessage());
        }



    }
    void registerUser(String username, String usercountry) throws InvalidCountryException
    {
        if (usercountry.equals("India"))
            System.out.println("User name : "+username +"\nUser status : User registration done successfully.");
        else {
            throw new InvalidCountryException("User name : "+username+"\nUser status : User Outside India  cannot be registered.");
        }
    }
}
