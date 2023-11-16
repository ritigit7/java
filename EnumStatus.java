enum Stat {
    Running(400), Error(401), Success(405);
    int p;
    Stat(int p){
        System.out.println(p);
    }
}

public class EnumStatus {
    public static void main(String[] args) {
        // Stat s=Stat.Error;
        // Stat[] ss=Stat.values();
        // System.out.println(ss.length);

        Stat[] st = Stat.values();
        for (Stat s : st) {
            switch (s) {
                case Running:
                    System.out.println("Running");
                case Success:
                    System.out.println("Success");
                default:
                    System.out.println("Error");
            }
        }
    }
}
