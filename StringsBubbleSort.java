import java.util.Scanner;

public class StringsBubbleSort {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number of strings: ");
            int n = sc.nextInt();
            sc.nextLine(); 

            String[] strings = new String[n];

            for (int i = 0; i < n; i++) {
                System.out.print("Enter string #" + (i+1) + ": ");
                strings[i] = sc.nextLine();
            }

            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (strings[j].compareTo(strings[j+1]) > 0) {
                        String temp = strings[j];
                        strings[j] = strings[j+1];
                        strings[j+1] = temp;
                    }
                }
            }

            System.out.println("Sorted strings:");
            for (String str : strings) {
                System.out.println(str);
            }
        }
    }
}
