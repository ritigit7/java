abstract class Parrent {

    public void met1() {
        System.out.println("This is from prrent met1....");
    }

    abstract public void met2();

}

class Child extends Parrent {

    public void met2() {
        System.out.println("this is from child and the value is.... ");
    }

}

// we cant access the the parrent because it has not body , we provide body by
// other sub class
public class AbstractClass {
    public static void main(String[] args) {

        Child obj = new Child();
        obj.met2();
    }
}
