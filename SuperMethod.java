class Ac {
    public Ac() {
        System.out.println("This is froom Ac class");
    }
    public Ac(int n) {
        System.out.println("This is froom Ac class "+ n);
    }
}

class Bc extends Ac {
    public Bc() {
        //every constructor has its own super() method , it call super class
        // super(5);
        System.out.println("This is froom Bc class");
    }
    public Bc(int n) {
        // super(n);
        this();
        System.out.println("This is froom Bc class "+n);
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        // Bc ob1=new Bc(4);
    }
}
