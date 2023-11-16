import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapClass {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<String, Integer>();
        data.put("a", 1);
        data.put("b", 2);
        data.put("c", 3);
        data.put("d", 4);
        data.put("e", 5);
        System.out.println(data.entrySet());

        var vv = new ArrayList<Integer>();
        vv.add(7);
        vv.add(8);
        vv.add(6);
        vv.add(4);

        System.out.println(vv);
    }
}
