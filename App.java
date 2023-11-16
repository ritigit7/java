import java.util.Scanner;
import java.time.LocalDate;


public class App {

    public static void main(String[] args){
        System.out.println("Hello, World!");
        String[] a={"dv","odf","erf","wed"};
        for (String i : a) {
            System.out.println(i);            
        }
        // App b=new App();
        add(7, 6);    
        add("dksf","kdsjf");    
        try (Scanner sc = new Scanner(System.in)) {
            String i=sc.nextLine();
            System.out.println(i);
        }
        LocalDate obDate=LocalDate.now();
        System.out.println(obDate);
    }
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add(String a,String b){
        System.out.println(a+b);
    }
}
