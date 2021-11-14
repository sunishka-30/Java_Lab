/*Write a program to accept name and age of a person from the command prompt
(passed as arguments when you execute the class) and ensure that the age entered is >=18 and < 60.
Display proper error messages.

The program must exit gracefully after displaying the error message in case the
arguments passed are not proper.
 (Hint : Create a user defined exception class for handling errors.)*/

package exceptionhandling;

class ExcepAge extends Exception
{
    ExcepAge(String s)
    {
        super(s);
    }
}

class TestEx
{
    static void checkAge(Integer age)throws ExcepAge{
        if(age >= 18 && age < 60)
            System.out.println("Valid age");
        else
            throw new ExcepAge("Invalid age");
    }

}

public class AgeName extends TestEx {
    public static void main(String[] args) {

        System.out.println("Name : " + args[0]);
        try {
            checkAge(Integer.parseInt(args[1]));

        }
        catch(ExcepAge e)

        {
            System.out.println(e.getMessage());

        }

    }
}
