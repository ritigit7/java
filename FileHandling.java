import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {
  public static void main(String[] args) {

    try {
      File obFile = new File("Filehandling.txt");
      if (obFile.createNewFile()) {
        System.out.println("File is sucessfully created...");
      }
    } catch (IOException e) {
      System.out.println("File is already exist...");
    }
    // write();
    read();
    // delete();
    // info();
  }

  public static void write() {
    try {
      FileWriter objWriter = new FileWriter("Filehandling.txt");
      objWriter.write("This is from FileHandaling class object......");
      System.out.println("Writen function is sucessfully run...");
      objWriter.close();

    } catch (IOException e) {
      System.out.println("File is not writen");
    }
  }

  public static void read() {

    File ffFile = new File("Filehandling.txt");
    try (Scanner sc = new Scanner(ffFile)) {
      while (sc.hasNextLine()) {
        String dataString = sc.nextLine();
        System.out.println(dataString);
      }
    } catch (FileNotFoundException e) {
      System.out.println("File is not found...");
    }
  }

  public static void delete() {
    File dFile = new File("Filehandling.txt");
    if (dFile.delete()) {
      System.out.println("File is Deleted...");
    }
  }

  public static void info() {
    File ob = new File("Filehandling.txt");
    if (ob.exists()) {
      System.out.println("File name: " + ob.getName());
      System.out.println("Absolute path: " + ob.getAbsolutePath());
      System.out.println("Writeable: " + ob.canWrite());
      System.out.println("Readable " + ob.canRead());
      System.out.println("File size in bytes " + ob.length());
    }
  }
}