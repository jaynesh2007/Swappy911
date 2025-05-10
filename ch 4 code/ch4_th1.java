class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 200; i += 2) {
            System.out.println("Even Thread: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 200; i += 2) {
            System.out.println("Odd Thread: " + i);
            try {
                Thread.sleep(100); 
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ch4_th1 {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();
    }
}
