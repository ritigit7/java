package Practical;

import java.util.Scanner;

public class P_1_B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x, y;
            System.out.println("Enter the number X-");
            x = sc.nextInt();
            System.out.println("Enter the number Y-");
            y = sc.nextInt();
            
            if (y<=(200-x)) {
                System.out.println("The ("+x+","+y+") point is inside the triangle.");
            } else {
                System.out.println("The ("+x+","+y+") point is not inside the triangle.");
            }
        }
    }
}
