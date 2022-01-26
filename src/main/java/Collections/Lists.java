package Collections;
import java.util.*;

public class Lists {
    public void arrayList() {
        int[] array;
        array = new int[10];
        array[1] = 2;
        System.out.println("Array list:");
        System.out.println(Arrays.toString(array));
    }

    public void linkedList() {
        List<Integer> list = new LinkedList<>();
        list.add(213);
        list.add(31);
        list.add(31);
        list.add(56);
        list.add(9);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        Collections.addAll(list, 3,4,5,6,7,8,9);
        Collections.replaceAll(list,3,14);
        System.out.println("Linked list:");
        System.out.println(list);
        System.out.println();
        list.removeIf(x->x.equals(3));
        System.out.println();
        System.out.println(list);
        System.out.println();
        System.out.println("Sorted Linked list:");
        Collections.sort(list);
        System.out.println(list);

    }
}
