package MyCollections;

import java.util.*;

public class MyCollections {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
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
    private void mapInList() {
        List<String> keyList = new ArrayList<>();
        List<String> valueList = new ArrayList<>();
        List<Map<String, String>> entryList = new ArrayList<>();
        for (int i = 0; i <= 15; i++) keyList.add(Integer.toHexString(i));
        for (int i = 0; i <= 255; i++) valueList.add(Character.toString((char) (i + 32)));
        for (int i = 0; i <= valueList.size() - 1; i++) {
            Map<String, String> a = new HashMap<>();
            for (int j = 0; j <= keyList.size() - 1; j++) {
                char string = (char) (i + 32);
                a.put(keyList.get(j), Character.toString(string));

            }
            entryList.add(a);
        }
        System.out.print("N ");
        for (int i = 0; i <= keyList.size() - 1; i++) {

            System.out.print(ANSI_RED + keyList.get(i).toUpperCase(Locale.ROOT) + ANSI_RESET + " ");

        }
        System.out.println();
        int a =0; // for unique value each 16 keys else there would repeat first 16
        for (int i = 0; i <= ((valueList.size())/(keyList.size()) -1); i++) {//  112/16 coz only 7 rows
            System.out.print(Integer.toHexString(i) + " "); //for column numbers
            for (int j = 0; j <= keyList.size() - 1; j++) { //16
                System.out.print(entryList.get(j+a).get(keyList.get(i)) + " ");
            }
            a=a+keyList.size();
            System.out.println();
        }
        int x = Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("444",16);

        System.out.println(x);
        System.out.println(c);
        System.out.println(b);
    }
    private void mapsMerge(){
        HashMap<Integer, String> passportsAndNames = new HashMap<>();
        HashMap<Integer, String> passportsAndNames2 = new HashMap<>();

        passportsAndNames.put(212133, "Walter White");
        passportsAndNames.put(162348, "Donald Trump");
        passportsAndNames.put(8082771, "Conan O'Brien");
        passportsAndNames.put(925648, "Jimi Hendrix");

        passportsAndNames2.put(917352, "Vladimir Putin");
        passportsAndNames2.put(925648, "Pavel Durov");



        passportsAndNames.putAll(passportsAndNames2);
        for (Map.Entry entry : passportsAndNames.entrySet()){
            System.out.println(entry);
        }
        Set<Integer> keys = passportsAndNames.keySet();
        Iterator<Integer> iterator = keys.iterator();
        while (iterator.hasNext()){
            int x =iterator.next();
            System.out.println(Integer.toHexString(x) + " = " + x );
        }


    }

    public static void main(String[] args) {
//        new MyCollections().vector();
//        new MyCollections().findChar(1);
//        new MyCollections().setExploring();
//        new MyCollections().mapExploring();
        new MyCollections().mapsMerge();
//        new MyCollections().mapInList();
    }


}
