import java.util.Scanner;
// import java.lang.Math;



public class AllCodes {
    // static int adder(int a, int b) {
    // return a + b;
    // }

    // static int factorial(int a) {
    // if (a == 0) {
    // return 1;
    // } else {
    // return a * factorial(a - 1);
    // }
    // }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter the number:");
            int s1=sc.nextInt();
            System.out.print("Enter the number:");
            int s2=sc.nextInt();
            System.out.println(s1+s2);
        }

        // boolean b1=sc.hasNextInt();
        // System.out.println(b1);

        // String s2 = sc.nextLine();// for string include the space
        // String s3 = sc.next();// for string not include space
        // System.out.println(s2);
        // System.out.println(s3);

        // String st=new String("dksfljs");//string is class not primitive data type
        // String st2="ofndks";
        // System.out.println(st2+" "+st);

        // System.out.println(Math.round(Math.random()*100));

        // if (10>20) {
        // System.out.println("True");
        // }
        // else{
        // System.out.println("False");
        // }

        // System.out.println((10<20)?"ok":"not ok");

        // int i=0;
        // while (i++<5) {
        // int j=0;
        // while (j++<i) {
        // System.out.print("+");
        // }
        // System.out.println();
        // }

        // for (int i = 0; i < 5; i++) {
        // for (int j = 0; j < i; j++) {
        // System.out.print("+");
        // }
        // System.out.println();
        // }

        // String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        // for (String i : cars) {
        // System.out.println(i);
        // }

        // String[] arr={"komod","isdo","oief"};
        // System.out.println(arr[1]);
        // for (String i : arr) {
        // System.out.println(i);
        // }

        // int[][] arr2={{1,2,3,4},{5,6}};
        // System.out.println(arr2[0][3]);
        // for(int i:arr2[0]){
        // System.out.println(i);
        // }

        // AllCodes adobj=new AllCodes();//---->if we cant use static in function
        // System.out.println(adobj.adder(4, 6));

        // System.out.println(adder(4, 6));
        // System.out.println(factorial(5));

        
    }
}