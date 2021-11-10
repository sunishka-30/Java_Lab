package com.company;

import java.util.Scanner;

public class Reverse2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr=new int [2][2];
        int t;
        System.out.println("The given 2D array is: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=sc.nextInt();
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println("The reverse of the 2D-array is:");
        for(int i=0;i<1;i++)
        {
            for(int j=0;j<2;j++) {
                 t=arr[1 - i][1 - j];
                arr[1 - i][1 - j]=arr[i][j];
                arr[i][j] = t;
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++) {
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }

    }
}
