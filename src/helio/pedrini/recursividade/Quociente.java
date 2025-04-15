package helio.pedrini.recursividade;

public class Quociente {

    public static int quociente(int x, int y) {
        return x / y;
    }

    public static int quocienteRecursivo(int x, int y) {
        if (x < y) return 0;
        return 1 + quocienteRecursivo(x - y, y);
    }

    public static void main(String[] args) {
        System.out.println(quociente(17, 4));
        System.out.println(quocienteRecursivo(17, 4));
    }
}
