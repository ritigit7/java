package Practical;
import java.util.Scanner;

public class P_1_A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the three digit number:");
            String n=sc.nextLine();
            // String arr[]=new String[5];
            // arr=n.split(" ");
            // System.out.println(arr[0]+" "+arr[1]);

            if (n.charAt(0)==n.charAt(2)) {
                System.out.println("This is palidrom number");
            }
            else{
                System.out.println("This is not palidrom number");
            }
        }
        
        // System.out.println("The perimeter of the circle is "+2*Math.PI*r);
        // System.out.println("The area of the circle is "+Math.PI*r*r);
        
        // System.out.println("Enter the value of valocity 1:");
        // int v1=sc.nextInt();
        // System.out.println("Enter the value of valocity 2:");
        // int v2=sc.nextInt();
        // System.out.println("Enter the value of time:");
        // int t=sc.nextInt();

        // System.out.println("The acceleration is "+(v1+v2*t));

    }
}