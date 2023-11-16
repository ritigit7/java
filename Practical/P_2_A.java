package Practical;

import java.util.Scanner;

public class P_2_A {
    public static void main(String[] args) {
        int t = 0;
        char[] arr = { 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' };
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the string:");
            String str = sc.nextLine();
            // int l=str.length();
            char[] ch = str.toCharArray();
            for (char c:ch) {
                for (char s:arr) {
                    if (s == c) {
                        t++;
                    }
                }
            }
        }
        System.out.println(t);
    }
}
