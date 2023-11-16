package Calc;

import java.util.Scanner;

class Addition{
    void dothis(){
        System.out.println("fghjklhgfdfg");
    }
    // Addition(int a,int b){
    //     System.out.println("the sum of two number is "+(a+b));
    // }
}
class Multiplier{
    Multiplier(int a,int b){
        System.out.println("the sum of two number is "+(a*b));
    }
}
class Subtraction{
    Subtraction(int a,int b){
        System.out.println("the sum of two number is "+(a-b));
    }
}
public class Calculator {
    public static void main(String[] args) {
        // Addition obj=new Addition(4,8);
        System.out.println("Enter 2 number:");
        try (Scanner sc = new Scanner(System.in)) {
            int a=sc.nextInt();
            int b=sc.nextInt();
            addition(a,b);
        }
    }
    public static void addition(int x,int y){
        System.out.println("the sum is :"+(x+y));
    }
}
