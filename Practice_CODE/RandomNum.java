package Practice_CODE;

import java.util.Scanner;
import java.lang.Math;
class Algo {

    public Algo(int i, int j) {

        if (i < j) {
            System.out.println("Please select bigger value..");
        } else if (i == j) {
            System.out.println(i+" is your randon number..");
        }
        else{
            System.out.println("Please select smaller value..");
        }
    }
}

public class RandomNum {
    public static void main(String[] args) {

        int step=1;
        try (Scanner sc = new Scanner(System.in)) {
            int m = (int) (Math.random() * 100);
            System.out.println(m);
            while (true) {
                System.out.print("Number between 1-100 for checking game number:");
                int n = sc.nextInt();
                if (n == m) {
                    break;
                }
                step++;
            }
        }
        System.out.println("You have complete game in "+step+" steps");
    }
}
