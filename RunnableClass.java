// class V1 implements Runnable {
//     public void run() {
//         for (int i = 0; i < 50; i++) {
//             System.out.println(i);
//         }
//     }
// }

// class V2 implements Runnable{
//     public void run() {
//         for (int i = 50; i < 100; i++) {
//             System.out.println(i);
//         }
//     }
// }

public class RunnableClass {
    public static void main(String[] args) {

        Runnable ob1 = () -> {
            for (int i = 0; i < 50; i++) {
                System.out.println(i);
            }
        };

        Runnable ob2 = () -> {
            for (int i = 50; i < 100; i++) {
                System.out.println(i);
            }
        };

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();
    }
}
