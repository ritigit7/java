class GeSe {
    private int id;
    public int getter() {
        return this.id;
    }
    public void setter(int y) {
        this.id = y;
    }
}

public class GetterSetter {
    public static void main(String[] args) {
        GeSe obj = new GeSe();
        obj.setter(4);
        System.out.println(obj.getter());
    }
}
