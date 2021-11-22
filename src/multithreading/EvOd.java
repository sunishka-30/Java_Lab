package multithreading;


public class EvOd {
    public static void main(String[] args) {
        Thread obj1 = new Thread(() -> {
            System.out.println("The even no.s are:");
            for (int i = 2; i < 20; i += 2) System.out.print(i + " ");
        });
        Thread obj2 = new Thread(() -> {


        try {
            obj1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nThe odd no.s:");

        for (int i = 1; i < 20; i += 2) {
            System.out.print(i + " ");
        }
    });
        obj1.start();
        obj2.start();

    }
}
