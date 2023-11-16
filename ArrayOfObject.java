import java.util.Scanner;

class S_Data{
    String sname;
    int age;
    
}

public class ArrayOfObject {
    public static void main(String[] args) {
        S_Data s1=new S_Data();
        S_Data s2=new S_Data();
        S_Data s3=new S_Data();

        S_Data arr[]=new S_Data[3];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        try (Scanner sc = new Scanner(System.in)) {
            for (int i = 0; i < arr.length; i++) {
                arr[i].sname=sc.next();      
                arr[i].age=sc.nextInt();      
            }
        }
        System.out.println(arr[0].age);
    }
}
