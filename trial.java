import java.util.Scanner;

// import java.util.Scanner;

// public class trial {
// static int i=4;
// public static void main(String[] args) {
// Scanner sc=new Scanner(System.in);
// System.out.println("Enter the marks of subject1:");
// float m1=sc.nextFloat();
// System.out.println("Enter the marks of subject2:");
// float m2=sc.nextFloat();
// System.out.println("Enter the marks of subject3:");
// float m3=sc.nextFloat();
// System.out.println("You got "+(m1+m2+m3)/3+" persentage from 3 subjects");
// int c='e';
// System.out.println(c);
// trial obj=new trial();
// System.out.println(obj.i);
// System.out.println(i);

// }

// }

// class ag{

//     public ag(int i){
//         if(i<5){
//             System.out.println("small");
//         }
//     } 
// }
// public class trial {

//     public static void main(String[] args) {

//         ag o=new ag(2);
//     }
// }
// class Library{
//     String[] books;
//     int no_of_books;
//     Library(){
//         this.books = new String[100];
//         this.no_of_books = 0;
//     }

//     void addBook(String book){
//         this.books[no_of_books] = book;
//         no_of_books++;
//         System.out.println(book+ " has been added!");
//     }

//     void showAvailableBooks(){
//         System.out.println("Available Books are:");
//         for (String book : this.books) {
//             if (book == null){
//                 continue;
//             }
//             System.out.println("* " + book);
//         }
//     }

//     void issueBook(String book){
//             for (int i=0;i<this.books.length;i++){
//             if (this.books[i].equals(book)){
//                 System.out.println("The book has been issued!");
//                 this.books[i] = null;
//                 return;
//             }
//         }
//         System.out.println("This book does not exist");
//     }

//     void returnBook(String book){
//         addBook(book);
//     }

// }

// import Practice_CODE.PrintFunciton;
// import Calc.Addition;
// public class trial {
// public static void main(String[] args) {
// System.out.println("iodjkv");
// String str="djkflsk";
// System.out.println(str);
// PrintFunciton obj=new PrintFunciton();
// System.out.println(obj.x);
// Addition obj=new Addition(4, 7);
// }
// }

// import javax.sound.sampled.AudioInputStream;
// import javax.sound.sampled.AudioSystem;
// import javax.sound.sampled.Clip;
// import java.io.File;

// public class trial {
//     public static void main(String[] args) {
//         try {
//             // Load the sound file
//             File soundFile = new File("");
//             AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);

//             // Get a Clip object to play the sound
//             Clip clip = AudioSystem.getClip();
//             clip.open(audioInputStream);

//             // Start playing the sound
//             clip.start();

//             // Sleep for 3 seconds
//             Thread.sleep(3000);

//             // Stop the sound
//             clip.stop();

//             // Close the Clip and AudioInputStream
//             clip.close();
//             audioInputStream.close();
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//     }
// }

// class trial {
//     public static void main(String[] args) {
//         char c = '9';
//         int num = 42;
//         // String formatted = String.format("The answer is %d", a);
//         Scanner sc=new Scanner(System.in);
//         System.out.println((int) c);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         addition(a, b);
//     }

//     public static void addition(int x, int y) {
//         System.out.println("the sum is :" + (x + y));
//     }
// }
// class prnt{
// 	prnt(){
// 		System.out.println("THis is form prnt");
// 	}
// }
// class parnt2 extends parnt{
// 	parnt2(){
// 		System.out.println("this is from parnt 2");
// 	}
// 	int i=5;
// }
// import java.util.Scanner;
public class trial{
	public static void main(String[] args) {
		int i[][]=new int[2][2];
		// int k[][]={{0,1},{1,7}};
		int j[]=new int[2];
		System.out.println(i[1][0]);
		System.out.println(j[0]);
		try (// trial at=new trial();
				// at.ptt();
				// ptt();
				// parnt2 ppParnt2=new parnt2();
				// try {
				// 	int t=5/0;
				// } catch (Exception e) {
				// 	System.out.println("error"+e.getMessage());
				// }
		Scanner sc = new Scanner(System.in)) {
			int balance = 5000;
			int withdraw = sc.nextInt();
			try {
			if(balance - withdraw < 1000) {
				throw new Exception("Balance must be grater than 1000");
			}
			else {
				balance = balance - withdraw;
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}

		static void ptt(){
			System.out.println("sdkjf");
		}
}
