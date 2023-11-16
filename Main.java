class OuterClass {
  int x = 10;

  class InnerClass {
    int y = 5;
  }
  public static void main(String[] args) {
    
  }
}

public class Main {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }

public void start() {
}

public boolean isAlive() {
    return false;
}
}