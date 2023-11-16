import java.util.Scanner;

public class Practical_6_1 {
    public static void main(String[] args) {
        try {
            int[] arr = { 12, 114, 553, 86, 54, 698, 88, 843, 66, 75 };
            System.out.print("Enter the index:");
            try (Scanner sc = new Scanner(System.in)) {
                int t=sc.nextInt();
                if(arr[t]<100){
                    System.out.println(arr[t]);
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getLocalizedMessage());
        }
    }
}