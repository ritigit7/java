interface Cycle {
    int a = 7;

    void speedUp(int i);

    void speedDown(int j);

    default void showSpeed() {
        System.out.println("this is the speed of the vehichel...");
    }
}

interface Color extends Cycle {

    void bikeColor(String str);

    void hornColor(String str);
}

class bike1 implements Color {
    public void applyBreak() {
        System.out.println("the break is applied...");
    }

    public void speedUp(int i) {
        System.out.println("the speed is increese by 1->" + (++i));
    }

    public void speedDown(int j) {
        System.out.println("the speed is dicrees by 1->" + (--j));
    }

    public void bikeColor(String str) {
        System.out.println("this is the " + str + " color of the bike.");
    }

    public void hornColor(String str) {
        System.out.println("this is the " + str + " color of the horn.");
    }
}

public class InterfaceClass {
    public static void main(String[] args) {
        bike1 obj = new bike1();
        obj.applyBreak();
        obj.speedUp(5);
        // System.out.println("this is from interface variable->" + obj.a);
        // we can not change the value of the interface variable
        obj.hornColor("bule");
        obj.showSpeed();
    }
}
