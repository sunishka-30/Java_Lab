package com.company;

import java.util.Scanner;

public class IgnoreSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int sum = 0;
        boolean flag = true;

        System.out.println("Enter the number of elements in array.");
        n= sc.nextInt();
        int[] arr =new int[n];
        System.out.println("Enter array elements.");

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]!=6 && flag)
            {
                sum+=arr[i];
            }
            else if (arr[i]==6)
            {
                flag=false;
            }
            else if (arr[i]==7)
            {
                flag=true;
            }
        }
        System.out.println("Sum of array elements following the given condition is = "+sum);




    }
}
