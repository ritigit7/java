// import java.util.Scanner;

// import Calc.Calculator;
// import Calc.Addition;
// import java.util.regex.Matcher;
// import java.util.regex.Pattern;

// public class Temp extends Thread {
// public static int amount = 0;

// public static void main(String[] args) {

// Main thread = new Main();
// thread.start();
// // Wait for the thread to finish
// while (thread.isAlive()) {
// System.out.println("Waiting...");
// }
// // Update amount and print its value
// System.out.println("Main: " + amount);
// amount++;
// System.out.println("Main: " + amount);
// }

// public void run() {
// amount++;

// Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
// Matcher matcher = pattern.matcher("Visit W3Schools!");
// boolean matchFound = matcher.find();
// if(matchFound) {
// System.out.println("Match found");
// } else {
// System.out.println("Match not found");
// }

// Scanner sc = new Scanner(System.in);
// Addition obj = new Addition(4, 6);
// Multiplier obj2=new Multiplier(9, 8);
// Calculator cal=new Calculator();
// cal.addition(7, 9);
// Addition aa=new Addition(2, 3);
// Addition ad = new Addition();
// ad.dothis();
// System.out.println("kjdsf");
// System.out.println((int)(Math.random()*100));
// int[] arr = new int[10];
// int i = 0;
// while (i < 10) {
//     arr[i] = (int) (Math.random() * 100);
// }
// try{
// int[] arr ={12,34,53,86,54,98,88,43,66,75};
//             System.out.println();
//         }
//         catch(ArrayIndexOutOfBoundsException e){
//             System.out.println("Out of Array");
//         }

//     }
// }

public class Temp extends Thread {

    @Override
    public void run() {
        // Do something in this thread.
        System.out.println("Hello from Temp!");
    }

    public static void main(String[] args) {
        // Create a new thread and start it.
        Temp thread = new Temp();
        System.out.println("Thread finished!");
        
        // Wait for the thread to finish.
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread.start();

        // The thread has finished, so do something else.
    }
}
