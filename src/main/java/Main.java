import Collections.Lists;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) {
        System.out.println("hello buddy");
        Lists lists = new Lists();
        lists.arrayList();

        int[] strings = new int[6];
        strings[0] = 32;
        strings[1] = 23;
        strings[2] = 45;
        strings[3] = 16;
        strings[4] = 1;
        strings[5] = 12;
        System.out.println(Arrays.toString(strings));
        Arrays.sort(strings, 2, 6);
        System.out.println(Arrays.toString(strings));
        lists.linkedList();

    }
}
