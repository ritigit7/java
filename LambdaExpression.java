interface F {
    public void show();
}

public class LambdaExpression {
    public static void main(String[] args) {
        F ob = () -> {
            System.out.println("this is from F interface implement by lambda");
        };
        ob.show();
    }
}