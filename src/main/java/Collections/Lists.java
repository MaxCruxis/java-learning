package Collections;

import java.util.*;

public class Lists {
    private void arrayList() {
        int[] array;
        array = new int[10];
        array[1] = 2;
        System.out.println("Array list:");
        System.out.println(Arrays.toString(array));
    }

    private void linkedList() {
        List<Integer> list = new LinkedList<>();
        list.add(213);
        list.add(31);
        list.add(31);
        list.add(3);
        list.add(3);
        list.add(56);
        list.add(9);
        list.add(3);
        list.add(3);
        list.add(3);
        list.add(3);
        System.out.println(list);
        list.remove(3);// remove value by index
        System.out.println(list);
        list.remove(Integer.valueOf(3)); //remove first founded value by condition
        System.out.println(list);
        Collections.addAll(list, 3, 4, 5, 6, 7, 8, 9);
        Collections.replaceAll(list, 3, 14);
        System.out.println("Linked list:");
        System.out.println(list);
        System.out.println();
        list.removeIf(x -> x.equals(3));
        System.out.println();
        System.out.println(list);
        System.out.println();
        System.out.println("Sorted Linked list:");
        Collections.sort(list);
        System.out.println(list);

    }
    private void vector() {
        Vector<Integer> vector = new Vector<>();
        vector.add(3);
        vector.add(9);
        vector.add(76);
        vector.add(2);
        System.out.println(vector);
    }

    private void findChar(int number) {
        char a = '\\';
        char b = (char) ((int) a + number);
        System.out.println((int) a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        new Lists().vector();
        new Lists().findChar(1);
    }


}
