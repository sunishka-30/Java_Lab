package multithreading;
class Test extends Thread
{
    @Override
    public void run() {
        System.out.println("Thread");
    }
}
public class Display {
    public static void main(String[] args) {
        Test obj1 = new Test();

        Test obj2 = new Test();
        obj1.start();
        obj2.start();
        obj1.setName("Scooby");
        obj2.setName("Shaggy");
        System.out.println(obj1.getName());
        System.out.println(obj2.getName());
    }
}
