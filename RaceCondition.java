class Count {
    int count;

    public synchronized void cont() {
        count++;
    }
}

public class RaceCondition {
    public static void main(String[] args) {

        Count ob = new Count();
        Runnable ob1 = () -> {
            for (int i = 0; i < 100; i++) {
                ob.cont();
            }
        };

        Runnable ob2 = () -> {
            for (int i = 0; i < 100; i++) {
                ob.cont();
            }
        };

        Thread th1 = new Thread(ob1);
        Thread th2 = new Thread(ob2);

        th1.start();
        th2.start();

        System.out.println(ob.count);
    }
}
