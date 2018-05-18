import java.util.Scanner;
public class packedWord {

    static int value;

    public static void pack(int p) {
        p = p << 9;
        value = value | p;
    }

    static void packsiblings(int s) {
        s = s << 5;
        value = value | s;
    }

    static void packchildress(int c) {
        c = c << 1;
        value = value | c;
    }

    static void packgender(int g) {
        value = value | g;
    }

    static int unpackage() {
        return value >> 9 | 0;
    }

    static int unpacksibling() {
        return value >> 5 & 15;
    }

    static int unpackchildren() {
        return value >> 1 & 15;
    }

    static int unpackgender() {
        return value & 1;
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        pack(sc.nextInt());
        packsiblings(sc.nextInt());
        packchildress(sc.nextInt());
        packgender(sc.nextInt());

        System.out.println(unpackage());
        System.out.println(unpacksibling());
        System.out.println(unpackchildren());
        System.out.println(unpackgender());

    }
}
