class SunClass{
    private int i=52;
    int j=852;

    void m1(){
        System.out.println(i);
        System.out.println(j);
    }
}

public class EccessModifier {
    public static void main(String[] args) {
        SunClass obj= new SunClass();
        obj.m1();
    }
}
