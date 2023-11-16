import java.util.ArrayList;
import java.util.Collection;
public class CollectionClass {
    public static void main(String[] args) {
        Collection<Integer> num=new ArrayList<Integer>();
        num.add(4);
        num.add(9);
        num.add(7);
        num.add(3);
        System.out.println(num.getClass());
        System.out.println(num);
    }
}
