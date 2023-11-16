sealed class S permits S1, S2 {

}

final class S1 extends S {

}

final class S2 extends S {

}

class S3 {

}

public class SealedClass {
    public static void main(String[] args) {
        int n[]={1,5};
        int[] m={7,8};
        System.out.println(n);
        System.out.println(m);
    }
}
