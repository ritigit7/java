class Block{
    int a;
    int b;
    static int c;
    Block(){
        System.out.println(a+b);
        System.out.println(a+b+c);
    }

    static{
        c=5;
    }
}
public class StaticBlock {
    public static void main(String[] args){
        // Block b1=new Block();
        // Block b2=new Block();
    }
}
