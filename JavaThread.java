class Runn1 implements Runnable{
    public void run(){
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
    }
}
class Runn2 implements Runnable{
    public void run(){
        char t='a';
        for (int i = 0; i <= 20; i++) {
            System.out.println(t++);
        }
    }
}

public class JavaThread {
    public static void main(String[] args) {
        Runn1 bullet1=new Runn1();
        Thread gun1=new Thread(bullet1);

        Runn2 bullet2=new Runn2();
        Thread gun2=new Thread(bullet2);

        gun1.start();                
        gun2.start();                
    }
}