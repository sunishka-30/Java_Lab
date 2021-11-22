package multithreading;

import java.util.Random;

public class Generate {
    public static void main(String[] args) {
        String[] colours={"white","blue","black","green","red","yellow"};
        Thread obj1 = new Thread(()->{
            int n=new Random().nextInt(6);
            while(!colours[n].equals("red")) {
                System.out.println(colours[n]);
                n= new Random().nextInt(6);
            }
        });
        obj1.start();
    }


}
