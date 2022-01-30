package MyCollections;

import java.util.*;

public class MyCollections {
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
        java.util.Collections.addAll(list, 3, 4, 5, 6, 7, 8, 9);
        java.util.Collections.replaceAll(list, 3, 14);
        System.out.println("Linked list:");
        System.out.println(list);
        System.out.println();
        list.removeIf(x -> x.equals(3));
        System.out.println();
        System.out.println(list);
        System.out.println();
        System.out.println("Sorted Linked list:");
        java.util.Collections.sort(list);
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

    private void setExploring() {
        Set<String> set = new HashSet<>();
        set.add("qweqwe");
        for (int i = 10; i >= 0; i--) {
            set.add(String.valueOf(i));
        }
        System.out.println(set);
//    set.remove(String.valueOf(4));
        set.removeIf(x -> x.equals(String.valueOf(4)));
        System.out.println(set);
        System.out.println(set.size());

    }

    private void mapExploring() {
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                char string = (char)(i+33);
                map.put(i,Character.toString(string));
            }
        }
        for (Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
//        for (int i = 0; i <= 10; i++) System.out.println((char)(i+33) );
    }
    private void mapInList(){
        Map<Integer,String> map = new HashMap<>();
        List<Integer> keyList = new ArrayList<>(map.keySet());
        List<String> valueList = new ArrayList<>(map.values());
        List<Map.Entry<Integer,String>>entryList =new ArrayList<>(map.entrySet());
        for (int i =0; i<=1000; i++){


        }

    }

    public static void main(String[] args) {
        new MyCollections().vector();
        new MyCollections().findChar(1);
        new MyCollections().setExploring();
        new MyCollections().mapExploring();
    }


}
