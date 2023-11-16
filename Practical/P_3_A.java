package Practical;

import java.util.Scanner;

class Ractangle {
    int w = 8;
    int h = 3;

    Ractangle(int x, int y) {
        getArea(x,y);
        getParameter(x,y);
    }

    void getArea(int a,int b) {
        System.out.println("The default ractangle area is " + a*b);
    }

    void getParameter(int a,int b){
        System.out.println("Ractangle's width:" + a + " height:" + b);
    }
}

public class P_3_A {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the ractangle width and height:");
        }

    }
}
