class Aa {
    public void meth1() {
        System.out.println("Aa class meth 1");
    }

    public void prnt() {
        System.out.println("Aa class prnt");
    }
}

class Ba extends Aa {
    public void prnt() {
        System.out.println("Ba class prnt");
    }
}

class Ca extends Aa {
    public void prnt() {
        System.out.println("Ca class prnt");
    }
}

public class DynamicMethod {
    public static void main(String[] args) {
        Aa ob1 = new Ba();
        ob1.prnt();
    }
}