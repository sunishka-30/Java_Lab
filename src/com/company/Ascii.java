package com.company;

import java.util.Scanner;

public class Ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements.");
        int n=sc.nextInt();
        System.out.println("Enter array elements.");
        int []arr= new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int  i:arr)
        {
            System.out.print((char)i+" ");
        }
    }
}
