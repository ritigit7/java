interface Network{
    void giveName();
    void range();
}
interface Camera{
    void record4kVideo();
    void shootIn64();
}

class Sellphone{
    void calling(){
        System.out.println("this is the calling feature of Sellphone...");
    }
}

class SmartMobile extends Sellphone implements Network,Camera{
    public void giveName(){
        System.out.println("Network is founding....");
    }
    public void range(){
        System.out.println("the range is 5km.....");
    }
    public void record4kVideo(){
        System.out.println("this is the feature of camera for record 4k video...");
    }
    public void shootIn64(){
        System.out.println("photo clicked by 64 mp....");
    }
}

public class Polimorphism {
    public static void main(String[] args) {

        Camera obj=new SmartMobile();
        obj.record4kVideo();
        // obj.range();//->it will give error because the range function is not in camera but it from smartmobile
    }
}