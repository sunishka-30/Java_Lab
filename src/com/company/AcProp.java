package com.company;

import java.util.Scanner;

public class AcProp {
    boolean AC_ON, HOME_THEATRE_ON, FAN_ON, LIGHT_ON;
    AcProp(boolean AC_ON, boolean HOME_THEATRE_ON, boolean FAN_ON, boolean LIGHT_ON)
    {   this.AC_ON = AC_ON;
        this.HOME_THEATRE_ON = HOME_THEATRE_ON;
        this.FAN_ON = FAN_ON;
        this.LIGHT_ON = LIGHT_ON;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ac = sc.nextBoolean();
        boolean home = sc.nextBoolean();
        boolean fan = sc.nextBoolean();
        boolean light = sc.nextBoolean();
        AcProp obj = new AcProp(ac,home,fan,light);
        calculatePower(ac,home,fan,light);

    }
    public static void calculatePower(boolean AC_ON, boolean HOME_THEATRE_ON, boolean FAN_ON, boolean LIGHT_ON)
    { int s=0;
        if (AC_ON)
        {
            s=s+1200;
        }
        if(HOME_THEATRE_ON)
        {
            s=s+600;
        }
        if(FAN_ON)
        {
            s=s+400;
        }
        if(LIGHT_ON)

        {
            s=s+100;
        }
        if(s>2000)
        {
            System.out.println("Overload");
        }
        else
        {
            System.out.println("Not Overload");
        }
    }
}
