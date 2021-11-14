/*Write a Program to take care of Number Format Exception if the user enters values other than integer
        for calculating the average marks of 2 students. The name of the students and marks in 3 subjects
        are taken from the user while executing the program.
        In the same Program write your own Exception classes to take care of Negative values and values out of
        range (i.e. other than in the range of 0-100).
        Exception Handling: Throw & User Defined Exception*/

package exceptionhandling;

import java.util.Scanner;

class TestNumber
{
    String name;
    int a,b,c;
    TestNumber(String name,int a,int b,int c)
    {
       this.name = name;
       this.a = a;
       this.b = b;
       this.c = c;
    }



    public void average(int a,int b,int c)
    {
        double average = (double)(a+b+c)/3;
        System.out.printf(name + "'s average marks are : %.2f\n", average);

    }

}
class NumberException extends Exception{
    NumberException(String s)
    {
        super(s);
    }
}
class TestException{
    static void numCheck(Integer num)throws NumberException{
        if(num < 0 || num > 100)
            throw new NumberException("Not valid number");
    }
}
public class Number extends TestException {
    public static void main(String[] args) {


     Number objs1 = new Number();
     Number objs2 = new Number();
     objs1.execute();
     objs2.execute();




    }

    public void execute()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name.");
        String name= sc.nextLine();
        int a,b,c;
        try {
            System.out.println("Enter marks.");
            a= Integer.parseInt(sc.nextLine());
            b=Integer.parseInt(sc.nextLine());
            c=Integer.parseInt(sc.nextLine());
            numCheck(a);
            numCheck(b);
            numCheck(c);
            TestNumber obj1 = new TestNumber(name,a,b,c);
            obj1.average(a,b,c);
        }
        catch (NumberFormatException obj )
        {
            System.out.println("The number is not of valid datatype.");
        }
        catch( NumberException e)
        {
            System.out.println(e.getMessage());
        }

    }

}
