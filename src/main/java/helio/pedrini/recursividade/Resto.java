package helio.pedrini.recursividade;

public class Resto {

    public static int resto(int x, int y) {
        return x % y;
    }

    public static int restoRecursivo(int x, int y) {
        if (x < y) return x;
        return restoRecursivo(x - y, y);
    }

    public static void main(String[] args) {
        System.out.println(resto(10, 4));
        System.out.println(restoRecursivo(10, 4));
    }
}
