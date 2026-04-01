
import java.util.ArrayList;

public class _01_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        list.add(1, 9); // add element o(n)

        System.err.println(list);
        //get operation
        int element = list.get(2);
        System.out.println(element);

        //Delete
        list.remove(2);
        System.out.println(list);

        //set element
        list.set(2, 10);
        System.out.println(list);

        //contains element
        boolean isContain = list.contains(10);
        System.out.println(isContain);

        System.out.println(list.size()); 
    }
}
