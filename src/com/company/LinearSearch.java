package com.company;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int f=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements.");
        int n=sc.nextInt();
        System.out.println("Enter array elements.");
        int []arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter element to be searched.");
        int e = sc.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==e)
            {   f=1;
                System.out.println("Element found at index "+(i+1));
                break;
            }

        }
        if(f==0) System.out.println("-1");
    }
}
