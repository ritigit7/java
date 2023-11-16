import java.util.Scanner;

public class binarynumbers {
   public static void main(String args[]) {
      try (Scanner s = new Scanner(System.in)) {
         System.out.println("Ener first binary number:");
         String int1 = s.next();
         System.out.println("Ener second binary number:");
         String int2 = s.next();
         int a1 = Integer.parseInt(int1);
         int a2 = Integer.parseInt(int2);
         int total = a1 + a2;
         System.out.println("ANSWER IS:" + total);
         Integer.toBinaryString(total);
      } catch (NumberFormatException e) {
         e.printStackTrace();
      }

   }

}