class f1 extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("");
            }
        }
    }
}

class f2 extends Thread {
    public void run() {
        for (int i = 50; i < 100; i++) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("");
            }
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        f1 ob1 = new f1();
        f2 ob2 = new f2();
        ob1.start();
        // ob1.setPriority(10);
        ob2.start();
    }
}
