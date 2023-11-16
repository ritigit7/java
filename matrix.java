import java.util.Scanner;

class matrix {
    public static void main(String[] args) {
        int a[][], b[][], c[][];
        int i, j;
        a = new int[2][2];
        b = new int[2][2];
        c = new int[2][2];
        Scanner r = new Scanner(System.in);

        System.out.println("ENTER FIRST MATRIX DATA");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                a[i][j] = r.nextInt();
            }
        }

        System.out.println("ENTER second MATRIX DATA");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                b[i][j] = r.nextInt();
            }
        }

        System.out.println("SUM  MATRIX DATA");
        for (i = 0; i < 2; i++) {
            for (j = 0; j < 2; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

}