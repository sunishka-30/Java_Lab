package multithreading;

public class Priority {
    public static void main(String[] args) {
        Thread obj1=new Thread(()->{for(int i=1;i<=5;i++) System.out.println("MAX");});
        Thread obj2=new Thread(()->{for(int i=1;i<=5;i++) System.out.println("MIN");});
        Thread obj3=new Thread(()->{for(int i=1;i<=5;i++) System.out.println("NORM");});
        obj1.setPriority(Thread.MAX_PRIORITY);obj2.setPriority(Thread.MIN_PRIORITY);obj3.setPriority(Thread.NORM_PRIORITY);
        obj1.start();obj2.start();obj3.start();
    }
}
