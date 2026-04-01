
import java.util.ArrayList;

public class collection {

    public static void main(String[] args) {
        // HashSet<String> hs1 = new HashSet<String>();
        // hs1.add("AAA");
        // hs1.add("BBB");
        // hs1.add("CCC");
        // hs1.add("DDD");
        // System.err.println(hs1);
        // HashSet<String> hs2 = new HashSet<String>();
        // // System.out.println(hs2.addAll(hs1));
        // // System.err.println(hs2);
        // hs2.add("AAA");
        // hs2.add("BBB");
        // System.err.println(hs2.addAll(hs1));
        // System.out.print(hs1);

        // ArrayList<String> a1 = new ArrayList<String>();
        // a1.add("AAA");
        // a1.add("BBB");
        // a1.add("CCC");
        // a1.add("DDD");
        // System.out.println(a1);
        // System.out.println(a1.remove("BBB"));
        // System.out.println(a1);
        // System.err.println(a1.remove("ZZZ"));
        // System.out.println(a1);
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("AAA");
        a1.add("BBB");
        a1.add("CCC");
        a1.add("DDD");
        a1.add("EEE");
        a1.add("FFF");

        System.out.println(a1);

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("CCC");
        a2.add("DDD");
        a2.add("XXX");
        a2.add("YYY");
        System.out.println(a2);
        System.out.println(a1.removeAll(a2));
        System.out.println(a1);
        System.out.println(a1.removeAll(a2));
        System.out.println(a1);
    }
}
