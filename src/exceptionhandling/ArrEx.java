package exceptionhandling;

import java.util.Scanner;

public class ArrEx {
    public static void main(String[] args) {
        System.out.println("Enter the number of elements in array : ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        System.out.println("Enter the elements in  array : ");
        try{
            for(int i=0;i<num;i++){
                String t = s.next();
                arr[i] = Integer.parseInt(t);}
            System.out.println("Enter the index of the array element you want to access : ");
            int id = s.nextInt();
            try{
                System.out.println("The array element at index "+id+" = "+arr[id]);
            }
            catch(IndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }

        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());
        }

    }
}
