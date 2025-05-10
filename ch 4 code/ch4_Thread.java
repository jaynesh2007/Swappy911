class Thread1 extends Thread {
    public void run() {
        int i = 5; // Set countdown value directly inside the method
        try {
            for (;i > 0; i--) {
                System.out.println("Thread1 No:- " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread1 interrupted: " + e.getMessage());
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        int i = 5; // Set countdown value directly inside the method
        try {
            for (; i > 0; i--) {
                System.out.println("Thread2 No:- " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread2 interrupted: " + e.getMessage());
        }
    }
}

public class ch4_Thread {
    public static void main(String[] args) {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();

        obj1.start();
        obj2.start();
    }
}
