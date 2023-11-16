class ParrentClass {
    private int data;

    public ParrentClass(){
        System.out.println("this is from parrent class");    
    }

    public int get() {
        return this.data;
    }

    public void set(int dt) {
        this.data = dt;
    }
}

class ChildClass extends ParrentClass {

    public ChildClass(){
        System.out.println("this is from child class");
    }
}

class Phone{
    public void method1(int i){
        System.out.println(i);
    }
}
class SmartPhone extends Phone{
    public void method1(int i){
        System.out.println(i+1+" method 1 from smart phone class");
    }
    public void method3(int i){
        System.out.println(i);
    }
}
public class Inheritance {
    public static void main(String[] args) {

        // ParrentClass obj = new ParrentClass();
        // obj.set(6);
        // System.out.println(obj.get());

        // ChildClass obj2 =new ChildClass();
        /*-->if there any construtor in parrent class then it will first  include and after child class it will execute first execute*/

        // obj2.set(65664);
        // System.out.println(obj2.get());

        // SmartPhone obj3=new SmartPhone();
        // obj3.method1(4);

        Phone obj4=new SmartPhone();
        obj4.method1(5);   
    }
}
