class Outter {
    public void out() {
        System.out.println("from outter class");
    }

    class Inner {
        public void in() {
            System.out.println("from inner class");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {

        Outter ot=new Outter();
        ot.out();

        Outter.Inner nt=ot.new Inner();// if inner class is not static 
        // Outter.Inner nt=new Outter.Inner();//use if inner class is static 
        nt.in();
    }
}
