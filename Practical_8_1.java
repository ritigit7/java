import java.io.File;
// import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Practical_8_1 {
    public static void main(String[] args) {
        System.out.print("Enter the number for table:");
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.close();
        try {
            File newFile=new File("Practical_8_1.txt");
            if(newFile.createNewFile()){
                System.out.println("File is created...");
            }
            PrintWriter pWriter=new PrintWriter(newFile);
            for (int i = 1; i <= 10; i++) {
                pWriter.println(t+" x "+i+" = "+(t*i));
            }
            pWriter.close();
            Scanner fileRead=new Scanner(newFile);
            for (int i = 0; i < 5; i++) {
                
                System.out.println(fileRead.nextLine());
            }
            fileRead.close();
        } catch (IOException e) {
            System.out.println("File is not created...");
        }
        
    }
}