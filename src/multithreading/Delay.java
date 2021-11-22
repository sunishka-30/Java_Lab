package multithreading;

public class Delay {
    public static void main(String[] args) {
        Thread obj1 = new Thread(()->
        {
            for(int i=1;i<=10;i++)
            {
                if(i==6)
                {
                    try{
                       Thread.sleep(5000);
                    }
                    catch(InterruptedException e)
                    {
                        System.out.println(e.getMessage());
                    }
                }
                System.out.println(i);
            }


        });
        obj1.start();
    }
}
