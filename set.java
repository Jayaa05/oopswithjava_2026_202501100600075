import java.util.*;

public class set {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        // add elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20);   // duplicate - not added

        System.out.println("Set: " + set);

        // size
        System.out.println("Size: " + set.size());

        // contains
        System.out.println("Contains 20: " + set.contains(20));

        // remove
        set.remove(10);
        System.out.println("After removing 10: " + set);

        // isEmpty
        System.out.println("Is empty: " + set.isEmpty());

        // traversal
        System.out.println("Elements:");

        for (int x : set) {
            System.out.println(x);
        }

        // clear
        set.clear();

        System.out.println("After clear: " + set);
        System.out.println("Is empty: " + set.isEmpty());
    }
}
