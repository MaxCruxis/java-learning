import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /* System.out.println("hello buddy");
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
        lists.linkedList();*/
        /*Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int fZero = 0;
        int fOne = 1;
        int fN=1;
            for (int i = 2; i <= x; i++) {
                fN = (fZero + fOne)%10;
                fZero = fOne%10;
                fOne = fN%10;
            }
            System.out.println(fN);*/
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        /*int x = 18;
        int y = 435345;*/
        while (x != y && x != 0 && y != 0) {
            if (x > y) x = x % y;
            else y = y % x;
        }
        if (x==0) System.out.println(y); else System.out.println(x);


        /*int a =10;
        int b =1;
        do {
            a =a-b;
            System.out.println(a);
        } while (a!=1);
        System.out.println(a);*/
    }
}
