
import java.util.ArrayList;
import java.util.Collections;

public class _05_ArrayList_Sort {

    public static void main(String[] args) {
        // collections.sort()
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);
        System.out.println(list);

        Collections.sort(list);// ascending order
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());//Descending order
        System.out.println(list);
    }
}
