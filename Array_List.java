import java.util.ArrayList;
public class Array_List {
    public static void main(String[] args) {
        ArrayList<Integer> objList=new ArrayList<Integer>();
        objList.add(1);
        objList.add(2);
        objList.add(3);
        objList.add(4);
        objList.add(5);
        System.out.println(objList);
        for (Integer i : objList) {
            System.out.println(i);
        }
        // objList.toString();
        // int[] tt={7,8,9,4,5};
        // System.out.println(tt[0]+objList.get(0));
        objList.set(4, 90);
        System.out.println(objList);
        
    }
}