class U {
    public void m1() {
        System.out.println("from U m1");
    }
}

class D extends U {
    public void m2() {
        System.out.println("from D m2");
    }
}

public class UpDownCasting {
    public static void main(String[] args) {
        U ob = (U) new D();//upcasting, a child class object is casting by parant class reference
        D ob2 = (D) ob; //downcasting , a child class is not use its own method , we have to downcast to new child object whth parant class 
        ob2.m2();
    }
}
