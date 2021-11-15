/*Write a class MathOperation which accepts 5 integers through command line.
        Create an array using these parameters. Loop through the array and obtain
        the sum and average of all the elements and display the result.

        Various exceptions that may arise like ArithmeticException, NumberFormatException,
        and so on should be handled.*/

        package exceptionhandling;

public class MathOperation {
    public static void main(String[] args) {
        int[] a = new int[5];
        int tt=0;
        try{
            for(int i=0;i<args.length;i++){
                a[i] = Integer.parseInt(args[i]);
                tt=tt+a[i];
            }
            System.out.println("Total of the entered values : "+tt);
            System.out.println("Average of the entered numbers is : "+tt/(args.length));
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
