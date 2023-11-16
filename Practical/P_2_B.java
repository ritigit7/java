package Practical;

import java.util.Scanner;

class PasswordCondition {
    String st;

    PasswordCondition(String str) {
        st = str;
        lenthString();
        letterDigit();
        twoDigit();
    }

    public void lenthString() {
        if (st.length() <= 8) {
            System.out.println("The password length must be 8.");
        }
    }

    public void letterDigit() {
        char[] c = st.toCharArray();
        for (char d : c) {
            if (((int) d <= 97 && (int) d >= 122) || ((int) d <= 47 && (int) d >= 57)) {
                System.out.println("The password must be include charactor and number.");
                break;
            }
        }
    }

    public void twoDigit() {
        char[] c = st.toCharArray();
        this.letterDigit();
        int t = 0;
        for (char d : c) {
            if (((int) d >= 47 && (int) d <= 57)) {
                t++;
            }
        }
        if (t != 2) {
            System.out.println("The password must be include atleast two number.");
        }
    }
}

public class P_2_B {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the Password:");
        }
    }
}
