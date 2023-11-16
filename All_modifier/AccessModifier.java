package All_modifier;

class C1 {
    public int a = 5;
    protected int b = 6;
    int c = 7;
    private int d = 8;

    public void method() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}

// class C2 {
// public void method() {
// System.out.println(a);
// System.out.println(b);
// System.out.println(c);
// System.out.println(d);
// }
// }

public class AccessModifier {
    public static void main(String[] args) {

        C1 obj = new C1();
        obj.method();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        // System.out.println(obj.d);//it will not execute because it is private

        // C2 obj2 = new C2();
        // obj2.method();
    }
}
