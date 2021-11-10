package array;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a no.");
        int n =sc.nextInt();
        int a=n;
        int s=0;
        int r;
        while(n!=0)
        {
            r=n%10;
            s=s*10+r;
            n=n/10;
        }
        if(s==a)
        {
            System.out.println("The no. is palindrome.");
        }
        else
        {
            System.out.println("The no. is not palindrome.");
        }
    }
}
