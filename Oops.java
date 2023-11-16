class data{
    int id;
    String name;

    void print(){
        System.out.println(id+" "+name);
    }
}

class Emp {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String str) {
        name = str;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }
}

public class Oops {
    int dt;
    String ss;
    
    void go(){
        System.out.println("this is from this....");
    }

    public Oops(int i,String st){
        dt=i;
        ss=st;
    }
    public static void main(String[] args) {

        data n1 = new data();
        n1.id = 5;
        n1.name = "Ritik";
        System.out.println(n1.id + " " + n1.name);
        n1.print();

        Emp e1 = new Emp();
        e1.setName("Ritik");
        e1.setId(77);
        System.out.println(e1.getId() + " " + e1.getName());

        // Oops ob=new Oops();
        // ob.go();

        Oops ob2=new Oops(4,"dsfiodsk");
        System.out.println(ob2.dt);        

   }
}