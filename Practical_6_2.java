// import java.util.concurrent.TimeUnit;
class R1 implements Runnable {
    public void run() {
        // try{
        // TimeUnit.NANOSECONDS.sleep(0);
        // }
        // catch(InterruptedException e){
        // e.printStackTrace();
        // }
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }
}

class R2 implements Runnable {
    public void run() {
        // try{
        // TimeUnit.NANOSECONDS.sleep(5);
        // }
        // catch(InterruptedException e){
        // e.printStackTrace();
        // }
        for (int i = 50; i < 60; i++) {
            System.out.print(i + " ");
        }
    }
}

class R3 implements Runnable {
    public void run() {
        // try{
        // TimeUnit.NANOSECONDS.sleep(5);
        // }
        // catch(InterruptedException e){
        // e.printStackTrace();
        // }
        for (int i = 60; i < 70; i++) {
            System.out.print(i + " ");
        }
    }
}

public class Practical_6_2 extends Thread {
    public static void main(String[] args) {
        R1 rr1 = new R1();
        Thread thobject1 = new Thread(rr1);

        R2 rr2 = new R2();
        Thread thobject2 = new Thread(rr2);

        R3 rr3 = new R3();
        Thread thobject3 = new Thread(rr3);

        thobject2.start();
        thobject3.start();
        try {
            thobject1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thobject1.start();

    }
}
